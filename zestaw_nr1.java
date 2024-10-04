// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        //zad 1
        System.out.println("zad 1");
        String imie = "Dawid Buc";
        System.out.println(imie);
        System.out.println("");

        //zad 2
        System.out.println("zad 2");
        System.out.println(imie.length()-1);
        System.out.println("");

        //zad 3
        System.out.println("zad 3");
        String ala = "Ala", ma = " ma", kota = " kota";
        String ala_sentence = ala.concat(ma).concat(kota);
        System.out.println(ala_sentence);
        System.out.println("");

        //zad 4
        System.out.println("zad 4");
        System.out.println("                    * ");
        System.out.println("                    * *");
        System.out.println("                    * * *");
        System.out.println("* * * * * * * * * * * * * *");
        System.out.println("* * * * * * * * * * * * * * *");
        System.out.println("* * * * * * * * * * * * * *");
        System.out.println("                    * * *");
        System.out.println("                    * *");
        System.out.println("                    * ");
        System.out.println("");

        System.out.println("     *");
        System.out.println("    * *");
        System.out.println("   * * *");
        System.out.println("  * * * *");
        System.out.println(" * * * * *");
        System.out.println("* * * * * *");
        System.out.println(" * * * * *");
        System.out.println("  * * * *");
        System.out.println("   * * *");
        System.out.println("    * *");
        System.out.println("     *");
        System.out.println("");

        //zad 5
        System.out.println("zad 5");
        System.out.println(ala_sentence.replace("a", "e"));
        System.out.println("");

        //zad 6
        System.out.println("zad 6");
        System.out.println(ala_sentence.toUpperCase());
        System.out.println(ala_sentence.toLowerCase());
        System.out.println("");

        //zad 7
        System.out.println("zad 7");
        System.out.println("ASCII code of certain characters:");
        String sentence = String.format("A = %d, ! = %d, @ = %d, > = %d , ~ = %d, \\n = %d, \\b = %d",
                (int) 'A', (int) '!', (int) '@', (int) '>', (int) '~', (int) '\n', (int) '\b');
        System.out.println(sentence);
        System.out.println("");

        //zad 8
        System.out.println("zad 8");
        System.out.println("ASCII code of lower case characters is between "+(int) 'a'+" and "+(int) 'z'
            +", upper case characters is between"+(int) 'A'+" and "+(int) 'Z'+", while numbers are between "
            +(int) '0'+" and "+(int) '9'+".");
        System.out.println("");

        //zad 9
        System.out.println("zad 9");
        String sentence2 = "Grzesiek nie wiedział dlacego %s jest tak drapieżnym %s mimo, że jego %s na to nie wskazuje.";
        sentence2 = String.format(sentence2,"lis", "ssakiem", "budowa");
        System.out.println(sentence2);
        System.out.println("");

        //zad 10
        System.out.println("zad 10");
        String sentence3 = "%s to najlepsza książka napisana przez %s.";
        sentence3 = String.format(sentence3, "Lalka", "Boleslawa Prusa");
        System.out.println(sentence3);
        System.out.println("");

        //zad 11
        System.out.println("zad 11");
        for (int i = 0; i < 5; i++) {
            if (i == 4) {
                System.out.println("wodrze");
            }
            else {
            System.out.print("wodrze ");};
        }
        System.out.println("");

        //zad 12
        System.out.println("zad 12");
        System.out.println("Dzisiaj jest (04-10-2002) godzina (14:52:18)");
        System.out.println("");

        //zad 13
        System.out.println("zad 13");
        System.out.println("Certain numbers and their respective ASCII character: 54 = "+(char) 54+", 103 = "+(char) 103
                +", 241 = "+(char) 241+", 67 = "+(char) 67+", 9999 = "+(char) 9999+", 8 = "
                +(char) 8+" 174035 = "+(char) 174035);
    }
}