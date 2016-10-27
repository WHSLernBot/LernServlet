package Entitys;

import static Entitys.Teilnahme_.id;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

/**
 *
 * @author Seve
 */
@Entity
@IdClass(TokenPK.class)
public class Token implements Serializable {

    @Id
    private Long thema;
    
    @Id
    private Long aufgabe;
    
    @Id
    private String token;

    @Override
    public String toString() {
        return "Entitys.Token[ id=" + id + " ]";
    }
    
}
