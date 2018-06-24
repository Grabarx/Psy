
public class Pies {

        String rasa;
        int waga;
        String name;
        int wzrost;

    public void szczekaj () {
        System.out.println(rasa + " " + name + " o wadze " + waga + "kg zaszczekał." + "A wzrost jego wynosi " + wzrost + " cm.");
    }

    public void kupa(){
        System.out.println(name + " Zrobi kupe piasku.");
    }

    public Pies (String rasa,int waga, String name ) {
        this(rasa, waga, name,0);
    }

    public Pies (String rasa,int waga, String name, int wzrost ) {
        this.rasa = rasa;
        this.waga = waga;
        this.name = name;
        this.wzrost = wzrost;
    }

    public Pies(){
        this("jamnik", 9,"Szarik", 15);
        System.out.println("konstruktor 4 arg");
    }


}
