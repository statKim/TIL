<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%-- jstl tag�� �ܺ� ���� tag�� ����ϱ� ���� �ʼ� ���� --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
	��� �� ������ jstl tag�� ���<br>
	<table border="1">
		<c:forEach items="${requestScope.allData}" var="data">
			<tr>
				<td>${data.national}</td>
				<td>${data.gender}</td>
				<td>${data.gend_total}</td>
				<td>${data.age4}</td>
				<td>${data.age9}</td>
				<td>${data.age14}</td>
				<td>${data.age19}</td>
				<td>${data.age24}</td>
				<td>${data.age29}</td>
				<td>${data.age34}</td>
				<td>${data.age39}</td>
				<td>${data.age44}</td>
				<td>${data.age49}</td>
				<td>${data.age54}</td>
				<td>${data.age59}</td>
				<td>${data.age60}</td>
			</tr>
		</c:forEach>
	</table>