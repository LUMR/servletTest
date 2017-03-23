/**js
 * Created by lumr on 2017/3/23.
 */
var xmlHttp;
function check() {
    //创建XMLHttpReQuest对象
    if (window.XMLHttpRequest){
        //true时，说明是新版本IE或其他浏览器
        xmlHttp = new XMLHttpRequest();
    }else {
        //false时，为老版本IE
        xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
    }
    //初始化组件
    var url = "/ajax"
    xmlHttp.open("POST",url,true);
    xmlHttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    //定义回调函数
    xmlHttp.onreadystatechange = callBack;
    //发送请求
    var userName = document.getElementsByName("name")[0].value;
    var password = document.getElementsByName("password")[0].value;
    // alert("名字："+userName+"密码："+password);
    var userInfo = "name="+userName+"&password="+password;
    xmlHttp.send(userInfo);
}

function callBack() {
    if(xmlHttp.readyState == 4 && xmlHttp.status == 200) {
        var callBackText = xmlHttp.responseText;
        document.getElementById("result").innerHTML = callBackText;
    }

}