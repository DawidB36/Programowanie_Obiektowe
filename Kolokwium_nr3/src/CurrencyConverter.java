public class CurrencyConverter implements Converter {
    @Override
    public double convertToEuro(double amount) {
        return amount * 4;
    }

    @Override
    public double convertToUSD(double amount) {
        return amount * 4.5;
    }

    @Override
    public double getConversionRate(String currency) {
        if (currency.equals("EUR")) {
            return 4;
        }
        else if (currency.equals("USD")) {
            return 4.5;
        }
        else {
            System.out.println("Nieprawidłowa waluta");
            return 0;
        }
    }
}
