class person{
    String name="Avik";
    int Salary=25000;
    void display(){
        System.out.println("The salary is :"+name);
        System.out.println("The name is :"+Salary);
    }

}
class company extends person{
    
}
// class person_1 extends person{

// }
public class inheritance_2 {
    public static void main(String[] args) {
        company com=new company();
        com.display();
        // person_1 pr=new person_1();
        // pr.display();
    }
    
}
