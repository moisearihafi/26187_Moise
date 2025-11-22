package _26187_.q8;

public class Record extends Payment {
    private double totalFine;

    public Record(long id, String createdDate, String updatedDate, String libraryName, String location, String phoneNumber, String sectionName, String sectionCode, String title, String author, String isbn, String memberName, long memberId, String contactNumber, String borrowDate, String returnDate, double fineAmount, int daysLate, String paymentDate, String paymentMode, double totalFine) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode, title, author, isbn, memberName, memberId, contactNumber, borrowDate, returnDate, fineAmount, daysLate, paymentDate, paymentMode);
        setTotalFine(totalFine);
    }

    public double getTotalFine() { return totalFine; }
    public void setTotalFine(double totalFine) throws LibraryDataException { if (totalFine <= 0) throw new LibraryDataException("totalFine must be > 0"); this.totalFine = totalFine; }
}
