<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<c:url value="/testmaven/assets" var="URL"></c:url>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<%@ include file="/common/header.jsp"%>
	</div>
	<div>
		<sitemesh:write property="body"/>
		<script src="${URL}assets/global/plugins/jquery.min.js" type="text/javascript"></script>
		<script>
			function choosefile(fileInput)
			{
				if(fileInput.files && fileInput.files[0])
				{
					var reader=new FileReader();
					reader.onload=function(e)
					{
						$('#imagesuser').attr('src',e.target.result);
					}
					reader.readAsDataURL(fileInput.files[0]);
				}
			}
		</script>
	</div>
	<div>
		<%@ include file="/common/footer.jsp"%>
	</div>
</body>
</html>