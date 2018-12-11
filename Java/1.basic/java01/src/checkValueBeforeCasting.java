// byte로 강제변환 전 변환하면서 데이터 손실 발생하는지 확인하는 코드
public class KHScheckValueBeforeCasting {

	public static void main(String[] args) {
		
		int i = 128;	// 변환 불가	byte 범위 : (-128~127)
		//int i = 127;	// 변환됨
		//int i = -128;	// 변환됨
		
		if ( (i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE)) {	//i가 byte의 최소보다 작거나 최대보다 크면
			System.out.println("byte 타입으로 변환할 수 없습니다.");	// 변환불가능하다는 문구 출력
			System.out.println("값을 다시 확인해 주세요");
		} else {
			byte b = (byte) i;								// byte의 범위 안에 들면 
			System.out.println(b);							// int값을 byte값으로 변환
			
		}

	}

}
