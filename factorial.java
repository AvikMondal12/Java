// Write a java program to calculate the factorial of this number..
import java.util.*;
public class factorial {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number:");
    int Num=sc.nextInt();
    int fact=1;
    if( Num==0 || Num==1){
        System.out.println("The factorial of "+ Num +"is : 1");
    }
    else{
        for(int i=Num;i>0;i--){
            
            fact=fact*i;
            
            // System.out.println("The factorial of " + Num + " is : "+fact);
        }
    }
             System.out.println("The factorial of " + Num + " is : "+fact);
    }
}    