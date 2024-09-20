public class employee{
    int orgId = 45554;
    String orgName = "Aswitha";
    String ceo = "Aswitha";
    int noOfDepts = 2;
    static double netWorth = 500.00;
    public static void main(String[] args) throws InterruptedException {
        int eid = 101;
        String empName = "John";
        double salary =5000.00;

        employee e1 = new employee();
        e1.getOrgID();
        e1.deleteEmployee(101);
        System.out.println(employee.getNetWorth());

        employee e2 = new employee();
        e2.deleteEmployee(101);

        Thread.sleep(5000);
        
    }
    public int getOrgID(){
        return orgId;
    }
    public static double getNetWorth(){
        return netWorth;
    }
    public void deleteEmployee(int empID){
        //code
    }

    
   

}
