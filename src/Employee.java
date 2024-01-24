public class Employee extends Person{
    private int id;
    private String position;
    private double salary;


    public void setPosition(String position) { this.position = position;}
    public void setSalary(double salary) { this.salary = salary;}

    public String getPosition() { return position;}
    public double getSalary() {return salary;}
    public Employee () {
        super();
    }
    public Employee(String surname, String name, String position, double salary) {
        this();
        setName(name);
        setSurname(surname);
        setPosition(position);
        setSalary(salary);
    }
    public String toString() {
        return "Employee: " + '\'' + super.toString() + " position: " + getPosition();
    }
    public double getPaymentAmount() {
        return salary;
    }
}
