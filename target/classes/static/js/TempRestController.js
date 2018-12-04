/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var RestControllerModule =(function (){
    var getTempF = function(callback){
            axios.get('/temp')
                    .then(function(response){
                        callback.onSuccess(response.data);
                        console.log(response.data);
                    })
                    .catch(function(error){
                        callback.onFailed(error.data);
                        console.log(error.data);
                    });
    };
    return{
      getTempF:getTempF  
    };   
        
  })();
