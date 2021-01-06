package assignment1;
public class Lecturer extends Staff implements Account{
    Account a = new MyAccount();
    private String id;
    
    private String department;
    private String degree;
    private int allowance;
    private int classes;
    private int payroll;
    private int yearstart;
    private int basicSalary = 1000;

    public Lecturer(String name, int yob, String id, String department, String degree, int payroll, int yearstart, int classes) {
        super(name,yob);
        this.id = id;
        this.department = department;
        this.degree = degree;
        this.payroll = payroll;
        this.yearstart = yearstart;
        this.classes = classes;   
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
    

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
    
    public int getAllowance() {
        if(degree.equals("bachelor")){
            allowance=300;
        }
        if(degree.equals("master")){
            allowance=900;
        }else if(degree.equals("phd")){
            allowance=2000;
        }
        return allowance;
    }

    
    public int getPayroll() {
        return payroll;
    }

    public void setPayroll(int payroll) {
        this.payroll = payroll;
    }
    public int getClasses() {
        return classes;
    }

    public void setClasses(int classes) {
        this.classes = classes;
    }
    public int getYearstart() {
        return yearstart;
    }

    public void setYearstart(int yearstart) {
        this.yearstart = yearstart;
    }

    @Override
    public int getBalance() {
        // TODO Auto-generated method stub
        return a.getBalance();
    }

    @Override
    public int debit(int amount) {
        // TODO Auto-generated method stub
        return a.debit(amount);
    }

    @Override
    public int credit(int amount) {
        // TODO Auto-generated method stub
        return a.credit(amount);
    }

    @Override
    public int getSalary() {
        // TODO Auto-generated method stub
        return payroll*basicSalary + allowance + classes*45;
    }
    
    
}
