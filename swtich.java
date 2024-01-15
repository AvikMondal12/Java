import java.util.Scanner;


public class swtich {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number :");
    int Num=sc.nextInt();


    switch (Num) {
        case 1:
        System.out.println("It's Sunday.");
        break;
        case 2:
        System.out.println("It's Monday.");
        break;

        case 3:
        System.out.println("It' Tuesday.");
        break;
                
        case 4:
        System.out.println("It's Wednesday.");
        break;
        case 5:
        System.out.println("It's Thrusday.");
        break;

        case 6:
        System.out.println("It's Friday.");
        break;

        case 7:
        System.out.println("It's Saturday.");
        break;


        default:
        System.out.println("That is not the name of week days.");
        break;

        }
    }
    
}
