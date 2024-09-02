public class operators{
    public static void main(String[] args) {
        
        int i = 20;
        int j = 10;
// arithmetic operators
        System.out.println(i+j);
        System.out.println(i-j);
        System.out.println(i*j);
        System.out.println(i/j);
        System.out.println(i%j);

//unary operator
        System.out.println(i);//20
        System.out.println(++i);//21
        System.out.println(i++);//21
        System.out.println(i++);//22 
        System.out.println(i++);//23
        System.out.println(i);

        System.out.println(j);//10
        System.out.println(--j);//9
        System.out.println(j--);//9
        System.out.println(j);//8

//relational operator
        
        System.out.println(i==j);//false
        System.out.println(i!=j);//true
        System.out.println(i>j);//true
        System.out.println(i<j);//false
        System.out.println(i>=j);//true
        System.out.println(i<=j);//false 

//conditional operator

        System.out.println(i==j && i<j);//false
        System.out.println(j<i || j>i);//true

        /*
         && 
         true-true -> true
         true-false-> false 
         false-false-> false
         false-true->false
         

         ||
         true-true-> true
         true-false->false
         false-true->false
         false-false->true

         */
 //assignment opeartor

        int x = 20;
        int y = 10;
        int k = 15;
        int l = 5;
        int m = 25;
        int n = 14;

        
        System.out.println(x);//20
        y +=5;
        System.out.println(y);//15
        k -=5;
        System.out.println(k);//10
        l *=5;
        System.out.println(l);//25
        m /=5;
        System.out.println(m);//5
        n %=5;
        System.out.println(n);//4



    
    }
}