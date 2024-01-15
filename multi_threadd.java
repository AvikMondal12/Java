class demo extends Thread{
    public void run(){

        try{
            System.out.println(Thread.currentThread().getName());
        }
        catch (Exception e){
            System.out.println("error");
        }
    }

}

public class multi_threadd {
    public static void main(String[] args) {
        for(int i=0;i<5;i++) {
            demo de = new demo();
            de.start();
        }

    }
}
