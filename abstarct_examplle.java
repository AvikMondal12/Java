abstract class A{
    abstract void display();
    abstract void printme();
}

class B extends A{
    public void display(){
        System.out.println("hii");
    }
    void printme(){
        System.out.println("hello");
    }
}
public class abstarct_examplle {
    public static void main(String[] args) {


        B obj = new B();
        obj.printme();
        obj.display();
    }
}
