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

class User extends Person {
    private int nbLivresEmpruntes;

    User(String name, String email, int nbLivre) {
        super(name, email);
        this.nbLivresEmpruntes = nbLivre;  
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Nombre des livres empruntes: " + this.nbLivresEmpruntes);
    }
}
