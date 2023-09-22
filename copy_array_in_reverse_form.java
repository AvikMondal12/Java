/**
 * reverse_array
 */
import java .util.*;
public class copy_array_in_reverse_form {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number which you want to take the size :");
        int a=sc.nextInt();
        int []arr=new int[a];
        int []brr=new int [arr.length];
        for (int i=0;i<a;i++){
            System.out.print("Enter the value of array :");
            arr[i]=sc.nextInt();
        }    //for just taking input.....



        System.out.print("\nThe first array is :");
        for(int i=0;i<a;i++){
        System.out.print(arr[i]+" ");
        brr[i]=arr[i]; 
        }    // for print  the first array
               
        System.out.print("\n\nThis is the copy array in reverse form : ");
        for(int i=brr.length-1;i>=0;i--){
            System.out.print(brr[i]+" ");
        }

    }
}