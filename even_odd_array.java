import java .util.*;
public class even_odd_array {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number which you want to take the size :");
        int a=sc.nextInt();
        int []arr=new int[a];
        int []even=new int[a];
        int []odd=new int[a];
      

        //for user input
        for (int i=0;i<a;i++){
            System.out.printf("Enter the %d'th index value: ",i);
            arr[i]=sc.nextInt();
        } 



        // This is the main condition
        for(int i=0;i<a;i++){
            
            if(arr[i]%2==0){
                even[i]=arr[i]; // even

            }
            else{
                odd[i]=arr[i]; //odd
               
            }
        }


        // this is for print
        System.out.println("Even array is .");
        for(int i=0;i<even.length;i++){
            if (even[i]==0){
                continue;

            }
            else{
                     System.out.print(even[i]+" ");

            }
       
        }
        // System.out.println();

        System.out.println("\nOdd array is .");
        for(int i=0;i<odd.length;i++){
            if (odd[i]==0){
                continue;

            }
            else{
                     System.out.print(odd[i]+" ");

            }
       
        }
        // // inter change between odd and even
        // System.out.println("\ninter change between odd and even :");
        // for(int i=0;i<odd.length;i++){
        //     if(even[i]==0){
        //         continue;
        //     }else{
        //         even[i]=odd[i];
        //     }
            
        // }
        // for(int i=0;i<even.length;i++){
        //     System.out.print(even[i]);

        // }
       


        // // inter change between even and odd
        // System.out.println("\ninter change between even and odd :");
        // for(int i=0;i<even.length;i++){
        //     if(odd[i]==0){
        //         continue;
        //     }else{
        //         odd[i]=even[i];
        //     }
            
        // }
        // for(int i=0;i<odd.length;i++){
        //     System.out.print(odd[i]);
        // }


    }
}