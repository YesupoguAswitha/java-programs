public class nonstatic2{
    static{
        System.out.println("static block");
    }
    {

    }
    public nonstatic2(){
        System.out.println("constustor");
    }
    public static void main(String[] args) {
        System.out.println("main method");

        //System.out.println(nonstatic.number);
        //nonstatic.print();
        //nonstatic ns = new nonstatic();
        // ns.print2();


        
    }
}