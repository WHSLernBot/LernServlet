package Entitys;

import static Entitys.Teilnahme_.id;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToMany;

/**
 *
 * @author Seve
 */
@Entity
@IdClass(AufgabePK.class)
public class Aufgabe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long aufgabenID;
    
    @Id
    private Long thema;
    
    private String frage;
    
    private int gefragt;
    
    private int richtig;
    
    private int schwirigkeit;
    
    @OneToMany
    private Collection<Antwort> antworten;
    
    @OneToMany
    private Collection<Token> token;

    

    @Override
    public String toString() {
        return "Entitys.Aufgabe[ id=" + id + " ]";
    }
    
}
