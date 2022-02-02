import java.util.ArrayList;

public class Ucenik {
    private String ime;
    private String prezime;
    private ArrayList ocene;

    public Ucenik(String ime, String prezime, ArrayList ocene) {
        this.ime = ime;
        this.prezime = prezime;
        this.ocene = ocene;
    }

    public Ucenik(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
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

    public ArrayList getOcene() {
        return ocene;
    }

    public void setOcene(ArrayList ocene) {
        this.ocene = ocene;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getIme());
        sb.append(" ");
        sb.append(getPrezime());
        sb.append(" ima ocene: ");
        sb.append(ocene.toString());
        return sb.toString();
    }

    public int prosek(ArrayList ocene) {
        int zbir = 0;
        for (int i = 0; i < ocene.size(); i++) {
            //ne znam kako ovde da uzmem vrednost ocene;
        }
        int brojOcena = ocene.size();
        return zbir / brojOcena;

    }
}
