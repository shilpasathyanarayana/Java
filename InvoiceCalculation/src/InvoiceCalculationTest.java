public class InvoiceCalculationTest{
	public static void main(String[] args) {
		InvoiceCalculation invoiceCalculation= new InvoiceCalculation(1, "ipad", 1, 900.50);
		System.out.println(invoiceCalculation.getInvoiceAmount());
		InvoiceCalculation invoiceCalculation2= new InvoiceCalculation(1, "laptop", -1, 456.6);
		System.out.println(invoiceCalculation2.getInvoiceAmount());
	}
}

class InvoiceCalculation {
	private int number;
	private String description;
	private int quantity;
	private Double pricePerItem;

	

	public InvoiceCalculation(int number, String description, int quantity, Double pricePerItem) {
		super();
		this.number = number;
		this.description = description;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int Quantity) {
		this.quantity = quantity;
	}

	public Double getPricePerItem() {
		return pricePerItem;
	}

	public void setPricePerItem(Double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}

	public double getInvoiceAmount() {
		double invoiceAmount;
		if (quantity <=0 || pricePerItem <=0) {
			invoiceAmount=0;
		}
		else 
			invoiceAmount= quantity * pricePerItem;
		
		return invoiceAmount;
		

	}

	@Override
	public String toString() {
		return "InvoiceCalculation [number=" + number + ", description=" + description + ", quantity=" + quantity
				+ ", pricePerItem=" + pricePerItem + "]";
	}
	
}
