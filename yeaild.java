class demo1 extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            Thread.yield();
            System.out.println(Thread.currentThread().getName());
        }
    }
}
public class yeaild {
    public static void main(String[] args) {
        demo1 de=new demo1();
        demo1 de1=new demo1();
        de.start();
        de1.start();
    }
}
