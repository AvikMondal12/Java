class person{
    String name="Suman";


}
class employee extends person{
    int Salary=200000;

}
class Manager extends employee{
    String department="TCs manager";

}
public class Inheritence1 {
    public static void main(String[] args) {
        Manager mn=new Manager();
        System.out.println("Name is:"+mn.name);
        System.out.println("Salary is:"+mn.Salary);
        System.out.println("Department is:"+mn.department);
    }
}
