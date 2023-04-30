import java.util.*;
class Spiral{
	public static void show(int a[][],int r,int c){
		System.out.println("The matrix is:: ");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int r1=0,c1=0,count=0;
		System.out.println("The spiral matrix is:: ");
		while(r1<r&&c1<c){
				for(int i=0;i<c;i++){
				System.out.print(a[r1][i]+" ");
			}
			r1++;
			for(int i=r1;i<r;i++){
				System.out.print(a[i][c-1]+" ");
			}
			c--;
			if(r1<r){
				for(int i=c-1;i>=count;i--){
					System.out.print(a[r-1][i]+" ");
				}
				r--;
				count++;
			}
			if(c1<c){
				for(int i=r-1;i>r1;i--){
					System.out.print(a[i][c1]+" ");
				}
				c1++;
			}
			
		}
		
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:: ");
		int r=sc.nextInt();
		System.out.println("Enter the number of coloum:: ");
		int c=sc.nextInt();
		int array[][]=new int[r][c];
		System.out.println("Enter the matrix:: ");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				array[i][j]=sc.nextInt();
			}
		}
		show(array,r,c);
	}
}