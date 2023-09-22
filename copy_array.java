import java .util.*;
public class copy_array {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number which you want to take the size :");
        int a=sc.nextInt();  //this line for taking the size of array form the user..
        int []arr1=new int[a];
        int []arr2=new int [arr1.length];
        for (int i=0;i<a;i++){
            System.out.print("Enter the value of array :");
            arr1[i]=sc.nextInt();
        }    //for just taking input.....
        System.out.print("\n\n This is the 1st array :");
        for (int i=0;i<a;i++){
            System.out.print(arr1[i]+" ");
            arr2=arr1;
        }
        System.out.print("\n \nCopy the 1st array in 2nd array :");
        for(int i=0;i<a;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}