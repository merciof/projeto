app.controller('homeController', ['$scope', '$http', function ($scope, $http) {

	
	
	$http.get("livros.json").success(function (result) {
        $scope.livros = result;
   
        console.log("sucesso");
    }).error(function (error) {
        alert(error.error + "/" + error.statusCode);
    });
	
	
}]);