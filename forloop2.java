public class forloop2{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,5};
        /*for (int i =0;i<arr.length;i++){   //for(int i=0; i<arr.length;i=i+2)-this one is even number 
            System.out.println(arr[i]);
        }*/

       // foreach loop 
       /*for(int value:arr){
        System.out.println(value);
       }*/

      // this is addition method in foreach
      int sum=0;
      for(int value:arr) {
        sum +=value;
      }
      System.out.println(sum);
      System.out.println(sum/arr.length);//avaerage 
    }
}