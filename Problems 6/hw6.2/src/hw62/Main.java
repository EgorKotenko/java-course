
package hw62;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author S
 */
public class Main {

    public static void main(String[] args) {
        try {
            Set<String> a = new Set<String>();
            a.addToSet("ae");
            a.addToSet("ololo");
            a.addToSet("buee");
            a.removeFromSet("ololo");
            Set<String> b = new Set<String>();
            b.addToSet("uuu");
            b.addToSet("ae");
            Set<String> c = a.setsIntersection(b);
            Set<String> d = a.setsUnion(b);
            a.printSet();
            b.printSet();
            c.printSet();
            d.printSet();
        } catch (removeNullElementException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.INFO, "", ex);
        } catch (uniqueElementException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.INFO, "", ex);
        }

    }

}
