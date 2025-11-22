package _26187_.q8;

public class Member extends Book {
    private String memberName;
    private long memberId;
    private String contactNumber;

    public Member(long id, String createdDate, String updatedDate, String libraryName, String location, String phoneNumber, String sectionName, String sectionCode, String title, String author, String isbn, String memberName, long memberId, String contactNumber) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode, title, author, isbn);
        setMemberName(memberName);
        setMemberId(memberId);
        setContactNumber(contactNumber);
    }

    public String getMemberName() { return memberName; }
    public void setMemberName(String memberName) throws LibraryDataException { if (memberName == null || memberName.trim().isEmpty()) throw new LibraryDataException("memberName must not be empty"); this.memberName = memberName.trim(); }

    public long getMemberId() { return memberId; }
    public void setMemberId(long memberId) throws LibraryDataException { if (memberId <= 0) throw new LibraryDataException("memberId must be > 0"); this.memberId = memberId; }

    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) throws LibraryDataException { if (contactNumber == null || !contactNumber.matches("\\d{10}")) throw new LibraryDataException("contactNumber must be 10 digits"); this.contactNumber = contactNumber; }
}
