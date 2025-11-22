package _26187_.q5;

import java.util.Scanner;

public final class RentalRecord extends Invoice {

    public RentalRecord(long id, String createdDate, String updatedDate, String companyName, String address, String phoneNumber,
                        String branchName, String locationCode,
                        String vehicleType, String registrationNumber, double dailyRate,
                        String customerName, String licenseNumber, String contactNumber,
                        String rentalDate, String returnDate, int rentalDays,
                        double rentalCharge, double penaltyCharge,
                        String paymentMode, String transactionId) throws RentalDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode, vehicleType, registrationNumber, dailyRate, customerName, licenseNumber, contactNumber, rentalDate, returnDate, rentalDays, rentalCharge, penaltyCharge, paymentMode, transactionId);
    }

    public double calculateTotalCharge() { return getTotalCharge(); }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter Entity (id createdDate updatedDate):");
            long id = Long.parseLong(sc.next());
            String createdDate = sc.next();
            String updatedDate = sc.next();

            System.out.println(" Enter Company (name address phone):");
            String companyName = sc.next();
            String address = sc.next();
            String phoneNumber = sc.next();

            System.out.println(" Enter Branch (branchName locationCode):");
            String branchName = sc.next();
            String locationCode = sc.next();

            System.out.println("Enter Vehicle (type regNo dailyRate):");
            String vehicleType = sc.next();
            String registrationNumber = sc.next();
            double dailyRate = Double.parseDouble(sc.next());

            System.out.println(" Enter Customer (name license contact):");
            String customerName = sc.next();
            String licenseNumber = sc.next();
            String contactNumber = sc.next();

            System.out.println(" Enter Rental (rentalDate returnDate rentalDays):");
            String rentalDate = sc.next();
            String returnDate = sc.next();
            int rentalDays = Integer.parseInt(sc.next());

            System.out.println(" Enter Charges (rentalCharge penaltyCharge):");
            double rentalCharge = Double.parseDouble(sc.next());
            double penaltyCharge = Double.parseDouble(sc.next());

            System.out.println(" Enter Payment (mode transactionId):");
            String paymentMode = sc.next();
            String transactionId = sc.next();

            RentalRecord rec = new RentalRecord(id, createdDate, updatedDate, companyName, address, phoneNumber,
                    branchName, locationCode,
                    vehicleType, registrationNumber, dailyRate,
                    customerName, licenseNumber, contactNumber,
                    rentalDate, returnDate, rentalDays,
                    rentalCharge, penaltyCharge,
                    paymentMode, transactionId);

            System.out.println("Company: " + rec.getCompanyName());
            System.out.println(" Branch: " + rec.getBranchName() + " (" + rec.getLocationCode() + ")");
            System.out.println(" Vehicle: " + rec.getVehicleType() + " Reg: " + rec.getRegistrationNumber() + " Rate/day: " + String.format("%.2f", rec.getDailyRate()));
            System.out.println(" Customer: " + rec.getCustomerName() + " License: " + rec.getLicenseNumber());
            System.out.println(" Rental: " + rec.getRentalDate() + " to " + rec.getReturnDate() + " Days: " + rec.getRentalDays());
            System.out.println(" Rental Charge: " + String.format("%.2f", rec.getRentalCharge()));
            System.out.println(" Penalty Charge: " + String.format("%.2f", rec.getPenaltyCharge()));
            System.out.println(" Total Charge: " + String.format("%.2f", rec.calculateTotalCharge()));
            System.out.println(" Payment: " + rec.getPaymentMode() + " Txn: " + rec.getTransactionId());

        } catch (RentalDataException rde) {
            System.out.println("Error: " + rde.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
