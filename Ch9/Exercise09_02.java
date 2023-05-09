//Stock class
public class Exercise09_02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stock stock = new Stock("ORCL", "Oracle Corporation");
		
		stock.setPreviousClosingPrice(34.5);
		stock.setCurrentPrice(34.35);
		
		System.out.println("Previous Closing Price: " + stock.getPreviousClosingPrice());
		System.out.println("Current Price: " + stock.getCurrentPrice());
		System.out.printf("Price Change: %.1f%%", stock.getChangePercent() * 100);
		
		
	}

}

class Stock{
	private String symbol = "";
	private String name = "";
	private double previousClosingPrice = 1;
	private double currentPrice = 1;
	
	public Stock(String symbol, String name) {
		this.symbol = symbol;
		this.name = name;
	}
	
	public double getChangePercent() {
		return currentPrice / previousClosingPrice - 1;
	}
	
	public void setPreviousClosingPrice(double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}
	
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	
	public double getPreviousClosingPrice() {
		return this.previousClosingPrice;
	}
	
	public double getCurrentPrice() {
		return this.currentPrice;
	}

	
	
}