package metier.admin;

import java.util.InputMismatchException;
import java.util.List;

import Util.typeAuClavier;
import dao.IDao;
import dao.daoFiles.ClientDao;
import metier.InteractiveConsole;
import presentation.modele.Banque;
import presentation.modele.Client;
import presentation.modele.Compte;
import presentation.modele.Filtre;

public class ServiceIHMAdmin implements IServiceIHMAdmin,InteractiveConsole{

	private Banque B;
	
	private ServiceAdmin srvAdmin;
	private ClientDao DaoClient  ;
	
	public ServiceIHMAdmin(Banque b) {
		super();
		B = b;
		DaoClient=DaoClient;
		srvAdmin=new ServiceAdmin(B);
	}
	
	public int menuGlobal() {
		Integer choix;
		
		do {
			       
			System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
			System.out.println("=*=           BIENVENUE CHER(E) ADMIN                 =*=");
			System.out.println("=*=**************************************************=*=*");
			
			System.out.println("=*=*=*=*=*=*=*=  MENU [ADMINISTRATEUR] =*=*=*=*=*=*=*=*=");
			System.out.println("=*=                                                  =*=");
			System.out.println("=*=**************************************************=*=");
			System.out.println("= Tapez 1 pour le [SERVICE CRUD]                       =");
			System.out.println("= Tapez 2 pour le [SERVICE INFORMATION]               =");
			System.out.println("= Tapez 3 pour le [SERVICE TRIE]                       =");
			System.out.println("= Tapez 4 pour le [TABLEAU DE BORD - STATISTIQUES]     =");
			System.out.println("= Tapez 5 pour se deconecter                           =");
			System.out.println("=*=                                                  =*=");
			System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
			
			System.out.println("=> Entrez Votre choix :");
			/* chaine=typeAuClavier.
					    StringAuClavier(sc, "Entrez Votre choix : ");*/
			
			try {
				choix=typeAuClavier.
	    			IntegerAuClavier(sc, "=> Entrez Votre Choix :");
			
				switch(choix) {
					case 1 :{  
						   menuCRUD();
							} break ; 
					case 2 :{
						menuInformation();
					} break ; 
					case 3 :{
						menuAjout(); 
					}break ; 
					case 4 :{ 
						
					} break;  
				}
			}
			catch(Exception e) {
			  System.out.println(e.getMessage());
			  break;
			}
			
		} while(choix >= 1 && choix < 5);
		return 0;
	}
	
	
	
