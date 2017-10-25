
public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1=1;
		int number2=2;
		int sum=2;
		int number3=3;
		while (number3<4000) {
			if (number3%2 == 0){
			sum=sum+number3;
			}
			number1=number2;
			number2=number3;
			number3=number1+number2;
		}
		System.out.println(sum);
	}

}
