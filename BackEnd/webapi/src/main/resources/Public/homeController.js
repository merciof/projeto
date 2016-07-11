app.controller('homeController', ['$scope', '$http', function ($scope, $http) {

	
	
	$http.get("http://localhost:8080/livro").success(function (result) {
        $scope.livros = result;
   
        console.log("sucesso");
    }).error(function (error) {
        alert(error.error + "/" + error.statusCode);
    });
	
	
}]);