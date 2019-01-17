app.service('staService',function ($http) {

    this.getBaseParam = function () {
        return $http.get('../statistics/getbase');
    }

    this.getPieData = function () {
        return $http.get('../statistics/getodortpie');
    }
})