/*
 Ispisite podatke o nekom glumcu i glumici tako sto cete ime i prezime prikazati kao dve promenljive, pol kao karakter,
 godine kao integer, vasa ocena njih od 1 do 10 (sa decimalom) i da li je iz Srbije odgovorite preko booleana. Sve
  potrebno za glumca i glumicu da budu dva ispisa (edited)
 */

public class Glumci {

    private String ime;
    private String prezime;
    private String pol;
    private int god;
    private double ocena;
    private boolean srpskoPoreklo;

    public Glumci(String ime, String prezime, String pol, int god, double ocena, boolean srpskoPoreklo) {
        this.ime = ime;
        this.prezime = prezime;
        this.pol = pol;
        this.god = god;
        this.ocena = ocena;
        this.srpskoPoreklo = srpskoPoreklo;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getPol() {
        return pol;
    }

    public boolean isSrpskoPoreklo() {
        return srpskoPoreklo;
    }

    public int getGod() {
        return god;
    }

    public void setGod(int god) {
        this.god = god;
    }

    public double getOcena() {
        return ocena;
    }

    public void setOcena(double ocena) {
        this.ocena = ocena;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        if(getPol().equals("m")){

            sb.append("Glumac: ");
            sb.append(getIme());
            sb.append(" ");
            sb.append(getPrezime());

            sb.append(" ima ");
            sb.append(getGod());
            sb.append(" godina.");
            sb.append("Moja ocena za njega je: ");
            sb.append(getOcena());
             if(isSrpskoPoreklo()==true){
                 sb.append("Iz Srbije je.");
             }else{
                 sb.append("Nije iz Srbije");
             }

        }
        if(getPol().equals("z")){

            sb.append("Glumica: ");
            sb.append(getIme());
            sb.append(" ");
            sb.append(getPrezime());

            sb.append(" ima ");
            sb.append(getGod());
            sb.append(" godina.");
            sb.append("Moja ocena za nju je: ");
            sb.append(getOcena());
            if(isSrpskoPoreklo()==true){
                sb.append(" Iz Srbije je.");
            }else{
                sb.append(" Nije iz Srbije");
            }

        }


        return sb.toString();
    }
}
