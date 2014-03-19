/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package whatsdanumba;

/**
 *
 * @author p1106732
 */
public class Jeu {
    private int borneInf;
    private int borneSup;
    
    private int difficulte;
    private int nombre;
    
    public Jeu(){
        difficulte = 0; //par défaut
        borneInf = 0;
        borneSup = 10;
        
        nombre = genNbreAleat(borneInf, borneSup);
    }
    
    private static int genNbreAleat(int borneInf, int borneSup) {
        return (int) ((borneSup - borneInf + 1) * Math.random() + borneInf);
    }
            
}
