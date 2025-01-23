package hotel;

public class Client {
    private String nom;
    private String email;

    public Client(String nom,String email) {
        this.nom = nom;
        this.email = email;

    }

    public Client(String aliceDupont, String mail) {
    }

    public Client(String bobMartin, String mail) {
    }

    public String getNom() {
        return nom;
    }

    public String getEmail() {
        return email;
    }

}