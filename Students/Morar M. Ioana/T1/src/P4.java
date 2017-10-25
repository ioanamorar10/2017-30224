import java.util.Scanner;
public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[][] board=new int[n][n];
		int i,j,k;
		int max=n*n;
		for(k=1;k<=n/2+1;k++) {
		for(j=n-k;j>=k-1;j--) {
			board[n-k][j]=max;
			max=max-1;
			}
		for(i=n-1-k;i>=k-1;i--) {
			board[i][k-1]=max;
			max=max-1;
			}
		for(j=k;j<=n-k;j++) {
			board[k-1][j]=max;
			max=max-1;
			}
		for(i=k;i<=n-1-k;i++) {
			board[i][n-k]=max;
			max=max-1;
		}
		}
		
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
