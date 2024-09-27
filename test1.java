
// string are immutable 
//stringbuffer and string builder are mutable
    
public class test1 {
        public static void main (String[] args){
     StringBuffer sb1 = new StringBuffer("Aswitha");
     StringBuffer sb2 = new StringBuffer("Aswitha");
      System.out.println(sb1 == sb2);

      sb1 = sb1.append("princess");
      System.out.println(sb1 == sb2);

      StringBuffer sb3 = new StringBuffer("AswithaPrincess");
        System.out.println(sb1 == sb3);

     System.out.println(">>>>>>>>>>>>>>>>>");

        String s1 = "Aswitha";
        String s2 = "Aswitha";
        System.out.println(s1 == s2);

        s1 = s1 + "Princess";
        System.out.println(s1 == s2);
       
        String s3 = "AswithaPrincess";
        System.out.println(s1 == s3);

      
    }
}