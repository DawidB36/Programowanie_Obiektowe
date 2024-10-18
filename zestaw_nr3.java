import java.util.Scanner;

public class zestaw_nr3 {

    ///zad 1
    static void trojkiPitagorejskie(int n) {
        for(int a=1;a<=n;a++) {
            for(int b=a;b<=n;b++) {
                for(int c=b;c<=n;c++) {
                    if(a*a + b*b == c*c) {
                        System.out.println("["+a+":"+b+":"+c+"]");
                    }
                }
            }
        }
    }

    ///zad 2
    static void funKwaRozwiazania(int n) {
        for(int a=1;a<=n;a++) {
            for(int b=1;b<=n;b++) {
                for(int c=1;c<=n;c++) {
                    if((b*b - 4*a*c) >= 0) {
                        System.out.println("f(x)="+a+"x^2+"+b+"x+"+c);
                    }
                }
            }
        }
    }

    ///zad 3
    static void funKwaDelta(int n) {
        for(int a=1;a<=n;a++) {
            for(int b=1;b<=n;b++) {
                for(int c=1;c<=n;c++) {
                    float delta = b*b - 4*a*c;
                    if(delta >= 0) {
                        for(int d=1;d<=n/2;d++) {
                            if(Math.sqrt(delta) == d) {
                                System.out.println("f(x)="+a+"x^2+"+b+"x+"+c);
                            }
                        }
                    }
                }
            }
        }
    }

    ///zad 4
    static void liczbyPierwsze(int n) {
        for(int i=2;i<=n;i++) {
            boolean flag = true;
            for(int j=2;j<=i;j++) {
                if(i % j == 0 && i != j) {
                    flag = false;
                }
            }
            if(flag) {
                System.out.println(i);
            }
        }
    }

    ///zad 5
    static void liczbyPodzielne(int m, int n) {
        for(int i=1;i<Math.pow(10, m);i++) {
            if(i%n==0) {
                System.out.println(i);
            }
        }
    }

    ///zad 6
    static void piramida(int n, String variant) {
        if(variant == "jednostronna") {
            for(int i=1;i<=n;i++) {
                for(int j=1;j<=i;j++) {
                    if(i!=j) {
                        System.out.print("* ");
                    }
                    else {
                        System.out.println("*");
                    }
                }
            }
        }

        else if(variant == "dwustronna") {
            for(int i=1;i<=n;i++) {
                for(int j=1; j<=n-i; j++) {
                    System.out.print(" ");
                }
                for(int k=1;k<=i;k++) {
                    if(i!=k) {
                        System.out.print("* ");
                    }
                    else {
                        System.out.println("*");
                    }
                }
            }
        }

        else {
        System.out.println("Nie ma takiego wariantu.");
        }
    }

    ///zad 7
    static int silnia(int n) {
        if (n == 0) {
            return 1;
        }
        return n * silnia(n - 1);
    }

    ///zad 8
    static int silniaPodwojona(int n) {
        int total = 1;

        if (n < 1) {
            total = 0;
            System.out.println("Błąd, podana została liczba mniejsza od 1!");
        }

        for (int i = n; i > 1; i = i - 2) {
            total *= i;
        }

        return total;
    }

    ///zad 9
    static int silniaMta(int m, int n) {
        int total = 1;

        if (n < 1) {
            total = 0;
            System.out.println("Błąd, podana została liczba mniejsza od 1!");
        }

        for (int i = n; i > 1; i = i - m) {
            total *= i;
        }

        return total;
    }

    ///zad 10
    static int dwumianNewtona(int n, int k) {
        int total = silnia(n) / ( silnia(k) * silnia(n - k) );
        return total;
    }

    ///zad 11
    static int ciagFibonacciego(int n) {
        if (n < 2) {
            return n;
        }
        return ciagFibonacciego(n - 1) + ciagFibonacciego(n -2);
    }

    ///zad 12
    static int sumaNaturalnych(int n) {
        int total = 0;
        for (int i = n; i > 0; i--) {
            total += i;
        }
        return total;
    }

    static int sumaParzystych(int n) {
        int total = 0;
        for (int i = n; i > 0; i--) {
            if(i % 2 == 0) {
                total += i;
            }
        }
        return total;
    }

    static int sumaNieparzystych(int n) {
        int total = 0;
        for (int i = n; i > 0; i--) {
            if(i % 2 != 0) {
                total += i;
            }
        }
        return total;
    }

    static int sumaKwaNaturalnych(int n) {
        int total = 0;
        for (int i = n; i > 0; i--) {
            total += (i * i);
        }
        return total;
    }

