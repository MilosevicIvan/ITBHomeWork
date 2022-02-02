package DomaciZadatak;

/* 2. Array liste
Kreirajte array listu nekog vaseg interesovanje (npr sport)
-u listu dodajte vase omiljene iteme tog hobija (npr koji su omiljeni sportovi)
-iz liste dohvatite 3. element liste i ispisite
-promenite naziv prvog elementa
-uklonite 5. element
-ispisite velicinu vase liste
-pomocu for petlje (i na jedan i na drugi nacin) ispisite sve elemente liste
 */

import java.util.ArrayList;

public class ListeInteresovanja {
    public static void main(String[] args) {

        System.out.println("Kreirajte array listu nekog vaseg interesovanja:");

        ArrayList <String> automobil = new ArrayList<>(5);

        System.out.println("_________________________");

        System.out.println("U listu dodajte vase omiljene iteme tog hobija:");
        automobil.add("Volvo");
        automobil.add("Honda");
        automobil.add("Audi");
        automobil.add("Saab");
        automobil.add("Mercedes Benz");
        System.out.println(automobil);

        System.out.println("_________________________");

        System.out.println("Iz liste dohvatite 3. element liste i ispisite:");
        String a = automobil.get(2);
        System.out.println(a);

        System.out.println("_________________________");

        System.out.println("Promenite naziv prvog elementa:");
        automobil.set(0, "Volvo Personvagnar AB");
        System.out.println(automobil);

        System.out.println("_________________________");

        System.out.println("Uklonite 5. element:");
        automobil.remove(4);
        System.out.println(automobil);

        System.out.println("_________________________");

        System.out.println("Ispisite velicinu vase liste:");
        int velicinaListe = automobil.size();
        System.out.println(velicinaListe);

        System.out.println("_________________________");

        System.out.println("Pomocu for petlje (na prvi nacin) ispisite sve elemente liste:");
        for (int i = 0; i < automobil.size(); i++){
            System.out.println(automobil.get(i));
        }

        System.out.println("_________________________");

        System.out.println("Pomocu for petlje (na drugi nacin) ispisite sve elemente liste:");
        for (String i : automobil){
            System.out.println(i);
        }
    }
}