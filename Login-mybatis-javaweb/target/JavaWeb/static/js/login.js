
function login(){
   var username = $(".username").val();
   var password = $(".password").val();
   var person = {
       username:"limingji",
       password:"你好啊"
   }
    $.ajax({
        type: "get",
        url: "login",
        //ajax传递json对象
        data: person,
        dataType:"json",
        success: function(msg){
            console.log(msg)
        }
    });
}

