app.service('manufacturersService',function($http){

    this.getAllManufacturers = function (page, rows) {
        return $http.get('../manufacturers?page='+page+'&rows='+rows);
    }

    this.addManufacturers = function (entity) {
        return $http.post('../manufacturers/add',entity);
    }

    this.del = function (mId) {
        return $http.get('../manufacturers/del?mId='+mId);
    }

    this.findOne = function (mId) {
        return $http.get('../manufacturers/findone?mId='+mId);
    }
    
    this.saveManufacturers = function (entity) {
        return $http.post('../manufacturers/update',entity);
    }

});