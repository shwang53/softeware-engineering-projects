package StockExercise;

import StockExercise.Given.ObservableStock;
import StockExercise.Given.ObserverStockExchangeCenter;
import StockExercise.Given.StockType;

public class ObserverStockExchangeCenterImpl extends ObserverStockExchangeCenter {
    public ObserverStockExchangeCenterImpl() {
        super();
    }

    public void notifyChange(StockType type, double price){
        //@TODO: Implememnt me
	ownedStock.put(type,price);
    }

    //@TODO: Override any necessary methods

    public void observe(ObservableStock o){
        //@TODO: Implememnt me
	o.registerStockExchangeCenter(this);
    }

    public void buyStock(ObservableStock s){
	ownedStock.put(s.getName(),0.0);
	observe(s);
    }
}
