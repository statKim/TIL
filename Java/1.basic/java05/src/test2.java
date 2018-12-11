
public class test2 {

	public static void main(String[] args) {
		
		int n1, n2;
		
		for (int i=1; i<100; i++) {
			n1 = i/10;
			n2 = i%10;

			if ((n1!=0)&&(n1%3==0)&&(n2%3==0)) {
				System.out.println(i + "¹Ú¼ö Â¦Â¦");
			} else if ((n1!=0)&&(n1%3==0)&&(n2%3!=0)
					||((n1%3!=0)&&(n2%3==0))
					||((n1==0)&&(n2%3==0))) {
				System.out.println(i + "¹Ú¼ö Â¦");
			}
		}

	}

}
