package assignment1;

public abstract class Staff {
    private String name;
    private int yob;   
    public abstract int getSalary();

    public Staff(String name, int yob){
        this.name = name;
        this.yob = yob;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }
    
}
