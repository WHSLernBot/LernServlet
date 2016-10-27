package Entitys;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Seve
 */
public class BeAufgabePK implements Serializable {
    
    private Long thema;
    
    private Long aufgabe;
    
    private Long benutzer;

    public BeAufgabePK() {
    }

    public BeAufgabePK(Long thema, Long aufgabe, Long benutzer) {
        this.thema = thema;
        this.aufgabe = aufgabe;
        this.benutzer = benutzer;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.thema);
        hash = 17 * hash + Objects.hashCode(this.aufgabe);
        hash = 17 * hash + Objects.hashCode(this.benutzer);
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
        final BeAufgabePK other = (BeAufgabePK) obj;
        if (!Objects.equals(this.thema, other.thema)) {
            return false;
        }
        if (!Objects.equals(this.aufgabe, other.aufgabe)) {
            return false;
        }
        if (!Objects.equals(this.benutzer, other.benutzer)) {
            return false;
        }
        return true;
    }
    
     
    
}
