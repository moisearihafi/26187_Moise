package _26187_.q10;

public class Invoice extends Shipping {
    private double totalAmount;

    public Invoice(long id, String createdDate, String updatedDate, String storeName, String addressStore, String email, String categoryName, String categoryCode, String productName, String productCode, double price, String customerName, String contactNumber, String address, String orderDate, String orderId, String paymentMethod, String paymentStatus, String shippingAddress, double shippingCost) throws OnlineShoppingDataException {
        super(id, createdDate, updatedDate, storeName, addressStore, email, categoryName, categoryCode, productName, productCode, price, customerName, contactNumber, address, orderDate, orderId, paymentMethod, paymentStatus, shippingAddress, shippingCost);
        calculateTotalAmount();
    }

    public double getTotalAmount() { return totalAmount; }

    public void calculateTotalAmount() { this.totalAmount = getPrice() + getShippingCost(); }
}
