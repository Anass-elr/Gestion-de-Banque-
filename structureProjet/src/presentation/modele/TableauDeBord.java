package presentation.modele;

public class TableauDeBord {
    private Long    nombreTotaleClient;
    private Long    nombreTotaleCompte;
    private Double  maxSolde;
    private Double  minSolde;
    private String  nomClientLePlusRiche;
    private Long    totalClientsFemme, totaleClientsHomme;

    public Long getNombreTotaleClient() {
        return nombreTotaleClient;
    }
    public Double getMaxSolde() {
        return maxSolde;
    }
    public Double getMinSolde() {
        return minSolde;
    }
    public Long getNombreTotaleCompte() {
        return nombreTotaleCompte;
    }
    public Long getTotalClientsFemme() {
        return totalClientsFemme;
    }
    public Long getTotaleClientsHomme() {
        return totaleClientsHomme;
    }
    public String getNomClientLePlusRiche() {
        return nomClientLePlusRiche;
    }

    public void setMaxSolde(Double maxSolde) {
        this.maxSolde = maxSolde;
    }
    public void setMinSolde(Double minSolde) {
        this.minSolde = minSolde;
    }
    public void setNombreTotaleClient(Long nombreTotaleClient) {
        this.nombreTotaleClient = nombreTotaleClient;
    }
<<<<<<< HEAD
    public void setNombreTotaleCompte(Long i) {
=======
    public void setNombreTotaleCompte(int i) {
>>>>>>> aed6cd9f93df3ece67e53b4f5b10e4e45fd5687c
        this.nombreTotaleCompte = i;
    }
    public void setNomClientLePlusRiche(String nomClientLePlusRiche) {
        this.nomClientLePlusRiche = nomClientLePlusRiche;
    }
    public void setTotalClientsFemme(Long totalClientsFemme) {
        this.totalClientsFemme = totalClientsFemme;
    }
    public void setTotaleClientsHomme(Long totaleClientsHomme) {
        this.totaleClientsHomme = totaleClientsHomme;
    }


    public TableauDeBord(){}

}

