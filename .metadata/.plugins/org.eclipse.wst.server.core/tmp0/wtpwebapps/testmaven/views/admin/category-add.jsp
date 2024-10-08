<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<form action="${pageContext.request.contextPath}/admin/category/insert"
	method="post" enctype="multipart/form-data">
	<label for="categoryname">Category name:</label><br> <input
		type="text" id="categoryname" name="categoryname"><br> <label
		for="images">Images:</label><br>
	<c:url value="/image?fname=default.png" var="imgUrl"></c:url>
	<img height="150" width="200" src="${imgUrl}" id="imagess" /> <input
		type="file" id="imagess" name="images" onchange="choosefile(this)"><br>
	<br> <label for="status">Status:</label><br> <input
		type="text" id="status" name="status"><br>
	<br> <input type="submit" value="Submit">

</form>
