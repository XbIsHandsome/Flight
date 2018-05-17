<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>航班信息展示</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link href="${pageContext.request.contextPath}/css/common.css"
	rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/show/bootstrap.css"
	rel="stylesheet" type="text/css"/>
<link rel="icon"
	href="${pageContext.request.contextPath}/image/xbzs.ico"
	type="image/x-icon" />
<link rel="shortcut icon"
	href="${pageContext.request.contextPath}/image/xbzs.ico" />
<link rel="Bookmark"
	href="${pageContext.request.contextPath}/image/xbzs.ico" />
</head>
<script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>
<script src="${pageContext.request.contextPath}/show/table.js"></script>
<script>
	$(function() {
		$('#transform').click(function() {
			$('#table-transform').bootstrapTable();
		});
		$('#destroy').click(function() {
			$('#table-transform').bootstrapTable('destroy');
		});
	});
</script>


<body>
	<s:include value="menu.jsp" />
	<div class="container index">
		<div class="span24">
			<table class="table table-bordered table-hover">
		<tr class="info">
			<td>飞机编号</td>
			<td>出发地</td>
			<td>目的地</td>
			<td>出发时间</td>
			<td>余座</td>
			<td>价格</td>
			<td>&nbsp;&nbsp;</td>
		</tr>
		<tr>
			<s:if test="#session.flight_list != null">
				<s:iterator value="#session.flight_list" var="f">
					<tr>
						<td><s:property value="#f.fid" /></td>
						<td><s:property value="#f.flight_from" /></td>
						<td><s:property value="#f.flight_to" /></td>
						<td><s:property value="#f.flight_time" /></td>
						<td><s:property value="#f.flight_seat" /></td>
						<td><s:property value="#f.flight_price" /></td>
						<td><a
							href="${pageContext.request.contextPath }/ticket_buy?fid=<s:property value="#f.fid"/>">购票</a></td>
					</tr>
				</s:iterator>
			</s:if>
		</tr>
	</table>
		</div>
	</div>
</body>
<s:include value="footer.jsp" />
</html>
