package _26187_.q8;

public class Library extends Entity {
    private String libraryName;
    private String location;
    private String phoneNumber;

    public Library(long id, String createdDate, String updatedDate, String libraryName, String location, String phoneNumber) throws LibraryDataException {
        super(id, createdDate, updatedDate);
        setLibraryName(libraryName);
        setLocation(location);
        setPhoneNumber(phoneNumber);
    }

    public String getLibraryName() { return libraryName; }
    public void setLibraryName(String libraryName) throws LibraryDataException { if (libraryName == null || libraryName.trim().isEmpty()) throw new LibraryDataException("libraryName must not be empty"); this.libraryName = libraryName.trim(); }

    public String getLocation() { return location; }
    public void setLocation(String location) throws LibraryDataException { if (location == null || location.trim().isEmpty()) throw new LibraryDataException("location must not be empty"); this.location = location.trim(); }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) throws LibraryDataException { if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) throw new LibraryDataException("phoneNumber must be 10 digits"); this.phoneNumber = phoneNumber; }
}
