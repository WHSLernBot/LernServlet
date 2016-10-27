package Entitys;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Seve
 */
public class AufgabePK implements Serializable {
    
    private Long thema;
    
    private Long aufgabenID;

    public AufgabePK() {
    }

    public AufgabePK(Long thema, Long aufgabenID) {
        this.thema = thema;
        this.aufgabenID = aufgabenID;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.thema);
        hash = 47 * hash + Objects.hashCode(this.aufgabenID);
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
        final AufgabePK other = (AufgabePK) obj;
        if (!Objects.equals(this.thema, other.thema)) {
            return false;
        }
        if (!Objects.equals(this.aufgabenID, other.aufgabenID)) {
            return false;
        }
        return true;
    }
    
    
    
}
