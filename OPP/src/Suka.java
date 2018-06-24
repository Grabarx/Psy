public class Suka extends Pies{

    @Override
    public void szczekaj() {
        System.out.println(rasa + " " + name + " o wadze " + waga + "kg zrobiła wooofff." + "A wzrost jej wynosi " + wzrost + " cm.");
    }

    public Suka(String rasa, int waga, String name, int wzrost){

        super(rasa,waga,name,wzrost);


    }
}
