public class add_5_positive_number_using_while_loop {
    public static void main(String[] args) {
        int sum=0;
        int i=0;
        while(i<=5){
            sum=sum+i;
            i++;
        }
        System.out.print("The sum of 5 positive number :"+sum);
    }
}
