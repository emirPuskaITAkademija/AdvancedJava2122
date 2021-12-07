package one.product;

public class Product {
    public static final double TAX_PERCENTAGE = 17;

    private String serialNumber;
    private double netPrice;

    public Product(String serialNumber, double price) {
        this.serialNumber = serialNumber;
        this.netPrice = price;
    }

    public double calculateGrossPrice() {
        double taxAmount = taxAmount();
        double grossPrice = netPrice + taxAmount;
        return grossPrice;
    }

    public double taxAmount() {
        return taxAmount(TAX_PERCENTAGE);
    }

    public double taxAmount(String taxPercentage) {
        double percentage = Double.parseDouble(taxPercentage);
        double taxAmount = netPrice * percentage / 100;
        return taxAmount;
    }

    public double taxAmount(double taxPercentage) {
        double taxAmount = netPrice * taxPercentage / 100;
        return taxAmount;
    }

    public double getNetPrice() {
        return netPrice;
    }

    public void print() {
        StringBuilder sb = new StringBuilder();
        sb.append("Product serial number: " + serialNumber);
        sb.append(", Net price: " + netPrice);
        sb.append(", Gross price: " + calculateGrossPrice());
        System.out.println(sb.toString());
    }

    @Override
    public String toString() {
        return serialNumber + " , price:" + calculateGrossPrice();
    }
}
