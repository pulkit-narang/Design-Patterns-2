// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class client {
    public static void main(String[] args) {
        targertt1 o1=new targertt1();
          Thread t1=new Thread(o1);
        targett2 o2=new targett2();
        Thread t2=new Thread(o2);
        t1.start();
        t2.start();
    }
}