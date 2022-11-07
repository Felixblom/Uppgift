
public class UppgiftRakna {

    public void antal(){


        UppgiftText bokstaver = new UppgiftText();//Importerar orden
        String bok = bokstaver.text();

        System.out.println(bok);
        String[] lines = bok.split("[ ]");// Räknar rader genom att använda en split som med hjälp av regular expression splittar vid varje mellanslag
        System.out.println("Antal rader: " + lines.length);
        bok = bok.replaceAll("\\s","");//Tar bort alla mellanslag så att vi kan räkna bokstäver
        System.out.println("Antal bokstäver: " + bok.length());

    }
}
