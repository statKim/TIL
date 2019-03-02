<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
[
<c:forEach items="${requestScope.datas}" var="data">
	{'text':'${data.text}', 'frequency':${data.frequency}},
</c:forEach>
	{'text':'Çý¿µ', 'frequency':50}
]
