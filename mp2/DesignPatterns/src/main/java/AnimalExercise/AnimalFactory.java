package AnimalExercise;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AnimalFactory {

    public static Animal create(AnimalType type){
        //@TODO: implement meA
	int age = Integer.parseInt((new SimpleDateFormat("dd")).format(new Date()));
	if (type == AnimalType.Cat) {
	  return new Cat("Salmon",age);
	}
	else if (type == AnimalType.Dog) {
	  return new Dog("Bone", age);
	}
	else if (type == AnimalType.Duck) {
	  return new Duck("Rice", age);
	}
	else if (type == AnimalType.Cow) {
	  return new Cow("Grass", age);
	}
        return null;
    }
}
