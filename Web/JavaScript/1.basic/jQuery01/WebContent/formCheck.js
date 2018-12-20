/**
 * formCheck.j
 * 회원가입 폼 입력 확인
 */

$(function() {
	//엔터키 눌렀을 때 무조건 submit 안되도록
	//문서 전체에 이벤트 처리
	//[Enter] 키의 아스키 코드값 : 13
	$(document).on("keydown", function(e){
		if (e.keyCode == 13)
			return false;
	});
	
	$("#id").focus();	//시작 시 id에 포커스
	
	//엔터키 눌렀을 때 포커스 이동
	//아이디 입력 후 엔터키 눌렀을 때 비밀번호로 포커스 이동
	$("#id").on("keydown", function(e){
		if ($("#id").val() != "" && e.keyCode == 13)	//아이디를 입력해야만 이동
		//if (e.keyCode == 13)	//입력하지 않아도 이동하게 될 경우
			$("#pwd").focus();
	});
	
	//input 텍스트 입력란과 비밀번호 입력란에 포커스 있을 때 색상 변경
	$("input[type='text'], input[type='password']").on("focus",function(){
		$(this).css("background-color","rgb(232,232,232)");
		//$(":submit,:reset").css("background-color","rgb(232,232,114)");
	});

	//포커스 잃을 때
	$("input[type='text'], input[type='password']").on("blur",function(){
		$(this).css("background-color","white");
		//$(":submit,:reset").css("background-color","rgb(232,232,232)");
	});
	
	//newMemberForm의 submit(전송) 버튼 누를 때
	$("#newMemberForm").on("submit",function(){
		if ($("#id").val()=="") {	//아이디 입력하지 않은 경우
			alert("아이디를 입력하세요.");
			$("#id").focus();
			return false;	//서버로 전송되지 않도록 전송 기능 막음
		}
		
		if ($("#pwd").val()==""){	//비밀번호 입력하지 않은 경우
			alert("비밀번호를 입력하세요.");
			$("#pwd").focus();
			return false;
		}
		
		//라디오버튼 선택하지 않은 경우
		if (!$("input[type='radio']").is(":checked")){
			alert("학년을 선택하세요.");
			return false;
		}
		
		//체크박스를 선택하지 않은 경우
		if (!$("input[type='checkbox']").is(":checked")){
			alert("관심분야는 1개 이상 선택하세요.");
			return false;
		}
		
		if ($("select").val()==""){	//select 입력하지 않은 경우
			alert("학과를 입력하세요.");
			$("select").focus();
			return false;
		}
	});	//폼 submit 끝
	
	//키보드 이벤트
	//첫 번째 번호 입력란에서 입력란이 3개가 되면 포커스 이동
	$("#hp1").on("keyup",function(){
		if ($(this).val().length == 3)
			$("#hp2").focus();
	});
	
	//두 번째 번호 입력란에서 입력란이 4개가 되면 포커스 이동
	$("#hp2").on("keyup",function(){
		if ($(this).val().length == 4)
			$("#hp3").focus();
	});
});	//$(function()) 끝