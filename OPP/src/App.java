import java.util.Scanner;

public class App {


//    public static String hello (String hello1) {
//
//        return ("Witaj: ") + hello1;
//    }
//
    public static void main(String[] args) {

        Pies jamnik = new Pies("jamnik", 14, "Sebastian");
        Pies bulldog = new Pies("bulldog", 8,"Cep");

        Pies hart = new Pies("hart", 600,"Klops", 30);

        Pies szarik = new Pies();


        jamnik.szczekaj();
        bulldog.szczekaj();
        hart.szczekaj();
        szarik.szczekaj();

        Wataha mojaWataha = new Wataha();
        mojaWataha.addMember(jamnik);
        mojaWataha.addMember(bulldog);
        mojaWataha.addMember(hart);
        mojaWataha.addMember(szarik);

        String stado = mojaWataha.ktoWStadzie();
        System.out.println(stado);



        Suka jadwiga = new Suka("kundel", 7,"Jadwiga", 50);

        jadwiga.szczekaj();

    }
//        Scanner enterName = new Scanner(System.in);
//
//
//        System.out.println(hello(enterName.nextLine()));
//    }

}
