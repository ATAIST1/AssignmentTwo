public class Employee extends Person{
    //Initializing id position salary fields
    private int id;
    private String position;
    private double salary;

    // position field setter
    public void setPosition(String position) { this.position = position;}
    // salary field setter
    public void setSalary(double salary) { this.salary = salary;}
    // position field getter
    public String getPosition() { return position;}
    //salary field getter
    public double getSalary() {return salary;}
    // default constructor that sets id of an object
    public Employee () {
        super();
    }
    /*/
       Employee constructor sets name, surname, position, salary of the object
     */
    public Employee(String surname, String name, String position, double salary) {
        this();
        setName(name);
        setSurname(surname);
        setPosition(position);
        setSalary(salary);
    }
    // toString method returns info of an object
    public String toString() {
        return "Employee: " + '\'' + super.toString() + " position: " + getPosition();
    }
    /*/
    getPaymentAmount method returns double type salary field of an object
     */
    public double getPaymentAmount() {
        return salary;
    }
}
