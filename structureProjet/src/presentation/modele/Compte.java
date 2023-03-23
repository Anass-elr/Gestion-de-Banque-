package presentation.modele;

<<<<<<< HEAD
import java.sql.Date;
=======
>>>>>>> aed6cd9f93df3ece67e53b4f5b10e4e45fd5687c
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Compte {
	
	
<<<<<<< HEAD
	private static long     compteur = 1;
    private String          numeroCompte;
    private Double          solde;
    private LocalDateTime   dateCreation;
    private Client          propriataire ;

=======
	private static long          compteur = 1;
    private String          numeroCompte;
    private Double          solde;
    private LocalDateTime   dateCreation;
    private Client          propriataire;
>>>>>>> aed6cd9f93df3ece67e53b4f5b10e4e45fd5687c
    private List<Log>       logs = new ArrayList<>();

 

    public Compte(){
        setNumeroCompte();
        setDateCreation();
        setSolde(0.0);
 
    }
    
    public Compte(Double solde){
        setNumeroCompte();
        setDateCreation();
        setSolde(solde);
       
    }
    
    
    
    public void setDateCreation() {
    	this.dateCreation = LocalDateTime.now();
    }
    
    public void setPropriataire(Client propriataire) {
        this.propriataire = propriataire;
    }
    
    public void setSolde(Double solde) {
        this.solde = solde;
    }
    public void setLog(TypeLog type, String msg) {
        Log log = new Log(LocalDate.now(), LocalTime.now(), type, msg);
        logs.add(log);
    }

    public Client           getPropriataire() {
        return propriataire;
    }
    
    public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}


    public Double           getSolde() {
        return solde;
    }
    public String getNumeroCompte() {
        return numeroCompte;
    }
    public void setNumeroCompte() {
        this.numeroCompte = "b-co00" + compteur++;
    }
    public LocalDateTime    getDateCreation() {
        return dateCreation;
    }
    
    public List<Log>        getLogs() {
        return logs;
    }


    @Override
    public String toString() {

        String      compteStr  = "------------------------------------------------------\n";
                    compteStr += "| N° de Compte            : "   + getNumeroCompte()   + "\n";
                    compteStr += "| Solde du Compte         : "   + getSolde()    + " Dh\n" ;
                    compteStr += "| Propriétaire du Compte  : "   + getPropriataire().getNomComplet() + "\n" ;
                    compteStr += "------------------------------------------------------\n";

        return compteStr;
    }



<<<<<<< HEAD


=======
>>>>>>> aed6cd9f93df3ece67e53b4f5b10e4e45fd5687c
}
