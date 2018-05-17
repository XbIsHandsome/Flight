<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<div class="container header">
	<div class="span5">
		<div class="logo">
			<a href="${pageContext.request.contextPath}/index.action">
				<img src="${pageContext.request.contextPath}/image/r___________renleipic_01/logo.gif" alt="许兵贼帅"/>
			</a>
		</div>
	</div>
	<div class="span9">
<div class="headerAd">
	<img src="${pageContext.request.contextPath}/image/header.jpg" width="320" height="50" alt="正品保障" title="正品保障"/>
</div>	
</div>


<div class="span10 last">
		<div class="topNav clearfix">
			<ul>
				<s:if test="#session.exitUser == null">
				<li id="headerLogin" class="headerLogin" style="display: list-item;">
					<a href="${ pageContext.request.contextPath }/user_loginPage.action">登录</a>|
				</li>
				<li id="headerRegister" class="headerRegister" style="display: list-item;">
					<a href="${ pageContext.request.contextPath }/user_registPage.action">注册</a>|
				</li>
				</s:if>
				<s:else>
					<li id="headerLogin" class="headerLogin" style="display: list-item;">
						<s:property value="#session.exitUser.username"/>|
					</li>
					<li id="headerLogin" class="headerLogin" style="display: list-item;">
						<a href="${ pageContext.request.contextPath }/order_myOrderList.action?page=1">我的订单</a>|
					</li>
					<li id="headerLogin" class="headerLogin" style="display: list-item;">
						<a href="${ pageContext.request.contextPath }/user_quit.action">注销</a>|
					</li>
				</s:else>
				<li>
					<a>会员中心</a>
					|
				</li>
				<li>
					<a>购物指南</a>
					|
				</li>
				<li>
					<a>关于我们</a>
					
				</li>
			</ul>
		</div>
		<div class="cart">
			<a  href="${pageContxt.request.contextPath }/xbzs2/cart_myCart.action?page=1">购物车</a>
		</div>
			<div class="phone">
				客服热线:
				<strong>96008/53277764</strong>
			</div>
	</div>
	<div class="span24">
		<ul class="mainNav">
			<li>
				<a href="${pageContxt.request.contextPath }/xbzs2/index.action">首页</a>
				|
			</li>
			<s:iterator value="#session.cList" var="c">
			<li>
				<a href="${pageContxt.request.contextPath }/xbzs2/product_findByCid.action?cid=<s:property value="#c.cid"/>&page=1">
				<s:property value="#c.cname"/></a>
				|
			</li>
			</s:iterator>
		</ul>
	</div>
		

</div>	