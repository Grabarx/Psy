import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Wataha {
    List<Pies> czlonkowie = new ArrayList<>();


    public void addMember(Pies p) {
        czlonkowie.add(p);
    }

    public String ktoWStadzie (){
        StringBuilder out = new StringBuilder();
        for (Pies p: czlonkowie) {
            out.append(p.name);
            out.append(" , ");
        }
        return out.toString();
    }

}
