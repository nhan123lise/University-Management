package assignment1;

public class Provider implements Payable,Account {
    Account a = new MyAccount();
    private String id;
    private String name;
    private int number;
    private int bill;

    public Provider(String id, String name, int number, int bill){
        this.id = id;
        this.name = name;
        this.number = number;
        this.bill = bill;
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
    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public int getBill(){
        return bill;
    }
    public void setBill(int bill){
        this.bill = bill;
    }


    @Override
    public int getCost() {
        // TODO Auto-generated method stub
        return number*bill;
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
    
    
}
