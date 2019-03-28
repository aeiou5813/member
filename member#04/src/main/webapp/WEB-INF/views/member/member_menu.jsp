<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- jstl 코어태그 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- jstl 코어태그 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!--context 경로 -->
<c:set var="path" value="${pageContext.request.contextPath}" />
<div style="text-align: center;">
	<a href="${path}/member/list.do">회원관리</a>
</div>
<hr>