package com.calculatorfinal;

public class CalculatorService implements ICalculatorService {

	@Override
	public long add(CalculatorModel model) throws Exception {
		long result = 0L;
		try {
			result = model.operator1 + model.operator2;
		} catch (Exception e) {

		}
		return result;
	}

	@Override
	public long sub(CalculatorModel model) throws Exception {
		long result = 0L;
		try {
			result = model.operator1 - model.operator2;
		} catch (Exception e) {

		}
		return result;
	}
}