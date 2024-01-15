class A1{
    void display(){
        System.out.println("hii");
    }
}
class B1 extends A1{
    void display (){
        System.out.println("hello");
    }
}
public class method_overridinng {
    public static void main(String[] args) {
        A1 obj =new A1();
        obj.display();
        B1 obj1 =new B1();
        obj1.display();

    }
}
