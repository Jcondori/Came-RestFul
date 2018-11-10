package com.came.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "TIPOPROG")
public class TipoprogEntity {


    @Id
    @GeneratedValue(generator="TipProgSeq")
    @SequenceGenerator(name="TipProgSeq",sequenceName="TIPOPROG_SEQ", allocationSize=1)
    @Column(name = "CODTIPPG", nullable = false, precision = 0)
    private long codtippg;

    @Basic
    @Column(name = "NOMTIPOPG", nullable = false, length = 100)
    private String nomtipopg;

    @Basic
    @Column(name = "ESTTIPOPG", nullable = false, length = 1)
    private String esttipopg;

    public long getCodtippg() {
        return codtippg;
    }

    public void setCodtippg(long codtippg) {
        this.codtippg = codtippg;
    }

    public String getNomtipopg() {
        return nomtipopg;
    }

    public void setNomtipopg(String nomtipopg) {
        this.nomtipopg = nomtipopg;
    }

    public String getEsttipopg() {
        return esttipopg;
    }

    public void setEsttipopg(String esttipopg) {
        this.esttipopg = esttipopg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoprogEntity that = (TipoprogEntity) o;
        return codtippg == that.codtippg &&
                Objects.equals(nomtipopg, that.nomtipopg) &&
                Objects.equals(esttipopg, that.esttipopg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codtippg, nomtipopg, esttipopg);
    }
}
