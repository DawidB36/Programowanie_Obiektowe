public class main {
    public static <T extends Comparable<T>> boolean isEqualOrNull(T object1, T object2){
        if (object1 == null && object2 == null)
            return true;
        return object1.compareTo(object2) == 0;
    }

    public static void main(String[] args) {
        isEqualOrNull_Test a1 = new isEqualOrNull_Test("a1", 1);
        isEqualOrNull_Test a2 = new isEqualOrNull_Test("a2", 1);
        isEqualOrNull_Test b1 = new isEqualOrNull_Test("b1", 2);

        System.out.println(isEqualOrNull(a1, a2));
        System.out.println(isEqualOrNull(a1, b1));
    }
}
