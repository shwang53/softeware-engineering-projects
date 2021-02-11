package Loaders;

import Entities.SingleTable;

import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.IOException;

public class TableFileLoader {

    private final static String[] HEADERS = {"Table Number", "Number of Seats"};
    private String fileName;
    public TableFileLoader(String fileName){
        this.fileName = fileName;
    }

    public File getDefaultFile() {
        return new File("./tables.txt");
    }
    int numberOfColumns = HEADERS.length;
    List<SingleTable> tables = new ArrayList<SingleTable>();
    boolean useDefault = true;
    BufferedReader breader = null;
    File file;
    List<List<String>> result = new ArrayList<List<String>>();

    public List<SingleTable> load(){

        try {
            file = new File(fileName);
            if (!file.exists()) {
                if(useDefault){
                    file = getDefaultFile();
                }else{
                    throw new IllegalArgumentException("The Components.Menu does not exist.");
                }
            }
            breader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
            String line = breader.readLine();
            helper1(line);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (breader != null){
                    breader.close();
                }
            } catch (IOException ex){
                ex.printStackTrace();
            }
        }
        for(List<String> line : result ){
            int tableIndex = Integer.parseInt(line.get(0).trim());
            int tableSeats = Integer.parseInt(line.get(1).trim());
            SingleTable table = new SingleTable(tableIndex,tableSeats);
            tables.add(table);
        }
        return tables;
    }

    void helper1(String line) {
        try {
            while(line != null){
                String[] entries = line.split(",");
                List<String> lineEntry = new ArrayList<String>();

                if(entries.length != numberOfColumns){
                    throw new IllegalArgumentException("The specified Columns are incorrect.");
                }
                for(String entry : entries){
                    lineEntry.add(entry);
                }
                result.add(lineEntry);
                line = breader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
