//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//Referenzen
public class referenzVergleich {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int Wert1 = 42;
        int Wert2 = 42;
        if (Wert1 == Wert2) {
            System.out.println("Die Werte sind gleich");
        } else {
            System.out.println("Die Werte sind nicht gleich");
        }

        System.out.println("Vergleich mit ==");
        String Ort1 = new String("Mühlenbeck");
        String Ort2 = new String("Mühlenbeck");
        if (Ort1 == Ort2) {
            System.out.println("Die Strings sind gleich");
        } else {
            System.out.println("Die Strings sind NICHT gleich");
        }
//Lösung: System.out.println("Vergleich mit equals");
        System.out.println("Vergleich mit equals");
        if (Ort1.equals(Ort2)) {
            System.out.println("Die Strings sind gleich");
        } else {
            System.out.println("Die Strings sind NICHT gleich");
        }
    }
}
