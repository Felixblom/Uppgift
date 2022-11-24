import java.util.Scanner;


public class UppgiftText {
    UppgiftRakna nummer = new UppgiftRakna();

    public void text() {
        String word = "";

        System.out.println("Skriv några ord:");
        Scanner sc = new Scanner(System.in); //En scanner som plockar upp det vi skriver in
        //StringBuilder text = new StringBuilder();// En StringBuilder vi fyller med det som scannern plockar upp

        while (!word.endsWith("stop"))//While loop som stängs ner när vi skriver stop med små bokstäver
        {
            word = sc.nextLine();
            nummer.myCharCount(word);
            nummer.myRowCount();
            System.out.println(word);
        }

        // return text.substring(0, text.toString().length()-5);//Gör vår StringBuilder till en string och tar bort 5 bokstäver som är stop och vårt sista mellanslag
        nummer.afterStop();

    }

}
