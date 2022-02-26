import java.util.ArrayList;
import java.util.List;

public class Race {
	private String name;
	private Circuit circuit;
	private List<Kart> karts = new ArrayList<Kart>();
	private List<Kart> finishedKarts = new ArrayList<Kart>();
	
	public Race(String name) {
		this.name = name;
	}
	
	public void run() {
		while(!notAllFinished()) {
			for(Kart kart : karts) {
				moveKart(kart);
				if(isFinished(kart)) {
					moveToFinished(kart);
				}
			}
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
	
	private boolean isFinished(Kart kart) {
		if(kart.getPosition() >= this.circuit.getDistance()) {
			return true;
		}
		
		return false;
	}
	
	private void moveToFinished(Kart kart) {
		int pos = this.karts.indexOf(kart);
		
		if(pos >= 0) {
			karts.remove(pos);
			finishedKarts.add(kart);
		}

	}
	
	public void addKart(Kart kart) {
		karts.add(kart);
	}
	
	public void setCircuit(Circuit circuit) {
		this.circuit = circuit;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Race: ");
		sb.append(this.name);
		sb.append("\nCircuit: ");
		sb.append(this.circuit.toString());
		for(Kart k : karts) {
			sb.append(karts.indexOf(k) + 1);
			sb.append(".-");
			sb.append(k.toString());
		}
		
		return sb.toString();
	}
	
	public String showResult() {
		StringBuilder sb = new StringBuilder();
		sb.append("Race: ");
		sb.append(this.name);
		sb.append("\nCircuit: ");
		sb.append(this.circuit.toString());
		for(Kart k : finishedKarts) {
			sb.append(finishedKarts.indexOf(k) + 1);
			sb.append(".-");
			sb.append(k.toString());
		}
		
		return sb.toString();
	}
	
}
