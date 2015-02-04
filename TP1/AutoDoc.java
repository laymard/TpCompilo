import java.io.*;
/**
 * la classe AutoDoc concrétise la classe abstraite Automate
 * pour l'analyse d'un document reconnaissable par un automate
 * fini
 * @author : Marie-Jo Pédrono
 * date de création : 18 mars 2003
 */
public class AutoDoc extends Automate {
  
    int e = etatErreur;// à des fins de présentation de la matrice

    //la matrice de transition n° ligne : état, n° colonne : unite

  private  final int[][] transition = {
  //autre,doc,fdoc,tit,ftit,date,fdate,para,fpara,ident,entier,pt,virg,etoi  //etat
    {e,    1,  e,   e,   e,   e,   e,    e,   e,    e,   e,     e,  e ,e },//0
    {e,    e,  e,   e,   e,   2,   e,    e,   e,    e,   e,     e,  e ,e },//1
    {e,    e,  e,   e,   e,   e,   e,    e,   e,    e,   3,     e,  e ,e },//2
    {e,    e,  e,   e,   e,   e,   4,    e,   e,    e,   e,     e,  e ,e },//3
    {e,    e,  e,   e,   e,   e,   e,    5,   e,    e,   e,     e,  e ,e  },//4
    {e,    e,  e,   e,   e,   e,   e,    e,   e,    6,   e,     e,  e, 9  },//5
    {e,    e,  e,   e,   e,   e,   e,    e,   8,    6,   e,     7,  7 ,9 },//6
    {e,    e,  e,   e,   e,   e,   e,    e,   8,    6,   e,     e,  e ,9 },//7
    {e,    e,  10,  e,   e,   e,   e,    5,   e,    e,   e,     e,  e ,e }, //8
    {e,    e,  e,   e,   e,   e,   e,    e,   e,    6,   e,     e,  e ,e } //9
  };

/**
* Constructeur AutoDoc pour initialisation
* initialise l’état initial et l’état final 
* @param le flot d'entrée
* 
*/
    public AutoDoc(InputStream flot){ 
    	    super(flot);
    	    // XXX a completer
    }

  /**
   *  Methode qui calcule l'état suivant
   *  @param etat : l'état courant
   *  @param unite : l'unité du token courant
   *  @return l'état suivant
   */
  int getTransition(int etat, int unite){
  	  return -1;
  	  // XXX a completer
  }//getTransition
  //à decommenter plus tard : 
  //void faireAction(int etat, int unite) {};
}//AutoDoc 
