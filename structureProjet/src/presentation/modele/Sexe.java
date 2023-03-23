package presentation.modele;

public enum Sexe {

<<<<<<< HEAD
    HOMME(0,"H", "Homme"),
       FEMME(1,"F", "Femme");
=======
    HOMME(0,"H", "Homme"), FEMME(1,"F", "Femme");
>>>>>>> aed6cd9f93df3ece67e53b4f5b10e4e45fd5687c

        String libelle, abreviation;
        Long indice;

        Sexe(){}
        Sexe(String abreviation){ this.abreviation = abreviation;}
        Sexe(long indice){ this.indice = indice;}
        Sexe(long indice, String abreviation)
                {
                    this.indice = indice;
                    this.abreviation = abreviation;
                }
        Sexe(long indice, String abreviation, String libelle)
                {
                    this.indice = indice;
                    this.abreviation = abreviation;
                    this.libelle = libelle;
                }

    public Long getIndice() {
        return indice;
    }
    public String getAbreviation() {
        return abreviation;
    }
    public String getLibelle() {
        return libelle;
    }
    
    
}
