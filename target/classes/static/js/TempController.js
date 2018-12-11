/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var TempControllModule =(function(){
   var sendTempF=function(){
       var valor =document.getElementById('value').value;
        var callback ={
            onSuccess: function(answer){
                console.log(answer);
                document.getElementById('respuesta').innerHTML=answer;
            },
            onFailed: function(answer){
                alert("la peticion no pudo ser completada");
                console.log(answer);
            }
        };
       RestControllerModule.getTempF(valor,callback);
    };
    var sendTempC=function(){
        var valor =document.getElementById('value').value;
        var callback ={
            onSuccess: function(answer){
                console.log(answer);
                document.getElementById('respuesta').innerHTML=answer;
            },
            onFailed: function(answer){
                alert("la peticion no pudo ser completada");
                console.log(answer);
            }
        };
        RestControllerModule.getTempC(valor,callback);
    }
    return{
        sendTempF: sendTempF,
        sendTempC: sendTempC
    };
})();

