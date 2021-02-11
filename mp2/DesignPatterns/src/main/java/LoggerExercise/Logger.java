package LoggerExercise;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static Logger instance = null;
    /**
     * @TODO Add any necessary fields and variables.
     */

    /**
     * The constructor for SingletonLogger. Set all necessary fields.
     *
     */
    //@TODO Add constructor here
    private Logger() {
    
    }

    /**
     * @return A Logger instance of this class.
     */
    public static Logger getInstance() {
	
	if (instance == null) {
	  instance = new Logger();
	}
        return instance; //@TODO: Delete this line

    }


    /**
     *
     * @param log
     *            The Object that will be logged in the file.
     */
    public void logInFile(Object log) {
        //@TODO: implement me
	try{
	  // variables
	  String today = (new SimpleDateFormat("MMddyyyy")).format(new Date());
	  String filename = "log"+today+".log";
	  // Create a file
	  File file = new File(filename);
          FileWriter fw = new FileWriter(file, true);
	  BufferedWriter bw = new BufferedWriter(fw);
	  // Wirte a String into a file
	  bw.write(log.toString());
	  bw.newLine();
	  bw.close();

	}
	catch(IOException e) {
	  e.printStackTrace();
	}
    }
}
