import java.io.*;
/**
 * la classe AutoDoc concr�tise la classe abstraite Automate
 * pour l'analyse d'un document reconnaissable par un automate
 * fini
 * @author : Marie-Jo P�drono
 * date de cr�ation : 18 mars 2003
 */
public class AutoDoc extends Automate {
  
    int e = etatErreur;// � des fins de pr�sentation de la matrice

    //la matrice de transition n� ligne : �tat, n� colonne : unite

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
* initialise l��tat initial et l��tat final 
* @param le flot d'entr�e
* 
*/
    public AutoDoc(InputStream flot){ 
    	    super(flot);
    	    // XXX a completer
    }

  /**
   *  Methode qui calcule l'�tat suivant
   *  @param etat : l'�tat courant
   *  @param unite : l'unit� du token courant
   *  @return l'�tat suivant
   */
  int getTransition(int etat, int unite){
  	  return -1;
  	  // XXX a completer
  }//getTransition
  //� decommenter plus tard�: 
  //void faireAction(int etat, int unite) {};
}//AutoDoc 
