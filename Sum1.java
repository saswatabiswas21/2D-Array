import java.util.*;
class Sum1{
	public static void show(int arr[][],int n){
		int r=0;
		for(int i=0;i<n;i++){
			r=r+arr[i][i];
		}
		System.out.println("The sum of diagonal is:: "+r);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of row & column:: ");
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		System.out.println("Enter the array:: ");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				a[i][j]=sc.nextInt();
			}
		}
		show(a,n);
	}
}