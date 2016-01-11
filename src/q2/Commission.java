package q2;

public class Commission extends Hourly{

	
	
	private int hoursWorked;
	
	private double totalSales;
	
	private double commission;
	

	public Commission (String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commission)
	{
		super (eName, eAddress, ePhone, socSecNumber, rate);
		hoursWorked = 0;
		totalSales = 0;
		this.commission = commission;
	}

	

	public void addSales(double totalSales){
		this.totalSales += totalSales;
	}
	
	public double pay()
	{
		double totalPay = super.pay() + (commission * totalSales);
		totalSales = 0;
		return totalPay;
	}
	
	public String toString()
	{
		String result = super.toString();
		result += "\nTotal Sales: " + totalSales;
		return result;
	}
}
