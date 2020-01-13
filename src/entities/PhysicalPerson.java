package entities;

public class PhysicalPerson extends TaxPayer {

	private Double healthExpenditures;
	
	public PhysicalPerson() {
		super();
	}

	public PhysicalPerson(String name, Double annualIncome, Double healthExpenditures) {
		super(name, annualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthCare() {
		return healthExpenditures;
	}

	public void setHealthCare(Double healthCare) {
		this.healthExpenditures = healthCare;
	}

	public double healthCareSpent() {
		if (healthExpenditures > 0) {
			healthExpenditures += healthExpenditures * 0.5;
		}
		else if(healthExpenditures == 0) {
			healthExpenditures += healthExpenditures * 1;
		}
		return healthExpenditures;
	}
	
	@Override
	public Double tax() {
		if (getAnnualIncome() < 20000.0) {
			return getAnnualIncome() * 0.15 - healthExpenditures * 0.5;
		}
		else {
			return getAnnualIncome() * 0.25 - healthExpenditures * 0.5;
		}
	}
	
	
}
