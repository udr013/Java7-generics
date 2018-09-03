package generics;

public class DuoApp {
    public static void main(String[] args) {
        Duo<String> sd = new Duo<>("Hello", "World");
        Duo<?> id = new Duo<Integer>(7, 5);
        Duo<Long> ld = new Duo<>(746987L, 546358L);
        Duo<Float> fd = new Duo<>(5.7F, 8.9F);

        String s1 = sd.getFirst();
        String s2 = sd.getSecond();
        Integer i1 = id.getFirst();
        Integer i2 = id.getSecond();
        System.out.println(s1 + " " + s2);
        System.out.println(i1 + i2);


        //arrays en generics
        Duo<?>[] twee;
        twee = new Duo<?>[4];

        twee[0] = new Duo<String>("Hallo", "Wereld");
        twee[1] = new Duo<Integer>(9, 7);
        twee[2] = new Duo<Long>(746987L, 546358L);
        twee[3] = new Duo<Float>(5.7F, 8.9F);

        for (Duo d : twee) {
            System.out.println(d.getFirst() + " " + d.getSecond());
        }

    }
}