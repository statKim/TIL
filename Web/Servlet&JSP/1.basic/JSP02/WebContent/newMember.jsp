<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
	<head>
		<meta charset="UTF-8">
		<title>회원가입용</title>
	</head>
	<body>
        <h1>회원 가입</h1>
        <form id="newMemberForm" name="newMemberForm" method="post" action="newMemberOk.jsp">
          <table>
            <tr><td>ID</td><td><input type="text" id="id" name="id"></td></tr>
            <tr><td>비밀번호</td><td><input type="password" id="pwd" name="pwd"></td></tr>
            <tr><td>성명</td><td><input type="text" id="name" name="name"></td></tr>
            <tr><td>휴대폰 번호</td><td><input type="text" id="hp1" name="hp1" size="3"> 
                    - <input type="text" id="hp2" name="hp2" size="4">
                    - <input type="text" id="hp3" name="hp3" size="4"></td></tr>   
            <tr><td>주소</td><td><input type="text" id="address" name="address" size="30"></td></tr>        
            <tr>
                <td colspan="2" align="center">
                    <br>
                    <input type="submit" value="가입">
                    <input type="reset" value="취소">
                </td>
            </tr>             
		</table>
      </form>	          
    </body>
</html>