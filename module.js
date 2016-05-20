var app = angular.module("app", []);

app.controller('controller', ['$scope','$http', function ($scope,$http) {
    
    /*$scope.objectArray = [{
        nome: "Java Como Programar",
        edicao: "Terceira",
        sinopse: "blablabla",
        autor: "Deitel",
        estado: "semi noovo"
    }];*/

    $http.get("livros.json").success(function (result) {
   $scope.objectArray = result;
   }).error(function (error) {
   alert(error.error + "/" + error.statusCode);
   
    });
    
    
  

}]);