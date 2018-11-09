package com.came.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "PROGRAMA", schema = "CAME")
public class ProgramaEntity {

    @Id
    @Column(name = "CODPROG", nullable = false, precision = 0)
    private long codprog;

    @Basic
    @Column(name = "NOMPROG", nullable = false, length = 200)
    private String nomprog;

    @Basic
    @Column(name = "ESTPROG", nullable = false, length = 1)
    private String estprog;

    @Basic
    @Column(name = "CODTIPPG", nullable = false, precision = 0)
    private long codtippg;

    @Basic
    @Column(name = "INIPROG", nullable = true, length = 20)
    private String iniprog;

    @Basic
    @Column(name = "CODARE", nullable = true, precision = 0)
    private Long codare;

    @Basic
    @Column(name = "CODEMP", nullable = true, precision = 0)
    private Long codemp;

    public long getCodprog() {
        return codprog;
    }

    public void setCodprog(long codprog) {
        this.codprog = codprog;
    }

    public String getNomprog() {
        return nomprog;
    }

    public void setNomprog(String nomprog) {
        this.nomprog = nomprog;
    }

    public String getEstprog() {
        return estprog;
    }

    public void setEstprog(String estprog) {
        this.estprog = estprog;
    }

    public long getCodtippg() {
        return codtippg;
    }

    public void setCodtippg(long codtippg) {
        this.codtippg = codtippg;
    }

    public String getIniprog() {
        return iniprog;
    }

    public void setIniprog(String iniprog) {
        this.iniprog = iniprog;
    }

    public Long getCodare() {
        return codare;
    }

    public void setCodare(Long codare) {
        this.codare = codare;
    }

    public Long getCodemp() {
        return codemp;
    }

    public void setCodemp(Long codemp) {
        this.codemp = codemp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProgramaEntity that = (ProgramaEntity) o;
        return codprog == that.codprog &&
                codtippg == that.codtippg &&
                Objects.equals(nomprog, that.nomprog) &&
                Objects.equals(estprog, that.estprog) &&
                Objects.equals(iniprog, that.iniprog) &&
                Objects.equals(codare, that.codare) &&
                Objects.equals(codemp, that.codemp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codprog, nomprog, estprog, codtippg, iniprog, codare, codemp);
    }
}
