app.service('spiritService',function($http){

    this.getAllSpirits = function (page, rows ,entity) {
        return $http.post('../spirit?page='+page+'&rows='+rows, entity);
    }

    this.findOne = function (lId) {
        return $http.get('../spirit/findone?lId='+lId);
    }

    this.del = function (entity) {
        return $http.post('../spirit/del',entity);
   }

   this.getOdortList = function () {
        return $http.get('../odort/getlist');
   }

   this.getManList = function () {
        return $http.get('../manufacturers/getlist');
   }

   this.findDesc = function (lId) {
       return $http.get('../spirit/finddesc?lId='+lId);
   }

   this.modifyBase = function (entity) {
       return $http.post('../spirit/modify/base',entity);
   }

});