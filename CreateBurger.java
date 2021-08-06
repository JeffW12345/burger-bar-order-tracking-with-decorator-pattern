public class CreateBurger {
	public static void main(String args[]) {
		Burgers burger = new PlainBurger();
		burger = new Cheese(burger);
		burger = new Bacon(burger);
		System.out.println(burger.getDesc() + "\nCost: £" + burger.getCost());
	}
}
