import java.util.*;

interface avik{
    void display();
}
class suman implements avik{
   public void display(){
        int arr[]={2,3,41,4,38,8};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
public class sorting_an_integer_array {
    public static void main(String[] args) {
        suman sm=new suman();
        sm.display();
    }
}
