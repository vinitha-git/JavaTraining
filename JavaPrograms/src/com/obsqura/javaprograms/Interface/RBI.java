/**
 * 
 */
package com.obsqura.javaprograms.Interface;

/**
 * Write a program, where RBI will be an interface,
 *  have a method recurringDeposit which can accept the 
 *  amount and duration. This must be implemented in class HDFC.
 *  Interest rate is defined in RBI interface.
 *  @author VINITHA EDWIN
 */
public interface RBI {
 
	double rateOfInterest = 0.04;
    double recurringDeposit(double amount, double duration);
}
