package generics;

public class MixedDuoApp {
    public static void main(String[] args) {
        MixedDuo<String, Integer> md = new MixedDuo<String, Integer>("Hello", 5);
        String s = md.getFirst();
        Integer i = md.getSecond();
        System.out.println(s + " " + i);
    }
}
