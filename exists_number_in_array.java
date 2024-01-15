import java.util.Scanner;

public class exists_number_in_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number which you want to find the number :");
        int num= sc.nextInt();
        int chk=0;
        int []arr={2,4,5,6,7,6,4,3,};
        for (int i=0;i<arr.length;i++){
            if(num==arr[i]){
                chk=1;
                break;
            }
        }
        if(chk==1){
            System.out.println("Yes,this number is exits.");
        }
        else {
            System.out.println("This number is does not exits .");
        }
    }
}
