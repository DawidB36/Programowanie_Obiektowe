import java.lang.reflect.Array;
import java.util.ArrayList;

public class zestaw_nr5 {
    ///zad 1
    public static ArrayList<Integer> append(ArrayList<Integer> tab1, ArrayList<Integer> tab2) {
        int length_left = tab1.size();
        int length_right = tab2.size();

        ArrayList<Integer> final_array = new ArrayList<Integer>();

        for (int i = 0; i < length_left; i++) {
            final_array.add(tab1.get(i));
        }
        for (int i = 0; i < length_right; i++) {
            final_array.add(tab2.get(i));
        }

        return final_array;
    }

    ///zad 2
    public static ArrayList<Integer> merge(ArrayList<Integer> tab1, ArrayList<Integer> tab2) {
        int length_left = tab1.size();
        int length_right = tab2.size();
        int i = 0;

        ArrayList<Integer> final_array = new ArrayList<Integer>();

        while (length_left > 0) {
            final_array.add(tab1.get(i));
            length_left--;
            if (length_right > 0) {
                final_array.add(tab2.get(i));
                length_right--;
            }
            i++;
        }

        while (length_right > 0) {
            final_array.add(tab2.get(i));
            i++;
            length_right--;
        }

        return final_array;
    }

    ///zad 3
    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> tab1, ArrayList<Integer> tab2) {
        ArrayList<Integer> final_array = append(tab1, tab2);

        int n = final_array.size();
        for (int i = 1; i < n; ++i) {
            int key = final_array.get(i);
            int j = i - 1;

            while (j >= 0 && final_array.get(j) > key) {
                final_array.set(j + 1, final_array.get(j));
                j = j - 1;
            }
            final_array.set(j + 1, key);
        }

        return final_array;

    }

    ///zad 4
    public static ArrayList<String> toArrayList(String napis) {
        ArrayList<String> array = new ArrayList<String>();

        for (int i = 0; i < napis.length(); i++) {
            array.add(String.valueOf(napis.charAt(i)));
        }

        int n = array.size();
        for (int i = 1; i < n; ++i) {
            String key = array.get(i);
            int j = i - 1;

            while (j >= 0 && array.get(j).charAt(0) > key.charAt(0)) {
                array.set(j + 1, array.get(j));
                j = j - 1;
            }
            array.set(j + 1, key);
        }

        return array;
    }

    public static ArrayList<Integer> toArrayList(Integer liczba) {
        ArrayList<Integer> array = new ArrayList<Integer>();

        int temp = liczba;
        int length = 0;
        while (temp > 0) {
            temp = (temp / 10);
            length++;
        }

        temp = liczba;
        for (int i = 1; i < length + 1; i++) {
            int digit = temp % 10;
            array.add(digit);
            temp = temp / 10;
        }

        int n = array.size();
        for (int i = 1; i < n; ++i) {
            int key = array.get(i);
            int j = i - 1;

            while (j >= 0 && array.get(j) > key) {
                array.set(j + 1, array.get(j));
                j = j - 1;
            }
            array.set(j + 1, key);
        }

        return array;
    }

    ///zad 5
    public static boolean checkChar(ArrayList<String> tab, char znak) {
        if(tab.contains(String.valueOf(znak)))
            return true;
        else
            return false;
    }

    public static boolean checkChar(ArrayList<Integer> tab, int cyfra) {
        if(tab.contains(cyfra))
            return true;
        else
            return false;
    }

    ///zad 6
    public static int countChar(ArrayList<String> tab, char znak) {
        int count = 0;

        for (int i = 0; i < tab.size(); i++) {
            if (tab.get(i).equals(String.valueOf(znak)))
                count++;
        }

        return count;
    }

    public static int countChar(ArrayList<Integer> tab, int cyfra) {
        int count = 0;

        for (int i = 0; i < tab.size(); i++) {
            if (tab.get(i) == cyfra)
                count++;
        }

        return count;
    }

    ///zad 7
    public static ArrayList<ArrayList<Integer>> uniqueArrayList(ArrayList<Integer> tab) {
        ArrayList<Integer> unique = new ArrayList<Integer>();

        for(int i = 0; i < tab.size(); i++) {
            if (!unique.contains(tab.get(i))) {
                unique.add(tab.get(i));
            }
        }

        ArrayList<ArrayList<Integer>> final_array = new ArrayList<ArrayList<Integer>>(unique.size());

        for(int i = 0; i < unique.size(); i++) {
            ArrayList<Integer> inner = new ArrayList<Integer>(2);
            inner.add(unique.get(i));
            inner.add(0);
            final_array.add(inner);
        }

        return final_array;

    }

    ///zad 8
    public static ArrayList<ArrayList<Integer>> countArrayList(ArrayList<Integer> tab) {
        ArrayList<ArrayList<Integer>> final_array = uniqueArrayList(tab);

        for (int i = 0; i < tab.size(); i++) {
            for (int j = 0; j < final_array.size(); j++) {
                if (final_array.get(j).get(0) == tab.get(i)) {
                    final_array.get(j).set(1, final_array.get(j).get(1) + 1);
                }
            }
        }

        return final_array;

    }

    public static void main(String[] args) {
        ///zad 1
        System.out.println("Zad 1:");

        ArrayList<Integer> tab1_a = new ArrayList<Integer>();
        tab1_a.add(1);
        tab1_a.add(2);
        tab1_a.add(1);

        ArrayList<Integer> tab1_b = new ArrayList<Integer>();
        tab1_b.add(3);
        tab1_b.add(4);
        tab1_b.add(3);

        System.out.println(tab1_a);
        System.out.println(tab1_b);

        System.out.println(append(tab1_a, tab1_b));

        System.out.println("");

        ///zad 2
        System.out.println("Zad 2:");

        ArrayList<Integer> tab2_a = new ArrayList<Integer>();
        tab2_a.add(1);
        tab2_a.add(2);
        tab2_a.add(1);
        tab2_a.add(7);
        tab2_a.add(6);


        ArrayList<Integer> tab2_b = new ArrayList<Integer>();
        tab2_b.add(3);
        tab2_b.add(4);
        tab2_b.add(3);


        System.out.println(tab2_a);
        System.out.println(tab2_b);

        System.out.println(merge(tab2_a, tab2_b));

        System.out.println("");

        ///zad 3
        System.out.println("Zad 3:");

        ArrayList<Integer> tab3_a = new ArrayList<Integer>();
        tab3_a.add(1);
        tab3_a.add(2);
        tab3_a.add(1);
        tab3_a.add(7);
        tab3_a.add(6);


        ArrayList<Integer> tab3_b = new ArrayList<Integer>();
        tab3_b.add(3);
        tab3_b.add(4);
        tab3_b.add(3);


        System.out.println(tab3_a);
        System.out.println(tab3_b);

        System.out.println(mergeSorted(tab3_a, tab3_b));

        System.out.println("");

        ///zad 4
        System.out.println("Zad 4:");

        String str4 = "ala ma kota";
        System.out.println(str4);
        System.out.println(toArrayList(str4));

        int liczba = 73207501;
        System.out.println(liczba);
        System.out.println(toArrayList(liczba));

        System.out.println("");

        ///zad 5
        System.out.println("Zad 5:");

        System.out.println(checkChar(toArrayList(str4), 'a'));

        System.out.println(checkChar(toArrayList(liczba), 6));

        System.out.println("");

        ///zad 6
        System.out.println("Zad 6:");

        System.out.println(countChar(toArrayList(str4), 'a'));

        System.out.println(countChar(toArrayList(liczba), 7));

        System.out.println("");

        ///zad 7
        System.out.println("Zad 7:");

        ArrayList<Integer> tab7 = new ArrayList<Integer>();
        tab7.add(1);
        tab7.add(2);
        tab7.add(1);
        tab7.add(1);
        tab7.add(5);

        System.out.println(tab7);

        System.out.println(uniqueArrayList(tab7));

        System.out.println("");

        ///zad 8
        System.out.println("Zad 8:");

        ArrayList<Integer> tab8 = new ArrayList<Integer>();
        tab8.add(1);
        tab8.add(2);
        tab8.add(1);
        tab8.add(1);
        tab8.add(5);

        System.out.println(tab8);

        System.out.println(countArrayList(tab8));

        System.out.println("");
    }
}