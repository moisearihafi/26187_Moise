package _26187_.q3;

public class Entity {
    private long id;
    private String createdDate;
    private String updatedDate;

    public Entity(long id, String createdDate, String updatedDate) throws PayrollDataException {
        setId(id);
        setCreatedDate(createdDate);
        setUpdatedDate(updatedDate);
    }

    public long getId() { return id; }
    public void setId(long id) throws PayrollDataException {
        if (id <= 0) throw new PayrollDataException("id must be > 0");
        this.id = id;
    }

    public String getCreatedDate() { return createdDate; }
    public void setCreatedDate(String createdDate) throws PayrollDataException {
        if (createdDate == null || createdDate.trim().isEmpty()) throw new PayrollDataException("createdDate must not be empty");
        this.createdDate = createdDate.trim();
    }

    public String getUpdatedDate() { return updatedDate; }
    public void setUpdatedDate(String updatedDate) throws PayrollDataException {
        if (updatedDate == null || updatedDate.trim().isEmpty()) throw new PayrollDataException("updatedDate must not be empty");
        this.updatedDate = updatedDate.trim();
    }
}
