// Write a java program to calculate even or odd

import java.util.Scanner;
public class Even_Odd {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter this number which we want to know Even or Odd :");
    int Num=sc.nextInt();
    if (Num%2==0){
        System.out.println("This number is Even");
    }
    else{
        System.out.println("This number is Odd");
    }
    
    }
    
}