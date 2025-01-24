public class isEqualOrNull_Test implements Comparable<isEqualOrNull_Test> {
    ///metoda znajduje sie w mainie

    public String a;
    public int b;

    public isEqualOrNull_Test(String a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int compareTo(isEqualOrNull_Test o) {
        return Integer.compare(this.b, o.b);
    }
}
