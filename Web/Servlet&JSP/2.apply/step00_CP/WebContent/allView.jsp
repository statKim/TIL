<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%-- jstl tag�� �ܺ� ���� tag�� ����ϱ� ���� �ʼ� ���� --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
	��� �� ������ jstl tag�� ���<br>
	<table border="1">
		<c:forEach items="${requestScope.allData}" var="data">
			<tr>
				<td>${data.id}</td>
				<td>${data.pw}</td>
				<td>${data.name}</td>
			</tr>
		</c:forEach>
	</table>