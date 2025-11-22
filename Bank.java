package _26187_.q6;

public class Bank extends Entity {
    private String bankName;
    private String branchCode;
    private String address;

    public Bank(long id, String createdDate, String updatedDate, String bankName, String branchCode, String address) throws BankingDataException {
        super(id, createdDate, updatedDate);
        setBankName(bankName);
        setBranchCode(branchCode);
        setAddress(address);
    }

    public String getBankName() { return bankName; }
    public void setBankName(String bankName) throws BankingDataException {
        if (bankName == null || bankName.trim().isEmpty()) throw new BankingDataException("bankName must not be empty");
        this.bankName = bankName.trim();
    }

    public String getBranchCode() { return branchCode; }
    public void setBranchCode(String branchCode) throws BankingDataException {
        if (branchCode == null || branchCode.trim().length() < 3) throw new BankingDataException("branchCode must be at least 3 chars");
        this.branchCode = branchCode.trim();
    }

    public String getAddress() { return address; }
    public void setAddress(String address) throws BankingDataException {
        if (address == null || address.trim().isEmpty()) throw new BankingDataException("address must not be empty");
        this.address = address.trim();
    }
}
