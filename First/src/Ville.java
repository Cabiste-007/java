public class Ville{   
  //Stocke le nom de notre ville
  private String nomVille;
  //Stocke le nom du pays de notre ville
  private String nomPays;
  //Stocke le nombre d'habitants de notre ville
  private int nbreHabitants;
     

  //Constructeur par d�faut
  public Ville(){
    System.out.println("Cr�ation d'une ville !");          
    nomVille = "Inconnu";
    nomPays = "Inconnu";
    nbreHabitants = 0;
  }
 
  //Constructeur avec param�tres
  //J'ai ajout� un � p � en premi�re lettre des param�tres.
  //Ce n'est pas une convention, mais �a peut �tre un bon moyen de les rep�rer.
  public Ville(String pNom, int pNbre, String pPays)
  {
    System.out.println("Cr�ation d'une ville avec des param�tres !");
    nomVille = pNom;
    nomPays = pPays;
    nbreHabitants = pNbre;
  }  
  //*************   ACCESSEURS *************
  
  //Retourne le nom de la ville
  public String getNom()  {  
    return nomVille;
  }

  //Retourne le nom du pays
  public String getNomPays()
  {
    return nomPays;
  }

  // Retourne le nombre d'habitants
  public int getNombreHabitants()
  {
    return nbreHabitants;
  } 
 
  //*************   MUTATEURS   *************

  //D�finit le nom de la ville
  public void setNom(String pNom)
  {
    nomVille = pNom;
  }

  //D�finit le nom du pays
  public void setNomPays(String pPays)
  {
    nomPays = pPays;
  }

  //D�finit le nombre d'habitants
  public void setNombreHabitants(int nbre)
  {
    nbreHabitants = nbre;
  }  
}