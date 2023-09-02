public class string {
    public static void main(String[] args) {
        System.out.print("The strinig is :");
        String name = ("AVIK");
                    //[ 0123 ]
        System.out.println(name);
        System.out.println();

       
        System.out.println("Length :\n"+name.length());
        System.out.println();

        System.out.println("Lower :\n"+name.toLowerCase());
        System.out.println();

        System.out.println("upeer :\n"+name.toUpperCase());
        System.out.println();

        String name1=("   Brainware   ");
        System.out.println(name1);
        System.out.println("Trim :\n"+name1.trim());
        // System.out.println(t);
        System.out.println();
        
        String name2=("Harry");
        System.out.println("Replace : \n"+name2.replace("r", "p"));
        System.out.println();
        System.out.println("StartsWith : \n"+name2.startsWith("z"));
        System.out.println();

        System.out.println("endsWith : \n"+name2.endsWith("y"));
        System.out.println();

        System.out.println("substring (beginIndex, endIndex) :\n"+name.substring(0, 2));
        System.out.println();

        System.out.println("substring (any cahr,end ) :\n"+name.substring(2));
        System.out.println();

        System.out.println("charAt :\n"+name2.charAt(0));
        System.out.println();

        System.out.println("indexOf from where :\n"+name2.indexOf("r",4));
        System.out.println();

        System.out.println("indexOf :\n"+name2.indexOf("r"));
        System.out.println();

        System.out.println("Last index :\n"+name2.lastIndexOf("r"));
        System.out.println();

        System.out.println("Last index :\n"+name2.lastIndexOf("r",1));
        System.out.println();

        System.out.println("Equals :\n"+name2.equals("Harry"));
        System.out.println();

        System.out.println("Equals IgnoreCase :\n"+name2.equalsIgnoreCase("HaRRy"));
        System.out.println();
    
    }
    
}
