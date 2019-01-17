app.service('odortService',function($http){

    this.getAllOdorts = function (page, rows) {
        return $http.get('../odort?page='+page+'&rows='+rows);
    }

    this.addOdort = function (entity) {
        return $http.post('../odort/add',entity);
    }

    this.del = function (oId) {
        return $http.get('../odort/del?oId='+oId);
    }

    this.findOne = function (oId) {
        return $http.get('../odort/findone?oId='+oId);
    }
    
    this.saveOdort = function (entity) {
        return $http.post('../odort/update',entity);
    }

});