 import java.util.Scanner;
public class sum_of_array {
    public static void main(String[] args) {
       

        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter how many number you want to input: ");//for size declare in array
        int a=sc.nextInt();//for size declare in array
        int []arr=new int[a];//here a is array size.
        for(int i = 0;i<a; i++){
            System.out.print("Enter the number: "); //For take input of data in array
            arr[i]=sc.nextInt();//For take input of data in array
            // System.out.println(arr[i]);
        }
        for (int i=0;i<a;i++){
            System.out.print(arr[i]+" ");
            sum=sum+arr[i];
        }
        System.out.println("\n The sum of array is :"+sum);
        
    }
    
}
