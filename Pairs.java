package generics;

public class Pairs{

    public static void main(String[] args) {
        GenericPair<?> shoepair = new GenericPair<Shoe>(new Shoe(), new Shoe());
    }

}
interface Pair<E> {

    public E getLeft();
    public E getRight();


}

class ShoePair implements Pair<Shoe>, Comparable<ShoePair>{
    Shoe right;
    Shoe left;

    public ShoePair(Shoe right, Shoe left) {
        this.right = right;
        this.left = left;
    }

    @Override
    public Shoe getLeft() {
        return left;
    }

    @Override
    public Shoe getRight() {
        return right;
    }

    @Override
    public int compareTo(ShoePair o) {
        return 0;
    }
}

class GenericPair<R extends Comparable<R>> implements Pair<R>{
    private R left;
    private R right;

    public GenericPair(R left, R right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public R getLeft() {
        return null;
    }

    @Override
    public R getRight() {
        return null;
    }
}
class Shoe implements Comparable {

    String shoe = "bla";


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

