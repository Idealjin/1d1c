<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../common/header.jsp"/>
	<h3>EMPLOYEE 테이블에서 EMP_ID를 이용하여 사원정보 조회해오기</h3>
	<form action="employee/select">
	  <label>조회할 사번 :</label>
	  <input type="text" name="empId" id="empId">
	  <button type="submit">조회하기</button>
	</form>

</body>
</html>