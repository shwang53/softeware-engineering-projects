package Loaders;

import Entities.MenuItem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;


import java.util.List;

public class MenuFileLoader {

    private final static String[] HEADERS = {"MenuItem Name", "Type" ,"Price", "Calorie"};
    private String fileName;
    public MenuFileLoader(String fileName){
        this.fileName = fileName;
    }

    public File getDefaultFile() {
        return new File("./menu.txt");
    }

    List<MenuItem> menuItems = new ArrayList<MenuItem>();
    boolean useDefault = true;
    BufferedReader breader = null;
    List<List<String>> result = new ArrayList<List<String>>();

    public List<MenuItem> load(){
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                if(useDefault){
                    file = getDefaultFile();
                } else {
                    throw new IllegalArgumentException("The Components.Menu doesn't exist.");
                }
            }
            breader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
            String line = breader.readLine();
            helper1(line, breader);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (breader != null) {
                    breader.close();
                }
            } catch (IOException ex){
                ex.printStackTrace();
            }
        }
        helper2(result, menuItems);
        return menuItems;
    }

    void helper1(String line, BufferedReader breader){
        try{
            while(line != null){
                String[] entries = line.split(",");
                List<String> lineEntry = new ArrayList<String>();

                if(entries.length != HEADERS.length){
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

    void helper2 (List<List<String>> result, List<MenuItem> menuItems) {
        final int num = 3;
        for(List<String> line : result ){
            String dishName = line.get(0).trim();
            String dishType = line.get(1).toUpperCase().trim();
            double dishPrice = Double.parseDouble(line.get(2).trim());
            double dishCalorie = Double.parseDouble(line.get(num).trim());
            MenuItem menuItem = new MenuItem(dishName,dishType,dishPrice,dishCalorie);
            menuItems.add(menuItem);
        }
    }

}
