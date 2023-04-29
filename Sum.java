import java.util.*;
class Sum{
	public static void show(int arr[][],int r,int c){
		int l=0,m=0;
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				l=l+arr[i][j];
			}
			System.out.println("Sum of "+(i+1)+" no row is:: "+l);
			l=0;
		}
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				m=m+arr[j][i];
			}
			System.out.println("Sum of "+(i+1)+" no column is:: "+m);
			m=0;
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:: ");
		int n=sc.nextInt();
		System.out.println("Enter the number of column:: ");
		int m=sc.nextInt();
		int array[][]=new int[n][m];
		System.out.println("Enter the 2D array:: ");
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				array[i][j]=sc.nextInt();
			}
		}
		show(array,n,m);
	}
}