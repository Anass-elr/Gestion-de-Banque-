package metier.clients;

import presentation.modele.Client;
import presentation.modele.Compte;

public interface IServiceClient {

        boolean versement(Client cl,Compte c,Double solde);
        boolean retrait  (Client cl,Compte c,Double solde);

        boolean virement (Compte c,String des,Double solde);
        
        void derniereresOp�rations();
        
        //--Surcharge
        boolean retrait  (Compte c,int choixRetrait);

        boolean modifierProfile(int choixModification);
        
        Double afficherSolde();
        Compte choisirCompte();

        void afficherTicket();

}
