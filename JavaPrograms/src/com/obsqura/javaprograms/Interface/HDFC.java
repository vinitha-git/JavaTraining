package com.obsqura.javaprograms.Interface;
/**
 *  a. When a customer deposit amount in HDFC, 
 *  they must be able to know how much amount 
 *  they will get after depositing for n period of time.
 *  @author VINITHA EDWIN
 */
public class HDFC implements RBI {

	@Override
	public double recurringDeposit(double amount, double duration) {
		
		return amount*(1+(rateOfInterest*duration));
	}
    public static void main(String[] args)
    {
        RBI ref = new HDFC();
        double finalAmount = ref.recurringDeposit(10000, 6);
        System.out.println(finalAmount);
    }
}
