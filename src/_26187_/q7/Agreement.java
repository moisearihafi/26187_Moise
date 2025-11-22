package _26187_.q7;

public class Agreement extends Buyer {
    private String agreementDate;
    private String terms;

    public Agreement(long id, String createdDate, String updatedDate, String agencyName, String location, String phoneNumber,
                     String agentName, String emailAgent, String licenseNumber,
                     String propertyCode, String propertyType, double price,
                     String sellerName, String contactNumber,
                     String buyerName, String email,
                     String agreementDate, String terms) throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName, emailAgent, licenseNumber, propertyCode, propertyType, price, sellerName, contactNumber, buyerName, email);
        setAgreementDate(agreementDate);
        setTerms(terms);
    }

    public String getAgreementDate() { return agreementDate; }
    public void setAgreementDate(String agreementDate) throws RealEstateDataException {
        if (agreementDate == null || agreementDate.trim().isEmpty()) throw new RealEstateDataException("agreementDate must not be empty");
        this.agreementDate = agreementDate.trim();
    }

    public String getTerms() { return terms; }
    public void setTerms(String terms) throws RealEstateDataException {
        if (terms == null || terms.trim().isEmpty()) throw new RealEstateDataException("terms must not be empty");
        this.terms = terms.trim();
    }
}
