package StockExercise;

import StockExercise.Given.ObservableStock;
import StockExercise.Given.ObserverStockExchangeCenter;
import StockExercise.Given.StockType;

import java.util.ArrayList;
import java.util.List;

public class ObservableStockImpl extends ObservableStock {

    //@TODO: Add any necessary fields
    private StockType name;
    private List<ObserverStockExchangeCenter> observers ;

    public ObservableStockImpl(StockType name){
        super(name);
	this.name = name;
	observers = new ArrayList<>();
        //@TODO: Implememnt me
    }

    public void notifyPriceChange(double price){
        //@TODO: Implememnt me
	for (ObserverStockExchangeCenter observer: observers) {
	  observer.notifyChange(name,price);
      }
    }

    public void registerStockExchangeCenter(ObserverStockExchangeCenter oc){
        //@TODO: Implememnt me
	observers.add(oc);
    }

    //@TODO: Override any necessary methods
    public void setPrice(double price) {
	notifyPriceChange(price);
    }
}
