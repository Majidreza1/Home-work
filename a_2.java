import java.util.Scanner;

public class a_2 {
	 public static void main(String[] args) {
	        Scanner a = new Scanner(System.in);
	        int n , i ;
	        System.out.print("Please enter the length of the array : \n");
	        n = a.nextInt();
	        int[] arr = new int[n];
	        for( i = 0 ; i < n ; i++ ){
	            System.out.print("Please enter element " + i +"\t");
	            arr[i] = a.nextInt();
	        }
	        int maximum = 0;
	        for( i = n-1 ; i >= 0 ; i-- ){
	            if( arr[i] > maximum){
	                maximum = arr[i];
	            }
	        }
	        System.out.println("The max element of the array is : \t" +maximum);
	    }
}
