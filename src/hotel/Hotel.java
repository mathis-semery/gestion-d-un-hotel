package hotel;


import java.util.ArrayList;

public class Hotel {
    private ArrayList<Chambre> chambres;
    private ArrayList<Reservation> reservations;


    public Hotel(String s, String avenuesDesRennes, String Laponie) {
        this.chambres = new ArrayList<>();
        this.reservations = new ArrayList<>();
    }

    public void ajouterChambre(Chambre chambre) {
        chambres.add(chambre);

    }

    public void afficherChambresDisponibles() {
        System.out.println("Chambres disponibles :");
        for (Chambre chambre : chambres) {
            if (!chambre.estReservee()) {
                System.out.println("Chambre " + chambre.getNumero() + " (" + chambre.getType() + ")");
            }
        }
    }

    public void reserverChambre(Client client1, Chambre chambre, String dateDebut, String dateFin) {
        if (!chambre.estReservee()) {
            chambre.reserver();
            reservations.add(new Reservation(client, chambre, dateDebut, dateFin));
            System.out.println("Chambre réservée pour " + client.getNom());
        } else {
            System.out.println("La chambre " + chambre.getNumero() + " est déjà réservée !");
        }
    }


    public void afficherReservations() {
        System.out.println("Réservations :");
        for (Reservation reservation : reservations) {
            System.out.println("Client : " + reservation.getClient().getNom() + ", Chambre : " + reservation.getChambre().getNumero() +
                    ", Dates : " + reservation.getdateDebut() + " à " + reservation.getDateFin());
        }
    }


    public void changerAffectation(Client client1, Chambre chambre1, Chambre chambre2) {

    }

    public void supressionReservation(Client client1, Chambre chambre2) {
        Reservation.remove(reservations)
    }
}