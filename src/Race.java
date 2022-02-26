import java.util.ArrayList;
import java.util.List;

public class Race {
	private String name;
	private Circuit circuit;
	private final static int NUM_KARTS = 3;
	private List<Kart> karts = new ArrayList<Kart>();
	private List<Kart> finishedKarts = new ArrayList<Kart>();
	
	public Race(String name) {
		this.name = name;
	}
	
	public void run() {
		while(!notAllFinished()) {
			
		}
	}
	
	private boolean notAllFinished() {
		for(Kart kart : karts) {
			if(kart != null) {
				return true;
			}
		}
		return false;
	}
	
	private void moveKart(Kart kart) {
		int movedPositions = 0;
		movedPositions = kart.move() - circuit.difficulty();
		kart.setPosition(kart.getPosition() + movedPositions);
	}
	
	
}
