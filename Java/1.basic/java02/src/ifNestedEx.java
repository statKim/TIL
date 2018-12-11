import java.util.Scanner;
import java.text.DecimalFormat;

public class KHSifNestedEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###");	// 천자리 표시하기 위해
		
		int num, count, price, total, dis;
		String name;
		
		System.out.println("******* 상품 정보 *******");
		System.out.println("1 노트북 : 1,200,000 원");
		System.out.println("2 디지털카메라 : 400,000 원");
		System.out.println("*********************");
		System.out.print("상품번호 입력 : ");
		num = sc.nextInt();
		
		if ((num==1) || (num==2)) {
			
			if (num==1) {
				name = "노트북";
				price = 1200000;
			} else {
				name = "디지털카메라";
				price = 400000;
			}
			
			System.out.print("주문 수량 입력 : ");
			count = sc.nextInt();
			total = price * count;
			
			if (total>=1000000) {
				dis = (int)(total*0.1);	
			} else if (total>=500000) {
				dis = (int)(total*0.05);
			} else {
				dis = 0;
			}
			
//			System.out.println("******* 주문 내용 *******");
//			System.out.println("상품명 : " + name);
//			System.out.println("가격 : " + price + " 원");
//			System.out.println("주문 수량 : " + count + " 개");
//			System.out.println("주문액 : " + total + " 원");
//			System.out.println("할인액 : " + dis + " 원");
//			System.out.println("총지불액 : " + (total - dis) + " 원");
			
			// 천자리 구분
			System.out.println("******* 주문 내용 *******");
			System.out.println("상품명 : " + name);
			System.out.println("가격 : " +  df.format(price) + " 원");
			System.out.println("주문 수량 : " + count + " 개");
			System.out.println("주문액 : " + df.format(total) + " 원");
			System.out.println("할인액 : " + df.format(dis) + " 원");
			System.out.println("총지불액 : " + df.format(total - dis) + " 원");
			
		} else {
			System.out.println("잘못 입력하였습니다. 종료합니다.");
		}
		
		sc.close();
		
	}

}
