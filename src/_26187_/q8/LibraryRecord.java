package _26187_.q8;

import java.util.Scanner;

public final class LibraryRecord extends Record {

    public LibraryRecord(long id, String createdDate, String updatedDate, String libraryName, String location, String phoneNumber, String sectionName, String sectionCode, String title, String author, String isbn, String memberName, long memberId, String contactNumber, String borrowDate, String returnDate, double fineAmount, int daysLate, String paymentDate, String paymentMode, double totalFine) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode, title, author, isbn, memberName, memberId, contactNumber, borrowDate, returnDate, fineAmount, daysLate, paymentDate, paymentMode, totalFine);
    }

    public double calculateFine() { return getTotalFine(); }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("25873 Enter Entity (id createdDate updatedDate):");
            long id = Long.parseLong(sc.next());
            String createdDate = sc.next();
            String updatedDate = sc.next();

            System.out.println("25873 Enter Library (name location phone):");
            String libraryName = sc.next();
            String location = sc.next();
            String phone = sc.next();

            System.out.println("25873 Enter Section (name code):");
            String sectionName = sc.next();
            String sectionCode = sc.next();

            System.out.println("25873 Enter Book (title author isbn):");
            String title = sc.next();
            String author = sc.next();
            String isbn = sc.next();

            System.out.println("25873 Enter Member (name id contact):");
            String memberName = sc.next();
            long memberId = Long.parseLong(sc.next());
            String contact = sc.next();

            System.out.println("25873 Enter Borrow (borrowDate returnDate):");
            String borrowDate = sc.next();
            String returnDate = sc.next();

            System.out.println("25873 Enter Fine (fineAmount daysLate):");
            double fineAmount = Double.parseDouble(sc.next());
            int daysLate = Integer.parseInt(sc.next());

            System.out.println("25873 Enter Payment (paymentDate paymentMode):");
            String paymentDate = sc.next();
            String paymentMode = sc.next();

            System.out.println("25873 Enter Record (totalFine):");
            double totalFine = Double.parseDouble(sc.next());

            LibraryRecord rec = new LibraryRecord(id, createdDate, updatedDate, libraryName, location, phone, sectionName, sectionCode, title, author, isbn, memberName, memberId, contact, borrowDate, returnDate, fineAmount, daysLate, paymentDate, paymentMode, totalFine);

            System.out.println("25873 Member: " + rec.getMemberName() + " ID: " + rec.getMemberId());
            System.out.println("25873 Book: " + rec.getTitle() + " by " + rec.getAuthor());
            System.out.println("25873 Fine: " + String.format("%.2f", rec.getFineAmount()) + " Days late: " + rec.getDaysLate());
            System.out.println("25873 Total Fine: " + String.format("%.2f", rec.calculateFine()));

        } catch (LibraryDataException lde) {
            System.out.println("25873 Error: " + lde.getMessage());
        } catch (Exception e) {
            System.out.println("25873 Unexpected error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
