var app = angular.module("app", []);

app.controller('controller', ['$scope', '$http', function ($scope, $http) {

    $scope.livros=[];
    $scope.livroPost={};
	
    
//    $scope.livroPost = {
//        nome: this.Object.nome,
//        edicao: this.Object.edicao,
//        sinopse: this.Object.sinopse,
//        autor: this.Object.autor,
//        estado: this.Object.estado,
//        preco: this.Object.preco
//    };
    
    $scope.testePost = {
    	"nome": "Java Como Programar",
        "edicao": "sexta",
        "sinopse": "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc venenatis purus dui, non convallis massa convallis non. Nulla dignissim bibendum fringilla. Integer dictum nisl et magna malesuada, sed pretium erat porta.",
        "autor": "Deitel",
        "estadoConservacao": "semi novo",
        "imagem": "img/sp_java_programar_8ed.jpg",
       	 "preco": "30"	
    };
	
	
	$scope.salvarLivro = function() { $http({
		  method:'POST', 
		  url: 'http://localhost:8080/livro',
		  data:$scope.Object}).then(function (result) {
			  
			  $scope.livros.push(result);
   
        console.log("sucesso");
    }, function (result) {
        
    	console.log("erro");
    	console.log(result.data);
        console.log(result.status);
    });
	
	}; 
	
/*	$http.get("livros.json").success(function (result) {
        $scope.objectArray = result;
   
    
    }).error(function (error) {
        alert(error.error + "/" + error.statusCode);
    });*/


//    $scope.SubmitForm = function () {
//        this.objectArray.push({
//            nome: this.Object.nome,
//            edicao: this.Object.edicao,
//            sinopse: this.Object.sinopse,
//            autor: this.Object.autor,
//            estado: this.Object.estado,
//			  preco: "this.Object.preco"
//        });
//    }

}]);