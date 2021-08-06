//A concrete decorator
public class Cheese extends ExtrasDecorator {
	public Cheese(Burgers burger) {
		this.burger = burger;
	}

	@Override
	public String getDesc() {
		return burger.getDesc() + "\nFarm fresh cheese";
	}

	@Override
	public double getCost() {
		return burger.getCost() + 1.09;
	}
}
