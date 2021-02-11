package AnimalExercise;

public class Dog extends Animal{
    //@TODO: implement me
    public Dog(String o) {
	super(o);
    }
    public Dog(String o, int n) {
	super(o);
	super.setAge(n);
    }
    public String speak() {
    	return "Woof";
    }
}
