public class typeconversion {
    public static void main(String[] args) {
        byte b =10; //impilicity
        short s = 50;
        int i = 65;
        float f = 25.1f;
        long l = 7895673;
        double d = 52.55;

        char ch = 'A';
        boolean bo = true;

        i = b ;
        s = b ;
        f = b ;
        l = b ;
        d = b ;
        d = i ;
        d = s ;
        b = (byte) s;
        s = (short) i;

       
   //int b2 = (byte) (b+b); //explicity
   long b2 = b+i+l;


        System.out.println(b);
        System.out.println(s);
    }
}