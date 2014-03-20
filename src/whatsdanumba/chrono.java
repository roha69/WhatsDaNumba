/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package whatsdanumba;

/**
 *
 * @author p1106732
 */
public class chrono {

    long temps;

    public chrono() {
        temps = 0;
    }

    public String getTime() {
        int sec = (int) ((System.currentTimeMillis() / 1000) % 60);
        int min = (int) ((System.currentTimeMillis() / 1000) / 60);
  
       return min+":"+sec;
    }
}
