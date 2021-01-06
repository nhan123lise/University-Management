package assignment1;

public class Student {
    Account a = new MyAccount();
    private String id;
    private String name;
    private int numberCredits;
    private int billCredits;
    // public Student(){};
    public Student(String id, String name, int numberCredits, int billCredits){
        this.id = id;
        this.name = name;
        this.numberCredits = numberCredits;
        this.billCredits = billCredits;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getnumberCredits() {
        return numberCredits;
    }

    public void setnumberCredits(int numberCredits) {
        this.numberCredits = numberCredits;
    }
    public int getbillCredits() {
        return billCredits;
    }

    public void setbillCredits(int billCredits) {
        this.billCredits = billCredits;
    }
    public int tuitionfee(){
        return this.billCredits*this.numberCredits;
    }

    

}
