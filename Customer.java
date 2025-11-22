package _26187_.q6;

public class Customer extends Account {
    private String customerName;
    private String email;
    private String phoneNumber;

    public Customer(long id, String createdDate, String updatedDate, String bankName, String branchCode, String address,
                    String accountNumber, String accountType, double balance,
                    String customerName, String email, String phoneNumber) throws BankingDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, accountType, balance);
        setCustomerName(customerName);
        setEmail(email);
        setPhoneNumber(phoneNumber);
    }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) throws BankingDataException {
        if (customerName == null || customerName.trim().isEmpty()) throw new BankingDataException("customerName must not be empty");
        this.customerName = customerName.trim();
    }

    public String getEmail() { return email; }
    public void setEmail(String email) throws BankingDataException {
        if (email == null || !email.matches("^[\\w.-]+@[\\w.-]+\\.[A-Za-z]{2,}$")) throw new BankingDataException("email invalid");
        this.email = email;
    }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) throws BankingDataException {
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) throw new BankingDataException("phoneNumber must be 10 digits");
        this.phoneNumber = phoneNumber;
    }
}
