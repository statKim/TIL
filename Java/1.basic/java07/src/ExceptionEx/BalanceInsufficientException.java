package ExceptionEx;

//사용자 정의 예외 클래스 선언
//생성자 2개
//Exception 패키지를 상속받아서 모든 예외처리 기능들을 가져옴!!!
public class BalanceInsufficientException extends Exception {
	public BalanceInsufficientException() { } //기본 생성자
	
	//예외 발생 원인(예외 메시지)를 전달하기 위해 String 타입 매개변수를 갖는 생성자
	//상위 클래스의 생성자를 호출하여 예외 메시지 전달
	//예외 메시지 용도는 catch{ } 블록의 예외 처리 코드에서 이용
	public BalanceInsufficientException(String message) {
		super(message);
	}
}
