import java.util.*;
interface a{
    public void display();
}
class b implements a{
    public void display(){
        int[]arr={2,36,3,5,6,3};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
public class interface_sort_array {
    public static void main(String[] args) {
        b ob =new b();
        ob.display();
    }
}
