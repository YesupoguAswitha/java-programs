public class bank {

    static int currentBalance = 1000;
    public static void greetCustomer() {
        //method body
        System.out.println("hello, welcome to the banking application"); 
        }
        public void deposite(int amount){
            currentBalance = currentBalance + amount;
            System.out.println("Amount is deposited successfully");

        }
        public  static void withdrawal(int amount){
            currentBalance = currentBalance - amount;
            System.out.println("Amount is withdrawn successfully");
        }

        public int  getCurrentBalance(){
            return currentBalance;

        }

    public static void main(String[] args) {
        bank bank = new bank();
        greetCustomer();
        System.out.println("current balance is :"+ bank.getCurrentBalance());
        bank.deposite(1000);
        System.out.println("current balance is :"+ bank.getCurrentBalance());
        withdrawal(500);
        System.out.println("current balance is :"+ bank.getCurrentBalance());


    }
}