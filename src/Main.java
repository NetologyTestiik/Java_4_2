public class Main {
    public static void main(String[] args) {
        BonusMilesServaice servaice = new BonusMilesServaice();
        int price = 10_000;
        int miles = servaice.calculate(price);
        System.out.println(miles);
    }
}