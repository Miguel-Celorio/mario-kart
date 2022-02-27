
public class Main {

	public static void main(String[] args) {
		Race race = new Race("Super cup");
		race.addKart(new Kart("Mario"));
		race.addKart(new Kart("Luigi"));
		race.addKart(new Kart("Bowser"));
		race.setCircuit(new Circuit("Mina de Wario", 100));
		System.out.println("**** Init Super Mario Kart ****");
		System.out.println(race);
		race.run();
		System.out.println("**** Game Over ****");
		System.out.println(race.showResult());

	}

}
