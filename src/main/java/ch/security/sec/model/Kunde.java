package ch.security.sec.model;

@Entity
public class Kunde {

    @Id
    @NotNull
    private long id;
    @NotNull
    private String name;
    @NotNull
    private String postanschrift;
    private String kreditkarte;

    public Kunde(){
        
    }

    public Kunde(long Id, String Name, String Postanschrift, String Kreditkarte){
        this.id = Id;
        this.name = Name;
        this.postanschrift = Postanschrift;
        this.kreditkarte = Kreditkarte;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostanschrift() {
        return postanschrift;
    }

    public void setPostanschrift(String postanschrift) {
        this.postanschrift = postanschrift;
    }

    public String getKreditkarte() {
        return kreditkarte;
    }

    public void setKreditkarte(String kreditkarte) {
        this.kreditkarte = kreditkarte;
    }
}
