package Collection_Framework;

enum Currency{
    // These calls implicitly invoke the private constructor
    USD("US Dollar", "$"),
    INR("Indian Rupee", "₹"),
    EUR("Euro", "€"),
    JPY("Japanese Yen", "¥");

    private final String currencyName;
    private final String currencySymbol;
    Currency(String currencyName, String currencySymbol) {
        this.currencyName = currencyName;
        this.currencySymbol = currencySymbol;
    }
    public String getCurrencyName() {
        return currencyName;
    }
    public String getCurrencySymbol() {
        return currencySymbol;
    }
}

public class Enums2  {
    public static void main(String[] args) {
        Currency currency1 = Currency.INR;
        Currency currency2 = Currency.USD;
        Currency currency3 = Currency.EUR;
        Currency currency4 = Currency.JPY;

        System.out.println(currency1.getCurrencySymbol() + " -> " + currency1.getCurrencyName());
        System.out.println(currency2.getCurrencySymbol() + " -> " + currency2.getCurrencyName());
        System.out.println(currency3.getCurrencySymbol() + " -> " + currency3.getCurrencyName());
        System.out.println(currency4.getCurrencySymbol() + " -> " + currency4.getCurrencyName());
    }
}
/*==== Output ====
₹ -> Indian Rupee
$ -> US Dollar
€ -> Euro
¥ -> Japanese Yen
 */