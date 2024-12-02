import java.util.Scanner;

public class Zulassung {

    public static void main(String[] args) {
        // Fehlermeldung ist zwar nicht vorgeschrieben, aber trotzdem sinnvoll
        if(args.length != 1) {
            System.out.println("genau ein Argument erwartet");
            return;
        }

        int gesamtpunktzahl = Integer.parseInt(args[0]);

        // Speicherplatz für bis zu 100 Studis anfordern
        Studi[] studis = new Studi[100];

        csvEinlesen(studis);

        zulassungenAusgeben(gesamtpunktzahl, studis);
    }

    private static void csvEinlesen(Studi[] studis) {
        // mitzählen, wie viele Studis bisher eingelesen
        int anzahlStudis = 0;

        Scanner stdin = new Scanner(System.in);

        while(stdin.hasNext()) {
            String zeile = stdin.nextLine();
            studis[anzahlStudis] = studiAusZeile(zeile);
            anzahlStudis++;
        }
    }

    private static Studi studiAusZeile(String zeile) {
        String[] parts = zeile.split(",");
        String name = parts[0];
        int[] punkte = new int[parts.length - 1];
        for(int i = 0; i < punkte.length; i++) {
            punkte[i] = Integer.parseInt(parts[i + 1]);
        }
        return new Studi(name, punkte);
    }

    private static void zulassungenAusgeben(int gesamtpunktzahl, Studi[] studis) {
        for(Studi studi: studis) {
            // Prüfung auf null: wenn wir weniger als 100 eingelesen haben, enthält das Array null-Einträge
            if(studi != null) {
                System.out.println(studi.csvZeile(gesamtpunktzahl));
            }
        }
    }
}

