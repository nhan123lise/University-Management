package assignment1;

public class Transaction {

    private int id;
    private String startAccount, endAccount;
    private int amount;
    private String time;
    private String message;


    public Transaction(int id, String startAccount,String endAccount,int amount, String time, String message) {
        this.id = id;
        this.startAccount = startAccount;
        this.endAccount = endAccount;
        this.time = time;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getStartAccount() {
        return startAccount;
    }

    public void setStartAccount(String startAccount) {
        this.startAccount = startAccount;
    }
    public String getEndAccount() {
        return endAccount;
    }

    public void setEndAccount(String endAccount) {
        this.endAccount = endAccount;
    }

    

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    // @Override
    // public int getCost() {
    //     // TODO Auto-generated method stub
    //     return (amount + periodCost);
    // }
    
    
}
