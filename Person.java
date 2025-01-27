public abstract class Person {

    private static int idGenerator = 12343;
    protected int id_person;
    protected String name;
    protected String email;

    Person(String name, String email) {this.id_person = (++Person.idGenerator) * 2;this.name = name; this.email = email;}

    public void displayInfo() {
        System.out.println("name: " + this.name);
        System.out.println("email: " + this.email);
    }

    
}
