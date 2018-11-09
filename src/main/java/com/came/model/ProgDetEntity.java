package com.came.model;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "PROG_DET", schema = "CAME")
public class ProgDetEntity {

    @Id
    @Column(name = "CODDETPROG", nullable = false, precision = 0)
    private long coddetprog;

    @Basic
    @Column(name = "FECHINI", nullable = false)
    private Time fechini;

    @Basic
    @Column(name = "FECHFIN", nullable = false)
    private Time fechfin;

    @Basic
    @Column(name = "ESTDETPROG", nullable = false, length = 1)
    private String estdetprog;

    @Basic
    @Column(name = "GENDETPROG", nullable = false, length = 10)
    private String gendetprog;

    @Basic
    @Column(name = "CODPER", nullable = false, precision = 0)
    private long codper;

    @Basic
    @Column(name = "CODPROG", nullable = false, precision = 0)
    private long codprog;

    @Basic
    @Column(name = "FRECDETPROG", nullable = true, length = 20)
    private String frecdetprog;

    @Basic
    @Column(name = "HORINIFIN", nullable = true, length = 20)
    private String horinifin;

    public long getCoddetprog() {
        return coddetprog;
    }

    public void setCoddetprog(long coddetprog) {
        this.coddetprog = coddetprog;
    }

    public Time getFechini() {
        return fechini;
    }

    public void setFechini(Time fechini) {
        this.fechini = fechini;
    }

    public Time getFechfin() {
        return fechfin;
    }

    public void setFechfin(Time fechfin) {
        this.fechfin = fechfin;
    }

    public String getEstdetprog() {
        return estdetprog;
    }

    public void setEstdetprog(String estdetprog) {
        this.estdetprog = estdetprog;
    }

    public String getGendetprog() {
        return gendetprog;
    }

    public void setGendetprog(String gendetprog) {
        this.gendetprog = gendetprog;
    }

    public long getCodper() {
        return codper;
    }

    public void setCodper(long codper) {
        this.codper = codper;
    }

    public long getCodprog() {
        return codprog;
    }

    public void setCodprog(long codprog) {
        this.codprog = codprog;
    }

    public String getFrecdetprog() {
        return frecdetprog;
    }

    public void setFrecdetprog(String frecdetprog) {
        this.frecdetprog = frecdetprog;
    }

    public String getHorinifin() {
        return horinifin;
    }

    public void setHorinifin(String horinifin) {
        this.horinifin = horinifin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProgDetEntity that = (ProgDetEntity) o;
        return coddetprog == that.coddetprog &&
                codper == that.codper &&
                codprog == that.codprog &&
                Objects.equals(fechini, that.fechini) &&
                Objects.equals(fechfin, that.fechfin) &&
                Objects.equals(estdetprog, that.estdetprog) &&
                Objects.equals(gendetprog, that.gendetprog) &&
                Objects.equals(frecdetprog, that.frecdetprog) &&
                Objects.equals(horinifin, that.horinifin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coddetprog, fechini, fechfin, estdetprog, gendetprog, codper, codprog, frecdetprog, horinifin);
    }
}
