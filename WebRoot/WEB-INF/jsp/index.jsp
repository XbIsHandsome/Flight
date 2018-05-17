<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>商城首页</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<meta http-equiv="pragma" content="no-cache" />
	<meta http-equiv="cache-control" content="no-cache" />
	<link href="${pageContext.request.contextPath}/css/common.css" rel="stylesheet" type="text/css" />
	<link href="${pageContext.request.contextPath}/css/date.css" rel="stylesheet" type="text/css" />
	<link href="${pageContext.request.contextPath}/css/register.css" rel="stylesheet" type="text/css" />
	<link rel="icon" href="${pageContext.request.contextPath}/image/xbzs.ico" type="image/x-icon" />
	<link rel="shortcut icon" href="${pageContext.request.contextPath}/image/xbzs.ico" />
	<link rel="Bookmark" href="${pageContext.request.contextPath}/image/xbzs.ico" />
	<script src="http://www.jq22.com/jquery/1.8.3/jquery.min.js"></script>

<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.date_input.pack.js"></script> 
<script type="text/javascript">

$(function(){

	$('.date_picker').date_input();

	})

</script>
<script type="text/javascript">
	function checkForm() {
		if (form.from.value == "") {
			document.getElementById("span_from").innerHTML = "<font color='red'>出发地不能为空</font>";
			form.from.focus();
			return false;
		}
		if (form.to.value == "") {
			document.getElementById("span_to").innerHTML = "<font color='red'>目的地不能为空</font>";
			form.to.focus();
			return false;
		}
		if (form.date.value != form.date.value) {
			document.getElementById("span_date").innerHTML = "<font color='red'>出发时间不能为空</font>";
			form.date.focus();
			return false;
		}
</script>
</head>

<body>
	<%@include file="menu.jsp"%>
	<div class="container register">
		<div class="span24">
			<div class="wrap">
				<div class="main clearfix">
					<div class="title">
						<strong>机票查询</strong>TICKET SEARCHING
					</div>
					<div class="title">
						<font color="red"><s:actionerror /></font>
					</div>
					<form id="registerForm" name="form" method="post"  onsubmit="return checkForm();"
						action="${pageContext.request.contextPath}/flight_search.action">
						<table>
							<tbody>
								<tr>
									<th><span class="requiredField">*</span>起点（FROM）</th>
									<td><input type="text" id="from" name="flight_from"
										class="text" maxlength="20" onblur="checkFrom()" /> <span
										id="span_from" /></td>

								</tr>
								<tr>
									<th><span class="requiredField">*</span>终点（TO）:</th>
									<td><input type="text" id="to" name="flight_to"
										class="text" maxlength="20" onblur="checkFrom()" /> <span
										id="span_to"></span></td>
								</tr>
								<tr>
									<th><span class="requiredField">*</span>日期（DATE）:</th>
									<td><input id="date" name="flight_time" maxlength="20"
										type="text" class="date_picker text" onblur="checkFrom()"/> <span id="span_date"></span></td>
								</tr>
								<tr>
									<th>&nbsp;</th>
									<td><input type="submit" class="submit" value="点击查询" /></td>
								</tr>

							</tbody>
						</table>
						<div class="login">
							<div class="ad">
								<dl>
									<dt>注册即享受</dt>
									<dd>正品保障、正规发票</dd>
									<dd>货到付款、会员服务</dd>
									<dd>自由退换、售后上门</dd>
								</dl>
							</div>
							<dl>
								<dt>已经拥有账号了？</dt>
								<dd>
									立即登录即可体验在线购票！ <a
										href="${pageContext.request.contextPath }/user_loginPage.action">立即登录</a>
								</dd>
							</dl>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<%@include file="footer.jsp"%>
</body>
</html>