public class object{
    int i;
    int j;

    public object(){
        i=20;
        j=30;

    }

    public object(int i,int j){
        this.i = i;
        this.j = j;

    }
    public static void main(String[] args) {
        object o1 = new object();
        object o2 = new object(15,25);
        object o3 = new object(25,55);


        System.out.println(o1.add ());//i+j=50
        System.out.println(o2.add ());// 15+25=40
        System.out.println(o3.add ());//25+55=80

        System.out.println(01 == 02);//false
        System.out.println(03 == 02);//false
        System.out.println(03 == 01);//false
    }

    public int add () {
        return i+j;
    }
}