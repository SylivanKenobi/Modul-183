package ch.security.sec.model;

import org.hibernate.annotations.Entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Kauf {

    @Id
    private Long id;

    private Integer mege;
    private Timestamp zeitpunkt;

    @ManyToOne(targetEntity = ch.security.sec.model.Artikel.class)
    @JoinColumn(name = "id_artikel")
    private Artikel artikel;

    @ManyToOne(targetEntity = Kunde.class)
    @JoinColumn(name = "id_kunde")
    private Kunde kunde;

    public Kauf() {
    }

    public Kauf(Long id, Integer mege, Timestamp zeitpunkt, Artikel artikel, Kunde kunde) {
        this.id = id;
        this.mege = mege;
        this.zeitpunkt = zeitpunkt;
        this.artikel = artikel;
        this.kunde = kunde;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getMege() {
        return mege;
    }

    public void setMege(Integer mege) {
        this.mege = mege;
    }

    public Timestamp getZeitpunkt() {
        return zeitpunkt;
    }

    public void setZeitpunkt(Timestamp zeitpunkt) {
        this.zeitpunkt = zeitpunkt;
    }

    public Artikel getArtikel() {
        return artikel;
    }

    public void setArtikel(Artikel artikel) {
        this.artikel = artikel;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }
}
