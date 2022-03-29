package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	private Date manufactureDate;
	SimpleDateFormat y = new SimpleDateFormat("dd/MM/yyyy");
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String toString() {
		return super.getName()
				+ "(used) $ "
				+ String.format("%.2f", super.getPrice())
				+" (Manufacture date: "
				+ y.format(manufactureDate)
				+ ")"
				;
	}
}
