import java.util.Scanner;
public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1=3;
		int number2=5;
		Scanner in=new Scanner(System.in);
		int maxim=in.nextInt();
		int sum=0;
		while (number1<maxim) {
			sum=sum+number1;
			number1=number1+3;
		}
		while (number2<maxim) {
			sum=sum+number2;
			number2=number2+5;
		}
		System.out.println("suma este:" + sum);
	}

}
