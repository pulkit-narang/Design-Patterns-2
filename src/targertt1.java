public class targertt1 implements Runnable{
     Dbconnection ref;
    @Override
    public void run() {
        Dbconnection d1=Dbconnection.getdbconnection();
        this.ref=d1;
        System.out.print(d1);
    }
}
