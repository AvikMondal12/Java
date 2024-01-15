import java.util.Scanner;
public class pattern {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value :");
    // size of the triangle
    int size = sc.nextInt();
    // loop to print the pattern
    for (int i = 0; i < size; i++) {
      // print column
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
