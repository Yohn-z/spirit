app.controller('staController',function ($scope,staService,loginService) {


    $scope.getBaseParam = function () {
        staService.getBaseParam().success(
            function (response) {
                if(response.success){
                    $scope.baseParam = response.object;
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



    var chart = Highcharts.chart('firCharts',{
        chart: {
            type: 'area'
        },
        title: {
            text: ''
        },
        subtitle: {
            text: ''
        },
        xAxis: {
            allowDecimals: false
        },
        yAxis: {
            title: {
                text: '总容量/L'
            },
            labels: {
            }
        },
        plotOptions: {
            area: {
                pointStart: 1940,
                marker: {
                    enabled: false,
                    symbol: 'circle',
                    radius: 2,
                    states: {
                        hover: {
                            enabled: true
                        }
                    }
                }
            }
        },
        series: [{
            name: '总升数',
            data: [ 6, 11, 32, 110, 235, 369, 640,
                1005, 1436, 2063, 3057, 4618, 6444, 9822, 15468, 20434, 24126]
        }],
        credits: {
            enabled: false     //不显示LOGO
        }
    });






    $.getJSON('../statistics/getodortpie', function (csv) {
// Make monochrome colors and set them as default for all pies
        Highcharts.getOptions().plotOptions.pie.colors = (function () {
            var colors = [],
                base = Highcharts.getOptions().colors[0],
                i;
            for (i = 0; i < 10; i += 1) {
                // Start out with a darkened base color (negative brighten), and end
                // up with a much brighter color
                colors.push(Highcharts.Color(base).brighten((i - 3) / 7).get());
            }
            return colors;
        }());
// 初始化图表
        var chart = Highcharts.chart('pieCharts', {
            title: {
                text: ''
            },
            tooltip: {
                pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
            },
            credits: {
                enabled: false     //不显示LOGO
            },
            plotOptions: {
                pie: {
                    allowPointSelect: true,
                    cursor: 'pointer',
                    dataLabels: {
                        enabled: true,
                        format: '<b>{point.name}</b>: {point.percentage:.1f} %',
                        style: {
                            color: (Highcharts.theme && Highcharts.theme.contrastTextColor) || 'black'
                        }
                    }
                }
            },
            series: [{
                type: 'pie',
                name: '占比',
                data: csv.object
            }]
        });
    });

    $.getJSON('../statistics/getyeardata', function (csv) {
        var chart = Highcharts.chart('yearCharts', {
            chart: {
                type: 'bar'
            },
            title: {
                text: ''
            },
            subtitle: {
                text: ''
            },
            credits: {
            enabled: false     //不显示LOGO
            },
            xAxis: {
                categories: ['一年以内', '一年以上', '两年以上', '五年以上', '十年以上','二十年以上'],
                title: {
                    text: null
                }
            },
            yAxis: {
                min: 0,
                title: {
                    text: '数量(瓶)',
                    align: 'high'
                },
                labels: {
                    overflow: 'justify'
                }
            },
            tooltip: {
                valueSuffix: '瓶'
            },
            plotOptions: {
                bar: {
                    dataLabels: {
                        enabled: false,
                        allowOverlap: true // 允许数据标签重叠
                    }
                }
            },
            series: [{
                name:'数量',
                data: csv.object
            }]
        });
    });

});