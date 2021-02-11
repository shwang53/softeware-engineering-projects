package ComputerExercise;

public class Keyboard extends ComputerPeripheral{
//@TODO: Implememnt me

    public Keyboard(Computer computer) {
        super(computer);
    }

    @Override
    public String run() {
	return computer.run();
    }

    @Override
    public String getDescription() {
	return computer.getDescription() + " with keyboard";
    }
}
