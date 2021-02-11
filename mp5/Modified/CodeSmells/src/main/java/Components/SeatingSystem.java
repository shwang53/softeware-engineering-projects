package Components;

import Loaders.TableFileLoader;
import Entities.SingleTable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SeatingSystem {

    private String tableConfigFilePath;
    private Map<SingleTable,Boolean> tables;

    public SeatingSystem(String tableConfigFilePath){
        this.tableConfigFilePath = tableConfigFilePath;
        populateSeats();
    }

    private void populateSeats(){
        TableFileLoader loader = new TableFileLoader(tableConfigFilePath);
        List<SingleTable> tableList = loader.load();
        tables = new HashMap<SingleTable,Boolean>();
        for (SingleTable i : tableList) {
            tables.put(i, false);
        }


    }

    public int[] getNumberOfSeatsForAllTable(){
        int[] seats = new int[tables.size()];
        int i = 0;
        for(SingleTable table : tables.keySet()){
            seats[i] = table.getNumberOfSeats();
            i++;
        }
        return seats;
    }

    public int[] getIndexForAllTable(){
        int[] indices = new int[tables.size()];
        int i = 0;
        for(SingleTable table : tables.keySet()){
            indices[i] = table.getIndex();
            i++;
        }
        return indices;
    }

    public SingleTable getAvailableTable(int numberOfPeople){
        SingleTable result = null;
        for( Map.Entry<SingleTable, Boolean> entry : tables.entrySet()){
            if(!entry.getValue()
                    && entry.getKey().getNumberOfSeats() >= numberOfPeople
                    && (result == null
                    || entry.getKey().getNumberOfSeats() < result.getNumberOfSeats())){
                result = entry.getKey();
            }
        }
        return result;
    }

    public boolean occupy(SingleTable table){
        boolean isOccupied = false;
        if(tables.get(table)){
            isOccupied = false;
        }else{
            tables.put(table, true);
            isOccupied = true;
        }
        return isOccupied;
    }

    public boolean vacate(SingleTable table){
        boolean isVacated = false;
        if(!tables.get(table)){
            isVacated = false;
        }else{
            tables.put(table,false);
            isVacated = true;
        }
        return isVacated;
    }



}
