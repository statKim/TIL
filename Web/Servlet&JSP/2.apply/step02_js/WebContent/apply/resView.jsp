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
		/* 1. EL tag�� js ������ �� ���� ����
				- EL �� �������� ������ ������� ����
			2. json ��ü�� ��ȯ ������ ���ڿ� ��� ����
				1. key�� value�� " " ǥ���� ���
						- JSON.parse()
				2.  key�� value�� ' ' ǥ���� ���
						- ��.��.�� eval() 
						- eval( "(" + ��ȯ ������ + ")") */
		
		//{'name' : '������', 'age' : 24}
		var data1 = "${requestScope.data1}";
		//data1 = JSON.parse(data1);
		data1 = eval("(" + data1 + ")");
		document.getElementById("nameView").value = data1.name;
		//alert(data1.name);
		
		/* 
		request.setAttribute("data1", "{'name' : '������', 'age' : 24}");
		var data1 = ${requestScope.data1};
		var data1 = '${requestScope.data1}';
		var data1 = "${requestScope.data1}";  */
	</script>
</body>
</html>







