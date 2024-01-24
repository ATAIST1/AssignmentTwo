public class Student extends Person{
    private double gpa;
    private static final double FILTHY_MONEY = 36660.00;


    public void setGpa(double gpa) {this.gpa = gpa;}
    public double getGpa() {return gpa;}
    public Student () {
        super();
    }
    public Student(String surname, String name, double gpa) {
        this();
        setName(name);
        setSurname(surname);
        setGpa(gpa);
    }
    public String getPosition() {
        return "Student";
    }
    public String toString() {
        return "Student: " + super.toString() + " GPA: " + getGpa() + " position: Student";
    }
    public double getPaymentAmount() {
        return (gpa > 2.67) ? FILTHY_MONEY : 0.0;
    }
}
