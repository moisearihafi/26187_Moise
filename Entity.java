package _26187_.q9;

public class Entity {
    private long id;
    private String createdDate;
    private String updatedDate;

    public Entity(long id, String createdDate, String updatedDate) throws AirlineDataException {
        setId(id);
        setCreatedDate(createdDate);
        setUpdatedDate(updatedDate);
    }

    public long getId() { return id; }
    public void setId(long id) throws AirlineDataException { if (id <= 0) throw new AirlineDataException("id must be > 0"); this.id = id; }

    public String getCreatedDate() { return createdDate; }
    public void setCreatedDate(String createdDate) throws AirlineDataException { if (createdDate == null || createdDate.trim().isEmpty()) throw new AirlineDataException("createdDate must not be empty"); this.createdDate = createdDate.trim(); }

    public String getUpdatedDate() { return updatedDate; }
    public void setUpdatedDate(String updatedDate) throws AirlineDataException { if (updatedDate == null || updatedDate.trim().isEmpty()) throw new AirlineDataException("updatedDate must not be empty"); this.updatedDate = updatedDate.trim(); }
}
