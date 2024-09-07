public class user{
    public static void main(String[] args) {
        guest g = new guest();
        g.read();

        developer dev = new developer();
        dev.read();
        dev.write();

        admin a = new admin();
        a.read();
        a.write();
        a.manage();
        

    }
}