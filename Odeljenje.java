import java.util.ArrayList;

public class Odeljenje {
    private String oznaka;
    private ArrayList<Ucenik> dnevnik;

    public Odeljenje(String oznaka, ArrayList<Ucenik> dnevnik) {
        this.oznaka = oznaka;
        this.dnevnik = dnevnik;
    }

    public String getOznaka() {
        return oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public ArrayList<Ucenik> getDnevnik() {
        return dnevnik;
    }

    public void setDnevnik(ArrayList<Ucenik> dnevnik) {
        this.dnevnik = dnevnik;
    }

    public void upisiUcenika(Ucenik u){
        dnevnik.add(u);
    }

    public void upisiUcenika(Ucenik u, int redniBroj){
        dnevnik.add(redniBroj, u);
    }

    public void ispisiUcenika(Ucenik u) {
        dnevnik.remove(u);
    }

    public void ispisiUcenika(int i){
        dnevnik.remove(i);
    }

    public void pogledajOcene(Ucenik u){
        dnevnik.get(u).getOcene();
    } //nisam siguran za ovo kako da uradim

    public void pogledajOcene(int i) {
        dnevnik.get(i).getOcene();
    }

    public void prosecnaOcena(Ucenik u){
        u.prosek(u.getOcene());
    }

    //nisam stigao ostale metode


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getOznaka());
        sb.append(" odeljenje ima djake: ")
                for(int i=0; i<dnevnik.size(); i++){
                    sb.append(dnevnik.get(i).getIme());
                    sb.append(" ");
                    sb.append(dnevnik.get(i).getPrezime());
                    sb.append("\n");
                }
        sb.append("\n");
        return sb.toString();
    }
}