	public int menuInformation() {
       Integer choix;
		
		do {
			       
			System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
			System.out.println("=*=           BIENVENUE CHER(E) ADMIN                 =*=");
			System.out.println("=*=**************************************************=*=*");
			
			System.out.println("=*=*=*=*=*=*=*=  MENU [ADMINISTRATEUR] =*=*=*=*=*=*=*=*=");
			System.out.println("=*=                                                  =*=");
			System.out.println("=*=**************************************************=*=");
			System.out.println("= TAPEZ 1 POUR AFFICHER TOUS CLIENTS                   =");
			System.out.println("= TAPEZ 2 POUR AFFICHER TOUS COMPTES                   =");
			System.out.println("= Tapez 3 pour le [SERVICE TRIE]                       =");
			System.out.println("= Tapez 4 pour le [TABLEAU DE BORD - STATISTIQUES]     =");
			System.out.println("= Tapez 5 pour se deconecter                           =");
			System.out.println("=*=                                                  =*=");
			System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
			
			System.out.println("=> Entrez Votre choix :");
			/* chaine=typeAuClavier.
					    StringAuClavier(sc, "Entrez Votre choix : ");*/
			
			try {
				choix=typeAuClavier.
	    			IntegerAuClavier(sc, "=> Entrez Votre Choix :");
			
				switch(choix) {
					case 1 :{  
						
							} break ; 
					case 2 :{
						menuInformation();
					} break ; 
					case 3 :{
						menuAjout(); 
					}break ; 
					case 4 :{ 
						
					} break;  
				}
			}
			catch(Exception e) {
			  System.out.println(e.getMessage());
			  break;
			}
			
		} while(choix >= 1 && choix < 5);
		return 0;
		
	}
	
	
	
	
	public int menuCRUD() {
		Integer choix;
		
		do {
			       
			System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
			System.out.println("=*=           BIENVENUE CHER(E) ADMIN                 =*=");
			System.out.println("=*=**************************************************=*=*");
			
			System.out.println("=*=*=*=*=*=*=*=  MENU [ADMINISTRATEUR] =*=*=*=*=*=*=*=*=");
			System.out.println("=*=                                                  =*=");
			System.out.println("=*=**************************************************=*=");
			System.out.println("= Tapez 1 pour le [MENU DE RECHERHCE]                  =");
			System.out.println("= Tapez 2 pour le [MENU DE MODIFICATION]               =");
			System.out.println("= Tapez 3 pour le [MENU D'AJOUT]                       =");
			System.out.println("= Tapez 4 pour le [MENU DE SUPPRESSION]                =");
			System.out.println("= Tapez 5 pour se deconecter                           =");
			System.out.println("=*=                                                  =*=");
			System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
			
			System.out.println("=> Entrez Votre choix :");
			/* chaine=typeAuClavier.
					    StringAuClavier(sc, "Entrez Votre choix : ");*/
			
			try {
				choix=typeAuClavier.
	    			IntegerAuClavier(sc, "=> Entrez Votre Choix :");
			
				switch(choix) {
					case 1 :{  
						 menuRecherche();
							} break ; 
					case 2 :{
						menuModification();
					} break ; 
					case 3 :{
						menuAjout(); 
					}break ; 
					case 4 :{ 
						
					} break;  
				}
			}
			catch(Exception e) {
			  System.out.println(e.getMessage());
			  break;
			}
			
		} while(choix >= 1 && choix < 5);
		return 0;
	}
	
