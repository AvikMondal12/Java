public class palindrome {
    public static void main(String[] args) {
        String name = "MAninam";
        String Rname="";
        for(int i = 0;i<name.length();i++){
            Rname=name.charAt(i)+Rname;
        }
        if (name.equalsIgnoreCase(Rname)) {
            System.out.println("yes");
        }
        else{
            System.out.println("not");
        }
    }
}