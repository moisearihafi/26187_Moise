package _26187_.q10;

public class Order extends Customer {
    private String orderDate;
    private String orderId;

    public Order(long id, String createdDate, String updatedDate, String storeName, String addressStore, String email, String categoryName, String categoryCode, String productName, String productCode, double price, String customerName, String contactNumber, String address, String orderDate, String orderId) throws OnlineShoppingDataException {
        super(id, createdDate, updatedDate, storeName, addressStore, email, categoryName, categoryCode, productName, productCode, price, customerName, contactNumber, address);
        setOrderDate(orderDate);
        setOrderId(orderId);
    }

    public String getOrderDate() { return orderDate; }
    public void setOrderDate(String orderDate) throws OnlineShoppingDataException { if (orderDate == null || orderDate.trim().isEmpty()) throw new OnlineShoppingDataException("orderDate must not be empty"); this.orderDate = orderDate.trim(); }

    public String getOrderId() { return orderId; }
    public void setOrderId(String orderId) throws OnlineShoppingDataException { if (orderId == null || orderId.trim().isEmpty()) throw new OnlineShoppingDataException("orderId must not be empty"); this.orderId = orderId.trim(); }
}
