public class Tabel {

    public Integer numarCriteriu;
    private Integer numarDosar;
    private Integer kilometri;
    private Double valoare;
    private Double jumatateValoare;

    public Tabel(Integer numarCriteriu, Integer numarDosar, Integer kilometri, Double valoare, Double jumatateValoare) {
        this.numarCriteriu = numarCriteriu;
        this.numarDosar = numarDosar;
        this.kilometri = kilometri;
        this.valoare = valoare;
        this.jumatateValoare = jumatateValoare;
    }

    public Integer getNumarCriteriu() {
        return numarCriteriu;
    }

    public void setNumarCriteriu(Integer numarCriteriu) {
        this.numarCriteriu = numarCriteriu;
    }

    public Integer getNumarDosar() {
        return numarDosar;
    }

    public void setNumarDosar(Integer numarDosar) {
        this.numarDosar = numarDosar;
    }

    public Integer getKilometri() {
        return kilometri;
    }

    public void setKilometri(Integer kilometri) {
        this.kilometri = kilometri;
    }

    public Double getValoare() {
        return valoare;
    }

    public void setValoare(Double valoare) {
        this.valoare = valoare;
    }

    public Double getJumatateValoare() {
        return jumatateValoare;
    }

    public void setJumatateValoare(Double jumatateValoare) {
        this.jumatateValoare = jumatateValoare;
    }
}
