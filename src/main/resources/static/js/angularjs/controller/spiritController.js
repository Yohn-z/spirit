app.controller('spiritController',function($scope,spiritService,loginService){

    $scope.search = {};
	
	//重新加载列表 数据
    $scope.reloadList=function(){
    	//切换页码  
    	$scope.getAllSpirits( $scope.paginationConf.currentPage, $scope.paginationConf.itemsPerPage , $scope.search);
    }
    
	//分页控件配置 
	$scope.paginationConf = {
         currentPage: 1,
         totalItems: 10,
         itemsPerPage: 10,
         perPageOptions: [10, 20, 30, 40],
         onChange: function(){
        	 $scope.reloadList();//重新加载
     	 }
	};


	
	$scope.getAllSpirits = function(page,rows,entity){

        spiritService.getAllSpirits(page,rows,entity).success(
				function(response){
					//更新分页插件
					$scope.list = response.rows;
					$scope.paginationConf.totalItems=response.total;
				}
		);


	}
	

	$scope.findOne = function(lId){
        spiritService.findOne(lId).success(
				function(response){
					$scope.spiritDescEntity = response.object;
				}
		);
	}

	$scope.out = {};

	$scope.del = function(){
        spiritService.del($scope.out).success(
				function(response){
					if(response.success){
						$scope.reloadList();
						toastr.success(response.message);
					}else{
						toastr.info(response.message);
					}
				}
		);
	}

	$scope.finDesc = function(lId){
        spiritService.findDesc(lId).success(
            function (response) {
                if (response.success){
                    $scope.desc = response.object;
                }else{
                    toastr.info("未知错误，请联系管理员");
                }
            }
        );
    }

    $scope.modifyBase = function () {
        spiritService.modifyBase($scope.desc).success(
            function (response) {
                if(response.success){
                    $scope.finDesc($scope.desc.lId);
                    $scope.reloadList();
                    toastr.success(response.message);
                }else{
                    toastr.info(response.message);
                }
            }
        );
    }

	$scope.getList = function () {

        spiritService.getManList().success(
        	function (response) {
				$scope.manList = response;
            }
		);

        spiritService.getOdortList().success(
            function (response) {
				$scope.odortList = response;
            }
        );


    }

    $scope.modifyPass = function(){
        if($scope.oPass != null || $scope.nPass != null || $scope.nConfirmPass != null){
            if($scope.oPass != $scope.nPass){
                if($scope.nPass == $scope.nConfirmPass){
                    loginService.modifyPass($scope.oPass,$scope.nConfirmPass).success(
                        function (response) {
                            if(response.success){
                                alert('密码修改成功，登录信息已失效，请重新登录');
                                location.href = "../";
                            }else {
                                toastr.error(response.message);
                            }
                        }
                    );
                }else {
                    toastr.info('两次输入的密码不同');
                }
            }else {
                toastr.info('原密码不能与旧密码相同');
            }
        }else {
            toastr.info('请填写完整');
        }
    }




    $scope.isLogin = function(){
        loginService.isLogin().success(
            function(response){
                if(response.success){
                    $scope.nuser = response.object;
                }else{
                    location.href="../"
                }
            }
        );
    }

    /**
     * 白酒文件修改提交
     */
    $("body").on('click','#modifyformsubmit',function () {
        var formjson = new FormData(document.getElementById("modifyform"));

        var lId = $('#lId').val();

        $.ajax({
            type:'post',
            data:formjson,
            async: true,
            cache: false,
            contentType: false,
            processData: false,
            url:"/spirit/modify/img",
            beforeSend: function () {
                // 禁用按钮防止重复提交
                $("#modifyformsubmit").html("提交中。。。");
                $("#modifyformsubmit").attr({ disabled: "disabled" });
            },
            complete: function () {
                $("#modifyformsubmit").removeAttr("disabled");
                $("#modifyformsubmit").html("添加");
            },
            success: function(data){
                if(data.success){
                    $scope.finDesc(lId);
                    $scope.reloadList();
                    toastr.success(data.message);
                }else{
                    toastr.info(data.message);
                }
            },
            error: function(data){  alert("未知错误");  }
        });
    })


    /**
     * 白酒入库提交
     */
    $("body").on('click','#addformsubmit',function(){
        var formjson = new FormData(document.getElementById("addform"));
        console.log(formjson);
            $.ajax({
                type:'post',
                data:formjson,
                async: true,
                cache: false,
                contentType: false,
                processData: false,
                url:"/spirit/add",
                beforeSend: function () {
                    // 禁用按钮防止重复提交
                    $("#addformsubmit").html("提交中。。。");
                    $("#addformsubmit").attr({ disabled: "disabled" });
                },
                complete: function () {
                    $("#addformsubmit").removeAttr("disabled");
                    $("#addformsubmit").html("添加");
                },
                success: function(data){
                    if(data.success){
                        $scope.reloadList();
                        toastr.success(data.message);
                    }else{
                        toastr.info(data.message);
                    }
                },
                error: function(data){  alert("未知错误");  }
            });


    });


    /**
     * 修改左移js
     */
    $("body").on("click","#qh",function(){

        //animate回调函数，首先距离移动图片，距离左边界150px，此时在右边界处了。在移动至贴近左边界。
        $("#page-inner").hide("slow");
        $("#xiugai").show("slow");
        $("#hq").show("slow");
    });

    $("body").on("click","#hq",function(){
        //向左移动，移出左边界，最后距离左边距160px.
        //animate回调函数，首先距离移动图片，距离左边界150px，此时在右边界处了。在移动至贴近左边界。
        $("#hq").hide();
        $("#xiugai").hide("slow");
        $("#page-inner").show("slow");
    });





});