public class memory{
    public static void main(String[] args) {
        //heap area error
        int size = 10;
        for(int i = 0; i<Integer.MAX_VALUE;i++){
            int [ ] arr = new int [size];
            size *=2;
            System.out.println(size);
            //671088640 
        }
    }
    //stack error 
    public void add(int i ){
        System.out.println(i);
        i++;
        add(i);
        //10377
        //10360
        //10169
    }
}