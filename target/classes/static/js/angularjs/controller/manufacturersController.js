app.controller('manufacturersController',function($scope,manufacturersService,loginService){
	
	//重新加载列表 数据
    $scope.reloadList=function(){
    	//切换页码  
    	$scope.getAllManufacturers( $scope.paginationConf.currentPage, $scope.paginationConf.itemsPerPage);
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
	
	$scope.getAllManufacturers = function(page,rows){
        manufacturersService.getAllManufacturers(page,rows).success(
				function(response){
					//更新分页插件
					$scope.list = response.rows;
					$scope.paginationConf.totalItems=response.total;
				}
		);
	}
	
	$scope.manufacturers = {};
	
	$scope.addManufacturers = function(){
        manufacturersService.addManufacturers($scope.manufacturers).success(
				function(response){
					if(response.success){
						$scope.reloadList();
						toastr.success(response.message);
						$scope.odort = {};
					}else{
						toastr.info(response.message);
					}
				}
		);
	}
	
	$scope.findOne = function(mId){
        manufacturersService.findOne(mId).success(
				function(response){
					$scope.manufacturersEntity = response.object;
				}
		);
	}
	
	$scope.saveManufacturers = function(){
        manufacturersService.saveManufacturers($scope.manufacturersEntity).success(
				function(response){
					if(response.success){
						$scope.reloadList();
						toastr.success(response.message);
						$scope.manufacturersEntity = {};
					}else{
						toastr.info(response.message);
					}
				}
		);
	}
	
	$scope.del = function(mId){
        manufacturersService.del(mId).success(
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