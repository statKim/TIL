<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	<body>
        <h1>학생 정보 입력</h1>
        <form id="newStudentForm" name="newStudentForm" method="post" action="newStudentOk.jsp">
          <table>
            <tr><td>학번</td><td><input type="text" id="id" name="id"></td></tr>
            <tr><td>성명</td><td><input type="text" id="name" name="name"></td></tr>
            <tr><td>연락처</td><td><input type="text" id="hp1" name="hp1" size="3"> 
                    - <input type="text" id="hp2" name="hp2" size="4">
                    - <input type="text" id="hp3" name="hp3" size="4"></td></tr>   
            <tr><td>학년</td><td><input type="radio" id="year1" name="year" value="1" >1학년
                                     <input type="radio" id="year2" name="year" value="2">2학년
                                     <input type="radio" id="year3" name="year" value="3">3학년
                                     <input type="radio" id="year4" name="year" value="4">4학년</td></tr>
            <tr><td>학과</td>
                  <td><select id="department" name="department">
                               <option value="">선택하세요</option>
                               <option value="통계학과">통계학과</option>
                               <option value="항공우주공학과">항공우주공학과</option>
                               <option value="수학과">수학과</option>
                               <option value="국제경영학과">국제경영학과</option>
                               <option value="산업경영공학과">산업경영공학과</option>
                          </select></td></tr>
             <tr>
                <td colspan="2" align="center">
                    <br><input type="submit" value="완료">
                    <input type="reset" value="취소">
                </td>
            </tr>             
            </table>
    	</form>		
	</body>
</html>