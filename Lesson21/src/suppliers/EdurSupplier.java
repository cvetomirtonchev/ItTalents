package suppliers;

public class EdurSupplier extends Supplier {

	private static final int EDUR_SUPPLIER_DISCOUNT = 15;

	@Override
	public int getDiscount() {
		return EDUR_SUPPLIER_DISCOUNT;
	}

}
