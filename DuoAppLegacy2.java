package generics;

public class DuoAppLegacy2 {

    public static void main(String[] args) {
        Duo od = new Duo("Hello", "World");
        String s1 = (String) od.getFirst();
        String s2 = (String) od.getSecond();
        DuoUtility.printUpper(od);            // Waarschuwing van de compiler
    }
}