import java.util.Scanner;
public class smallest_biggest_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array :");
        int a=sc.nextInt();
        int []arr=new int[a];

        System.out.println();//for  just a simple gap...
        
        for(int i=0;i<a;i++){
            System.out.print("Enter the value of array :");
            arr[i]=sc.nextInt();
        }
        // int len=arr.length;    // for want to length of this array.......
        int smallest=Integer.MAX_VALUE;
        int biggest=Integer.MIN_VALUE;

        //for print this array.....
        System.out.print("\nThe array is :");
        for(int i=0;i<a;i++){
            System.out.print(arr[i]+" ");

            if (arr[i]<smallest){
                smallest=arr[i];
            }
            else if (arr[i]>biggest){
                biggest=arr[i];
            }
        }
        System.out.println("\n\nThe smallest number is :"+smallest);
        System.out.println("\nThe biggest number is :"+biggest);      
    }
    
}
