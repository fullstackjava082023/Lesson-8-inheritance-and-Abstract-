public class Manager extends Employee {
    private double bonus =0;



    //constructor
    public Manager (double salary, String name, int year, int month, int day) {
        super(salary, name ,year, month, day);
    }

    public Manager (double salary, String name, int year, int month, int day, double bonus) {
        super(salary,name,year,month,day);
        this.bonus = bonus;
    }


    //override Employee to calculate bonus + salary
    public double getSalary() {
        return super.getSalary() + this.bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }


    public String toString() {
        return super.toString() + " bonus is: " + this.bonus;
    }
}
