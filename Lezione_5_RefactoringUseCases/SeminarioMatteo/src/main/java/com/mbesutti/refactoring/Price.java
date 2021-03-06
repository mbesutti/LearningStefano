package com.mbesutti.refactoring;


abstract class Price {
	abstract int getPriceCode();
	abstract double getCharge(int daysRented);
	int getFrequentRenterPoints(int daysRented) {
		return daysRented;
	}
}
