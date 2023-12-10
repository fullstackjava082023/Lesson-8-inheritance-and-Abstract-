public class Student extends Person{
    public String discipline = "computer science";

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }


    public void getDescription() {
        System.out.println("I am student with name: "  + this.name + " lerning the :" + this.discipline);
    }
}
