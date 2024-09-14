

public class employee {
    private int id;
    public String name;
    protected double salary;

    public employee(){
       System.out.println("no arg constructor is called");
    }

   public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

}