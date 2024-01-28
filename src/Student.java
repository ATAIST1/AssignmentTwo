public class Student extends Person{
    // Initializing gpa and scholarship fields
    private double gpa;
    private static final double scholarship = 36660.00;

    // setGpa - gpa field setter
    public void setGpa(double gpa) {this.gpa = gpa;}

    // getGpa - gpa field getter
    public double getGpa() {return gpa;}

    // Student default constructor sets id of an object
    public Student () {
        super();
    }

    // Student parametrized constructor sets name, surname, gpa of an object
    public Student(String surname, String name, double gpa) {
        this();
        setName(name);
        setSurname(surname);
        setGpa(gpa);
    }

    // getPosition method - returns "Student"
    public String getPosition() {
        return "Student";
    }

    // toString method returns info of an object
    public String toString() {
        return "Student: " + super.toString() + " GPA: " + getGpa() + " position: Student";
    }

    /*/
    getPaymentAmount method returns earning of a student
    If gpa is less than 2.67 it will return 0.0 if not it will return the scholarship  field
     */
    public double getPaymentAmount() {
        return (gpa > 2.67) ? scholarship : 0.0;
    }
}
