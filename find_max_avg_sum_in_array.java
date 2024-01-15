public class find_max_avg_sum_in_array {
    public static void main(String[] args) {
        int sum=0;
        float avg=0;
        int max=Integer.MIN_VALUE;
        int []arr={2,3,4,1,5};
        int size=arr.length;
        for(int i=0;i<size;i++){
            sum=sum+arr[i];
            avg=sum/size;
            if(max<arr[i]){
                max=arr[i];

            }

    }
        System.out.println("The sum is "+sum);
        System.out.println("The avarage is "+avg);
        System.out.println("The maximum value is "+max);
    }
}
