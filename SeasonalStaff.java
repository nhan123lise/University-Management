package assignment1;

public class SeasonalStaff extends Staff implements Account {

    private String id;
    private int workday;
    private int billworkday;
    private int remain;
    Account a = new MyAccount();

    public SeasonalStaff(String name, int yob, String id, int workday, int billworkday, int remain) {
        super(name,yob);
        this.id = id;
        
        this.workday = workday;
        this.billworkday = billworkday;
        this.remain = remain;         
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
    public int getWorkday() {
        return workday;
    }

    public void setWorkday(int workday) {
        this.workday = workday;
    }
    public int getBillworkday() {
        return billworkday;
    }

    public void setBillworkday(int billworkday) {
        this.billworkday = billworkday;
    }
    public int getRemain() {
        return remain;
    }

    public void setRemain(int remain) {
        this.remain = remain;
    }
    @Override
    public int getBalance() {
        return a.getBalance();
    }

    @Override
    public int debit(int amount) {
        return a.debit(amount);
        
    }

    @Override
    public int credit(int amount) {
        return a.credit(amount);
    }    

    @Override
    public int getSalary() {
        return workday*this.billworkday;
    }
    
    
    
}
