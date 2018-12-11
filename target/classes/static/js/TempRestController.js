/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var RestControllerModule =(function (){
    var getTempF = function(valor,callback){
            axios.get('/temp/F/'+valor)
                    .then(function(response){
                        callback.onSuccess(response.data);
                        console.log(response.data);
                    })
                    .catch(function(error){
                        callback.onFailed(error.data);
                        console.log(error.data);
                    });
    };
    var getTempC =function(valor,callback){
        axios.get('/temp/C/'+valor)
                    .then(function(response){
                        callback.onSuccess(response.data);
                        console.log(response.data);
                    })
                    .catch(function(error){
                        callback.onFailed(error.data);
                        console.log(error.data);
                    });
    }
    return{
      getTempF:getTempF,
      getTempC:getTempC
    };   
        
  })();
