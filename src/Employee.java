import java.time.LocalDate;

public class Employee extends Person {
    private double salary;

    private LocalDate hireDate;



    public Employee (double salary, String name, int year, int month, int day) {
        this.salary = salary;
        this.name = name;
        this.hireDate = LocalDate.of(year,month,day);
    }

    public void raiseSalary(double percent) {
        //this.salary += this.salary * percent/100;
        this.salary *= 1 + (percent/100);
    }

    public String toString() {
        return  "name =" + this.name + ",salary=" + this.getSalary() + ",hireDay=" + this.hireDate;
    }


    public void getDescription() {
        System.out.println("I am employee: " + this.name + " with the salary of: " + this.getSalary());
    }

    //read
    public double getSalary() {
        return this.salary;
    }



    public LocalDate getHireDate() {
        return this.hireDate;
    }

    //write
    public void setSalary(double salary) {
        this.salary = salary;
    }



    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }


}

