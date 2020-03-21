package ch.security.sec.model;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_user")
    @SequenceGenerator(name = "seq_user")
    private Integer id;

    // Kunde

    @NotNull
    private String name;
    @NotNull
    private boolean berechtigung;
    @NotNull
    private String pw_algo;
    @NotNull
    private Integer algo_param;
    @NotNull
    private String pw_hash;
    @NotNull
    private String pw_salt;

    public User() {
    }

    public User(Integer id, @NotNull String name, @NotNull boolean berechtigung, @NotNull String pw_algo, @NotNull Integer algo_param, @NotNull String pw_hash, @NotNull String pw_salt) {
        this.id = id;
        this.name = name;
        this.berechtigung = berechtigung;
        this.pw_algo = pw_algo;
        this.algo_param = algo_param;
        this.pw_hash = pw_hash;
        this.pw_salt = pw_salt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBerechtigung() {
        return berechtigung;
    }

    public void setBerechtigung(boolean berechtigung) {
        this.berechtigung = berechtigung;
    }

    public String getPw_algo() {
        return pw_algo;
    }

    public void setPw_algo(String pw_algo) {
        this.pw_algo = pw_algo;
    }

    public Integer getAlgo_param() {
        return algo_param;
    }

    public void setAlgo_param(Integer algo_param) {
        this.algo_param = algo_param;
    }

    public String getPw_hash() {
        return pw_hash;
    }

    public void setPw_hash(String pw_hash) {
        this.pw_hash = pw_hash;
    }

    public String getPw_salt() {
        return pw_salt;
    }

    public void setPw_salt(String pw_salt) {
        this.pw_salt = pw_salt;
    }
}
