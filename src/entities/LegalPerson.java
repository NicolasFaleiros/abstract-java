package entities;

public class LegalPerson extends TaxPayer{

	public Integer Employees;
	
	public LegalPerson() {
		super();
	}

	public LegalPerson(String name, Double annualIncome, Integer employees) {
		super(name, annualIncome);
		Employees = employees;
	}

	public Integer getEmployees() {
		return Employees;
	}

	public void setEmployees(Integer employees) {
		Employees = employees;
	}
	
	@Override
	public Double tax() {
		if(Employees > 10) {
			return getAnnualIncome() * 0.14;
		}
		else {
			return getAnnualIncome() * 0.16;
		}
	}
}
