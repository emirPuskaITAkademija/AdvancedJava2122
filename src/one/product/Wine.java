package one.product;

public class Wine extends Product {

    public static final double ADDITIONAL_TAX = 10.0;

    public Wine(String serialNumber, double price) {
        super(serialNumber, price);
    }

    @Override
    public double calculateGrossPrice() {
        double taxPercentage = ADDITIONAL_TAX+TAX_PERCENTAGE;
        double netPrice = getNetPrice();
        double taxAmount = taxAmount(taxPercentage);
        double totalGross = netPrice + taxAmount;
        return totalGross;
    }
}
