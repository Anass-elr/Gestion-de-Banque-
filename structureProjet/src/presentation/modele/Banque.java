package presentation.modele;

import java.util.*;

public class Banque {

    private static long          compteur = 1;
    private Long                 idBanque;
    private String              nomBanque;
    private String              adresseBanque;
    private String              telBanque;
    private String              emailBanque;
    private ArrayList<Client>        clientsDeBanque = new ArrayList<>();

    public Banque()
                    {
                        idBanque = compteur++;
                    }
    public Banque(String nom, String adresse, String tel, String mail)
                    {
                        idBanque        = compteur++;
                        nomBanque       = nom;
                        telBanque       = tel;
                        adresseBanque   = adresse;
                        emailBanque     = mail;
                    }
    
    
<<<<<<< HEAD

=======
    public Client getClient(Client x) {
    	clientsDeBanque.con
    }
>>>>>>> aed6cd9f93df3ece67e53b4f5b10e4e45fd5687c

    public Long             getIdBanque() {
        return idBanque;
    }
    public String           getNomBanque() {
        return nomBanque;
    }
    public String           getEmailBanque() {
        return emailBanque;
    }
    public String           getTelBanque() {
        return telBanque;
    }
    public String           getAdresseBanque() {
        return adresseBanque;
    }
    public List<Client>     getClientsDeBanque() {
        return clientsDeBanque;
    }

    public void             setIdBanque(Long idBanque) {
        this.idBanque = idBanque;
    }
    public void             setNomBanque(String nomBanque) {
        this.nomBanque = nomBanque;
    }
    public void             setEmailBanque(String emailBanque) {
        this.emailBanque = emailBanque;
    }
    public void             setAdresseBanque(String adresseBanque) {
        this.adresseBanque = adresseBanque;
    }
    public void             setTelBanque(String telBanque) {
        this.telBanque = telBanque;
    }
    public void             setClientsDeBanque(List<Client> clientsDeBanque) {
        this.clientsDeBanque = (ArrayList<Client>) clientsDeBanque;
    }



}
