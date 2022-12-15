import java.util.Calendar;

/** Classe che gestisce gli anni bisestili
 * @author cletus : https://stackoverflow.com/users/18393/cletus  */
public class JavaBisestile {
    /** Soluzione per i Java Maniacs
     *
     * @param i anno da verificare
     * @return  se l'anno è bisestile o no */
    public static boolean isBisestile(int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        return cal.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;
    } }

