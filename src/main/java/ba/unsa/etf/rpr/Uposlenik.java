package ba.unsa.etf.rpr;

/**
 * Implementing build pattern
 * Model class Uposlenik
 */

public class Uposlenik
{
    private String ime;
    private String prezime;
    private String spol;
    private Integer dob;
    private Boolean imaLiDiplomu;
    private String mail;

    public Uposlenik(String ime, String prezime, String spol, Integer dob, Boolean imaLiDiplomu, String mail) {
        this.ime = ime;
        this.prezime = prezime;
        this.spol = spol;
        this.dob = dob;
        this.imaLiDiplomu = imaLiDiplomu;
        this.mail = mail;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getSpol() {
        return spol;
    }

    public void setSpol(String spol) {
        this.spol = spol;
    }

    public Integer getDob() {
        return dob;
    }

    public void setDob(Integer dob) {
        this.dob = dob;
    }

    public Boolean isImaLiDiplomu() {
        return imaLiDiplomu;
    }

    public void setImaLiDiplomu(Boolean imaLiDiplomu) {
        this.imaLiDiplomu = imaLiDiplomu;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