    static int sumaSzeNaturalnych(int n) {
        int total = 0;
        for (int i = n; i > 0; i--) {
            total += (i * i * i);
        }
        return total;
    }

    static int sumaOdwNaturalnych(int n) {
        int total = 0;
        for (int i = n; i > 0; i--) {
            total += (-i);
        }
        return total;
    }

    ///zad 13

    static boolean czyPalindrom(String wyraz) {
        char[] array = wyraz.toCharArray();
        boolean flag = true;
        int length = wyraz.length();

        for (int i = 0; i < length / 2; i++) {
            if(array[i] != array[length - 1 - i]) {
                flag = false;
            }
        }

        return flag;
    }

    ///zad 14

    static void trojkatPascala(int n) {
        int i, j;
        for(i = 0; i <= n; i++) {
            for(j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print(" " + dwumianNewtona(i, j));
            }

            System.out.println("");

        }
    }

    ///zad 15

    static boolean czyPalindromLiczba(int n) {
        int original = n;
        int reversed = 0;

        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        return original == reversed;
    }

    ///zad 16

    public static boolean czyDoskonala(int n) {
        int suma = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                suma += i;
            }
        }
        return suma == n;
    }

    ///zad 17

    public static boolean czyPierwsza(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    ///zad 18

    public static int NWD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    ///zad 19

    public static int[] wczytajTablice() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Podaj liczbę n: ");
        int n = userInput.nextInt();
        int[] tablica = new int[n];
        System.out.println("Podaj " + n + " liczb:");

        for (int i = 0; i < n; i++) {
            tablica[i] = userInput.nextInt();
        }
        return tablica;
    }

    ///zad 20



    public static void main(String[] args) {
        System.out.println("Zad 1:");
        trojkiPitagorejskie(39);
        System.out.println("");

        System.out.println("Zad 2:");
        funKwaRozwiazania(5);
        System.out.println("");

        System.out.println("Zad 3:");
        funKwaDelta(5);
        System.out.println("");

        System.out.println("Zad 4:");
        liczbyPierwsze(10);
        System.out.println("");

        System.out.println("Zad 5:");
        liczbyPodzielne(3, 10);
        System.out.println("");

        System.out.println("Zad 6:");
        piramida(6, "dwustronna");
        System.out.println("");

        System.out.println("Zad 7:");
        int answer1 = silnia(3);
        System.out.println(answer1);
        System.out.println("");

        System.out.println("Zad 8:");
        int answer2 = silniaPodwojona(7);
        System.out.println(answer2);
        System.out.println("");

        System.out.println("Zad 9:");
        int answer3 = silniaMta(3, 8);
        System.out.println(answer3);
        System.out.println("");

        System.out.println("Zad 10:");
        int answer4 = dwumianNewtona(8, 3);
        System.out.println(answer4);
        System.out.println("");

        System.out.println("Zad 11:");
        int answer5 = ciagFibonacciego(7);
        System.out.println(answer4);
        System.out.println("");

        System.out.println("Zad 12:");
        int answer6 = sumaNaturalnych(5);
        System.out.println(answer6);

        answer6 = sumaParzystych( 5);
        System.out.println(answer6);

        answer6 = sumaNieparzystych(5);
        System.out.println(answer6);

        answer6 = sumaKwaNaturalnych(5);
        System.out.println(answer6);

        answer6 = sumaSzeNaturalnych(5);
        System.out.println(answer6);

        answer6 = sumaOdwNaturalnych(5);
        System.out.println(answer6);

        System.out.println("");

        System.out.println("Zad 13:");

        boolean answer7 = czyPalindrom("tozzot");
        System.out.println(answer7);

        System.out.println("");

        System.out.println("Zad 14:");
        trojkatPascala(6);
        System.out.println("");

        System.out.println("Zad 15:");

        boolean answer8 = czyPalindromLiczba(1234321);
        System.out.println(answer8);

        System.out.println("");

        System.out.println("Zad 16:");

        boolean answer9 = czyDoskonala(496);
        System.out.println(answer9);

        System.out.println("");

        System.out.println("Zad 17:");

        boolean answer10 = czyPierwsza(37);
        System.out.println(answer10);

        System.out.println("");

        System.out.println("Zad 18:");

        int answer11 = NWD(56, 42);
        System.out.println(answer11);

        System.out.println("");

        System.out.println("Zad 19:");

        int[] array = wczytajTablice();

        System.out.println("");
    }
}
