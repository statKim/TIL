<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% request.setCharacterEncoding("utf-8"); %>

<%
	request.setAttribute("id", "hgdong@hkd.com");
	request.setAttribute("name","홍길동");
%>

forwardForm.jsp 페이지입니다.<br>
화면에 절대로 표시되지 않습니다.<br>

<jsp:forward page="forwardTo.jsp"/>