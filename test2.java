public class test2{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("aswitha");
        sb.append("princess");
        //sb.insert(7,"princess");
        sb.ensureCapacity(100);

        sb.reverse();
        //b.deleteCharAt(7);
        sb.capacity();
        //System.out.println(sb.capacity());
        System.out.println(sb);

        StringBuilder sb2 = new StringBuilder("hello");
        StringBuilder sb3 = new StringBuilder("hello");

        System.out.println(sb2.equals(sb3));//this code  adderss printing
        System.out.println( sb2 == sb3);//this code data printing
        System.out.println(sb2.compareTo(sb3));//this  code comparesion to data 
        


    }
}