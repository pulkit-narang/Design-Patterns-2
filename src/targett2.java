public class targett2 implements  Runnable {
    public Dbconnection ref;

    @Override
    public void run() {
        Dbconnection d2 = Dbconnection.getdbconnection();
        this.ref = d2;
        System.out.print(d2);
    }
}
