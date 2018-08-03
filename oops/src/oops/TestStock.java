package oops;



import lti.stock.Broker;
import lti.stock.Exchange;
import lti.stock.Holder;
import lti.stock.StockSingleton;

public class TestStock {

	public static void main(String[] args) {
		
	
		Broker b=StockSingleton.getStock();
		b.getQuote();
		
		Holder h=StockSingleton.getStock();
		h.viewQuote();
		System.out.println(h==b);
		
		Exchange e=StockSingleton.getStock();
		e.viewQuote();
		
		e.setQuote(30);
	}
}