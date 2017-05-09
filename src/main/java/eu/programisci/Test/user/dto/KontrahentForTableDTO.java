package eu.programisci.Test.user.dto;

/**
 * Created by student on 09.05.17.
 */
public class KontrahentForTableDTO {

    private Long id;
    private String nazwa;
    private String adres;
    private String nip;

    public KontrahentForTableDTO(){

    }
    public Long getId() {
        return id;
    }

    public void setId(Long aID) {
        id=aID;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String aNazwa) {
        nazwa=aNazwa;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String aAdres) {
        adres=aAdres;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String aNip) {
        nip=aNip;
    }
}
