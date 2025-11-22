package _26187_.q8;

public class Section extends Library {
    private String sectionName;
    private String sectionCode;

    public Section(long id, String createdDate, String updatedDate, String libraryName, String location, String phoneNumber, String sectionName, String sectionCode) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber);
        setSectionName(sectionName);
        setSectionCode(sectionCode);
    }

    public String getSectionName() { return sectionName; }
    public void setSectionName(String sectionName) throws LibraryDataException { if (sectionName == null || sectionName.trim().isEmpty()) throw new LibraryDataException("sectionName must not be empty"); this.sectionName = sectionName.trim(); }

    public String getSectionCode() { return sectionCode; }
    public void setSectionCode(String sectionCode) throws LibraryDataException { if (sectionCode == null || sectionCode.trim().length() < 3) throw new LibraryDataException("sectionCode must be at least 3 chars"); this.sectionCode = sectionCode; }
}
