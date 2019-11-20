package com.capg.currency;

import java.util.Currency;
import java.util.Set;

public class CurrencyExample {

	public static void main(String[] args) {

		Currency currcode1 = Currency.getInstance("INR");      //get instance
		Currency currcode2= Currency.getInstance("USD");
		
		String currencycodesymbol1= currcode1.getSymbol();  //gets symbol for currency
		String currencycodesymbol2= currcode2.getSymbol();
		
		System.out.println("Symbol for INR : "+currencycodesymbol1);
		System.out.println("Symbol for USD : "+currencycodesymbol2);
		System.out.println("********************************************");
		
		String currencycode1Display = currcode1.getDisplayName();  // get display is to get the name pf currency
		String currencycode2Display = currcode2.getDisplayName();
		
		System.out.println("Display Name for INR :" +currencycode1Display);
		System.out.println("Display Name for USD :"+currencycode2Display);
		System.out.println("********************************************");
		
		Set<Currency> currencies = Currency.getAvailableCurrencies();     //shows all the available currencies
		System.out.println(currencies);
		System.out.println("********************************************");
		
		int currencycode1fraction = currcode1.getDefaultFractionDigits();  //gets default fraction
		int currencycode2fraction = currcode2.getDefaultFractionDigits();
		System.out.println("Default fraction for INR :"+ currencycode1fraction);
		System.out.println("Deaflt fraction for USD :" +currencycode2fraction);	
	}

}
