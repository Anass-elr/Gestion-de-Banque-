package metier.clients;

import presentation.modele.Client;
import presentation.modele.Compte;

public interface IServiceClient {

        boolean versement(Client cl,Compte c,Double solde);
        boolean retrait  (Client cl,Compte c,Double solde);

        boolean virement (Compte c,String des,Double solde);
        
        void derniereresOpérations();
        
        //--Surcharge
        boolean retrait  (Compte c,int choixRetrait);

<<<<<<< HEAD
        boolean modifierProfile(int choixModification,Long id);
=======
        boolean modifierProfile(int choixModification);
>>>>>>> aed6cd9f93df3ece67e53b4f5b10e4e45fd5687c
        
        Double afficherSolde();
        Compte choisirCompte();

        void afficherTicket();

}
