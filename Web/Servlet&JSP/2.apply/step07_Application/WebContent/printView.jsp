<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
[
          ['Age', 'Number of Crime'],
          <c:forEach items="${requestScope.crimeMan}"  var="data">    
	          ['20������', ${data.sum1}],
	          ['21-30', ${data.sum2}],
	          ['31-40', ${data.sum3}],
	          ['41-50', ${data.sum4}],
	          ['51-60', ${data.sum5}],
	          ['61-70', ${data.sum6}],
	          ['70�� �̻�', ${data.sum7}]
          </c:forEach>         
]