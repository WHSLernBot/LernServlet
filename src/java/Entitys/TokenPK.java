package Entitys;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Seve
 */
public class TokenPK implements Serializable {
    
    private Long thema;
    
    private Long aufgabe;
    
    private String token;

    public TokenPK() {
    }

    public TokenPK(Long thema, Long aufgabe, String token) {
        this.thema = thema;
        this.aufgabe = aufgabe;
        this.token = token;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.thema);
        hash = 83 * hash + Objects.hashCode(this.aufgabe);
        hash = 83 * hash + Objects.hashCode(this.token);
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
        final TokenPK other = (TokenPK) obj;
        if (!Objects.equals(this.token, other.token)) {
            return false;
        }
        if (!Objects.equals(this.thema, other.thema)) {
            return false;
        }
        if (!Objects.equals(this.aufgabe, other.aufgabe)) {
            return false;
        }
        return true;
    }

    
    
}
