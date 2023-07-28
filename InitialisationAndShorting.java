import java.util.*;
class InitialisationAndShorting{
	public static void scarch(int arr[][],int key){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				if(arr[i][j]==key)
					System.out.println("The key is at "+i+" , "+j);
			}
		}
	}
	public static void show(int arr[][]){
		System.out.println("The entered matrix is:: ");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows of the array:: ");
		int r=sc.nextInt();
		System.out.println("Enter the column of the array:: ");
		int c=sc.nextInt();
		int arr[][]=new int[r][c];
		System.out.println("Enter the array element:: ");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		show(arr);
		System.out.println("Enter the key:: ");
		int k=sc.nextInt();
		scarch(arr,k);
	}
}