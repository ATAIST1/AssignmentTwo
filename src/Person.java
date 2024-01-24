public class Person implements Playable, Comparable<Person>{

    private static int id_gen = 1;
    private int id;
    private String name ;
    private String surname;
    public Person () {
        id = id_gen++;
    }
    public Person(String surname, String name) {
        setName(name);
        setSurname(surname);
    }
    @Override
    public double getPaymentAmount(){
        return 0;
    }





    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'';
    }
    public int getId() {return id;}
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }

    public int compareTo(Person person) {
        return Double.compare(this.getPaymentAmount(), person.getPaymentAmount());

    }
    public String getPosition() {
        return "Student";
    }

}
