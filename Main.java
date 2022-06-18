import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Podaj tekst do zmiany");
    String zdanie=scan.nextLine();
    int wartosc;
    char[] pomocnicza=zdanie.toCharArray();
   for (int i=0;i<pomocnicza.length;i++)
     {
      if (pomocnicza[i]>96 && pomocnicza[i]<122)
      {
        wartosc=pomocnicza[i];
        wartosc=wartosc-32;
        pomocnicza[i]=(char)wartosc;
      } else if (pomocnicza[i]<90 && pomocnicza[i]>41)
      {
        wartosc=pomocnicza[i];
        wartosc=wartosc+32;
        pomocnicza[i]=(char)wartosc;
      }
       System.out.print(pomocnicza[i]);
     }
        
    
  }
}