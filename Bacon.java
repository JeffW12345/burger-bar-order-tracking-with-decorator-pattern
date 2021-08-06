// A concrete decorator

public class Bacon extends ExtrasDecorator {
	public Bacon(Burgers burger) {
		this.burger = burger;
	}

	@Override
	public String getDesc() {
		return burger.getDesc() + "\nSizzling bacon";
	}

	@Override
	public double getCost() {
		return burger.getCost() + 0.80;
	}
}
