import java .util.Scanner;
public class bubbl_sort {
    public static void main(String[] args) {

        //This is for size of array.....
        System.out.print("Enter the size of this array :"); 
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        //This is for taking input of the array....
        int num[]=new int[size];
        for (int i=0;i<size;i++){
            System.out.printf("Enter the %d'th index value :",i);
            num[i]=sc.nextInt();
        }

        int temp;

        //This is for printing of the array....
        System.out.println("The array is :");
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }

        //This is the main condition of bubble sort....
        for(int i=0;i<num.length;i++){
            for(int j=0;j<i;j++){
                if(num[j]>num[j+1]){
                    temp=num[j+1];
                    num[j+1]=num[j];
                    num[j]=temp;
                }
            }
        }

        //This is for printing the sorting array... 
        System.out.println("\nThe sorting array is :");
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
}