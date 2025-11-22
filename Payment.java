package _26187_.q10;

public class Payment extends Order {
    private String paymentMethod;
    private String paymentStatus;

    public Payment(long id, String createdDate, String updatedDate, String storeName, String addressStore, String email, String categoryName, String categoryCode, String productName, String productCode, double price, String customerName, String contactNumber, String address, String orderDate, String orderId, String paymentMethod, String paymentStatus) throws OnlineShoppingDataException {
        super(id, createdDate, updatedDate, storeName, addressStore, email, categoryName, categoryCode, productName, productCode, price, customerName, contactNumber, address, orderDate, orderId);
        setPaymentMethod(paymentMethod);
        setPaymentStatus(paymentStatus);
    }

    public String getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(String paymentMethod) throws OnlineShoppingDataException { if (paymentMethod == null || paymentMethod.trim().isEmpty()) throw new OnlineShoppingDataException("paymentMethod must not be empty"); this.paymentMethod = paymentMethod.trim(); }

    public String getPaymentStatus() { return paymentStatus; }
    public void setPaymentStatus(String paymentStatus) throws OnlineShoppingDataException { if (paymentStatus == null || paymentStatus.trim().isEmpty()) throw new OnlineShoppingDataException("paymentStatus must not be empty"); this.paymentStatus = paymentStatus.trim(); }
}
