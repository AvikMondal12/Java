import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);


        int arr[][] = new int[3][3];
        int arr1[][] = new int[3][3];
        int arr2[][]=new int [3][3];
        System.out.println("Enter the value of 1st array :");
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the 2nd array :");
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("The answer of the sum of 2 array :");
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr2[i][j]=arr[i][j]+arr1[i][j];
             }
        }
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++) {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
             }


    }
}
