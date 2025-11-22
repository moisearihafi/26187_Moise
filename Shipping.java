package _26187_.q10;

public class Shipping extends Payment {
    private String shippingAddress;
    private double shippingCost;

    public Shipping(long id, String createdDate, String updatedDate, String storeName, String addressStore, String email, String categoryName, String categoryCode, String productName, String productCode, double price, String customerName, String contactNumber, String address, String orderDate, String orderId, String paymentMethod, String paymentStatus, String shippingAddress, double shippingCost) throws OnlineShoppingDataException {
        super(id, createdDate, updatedDate, storeName, addressStore, email, categoryName, categoryCode, productName, productCode, price, customerName, contactNumber, address, orderDate, orderId, paymentMethod, paymentStatus);
        setShippingAddress(shippingAddress);
        setShippingCost(shippingCost);
    }

    public String getShippingAddress() { return shippingAddress; }
    public void setShippingAddress(String shippingAddress) throws OnlineShoppingDataException { if (shippingAddress == null || shippingAddress.trim().isEmpty()) throw new OnlineShoppingDataException("shippingAddress must not be empty"); this.shippingAddress = shippingAddress.trim(); }

    public double getShippingCost() { return shippingCost; }
    public void setShippingCost(double shippingCost) throws OnlineShoppingDataException { if (shippingCost < 0) throw new OnlineShoppingDataException("shippingCost must be >= 0"); this.shippingCost = shippingCost; }
}
