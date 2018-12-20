<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% request.setCharacterEncoding("utf-8"); %>

<% String pageName = request.getParameter("pageName"); %>
포함하는 페이지 includeTest.jsp 입니다.<br>

<hr>
여기에 다음 페이지가 포함됩니다.<br>
<jsp:include page="<%=pageName %>" flush="false"/>

<hr>
includeTest.jsp의 나머지 내용입니다.