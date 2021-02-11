package AnimalExercise;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cow extends Animal{
    //@TODO: implement me
    public Cow(String o) {
	super(o);
    }
    public Cow(String o, int n) {
	super(o);
	super.setAge(n);
    }
    public String speak() {
	return "Moo";
    }
}
