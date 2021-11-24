package lu.pata.chitibus.pojo;

public class Persoana {
    private String nume;
    private String telefon;

    public Persoana(String nume, String telefon) {
        this.nume = nume;
        this.telefon = telefon;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
}