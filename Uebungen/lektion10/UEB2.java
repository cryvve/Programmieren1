package lektion10;

public class UEB2 {

    public static void main(String[] args) {
        Uhr[] weltzeit = new Uhr[24];
        Uhr uhr = new Uhr(23, 59, 59);

        uhr.naechsteSek();

        System.out.println(uhr.getStd() + ":" + uhr.getMin() + ":" + uhr.getSek());

        for (int i = 0; i < weltzeit.length; i++) {
            weltzeit[i] = new Uhr(i, 23, 7);
        }

        for (int j = 0; j < weltzeit.length; j++) {
            weltzeit[j].naechsteSek();
        }

        for (Uhr u : weltzeit) {
            System.out.println(u.getStd() + ":" + u.getMin() + ":" + u.getSek());
        }
    }
}
