/** Classe che gestisce gli anni bisestili
 * @author piffy  */
public class JavaBisestile {
    /** @param i anno da verificare
     * @return  se l'anno è bisestile o no */
    public static boolean isBisestile(int i) {
        if (i<1600 || i%400!=0) {
            if (i%100==0)
                return false;
            return (i%4)==0;
        }
        // Caso della riforma Gregoriana senza eccezione 400
        return i%4==0;
    }  }
