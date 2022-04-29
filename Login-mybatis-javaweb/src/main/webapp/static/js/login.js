
function login(){
   var username = $(".username").val();
   var password = $(".password").val();
   var person = {
       name:"limingji",
       sex:"nan",
       school:"湖南工商大学"
   }
    $.ajax({
        type: "get",
        url: "login",
        data: {"person":person},
        dataType:"json",
        success: function(msg){
            console.log(msg)
        }
    });
}

