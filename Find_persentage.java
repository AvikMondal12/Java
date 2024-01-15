import java.util.Scanner; 
public class Find_persentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the 1st subject number :");
        float sub1=sc.nextFloat();
    
        System.out.println("Enter the 2nd subject number :");
        float sub2=sc.nextFloat();

        System.out.println("Enter the 3rd subject number :");
        float sub3=sc.nextFloat();

        System.out.println("Enter the 4th subject number :");
        float sub4=sc.nextFloat();

        System.out.println("Enter the 5th subject number :");
        float sub5=sc.nextFloat();

        float persentage=((sub1+sub2+sub3+sub4+sub5)/5);
        System.out.println("The persentage is :"+persentage+"%");
    }
    
    
}
