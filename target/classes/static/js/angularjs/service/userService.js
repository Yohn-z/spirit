app.service('userService',function($http){

    this.getAllUsers = function (page, rows) {
        return $http.get('../user?page='+page+'&rows='+rows);
    }


    this.del = function (uId) {
        return $http.get('../user/del?uId='+uId);
    }

    this.forg = function (uId) {
        return $http.get('../user/for?uId='+uId);
    }

});