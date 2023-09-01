// Write a java program to calculate Avarage among three numbers..

import java.util.Scanner;
public class Find_Avarage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the 1st number :");
        int Number1=sc.nextInt();

        System.out.println("Enter the 2nd number :");
        int Number2=sc.nextInt();

        System.out.println("Enter the 3rd number :");
        int Number3=sc.nextInt();

        int Avarage = ((Number1+Number2+Number3)/3);
        System.out.println("The avarage of these number is :"+ Avarage);
    }
    
}
