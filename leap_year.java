import java.util.*;
public class leap_year {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter the year which you want to know leap year or not :");
        int year=sc.nextInt();

        if(year%4==0 && year %100!=0 || year%400==0){
            System.out.println("This is leap year.");
        }
        else{
            System.out.println("This is not a leap year.");
        }
    }    
}
