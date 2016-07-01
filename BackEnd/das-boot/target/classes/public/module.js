var app = angular.module("app", []);

app.controller('controller', ['$scope', '$http', function ($scope, $http) {

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


    $scope.SubmitForm = function () {
        this.objectArray.push({
            nome: this.Object.nome,
            edicao: this.Object.edicao,
            sinopse: this.Object.sinopse,
            autor: this.Object.autor,
            estado: this.Object.estado
        });
    }

}]);

var app2 = angular.module("app2", []);