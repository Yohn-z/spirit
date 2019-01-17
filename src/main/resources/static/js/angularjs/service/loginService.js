app.service('loginService',function($http){

    this.login = function (entity) {
        return $http.post('../login',entity);
    }

    this.isLogin = function () {
        return $http.get('../il');
    }

    this.logout = function () {
        return $http.get('../logout');
    }

    this.reg = function (entity) {
        return $http.post('../reg',entity);
    }

    this.modifyPass = function (o_pass, n_pass) {
        return $http.get('../modify/pass?nPass='+n_pass+'&oPass='+o_pass);
    }

});