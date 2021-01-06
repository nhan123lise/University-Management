package assignment1;

public class University implements Account{
    private int id;
    private String name;
    Account a = new MyAccount();

    public University(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    public int getBalance() {
        // TODO Auto-generated method stub
        return a.getBalance();
    }
}