	@Override
	public int menuModification() {
		Integer choix;
		try {
			long n=typeAuClavier.LongAuClavier(sc,"=> ID DU CLIENT A MODIFIER : ");
			  
			do {
				System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
				System.out.println("=*=           BIENVENUE CHER(E) ADMIN                 =*=");
				System.out.println("=*=**************************************************=*=*");
				
				System.out.println("=*=*=*=*=*=*=*=*=*=  MENU [MODIFICATION] =*=*=*=*=*=*=*=*");
				System.out.println("=*=                                                  =*=");
				System.out.println("=*=**************************************************=*=");
				System.out.println("= TAPER 1 PR MODIFIER  ID                              =");
				System.out.println("= TAPEZ 2 PR MODIFIER EMAIL                            =");
				System.out.println("= TAPEZ 3 PR MODIFIER CIN                              =");
				System.out.println("= TAPEZ 4 PR MODIFIER NOM                              =");
				System.out.println("= TAPEZ 5 PR MODIFIER PRENOM                           =");
				System.out.println("= TAPEZ 6 PR MODIFIER LOGIN                            =");
				System.out.println("= TAPEZ 7 PR MODIFIER PASSWORD                         =");
				System.out.println("=*= TAPEZ AUTRE POUR QUITTER MENU PRINCIPALE         =*=");
				System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
					
				try {
			    	choix=typeAuClavier.
			    		   IntegerAuClavier(sc, "=> Entrez Votre Choix :");
			    	switch(choix) {
					case 1 :{ 
						srvAdmin.modifierClient(Filtre.ID.getLibelle(), n);
					} break ; 
					
					case 2:{
						srvAdmin.modifierClient(Filtre.EMAIL.getLibelle(), n);		
					};break;
					
					case 3:{
						srvAdmin.modifierClient(Filtre.CIN.getLibelle(), n);		
					};break;
					
					case 4:{
						srvAdmin.modifierClient(Filtre.NOM.getLibelle(), n);		
					};break;
					
					
					case 5:{
						srvAdmin.modifierClient(Filtre.PRENOM.getLibelle(), n);		
					};break;
					
					case 6:{
						srvAdmin.modifierClient(Filtre.LOGIN.getLibelle(), n);		
					};break;
					
					case 7:{
						srvAdmin.modifierClient(Filtre.PASS.getLibelle(), n);		
					};break;
					
					
			    	}
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
					break;
				}
			   
			} while(choix >= 1 && choix < 3);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return 0;
	}

	@Override
	public int menuRecherche() {
		Integer choix;
		
		do {
			System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
			System.out.println("=*=           BIENVENUE CHER(E) ADMIN                 =*=");
			System.out.println("=*=**************************************************=*=*");
			
			System.out.println("=*=*=*=*=*=*=*=*=*=  MENU [RECHERCHE] =*=*=*=*=*=*=*=*=*=");
			System.out.println("=*=                                                  =*=");
			System.out.println("=*=**************************************************=*=");
			System.out.println("= Tapez 1 CHERCHER UN CLIENT                           =");
			System.out.println("= Tapez 2 CHERCHER UN COMPTE                           =");
			System.out.println("= Tapez 3 AFFICHER TOUS LES CLIENTS                    =");
			System.out.println("= AUTRE POUR MENU PRINCIPALE                           =");
			System.out.println("=*=                                                  =*=");
			System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
				
			try {
		    	choix=typeAuClavier.
		    		 IntegerAuClavier(sc, "=> Entrez Votre Choix :");
		    	switch(choix) {
				case 1 :{ 
					menuRechercheClient();
				} break ; 
				
				case 2:{
					menuRechercheCompte();			
				};break;
				
				case 3:{
					srvAdmin.AfficherClients()	;	
				};break;
				
				
		    	}
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
				break;
			}
		   
		} while(choix >= 1 && choix <= 3);
		return 0;
	}
	
	
	public int menuRechercheClient() {
	  int schoix;
		do {
			System.out.println("=*=*=*=*=*=*=*=*=*=  MENU [RECHERCHE] =*=*=*=*=*=*=*=*=*=");
			System.out.println("=*=                                                  =*=");
			System.out.println("=*=**************************************************=*=");
			System.out.println("= Tapez 1 Pour Chercher par Id                         =");
			System.out.println("= Tapez 2 Pour Chercher par Nom                        =");
			System.out.println("= Tapez 3 Pour Chercher par Prenom                     =");
			System.out.println("= Tapez 4 Pour Chercher par Cin                        =");
			System.out.println("= Tapez 5 Pour Chercher par Email                      =");					
			System.out.println("= Autre pour Menu précedant                            =");
			//Add prop
			System.out.println("=*=                                                  =*=");
			System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
			
			try {
				schoix=typeAuClavier.IntegerAuClavier(sc, "");
				
				switch (schoix) {
				  
				case 1 :{  
					Long id;
					try {
						 sc.nextLine();
						 id=typeAuClavier.LongAuClavier(sc, "Entrez Id");
						 
						 Client c=srvAdmin.chercherClientParId(id);
						  if(c==null) 
							   System.out.println("Pas de Client");
						  else 
								 System.out.println(c.toString()); 
					}catch(Exception e) {
						System.out.println(e.getMessage());
					}
					
				  } break ; 
				
				case 2 :{  
					sc.nextLine();
					 String ch=typeAuClavier.StringAuClavier(sc, "Entrez le Nom : ");
					
					  List<Client> clients=srvAdmin.chercherClientParNom(ch);
					  if(clients.size()==0) 
						   System.out.println("Pas de Client");
					  else {
						  clients.forEach(cl -> System.out.println(cl.toString()) );	
						
					  }
				} break ; 
				
				case 3 :{  
					sc.nextLine();
					 String ch=typeAuClavier.StringAuClavier(sc, "Entrez Prenom");
					  List<Client> clients=srvAdmin.chercherClientParPrénom(ch);
					  if(clients.size()==0) 
						   System.out.println("Pas de Client");
					  else 
						  clients.forEach(cl -> System.out.println(cl.toString()) );
				} break ; 
					
		
			    case 4 :{  
					 String ch=typeAuClavier.StringAuClavier(sc, "Entrez CIN");
					  Client c=srvAdmin.chercherClientParCin(ch);
					  if(c==null) 
						   System.out.println("Pas de Client");
					  else 
						 System.out.println(c.toString()); 
				} break ; 
					
				case 5 :{  
					sc.nextLine();
					 String ch=typeAuClavier.StringAuClavier(sc, "Entrez EMAIL");
					  Client c=srvAdmin.chercherClientParEmail(ch);
					  if(c==null) 
						   System.out.println("Pas de Client");
					  else 
						 System.out.println(c.toString()); 
				 } break ; 
			   }
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
				break;
			}
			
		
		}while(schoix>=1 && schoix<=5);
		return 1;
	}


	public int menuRechercheCompte() {
			
		Integer choix;
			
			do {
				System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
				System.out.println("=*=           BIENVENUE CHER(E) ADMIN                 =*=");
				System.out.println("=*=**************************************************=*=*");
				
				System.out.println("=*=*=*=*=*=*=*=*=*=  MENU [RECHERCHE] =*=*=*=*=*=*=*=*=*");
				System.out.println("=*=                                                  =*=");
				System.out.println("=*=**************************************************=*=");
				System.out.println("= Tapez 1 Recherche par Id                             =");
				System.out.println("= Tapez 2 Recherche par solde                          =");
				System.out.println("= Tapez 3 Recherche par dateCreation                   =");
				System.out.println("= Tapez 4 Recherche par Propriataire                   =");
				
				System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
				
				System.out.println("=> Entrez Votre Choix :");
				choix = sc.nextInt();
				
				switch(choix) {
				   case 1 :{  
					   Compte c=null;
					   String id=typeAuClavier.StringAuClavier(sc, "Entrez idCompte");
					   c=srvAdmin.chercherCompteParId(id);
						   if(c==null) 
							   System.out.println("Pas de Compte");
					   	   else 
								 System.out.println(c.toString()); 
					  } break ; 
					
					case 2 :{  
						 double solde;
						try {
							solde = typeAuClavier.DoubleAuClavier(sc, "Entrez le Solde");  
							
						   List<Compte> cpts=srvAdmin.chercherCompteParSolde(solde);
							  if(cpts==null) 
								   System.out.println("Pas de Client");
							  else 
								  cpts.forEach(cl -> System.out.println(cl.toString()) );	
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
							  
					} break ;   
				}
			} while(choix >= 1 && choix < 5);
			return 0;
	}

	@Override
	public int menuInformations() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int menuAjout() {
		// TODO Auto-generated method stub
		Integer choix;
		
		do {
			System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
			System.out.println("=*=           BIENVENUE CHER(E) ADMIN                 =*=");
			System.out.println("=*=**************************************************=*=*");
			
			System.out.println("=*=*=*=*=*=*=*=*=*=  MENU [D'AJOUT] =*=*=*=*=*=*=*=*=*=*");
			System.out.println("=*=                                                  =*=");
			System.out.println("=*=**************************************************=*=");
			System.out.println("= Tapez 1  AJOUTER NV CLIENT                           =");
			System.out.println("= Tapez 2  AJOUTER NV COMPTE                           =");
			System.out.println("= AUTRE POUR MENU PRECEDENT                            =");
			System.out.println("=*=                                                  =*=");
			System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
			
			System.out.println("=> Entrez Votre Choix :");
			choix = sc.nextInt();
			
			switch(choix) {
				case 1 :{  
					Client c=srvAdmin.nouveauClient();
					if(c != null) {
						System.out.println("Client Ajouté avec succes");
					    B.getClientsDeBanque().forEach(e->System.out.println(e.toString()));
					}
					else 
						System.out.println("Client existe deja");					
				} break ; 
				
				case 2:{
					System.out.println("Entrez Id de Client");
					Long n=sc.nextLong();
					if(srvAdmin.nouveauCompteClientExistant(n) == null) {
						System.out.println("Client n'existe pas");					
					}
					B.getClientsDeBanque().forEach(cl->{
						cl.getComptesClient().forEach(cp->{cp.toString();});
					});
				} break ;   
			}
		} while(choix >= 1 && choix < 3);
		return 0;
	}

	@Override
	public int menuSuppression() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int tableauDeBord() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int menuTrie() {
		// TODO Auto-generated method stub
		return 0;
	}



	

	

}
