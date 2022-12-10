package ba.unsa.etf.rpr;

public class UposlenikBuilder {
    private String ime;
    private String prezime;
    private String spol;
    private Integer dob;
    private Boolean imaLiDiplomu;
    private String mail;

    public UposlenikBuilder setIme(String ime) {
        this.ime = ime;
        return this;
    }

    public UposlenikBuilder setPrezime(String prezime) {
        this.prezime = prezime;
        return this;
    }

    public UposlenikBuilder setSpol(String spol) {
        this.spol = spol;
        return this;
    }

    public UposlenikBuilder setDob(Integer dob) {
        this.dob = dob;
        return this;
    }

    public UposlenikBuilder setImaLiDiplomu(Boolean imaLiDiplomu) {
        this.imaLiDiplomu = imaLiDiplomu;
        return this;
    }

    public UposlenikBuilder setMail(String mail) {
        this.mail = mail;
        return this;
    }
    public Uposlenik build(){
        return new Uposlenik(ime, prezime, spol, dob, imaLiDiplomu, mail);
    }
}
