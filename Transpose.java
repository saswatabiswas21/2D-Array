import java.util.*;
//import java.util.*;
class Transpose{
	public static void show(int arr[][],int r,int c){
		System.out.println("The main array is:: ");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		int arr1[][]=new int[c][r];
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				arr1[j][i]=arr[i][j];
			}
		}
		System.out.println("The transpose array is:: ");
		for(int i=0;i<c;i++){
			for(int j=0;j<r;j++){
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
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