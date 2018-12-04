/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var TempControllModule =(function(){
   var sendTempF=function(){
        var callback ={
            onSuccess: function(answer){
                console.log(answer);
            },
            onFailed: function(answer){
                alert("la peticion no pudo ser completada");
                console.log(answer);
            }
        };
       RestControllerModule.getTempF(callback);
    };
    return{
        sendTempF: sendTempF
    };
})();

