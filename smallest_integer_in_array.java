public class smallest_integer_in_array {
    public static void main(String[] args) {
        int []arr={23,4,3,456,7,8,2,0};
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
