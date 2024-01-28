public class Person implements Playable, Comparable<Person>{
    // Initializing id_gen, id, name, surname fields
    private static int id_gen = 1;
    private int id;
    private String name ;
    private String surname;
    // Default constructor Person sets id of an object
    public Person () {
        id = id_gen++;
    }
    // Parametrized constructor Person - sets name and surname of an object
    public Person(String surname, String name) {
        setName(name);
        setSurname(surname);
    }
    // getPaymentAmount - doesn't do anything in Person class but returns earnings of a Person in Employee and Student
    @Override
    public double getPaymentAmount(){
        return 0;
    }

    //toString - method returns info of an object
    @Override
    public String toString() {
        return
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'';
    }
    // getID - Id field getter
    public int getId() {return id;}
    // setName - name field setter
    public void setName(String name) {
        this.name = name;
    }
    //setSurname - surname field setter
    public void setSurname(String surname) {
        this.surname = surname;
    }
    // getName - name field getter
    public String getName() {
        return name;
    }
    // getSurname - surname field getter
    public String getSurname() {
        return surname;
    }

    // compareTo - using .compare compares current object payment with other Person type object and prints the text message
    // Person person - other object which payment will be compared
    // method returns text message saying who earns more
    public int compareTo(Person person) {
        return Double.compare(this.getPaymentAmount(), person.getPaymentAmount());
    }

    // getPosition - position field setter
    public String getPosition() {
        return "Student";
    }

}
