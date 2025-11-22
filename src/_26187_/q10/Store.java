package _26187_.q10;

public class Store extends Entity {
    private String storeName;
    private String address;
    private String email;

    public Store(long id, String createdDate, String updatedDate, String storeName, String address, String email) throws OnlineShoppingDataException {
        super(id, createdDate, updatedDate);
        setStoreName(storeName);
        setAddress(address);
        setEmail(email);
    }

    public String getStoreName() { return storeName; }
    public void setStoreName(String storeName) throws OnlineShoppingDataException { if (storeName == null || storeName.trim().isEmpty()) throw new OnlineShoppingDataException("storeName must not be empty"); this.storeName = storeName.trim(); }

    public String getAddress() { return address; }
    public void setAddress(String address) throws OnlineShoppingDataException { if (address == null || address.trim().isEmpty()) throw new OnlineShoppingDataException("address must not be empty"); this.address = address.trim(); }

    public String getEmail() { return email; }
    public void setEmail(String email) throws OnlineShoppingDataException { if (email == null || !email.matches("^[\\w.-]+@[\\w.-]+\\.[A-Za-z]{2,}$")) throw new OnlineShoppingDataException("email invalid"); this.email = email; }
}
