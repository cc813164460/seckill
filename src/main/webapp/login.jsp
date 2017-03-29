<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>登录</title>
    </head>
    <body class="index">
        <div class="login_box">
            <table>
                <tr>
                    <td class="login_info">账号：</td>
                    <td ><input name="" type="text" class="width150" id="username"/></td>
                </tr>
                <tr>
                    <td class="login_info">密码：</td>
                    <td><input name="" type="password" class="width150" id="userpwd"/></td>
                </tr>
                <tr>
                    <td colspan="2"><button style="cursor:pointer" onclick="fnLogin()">登录</button></td>
                </tr>
            </table>
        </div>
    </body>
  <script type="text/javascript">
	  function fnLogin(){
		  var xmlhttp;
			if (window.XMLHttpRequest) {
				xmlhttp = new XMLHttpRequest();
			} else {
				xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
			}
			xmlhttp.open("POST", "action/userAction!login.do" ,true);
			xmlhttp.setRequestHeader("Content-type","application/x-www-form-urlencoded");
			xmlhttp.setRequestHeader("x-requested-with", "XMLHttpRequest");
			xmlhttp.onreadystatechange = function() {
				if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
					try {
						alert(xmlhttp.responseText)
					} catch (error) {
						toNotice("validate","validateError","发生异常，请刷新后重试，或联系管理员");
					} finally {
					}

				} else if (xmlhttp.readyState == 4) {
					alert("失败")
				}
			}
			xmlhttp.send("username=" + document.getElementById("username").value + 
					"&password=" + document.getElementById("userpwd").value);
	  }
  </script>
</html>
