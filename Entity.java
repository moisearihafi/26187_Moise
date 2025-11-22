package _26187_.q6;

public class Entity {
    private long id;
    private String createdDate;
    private String updatedDate;

    public Entity(long id, String createdDate, String updatedDate) throws BankingDataException {
        setId(id);
        setCreatedDate(createdDate);
        setUpdatedDate(updatedDate);
    }

    public long getId() { return id; }
    public void setId(long id) throws BankingDataException {
        if (id <= 0) throw new BankingDataException("id must be > 0");
        this.id = id;
    }

    public String getCreatedDate() { return createdDate; }
    public void setCreatedDate(String createdDate) throws BankingDataException {
        if (createdDate == null || createdDate.trim().isEmpty()) throw new BankingDataException("createdDate must not be empty");
        this.createdDate = createdDate.trim();
    }

    public String getUpdatedDate() { return updatedDate; }
    public void setUpdatedDate(String updatedDate) throws BankingDataException {
        if (updatedDate == null || updatedDate.trim().isEmpty()) throw new BankingDataException("updatedDate must not be empty");
        this.updatedDate = updatedDate.trim();
    }
}
