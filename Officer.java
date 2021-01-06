package assignment1;

public class Officer extends Staff implements Account {
    Account a = new MyAccount();
    private String id;
    private String team;
    private int daywork;
    private int payroll;
    private int allowance;
    private String level;

    public Officer(String id, String name, int yob, String team, int daywork, int payroll, String level) {
        super(name, yob);
        this.id = id;
        this.team = team;
        this.daywork = daywork;
        this.payroll = payroll;
        this.level = level;

        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getDaywork() {
        return daywork;
    }

    public void setDaywork(int daywork) {
        this.daywork = daywork;
    }    

    public int getPayroll() {
        return payroll;
    }

    public void setPayroll(int payroll) {
        this.payroll = payroll;
    }

    public int getAllowance() {
        if(level.equals("manager")){
            allowance = 1000;
        }
        if(level.equals("vicemanager")){
            allowance = 600;
        }else if(level.equals("staff")){
            allowance = 400;
        }
        return allowance;
    }

    
    
    public String getLevel() {
        return level;
    }

    public void setlevel(String level) {
        this.level = level;
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
        //Hệ số lương*lương tối thiểu vùng + phụ cấp + số ngày công*30
        return (payroll*200 + allowance +daywork*30);
    }
    
}
