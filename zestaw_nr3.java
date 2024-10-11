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
    static void piramida(int n, String wariant) {
        if(wariant == "jednostronna") {
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

        }
        else {
            System.out.println("Nie ma takiego wariantu.");
        }
    }

    public static void main(String[] args) {
//        trojkiPitagorejskie(39);
//        funKwaRozwiazania(5);
//        funKwaDelta(5);
//        liczbyPierwsze(10);
//        liczbyPodzielne(3, 10);
        piramida(4, "dwustronna");


    }

}