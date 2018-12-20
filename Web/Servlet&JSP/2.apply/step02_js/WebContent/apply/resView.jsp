<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>apply/resView.jsp</title>
</head>
<body>
	<input type="text" id="nameView">
	
	<script type="text/javascript">
		/* 1. EL tag로 js 변수에 값 대입 가능
				- EL 은 서버에서 실행한 결과값을 응답
			2. json 객체로 변환 가능한 문자열 고려 사항
				1. key와 value가 " " 표기인 경우
						- JSON.parse()
				2.  key와 value가 ' ' 표기인 경우
						- 반.드.시 eval() 
						- eval( "(" + 변환 데이터 + ")") */
		
		//{'name' : '강상현', 'age' : 24}
		var data1 = "${requestScope.data1}";
		//data1 = JSON.parse(data1);
		data1 = eval("(" + data1 + ")");
		document.getElementById("nameView").value = data1.name;
		//alert(data1.name);
		
		/* 
		request.setAttribute("data1", "{'name' : '강상현', 'age' : 24}");
		var data1 = ${requestScope.data1};
		var data1 = '${requestScope.data1}';
		var data1 = "${requestScope.data1}";  */
	</script>
</body>
</html>







