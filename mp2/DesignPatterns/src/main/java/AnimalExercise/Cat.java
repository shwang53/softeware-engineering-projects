package AnimalExercise;

public class Cat extends Animal{
    //@TODO: implement me
    public Cat(String o) {
	super(o);
    }
    public Cat(String o, int n) {
	super(o);
	super.setAge(n);
    }
    public String speak() {
	return "Meow";
    }
}
