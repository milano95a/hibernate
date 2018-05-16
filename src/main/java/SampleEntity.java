import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by AB on 27-Jul-17.
 */

@Entity
public class SampleEntity {

    @Id
    @GeneratedValue
    @Column(name = "ENTITY_ID")
    private Integer entityId;

    public Integer getEntityId() {
        return entityId;
    }

    public void setEntityId(Integer entityId) {
        this.entityId = entityId;
    }
}
