public class zestaw_nr4 {

    ///print double table
    public static void drukujTabliceDouble(double [] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
    }

    ///print int table
    public static void drukujTabliceInt(int [] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
    }

    ///generator int w zakresie
    public static int randomIntRange(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    ///zad 1
    public static int[] generujTablice(int n, int minWartosc, int maxWartosc) {
        int[] tab = new int[n];

        for(int i = 0; i < n; i++) {
            tab[i] = randomIntRange(minWartosc, maxWartosc);
        }

        return tab;
    }

    ///zad 2
    public static void wypiszTablice(int [] tab, int n, int m) {
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(k >= tab.length) {
                    System.out.print("NaN ");
                }
                else {
                    System.out.print(tab[k] + " ");
                }
                k++;
            }
            System.out.println("");
        }
    }

    ///zad 3
    public static int ileNieparzystych(int[] tab) {
        int total = 0;

        for (int i = 0; i < tab.length; i++) {
            if(tab[i] % 2 != 0) {
                total++;
            }
        }

        return total;
    }

    public static int ileParzystych(int[] tab) {
        int total = 0;

        for (int i = 0; i < tab.length; i++) {
            if(tab[i] % 2 == 0) {
                total++;
            }
        }

        return total;
    }

    public static int ileDodatnich(int[] tab) {
        int total = 0;

        for (int i = 0; i < tab.length; i++) {
            if(tab[i] > 0) {
                total++;
            }
        }

        return total;
    }

    public static int ileUjemnych(int[] tab) {
        int total = 0;

        for (int i = 0; i < tab.length; i++) {
            if(tab[i] < 0) {
                total++;
            }
        }

        return total;
    }

    public static int ileZerowych(int[] tab) {
        int total = 0;

        for (int i = 0; i < tab.length; i++) {
            if(tab[i] == 0) {
                total++;
            }
        }

        return total;
    }

    public static int ileMaxymalnych(int[] tab) {
        int total = 0;
        int max = tab[0];

        for (int i = 0; i < tab.length; i++) {
            if(tab[i] > max) {
                max = tab[i];
            }
        }

        for (int i = 0; i < tab.length; i++) {
            if(tab[i] == max) {
                total++;
            }
        }

        return total;
    }

    public static int ileMinimalnych(int[] tab) {
        int total = 0;
        int min = tab[0];

        for (int i = 0; i < tab.length; i++) {
            if(tab[i] < min) {
                min = tab[i];
            }
        }

        for (int i = 0; i < tab.length; i++) {
            if(tab[i] == min) {
                total++;
            }
        }

        return total;
    }

    public static int ileUnikalnych(int[] tab) {
        int unique = 0;

        for (int i = 0; i < tab.length; i++) {
            boolean flag = true;

            for (int j = 0; j < tab.length; j++) {
                if(tab[i] == tab[j] && i != j) {
                    flag = false;
                }
            }

            if(flag) {
                unique++;
            }
        }

        return unique;
    }

    ///zad 4
    public static int sumaDodatnich(int[] tab) {
        int total = 0;

        for (int i = 0; i < tab.length; i++) {
            if(tab[i] > 0) {
                total += tab[i];
            }
        }

        return total;
    }

    public static int sumaUjemnych(int[] tab) {
        int total = 0;

        for (int i = 0; i < tab.length; i++) {
            if(tab[i] < 0) {
                total += tab[i];
            }
        }

        return total;
    }

    public static int sumaOdwrotnosci(int[] tab) {
        int total = 0;

        for (int i = 0; i < tab.length; i++) {
            total += -tab[i];
        }

        return total;
    }

    public static double sredniaArytmetyczna(int[] tab) {
        int total = 0;

        for (int i = 0; i < tab.length; i++) {
            total += tab[i];
        }

        return (double) total / tab.length;
    }

    public static double sredniaGeometryczna(int[] tab) {
        double total = 1;

        for (int i = 0; i < tab.length; i++) {
            total *= tab[i];
        }

        return Math.pow(total, 1.0/tab.length);
    }

    public static double sredniaHarmoniczna(int[] tab) {
        double total = 0;

        for (int i = 0; i < tab.length; i++) {
            total += 1.0/tab[i];
        }

        return tab.length/total;
    }

    ///zad 5
    public static int[] funkcjaLiniowa(int[] tab, int a, int b) {
        int[] output_tab = new int[tab.length];

        for(int i = 0; i < tab.length; i++) {
            output_tab[i] = a * tab[i] + b;
        }

        return output_tab;
    }

    public static int[] funkcjaKwadratowa(int[] tab, int a, int b, int c) {
        int[] output_tab = new int[tab.length];

        for(int i = 0; i < tab.length; i++) {
            output_tab[i] = a * (tab[i] * tab[i]) + b * tab[i] + c;
        }

        return output_tab;
    }

    public static double[] funkcjaWykladnicza(int[] tab, int a) {
        double[] output_tab = new double[tab.length];

        for(int i = 0; i < tab.length; i++) {
            output_tab[i] = Math.pow(a, tab[i]);
        }

        return output_tab;
    }

    public static int[] funkcjaSignum(int[] tab) {
        int[] output_tab = new int[tab.length];

        for(int i = 0; i < tab.length; i++) {
            if (tab[i] > 0)
                output_tab[i] = 1;
            else if (tab[i] < 0)
                output_tab[i] = -1;
            else
                output_tab[i] = 0;
        }

        return output_tab;
    }

    ///zad 6
    public static int najdluzszyCiagDodatnich(int[] tab) {
        int maxLength = 0, currentLength = 0;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 0) {
                currentLength++;
            }
            else {
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 0;
            }
        }
        maxLength = Math.max(maxLength, currentLength);

        return maxLength;
    }

    public static int najdluzszyCiagUjemnych(int[] tab) {
        int maxLength = 0, currentLength = 0;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 0) {
                currentLength++;
            } else {
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 0;
            }
        }
        maxLength = Math.max(maxLength, currentLength);

        return maxLength;
    }

    public static void odwrocTablice(int[] tab) {
        int left = 0;
        int right = tab.length - 1;

        while (left < right) {
            int temp = tab[left];
            tab[left] = tab[right];
            tab[right] = temp;
            left++;
            right--;
        }
    }

    public static void odwrocTablice(int[] tab, int indeksStart, int indeksStop) {
        int left = indeksStart;
        int right = indeksStop;

        while (left < right) {
            int temp = tab[left];
            tab[left] = tab[right];
            tab[right] = temp;
            left++;
            right--;
        }
    }

    ///zad 7
    public static double[] generujZakres(int n, double minWartosc, double maxWartosc) {
        double[] tab = new double[n];
        double space = (maxWartosc - minWartosc) / (n - 1);

        if(n > 2) {
            for (int i = 0; i < n; i++) {
                tab[i] = minWartosc + (space * i);
            }
        }
        else {
            System.out.println("Nieprawidłowa ilość elementów!");
            return null;
        }

        return tab;
    }

    public static void main(String[] args) {
        ///zad 1
        System.out.println("Zadanie nr 1:");
        int[] tab1 = generujTablice(20, -10, 10);

        drukujTabliceInt(tab1);
        System.out.println("\n");

        ///zad 2
        System.out.println("Zadanie nr 2:");
        int[] tab2 = generujTablice(9, -10, 10);

        drukujTabliceInt(tab2);
        System.out.println("\n");

        wypiszTablice(tab2, 4, 4);
        System.out.println("");

        ///zad 3
        System.out.println("Zadanie nr 3:");
        int[] tab3 = generujTablice(10, -10, 10);

        drukujTabliceInt(tab3);
        System.out.println("\n");

        System.out.println("Ilość liczb nieparzystych: " + ileNieparzystych(tab3));

        System.out.println("Ilość liczb parzystych: " + ileParzystych(tab3));

        System.out.println("Ilość liczb dodatnich: " + ileDodatnich(tab3));

        System.out.println("Ilość liczb ujemnych: " + ileUjemnych(tab3));

        System.out.println("Ilość liczb zerowych: " + ileZerowych(tab3));

        System.out.println("Ilość liczb maksymalnych: " + ileMaxymalnych(tab3));

        System.out.println("Ilość liczb minimalnych: " + ileMinimalnych(tab3));

        System.out.println("Ilość liczb unikalnych: " + ileUnikalnych(tab3));

        System.out.println("\n");

        ///zad 4
        System.out.println("Zadanie nr 4:");

        int[] tab4 = generujTablice(4, 1, 10);
        drukujTabliceInt(tab4);
        System.out.println("\n");

        System.out.println("Suma liczb dodatnich: " + sumaDodatnich(tab4));

        System.out.println("Suma liczb ujemnych: " + sumaUjemnych(tab4));

        System.out.println("Suma liczb odwrotnych: " + sumaOdwrotnosci(tab4));

        System.out.println("Średnia arytmetyczna: " + sredniaArytmetyczna(tab4));

        System.out.println("Średnia geometryczna: " + sredniaGeometryczna(tab4));

        System.out.println("Średnia harmoniczna: " + sredniaHarmoniczna(tab4));

        System.out.println("\n");

        ///zad 5
        System.out.println("Zadanie nr 5:");

        int[] tab5 = generujTablice(4, -10, 10);
        drukujTabliceInt(tab5);
        System.out.println("\n");

        System.out.println("Nowa tablica z użyciem funkcji liniowej:");
        int[] tab5_lin = funkcjaLiniowa(tab5, 2, 10);
        drukujTabliceInt(tab5_lin);
        System.out.println("\n");

        System.out.println("Nowa tablica z użyciem funkcji kwadratowej:");
        int[] tab5_kwad = funkcjaKwadratowa(tab5, 2, 10, -1);
        drukujTabliceInt(tab5_kwad);
        System.out.println("\n");

        System.out.println("Nowa tablica z użyciem funkcji wykładniczej:");
        double[] tab5_wyk = funkcjaWykladnicza(tab5, 2);
        drukujTabliceDouble(tab5_wyk);
        System.out.println("\n");

        System.out.println("Nowa tablica z użyciem funkcji signum:");
        int[] tab5_sig = funkcjaSignum(tab5);
        drukujTabliceInt(tab5_sig);
        System.out.println("\n");

        ///zad 6
        System.out.println("Zadanie nr 6:");

        int[] tab6 = generujTablice(10, -10, 10);
        drukujTabliceInt(tab6);
        System.out.println("\n");

        System.out.println("Najdłuższy ciąg liczb dodatnich: " + najdluzszyCiagDodatnich(tab6));
        System.out.println("\n");

        System.out.println("Najdłuższy ciąg liczb ujemnych: " + najdluzszyCiagUjemnych(tab6));
        System.out.println("\n");

        odwrocTablice(tab6);
        System.out.println("Tablica po odwróceniu:");
        drukujTabliceInt(tab6);
        System.out.println("\n");

        odwrocTablice(tab6, 2, 7);
        System.out.println("Tablica po odwróceniu od indeksu 2 do 7:");
        drukujTabliceInt(tab6);

        System.out.println("\n");

        ///zad 7
        System.out.println("Zadanie nr 7:");
        double[] tab7 = generujZakres(3, 1.0, 6.0);

        drukujTabliceDouble(tab7);
        System.out.println("");
    }
}
