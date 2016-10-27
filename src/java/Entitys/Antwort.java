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
@IdClass(AntwortPK.class)
public class Antwort implements Serializable {

    @Id
    private Long aufgabeID;

    @Id
    private Long thema;
    
    @Id
    private int nummer;
    
    private String antwort;
    
    private Boolean richtig;
    
    private long haeufigkeit;

    @Override
    public String toString() {
        return "Entitys.Antwort[ id=" + id + " ]";
    }
    
}
