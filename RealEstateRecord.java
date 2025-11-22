package _26187_.q7;

import java.util.Scanner;

public final class RealEstateRecord extends Commission {

    public RealEstateRecord(long id, String createdDate, String updatedDate, String agencyName, String location, String phoneNumber,
                            String agentName, String emailAgent, String licenseNumber,
                            String propertyCode, String propertyType, double price,
                            String sellerName, String contactNumber,
                            String buyerName, String email,
                            String agreementDate, String terms,
                            double paymentAmount, String paymentDate,
                            double commissionRate) throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName, emailAgent, licenseNumber, propertyCode, propertyType, price, sellerName, contactNumber, buyerName, email, agreementDate, terms, paymentAmount, paymentDate, commissionRate);
    }

    public double calculateCommission(double price) {
        double rate = getCommissionRate();
        return (price * rate) / 100.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("25873 Enter Entity (id createdDate updatedDate):");
            long id = Long.parseLong(sc.next());
            String createdDate = sc.next();
            String updatedDate = sc.next();

            System.out.println("25873 Enter Agency (name location phone):");
            String agencyName = sc.next();
            String location = sc.next();
            String phone = sc.next();

            System.out.println("25873 Enter Agent (name email license):");
            String agentName = sc.next();
            String email = sc.next();
            String license = sc.next();

            System.out.println("25873 Enter Property (code type price):");
            String propertyCode = sc.next();
            String propertyType = sc.next();
            double price = Double.parseDouble(sc.next());

            System.out.println("25873 Enter Seller (name contact):");
            String sellerName = sc.next();
            String sellerContact = sc.next();

            System.out.println("25873 Enter Buyer (name email):");
            String buyerName = sc.next();
            String buyerEmail = sc.next();

            System.out.println("25873 Enter Agreement (date terms):");
            String agreementDate = sc.next();
            String terms = sc.next();

            System.out.println("25873 Enter Payment (amount date):");
            double paymentAmount = Double.parseDouble(sc.next());
            String paymentDate = sc.next();

            System.out.println("25873 Enter Commission Rate:");
            double commissionRate = Double.parseDouble(sc.next());

            RealEstateRecord rec = new RealEstateRecord(id, createdDate, updatedDate, agencyName, location, phone, agentName, email, license, propertyCode, propertyType, price, sellerName, sellerContact, buyerName, buyerEmail, agreementDate, terms, paymentAmount, paymentDate, commissionRate);

            System.out.println("25873 Property Price: " + String.format("%.2f", price));
            System.out.println("25873 Commission Rate: " + String.format("%.2f", rec.getCommissionRate()) + "%");
            System.out.println("25873 Commission Amount: " + String.format("%.2f", rec.calculateCommission(price)));

        } catch (RealEstateDataException rede) {
            System.out.println("25873 Error: " + rede.getMessage());
        } catch (Exception e) {
            System.out.println("25873 Unexpected error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
