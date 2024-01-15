public class throw_throws_keyword {
    static void method()throws Exception{
        throw new Exception("Hii i am error .");
    }

    public static void main(String[] args) {
        try {
            method();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}
