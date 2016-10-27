package Entitys;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Seve
 */
public class AntwortPK implements Serializable {
    
    private Long aufgabeID;
    
    private Long thema;
    
    private int nummer;

    public AntwortPK(Long AufgabeID, Long Thema, int Nummer) {
        this.aufgabeID = AufgabeID;
        this.thema = Thema;
        this.nummer = Nummer;
    }

    public AntwortPK() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.aufgabeID);
        hash = 89 * hash + Objects.hashCode(this.thema);
        hash = 89 * hash + this.nummer;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AntwortPK other = (AntwortPK) obj;
        if (this.nummer != other.nummer) {
            return false;
        }
        if (!Objects.equals(this.aufgabeID, other.aufgabeID)) {
            return false;
        }
        if (!Objects.equals(this.thema, other.thema)) {
            return false;
        }
        return true;
    }
    
    
    
}
