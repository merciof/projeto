var app=angular.module("app",[]);

app.controller("controller",function(){
    this.objectArray=[{nome:"Java Como Programar",edicao:"Terceira",sinopse:"blablabla",autor:"Deitel",estado:"semi noovo"}]

    this.SubmitForm=function(){
    this.objectArray.push({nome:this.Object.nome,edicao:this.Object.edicao,sinopse:this.Object.sinopse,autor:this.Object.autor,estado:this.Object.estado});
    }

});

