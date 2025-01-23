package hotel;

public class Client {
    private String nom;
    private String prenom;
    private String email;

    public Client(String nom, String prenom, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;

    }

    public String getNom() {
        return nom;
    }

    public String getEmail() {
        return email;
    }
    public String getPrenom(){
        return prenom;

    }
}