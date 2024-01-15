import java.util.Scanner;
public class equal_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int check=0;

        // The first part......
        System.out.print("Enter the number how many input you want to take in array 1 :");
        int a = sc.nextInt();
        int []arr1=new int[a];
        for(int i=0;i<a;i++){
            System.out.printf("Enter the %d'th index value: ",i);
            arr1[i]=sc.nextInt();
        }
        System.out.println("This is array one :");
        for(int i=0;i<a;i++){
            System.out.print(arr1[i]+" ");
        }


        // The second part ....
        System.out.print("\nEnter the number how many input you want take in array 2: ");
        int b=sc.nextInt();
        int []arr2=new int[b];
        for (int i=0;i<b;i++){
            System.out.printf("Enter the %d'th index value: ",i); 
            arr2[i]=sc.nextInt();
        }
        System.out.println("This is array two :");
        for(int i=0;i<a;i++){
            System.out.print(arr2[i]+" ");
        }
        if(a==b){
            for(int i=0;i<a;i++){
               if(arr1[i]==arr2[i]){
                   check=1;
               }
               else{
                    check=0;
                    break;
                 }
            }
        }
        
        else{
              check=0;
        }
if(check==1){
   System.out.println("\n This two array are equal.");
}
else{
   System.out.println("\n This two array are not equal.");
}
        

    }
    
}