
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
        //如果ajax传递的是一个json对象，那么会自动将该对象
        // 转换成key=value&key=value... 字符串形式便于后台req.getParamter(“key”)接收
        // data: person,
        data:"",
        dataType:"json",
        success: function(msg){
            console.log(msg)
        }
    });
}

