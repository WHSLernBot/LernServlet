package Entitys;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

/**
 *
 * @author Seve
 */
@Entity
@IdClass(BeAufgabePK.class)
public class BeAufgabe implements Serializable {

    @Id
    private Long thema;
    
    @Id
    private Long aufgabe;
    
    @Id
    private Long benutzer;
    
    private Boolean richtig;
    
    private Date datum;

    @Override
    public String toString() {
        return "Bearbeitete Aufgabe " + aufgabe + " " +  benutzer;
    }
    
}
