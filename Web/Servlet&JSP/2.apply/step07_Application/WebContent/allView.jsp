<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" 
	uri = "http://java.sun.com/jsp/jstl/core"%>
��� �� ������ jstl tag�� ��� <br>
<table border="1">
	<tr>
		<th>��з�</th>
		<th>�ߺз�</th>
		<th>�Ұ�</th>
	</tr>
	<c:forEach var="data" items="${requestScope.data}">
		<tr>
			<td>${data.bigClassify}</td>
			<td>${data.middleClassify}</td>
			<td>${data.crimeSum}</td>
		</tr>
	</c:forEach>
</table>