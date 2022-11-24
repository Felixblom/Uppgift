
public class UppgiftRakna {


    //attribut där du sparar antalet rader, antal tecken
    int charCount = 0;
    int rowCount = 0;

    public void myRowCount() {
        rowCount++;
    }

    public void myCharCount(String input) {
        charCount = charCount + input.length();
    }

    public int getCharCount() {

        return charCount - 4;
    }

    public int getRowCount() {

        return rowCount - 1;
    }

    /*/metoder som sparar antal tecken/antal rader i attributen
  //  public void textCount(){

        UppgiftText bokstaver = new UppgiftText();//Importerar orden
        String bok = bokstaver.text();

        String[] lines = bok.split("[ ]");// Räknar rader genom att använda en split som med hjälp av regular expression splittar vid varje mellanslag
        RowCount = lines.length;

        bok = bok.replaceAll("\\s","");//Tar bort alla mellanslag så att vi kan räkna bokstäver
        CharCount = bok.length();
    }
    /*/
    //metoder som returnerar antal tecken/antal rader
    public void afterStop() {

        System.out.println("Antal rader: " + getRowCount());
        System.out.println("Antal bokstäver: " + getCharCount());
    }

}
