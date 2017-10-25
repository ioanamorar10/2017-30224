
public class P3 {
	public static int verifPal(int n) {
		int copy=n;
		int reverse=0;
		
		while (copy != 0) {
			reverse = reverse*10;
			reverse = reverse + copy%10;
			copy=copy/10;
		}
		if (n==reverse)
			return 1;
		else 
			return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ok=0;
		int max=999*999;
		while (max>10000 && ok==0) {
			if (verifPal(max)==1) {
				ok=1;
			System.out.println("Cel mai mare palindrom: " + max);
			}
			else
				max=max-999;
		}
	}

}
