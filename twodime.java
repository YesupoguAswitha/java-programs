public class twodime{
    public static void main(String[] args) {

        //two dimensional arry 
        
    // int[][] arr = new int[3][2];
      /* arr[0][0] = 1;
       arr[0][1] = 2;

       arr[1][0] = 3;
       arr[1][1] = 4;

       arr[2][0] = 5;
        arr[2][1] = 6;

        for (int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        } */

// jagged array

           /*int [][] arr = new int [3][];
           arr[0] = new int[2];
           arr[1] = new int[5];
           arr[2] = new int[3];
        
           arr[0][0] =1;
           arr[0][1] =2;

           arr[1][0] =18;
           arr[1][1] =24;
           arr[1][2] =13;
           arr[1][3] =26;
           arr[1][4] =17;

           arr[2][0] =26;
           arr[2][1] =14;
           arr[2][2] =26;

            for (int i=0; i<arr.length; i++) {
               for(int j=0; j<arr[i].length; j++){
                   System.out.print(arr[i][j]+" ");
            }
                System.out.println();
        } */

       //this another method

       int[][] arr = {
               {1,2},
               {8,5,6},
               {1,2},
       };

       for (int i=0; i<arr.length; i++) {
               for(int j=0; j<arr[i].length; j++){
                   System.out.print(arr[i][j]+" ");
            }
                System.out.println();
        } 

    }
}