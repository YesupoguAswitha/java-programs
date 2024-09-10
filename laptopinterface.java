public interface laptopinterface{
    public void copy();

    public void paste();

    public void cut();

    public void keyboard();

    default void security(){
        System.out.println("laptop security code");
    }
    static void audio(){
        System.out.println("laptop audio code");
    }

    
}