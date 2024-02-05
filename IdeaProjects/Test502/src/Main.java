import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
      FileReader test = new FileReader();
      System.out.println("Tast: 1 for at Oprette filen" );
      System.out.println("Tast: 2 for at Læse filen" );
      System.out.println("Tast: 3 for at Slette filen" );
      System.out.println("Tast: 4 for at Se filer i mappen" );
      System.out.println("Tast: 5 for at Oprette en mappe" );
      int brugerinput = scanner.nextInt();
      switch (brugerinput){
          //Oprette fil
          case 1:
          System.out.println("Indtast filnavn");
          String filnavn = scanner.next();
          test.opretfil(filnavn);
          break;
          //Læs fil
          case 2:
              System.out.println("Indtast filen");
              filnavn = scanner.next();
              test.laesfil(filnavn);
              break;
          //slette fil
          case 3:
              System.out.println("Indtast filnavn");
              filnavn = scanner.next();
              test.sletfil(filnavn);
              break;
          //Se filer i mappen
          case 4:
              System.out.println("Indtast mappenavn");
              filnavn = scanner.next();
              test.sefiler(filnavn);
              break;
          //Opret mappe
          case 5:
              System.out.println("Indtast mappenavn");
              filnavn = scanner.next();
              test.opretmappe(filnavn);
      }

    }
}
