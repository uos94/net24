<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!DOCTYPE html>
<html lang="ko">
<head>
<title>::: KCS Frame Exception Resolver :::</title>
</head>
<body>

<div id="layoutSidenav">
 
	<div id="layoutSidenav_content">
		<p>excpCd : ${excpCd}</p>
		<p>excpMsg : ${excpMsg}</p>
		<p>excpCdMsg : ${excpCdMsg}</p>
		<p>excpPath : ${excpPath}</p>
		<p>excpMethod : ${excpMethod}</p>
		<p>${excpToStr}</p>
	</div>
	
</div>

</body>
</html>