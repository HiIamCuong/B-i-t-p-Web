<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="col-sm-6">
		<ul class="list-inline right-topbar pull-right">
			<li><img src="${sessionScope.account.avatar}"
				style="width: 100px; height: 70px;"> Hello manager: <a
				href="${pageContext.request.contextPath}/member/myaccount">${sessionScope.account.fullname}</a>
				| <a href="${pageContext.request.contextPath }/logout">Đăng Xuất</a></li>
			<li><i class="search fa fa-search search-button"></i></li>
		</ul>
	</div>
</body>
</html>