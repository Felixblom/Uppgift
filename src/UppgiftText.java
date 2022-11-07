import java.util.Scanner;


public class UppgiftText {

    public static String text(){
        System.out.println("Skriv några ord:");
        Scanner sc = new Scanner(System.in); //En scanner som plockar upp det vi skriver in
        StringBuilder text = new StringBuilder();// En StringBuilder vi fyller med det som scannern plockar upp

        while(!text.toString().endsWith("stop "))//While loop som stängs ner när vi skriver stop med små bokstäver
        {
            text.append(sc.nextLine()+" "); //Vi lägger in ett mellanslag efter varje ord så att vi kan räkna rader med regular expression

            System.out.println(text);
        }

        return text.substring(0, text.toString().length()-5);//Gör vår StringBuilder till en string och tar bort 5 bokstäver som är stop och vårt sista mellanslag


    }
}
