package _26187_.q10;

public class Customer extends Product {
    private String customerName;
    private String contactNumber;
    private String address;

    public Customer(long id, String createdDate, String updatedDate, String storeName, String addressStore, String email, String categoryName, String categoryCode, String productName, String productCode, double price, String customerName, String contactNumber, String address) throws OnlineShoppingDataException {
        super(id, createdDate, updatedDate, storeName, addressStore, email, categoryName, categoryCode, productName, productCode, price);
        setCustomerName(customerName);
        setContactNumber(contactNumber);
        setAddress(address);
    }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) throws OnlineShoppingDataException { if (customerName == null || customerName.trim().isEmpty()) throw new OnlineShoppingDataException("customerName must not be empty"); this.customerName = customerName.trim(); }

    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) throws OnlineShoppingDataException { if (contactNumber == null || contactNumber.trim().isEmpty()) throw new OnlineShoppingDataException("contactNumber must not be empty"); this.contactNumber = contactNumber.trim(); }

    public String getAddress() { return address; }
    public void setAddress(String address) throws OnlineShoppingDataException { if (address == null || address.trim().isEmpty()) throw new OnlineShoppingDataException("address must not be empty"); this.address = address.trim(); }
}
