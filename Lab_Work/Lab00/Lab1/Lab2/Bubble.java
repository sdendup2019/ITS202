/* Java Program Example - Bubble Sort */
		
import java.util.Scanner;

public class Bubble
{
   public static void main(String args[])
   {
       int n, i, j, temp;
       int arr[] = new int[50];
       Scanner scan = new Scanner(System.in);
	   
       System.out.print("Enter Total Number of Elements : ");
       n = scan.nextInt();
	   
       System.out.print("Enter " +n+ " Numbers : ");
       for(i=0; i<n; i++)
       {
           arr[i] = scan.nextInt();
       }
	   
       for(i=0; i<(n-1); i++)
       {
           for(j=0; j<(n-i-1); j++)
           {
               if(arr[j] > arr[j+1])
               {
                   temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
           }
       }
	   
       System.out.print("Sorted List in Ascending Order : \n");
       for(i=0; i<n; i++)
       {
           System.out.print(arr[i]+ "  ");
       }
   }
}