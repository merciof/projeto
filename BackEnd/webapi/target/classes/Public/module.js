var app = angular.module("app", []);

app.controller('controller', ['$scope', '$http', function ($scope, $http) {

    $scope.livros=[];
    $scope.livroPost={};
	
    	
	$scope.salvarLivro = function() { $http({
          method:'POST', 
          url: 'http://localhost:8080/livro',
          data:$scope.Object}).then(function (result) {
              
              $scope.livros.push(result);
   
        alert("livro salvo");
    }, function (result) {
        
        console.log("erro");
        console.log(result.data);
        console.log(result.status);
    });
    
    }; 

 

    $scope.deletarLivro = function() { $http({method:'DELETE', url: 'http://localhost:8080/livro/'+Object.id,
        	}).then(function () {
              
             
   
        alert("Livro deletado.");
    }, function (result) {
        
        console.log("erro");
        console.log(result.data);
        console.log(result.status);
    });
    
    }; 
	

}]);