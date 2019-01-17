app.controller('loginController',function($scope,loginService){


	$scope.login = function () {
		loginService.login($scope.user).success(
			function (response) {
				if(response.success){
					location.href="../c"
				}else {
					toastr.error(response.message);
				}
            }
		);
    }

    $scope.reg = function () {
		loginService.reg($scope.user).success(
			function (response) {
				if(response.success){
					location.href = "../c";
				}else{
					toastr.info(response.message);
				}
            }
		);
    }
});