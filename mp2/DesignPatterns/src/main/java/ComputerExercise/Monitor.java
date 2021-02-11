package ComputerExercise;

public class Monitor extends ComputerPeripheral{
    public Monitor(Computer computer) {
        super(computer);
    }
//@TODO: Implememnt me
	
    @Override
    public String run() {
	return "Monitor turned on\n" + computer.run() + "Display colorful interface\n";
    }

    @Override
    public String getDescription() {
    	return computer.getDescription() + " with monitor";
    }
}
