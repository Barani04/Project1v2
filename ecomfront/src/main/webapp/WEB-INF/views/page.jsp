<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />
<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>TECH STORE - ${title}</title>

<script type="text/javascript">
		window.menu = '${title}';
</script>
<!-- Bootstrap Core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">
<!-- Bootstrap Lumen theme CSS -->
<link href="${css}/bootstrap-spacelab-theme.min.css" rel="stylesheet">
<!-- Custom CSS -->
<link href="${css}/custom.css" rel="stylesheet">
</head>
<body>
	<div class="wraper">
			<!-- Navigation -->
		<%@include file="common/navbar.jsp" %>

			<!-- Page Content -->
	<div class="content">
		<c:if test="${userClickedHome == true }">
			<%@include file="home.jsp" %>	
		</c:if>	
	
		<c:if test="${userClickedAbout == true }">
			<%@include file="about.jsp" %>	
		</c:if>	
	
		<c:if test="${userClickedContact == true }">
			<%@include file="contact.jsp" %>	
		</c:if>	
		
		<c:if test="${userClickedAllProducts == true  or userClickedCategoryProducts == true  }">
			<%@include file="productList.jsp" %>	
		</c:if>	
		
	</div>
			<!-- Footer -->
		<%@include file="common/footer.jsp" %>
	
	<!-- jQuery -->
	<script src="${js}/jquery.js"></script>
	<!-- Bootstrap Core JavaScript -->
	<script src="${js}/bootstrap.min.js"></script>
	<!-- custom JavaScript -->
	<script src="${js}/custom.js"></script>
</div>
</body>

</html>
