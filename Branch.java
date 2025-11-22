package _26187_.q5;

public class Branch extends Company {
    private String branchName;
    private String locationCode;

    public Branch(long id, String createdDate, String updatedDate, String companyName, String address, String phoneNumber,
                  String branchName, String locationCode) throws RentalDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber);
        setBranchName(branchName);
        setLocationCode(locationCode);
    }

    public String getBranchName() { return branchName; }
    public void setBranchName(String branchName) throws RentalDataException {
        if (branchName == null || branchName.trim().isEmpty()) throw new RentalDataException("branchName must not be empty");
        this.branchName = branchName.trim();
    }

    public String getLocationCode() { return locationCode; }
    public void setLocationCode(String locationCode) throws RentalDataException {
        if (locationCode == null || !locationCode.matches(".{3,}")) throw new RentalDataException("locationCode must be at least 3 chars");
        this.locationCode = locationCode;
    }
}
