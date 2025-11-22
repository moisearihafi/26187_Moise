package _26187_.q1;

public class Entity {
    private long id;
    private String createdDate;
    private String updatedDate;

    public Entity(long id, String createdDate, String updatedDate) throws HospitalDataException {
        setId(id);
        setCreatedDate(createdDate);
        setUpdatedDate(updatedDate);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) throws HospitalDataException {
        if (id <= 0) throw new HospitalDataException("id must be greater than 0");
        this.id = id;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) throws HospitalDataException {
        if (createdDate == null || createdDate.trim().isEmpty()) throw new HospitalDataException("createdDate must not be empty");
        this.createdDate = createdDate.trim();
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) throws HospitalDataException {
        if (updatedDate == null || updatedDate.trim().isEmpty()) throw new HospitalDataException("updatedDate must not be empty");
        this.updatedDate = updatedDate.trim();
    }
}
