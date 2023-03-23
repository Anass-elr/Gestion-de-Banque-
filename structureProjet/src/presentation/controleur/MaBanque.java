package presentation.controleur;

import metier.authentification.*;
import metier.authentification.ServiceIHM;
import metier.clients.ServiceIHMClient;
import presentation.modele.Banque;
import presentation.modele.Client;
import presentation.modele.Sexe;

import java.util.Scanner;

public class MaBanque {
        public static IAuth loginService;
        public static void main(String[] args) {
        		
         
        
                Banque maBanque
                        = new Banque(   "BP",
                                        "Hassan Rabat",
                                        "212535224433",
                                        "bp@banquePop.ma");

<<<<<<< HEAD
                maBanque.getClientsDeBanque().add(
                  new Client("xx","xx","xx","xx","xx"));
              
              ServiceIHM menuApp=new ServiceIHM(maBanque);
              
              
              
=======
       
              
              ServiceIHM menuApp=new ServiceIHM(maBanque);
              
>>>>>>> aed6cd9f93df3ece67e53b4f5b10e4e45fd5687c
              menuApp.menuGlobal();
              
                      	
        	
              
              
        }

		
}
