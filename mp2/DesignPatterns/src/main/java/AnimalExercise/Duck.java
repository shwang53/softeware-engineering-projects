package AnimalExercise;

public class Duck extends Animal {
    //@TODO: implement me
   public Duck(String o) {
	super(o);
   }
   public Duck(String o, int n) {
	super(o);
	super.setAge(n);
   }
    public String speak(){
	return "Quack";
    }

}
