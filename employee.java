package entities;

public class employee {
	public String name;
	public Double grossSalary;
	public Double tax;
	
	public Double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(Double percentage) {
		double result = (grossSalary * percentage) / 100;
		grossSalary += result;
	}
	
	public String toString() {
		return name + ", $ " + netSalary();
	}
}
