<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" charset="UTF-8">
<title>회원등록페이지</title>
<%@ include file="member_header.jsp"%>
</head>
<body>
	<%@ include file="member_menu.jsp"%>
	<form name="form1" method="post" action="${path}/member/insert.do">
		<table border="1">
			<tr>
				<td>아이디</td>
				<td><input name="userId"></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="userPw"></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input name="userName"></td>
			</tr>
			<tr>
				<td>이메일 주소</td>
				<td><input name="userEmail"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="확인">
					<input type="reset" value="취소"></td>
			</tr>
		</table>

	</form>
</body>
</html>