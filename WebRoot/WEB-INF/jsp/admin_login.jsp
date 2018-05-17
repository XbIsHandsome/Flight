<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
	<title>会员登录</title>
	<link href="${pageContext.request.contextPath}/css/common.css" rel="stylesheet" type="text/css"/>
	<link href="${pageContext.request.contextPath}/css/login.css" rel="stylesheet" type="text/css"/>
	<link rel="icon" href="${pageContext.request.contextPath}/image/xbzs.ico" type="image/x-icon" />
	<link rel="shortcut icon" href="${pageContext.request.contextPath}/image/xbzs.ico"/>
	<link rel="Bookmark" href="${pageContext.request.contextPath}/image/xbzs.ico"/>
</head>
<body>

	
<%@include file="menu.jsp" %>
<script>
	
	function checkForm() {
		if (form.adminname.value == "") {
			document.getElementById("span_username").innerHTML = "<font color='red'>用户名不能为空</font>";
			form.adminname.focus();
			return false;
		}
		if (form.adminpass.value == "") {
			document.getElementById("span_password").innerHTML = "<font color='red'>密码不能为空</font>";
			form.adminpass.focus();
			return false;
		}
	}
	
	function changeimg() {
		var checkimg = document.getElementById("checkimg");
		checkimg.src = "${pageContext.request.contextPath}/checkimg.action?"+new Date().getTime();
	}
	
</script>	
<div class="container login">
		<div class="span12">
			<div class="ad">
					<img src="${pageContext.request.contextPath}/image/login.jpg" width="500" height="330" alt="会员登录" title="会员登录"/>
			</div>		
		</div>
		
		<div class="span12 last">
			<div class="wrap">
				<div class="main">
					<div class="title">
						<strong>管理员登录</strong>USER LOGIN 
					</div>
					<div class="title">
						<font color="red"><s:actionmessage/></font>
					</div>
					<form id="loginForm"  method="post" novalidate="novalidate" name="form"
					action="${pageContext.request.contextPath }/admin_login.action" onsubmit="return checkForm();">
						<table>
							<tbody><tr>
								<th>用户名</th>
								<td>
									<input type="text" id="username" name="adminname" class="text" maxlength="20"/>
									<span id="span_username"/>
								</td>
							</tr>
							<tr>
								<th>密&nbsp;&nbsp;码:</th>
								<td>
									<input type="password" id="password" name="adminpass" class="text" maxlength="20" autocomplete="off"/>
									<span id="span_password"/>
								</td>
							</tr>
								<tr>
									<th>验证码:</th>
									<td>
										<span class="fieldSet">
											<input type="text" id="loginCheckCode" name="loginCheckCode" 
											class="text captcha" maxlength="4" autocomplete="off"/>
											<img id="checkimg" class="captchaImage" 
											src="${pageContext.request.contextPath}/checkimg.action" 
											title="点击更换验证码" onclick="changeimg()"/>
										</span>
										<span><font color="red"><s:actionerror/></font></span>
									</td>
								</tr>
							<tr>
								<th>&nbsp;
									
								</th>
								<td>
									<label>
										<input type="checkbox" id="isRememberUsername" name="isRememberUsername" value="true"/>记住用户名
									</label>
									<label>
										&nbsp;&nbsp;<a >找回密码</a>
									</label>
								</td>
							</tr>
							<tr>
								<th>&nbsp;
									
								</th>
								<td>
									<input type="submit" class="submit" value="登 录"/>
								</td>
							</tr>
							<tr class="register">
								<th>&nbsp;
									
								</th>
								<td>
									<dl>
										<dt>还没有注册账号？</dt>
										<dd>
											立即注册即可体验在线购票！
											<a href="#">立即注册</a>
										</dd>
									</dl>
								</td>
							</tr>
						</tbody></table>
					</form>
				</div>
			</div>
		</div>
	</div>
<%@include file="footer.jsp" %>
</body></html>