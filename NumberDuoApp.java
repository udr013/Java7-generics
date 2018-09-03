package generics;

public class NumberDuoApp {
    public static void main(String[] args) {
        NumberDuo<?> nd1 = new NumberDuo<Integer>(3, 5);
        NumberDuo<?> nd2 = new NumberDuo<>(3.2, 5.8);
        NumberDuo<?> nd3 = new NumberDuo<>(3.2, 5);
        System.out.println(nd1.getSum());
        System.out.println(nd2.getSum());
        System.out.println(nd3.getSum());


        NumberDuo<?> nd4 = new NumberDuo<Integer>(3, 5);
        nd4.getFirst(); // Goed
//        nd4.setFirst(new Float(6));        // Fout
        System.out.println(nd4.getSum());
    }
}
