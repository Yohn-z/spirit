app.controller('userController',function($scope,userService,loginService){
	
	//重新加载列表 数据
    $scope.reloadList=function(){
    	//切换页码  
    	$scope.getAllUsers( $scope.paginationConf.currentPage, $scope.paginationConf.itemsPerPage);
    }
    
	//分页控件配置 
	$scope.paginationConf = {
         currentPage: 1,
         totalItems: 5,
         itemsPerPage: 5,
         perPageOptions: [5, 10, 20, 30],
         onChange: function(){
        	 $scope.reloadList();//重新加载
     	 }
	}; 
	
	$scope.getAllUsers = function(page,rows){
        userService.getAllUsers(page,rows).success(
				function(response){
					//更新分页插件
					$scope.list = response.rows;
					$scope.paginationConf.totalItems=response.total;
				}
		);
	}
	

	$scope.del = function(uId){
        userService.del(uId).success(
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

    $scope.forg = function(uId){
        userService.forg(uId).success(
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

});