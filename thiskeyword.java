public class thiskeyword{
    int age =25;
    String name;
    String jobrole;
    public static void main(String[] args) {
        thiskeyword e = new thiskeyword();
        e.setAge(50);
        System.out.println(e.getAge());
        
        thiskeyword e2 = new thiskeyword();
        e2.setAge(45);
        System.out.println(e2.getAge());
        
        thiskeyword e3 = new thiskeyword();
        e3.setAge(10);
        System.out.println(e3.getAge());
        
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age ){
      this.age = age;
      
}

}