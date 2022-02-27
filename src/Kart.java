import java.util.Random;

public class Kart {
    private String driver;
    private int speed;
    private int acceleration;
    private int position;
    private Random random;
    private final static int MAX_POINTS = 18;
    private final static int MAX_RANDOM = 6;
    
    public Kart(String driver) {
        this.driver = driver;
        init();
    }

    public String getDriver() {
		return driver;
	}

	public int getSpeed() {
		return speed;
	}

	public int getAcceleration() {
		return acceleration;
	}

	public int getPosition() {
		return position;
	}

	public Random getRandom() {
		return random;
	}

	public static int getMaxPoints() {
		return MAX_POINTS;
	}

	public static int getMaxRandom() {
		return MAX_RANDOM;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setAcceleration(int acceleration) {
		this.acceleration = acceleration;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public void setRandom(Random random) {
		this.random = random;
	}

	private void init() {
        this.position = 0;
        this.random = new Random();
        this.speed = random.nextInt(MAX_POINTS);
        this.acceleration = MAX_POINTS - this.speed;
    }
    
    public int move() {
    	int distance = this.speed + this.acceleration + random.nextInt(MAX_RANDOM);
    	return distance;
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Kart [name=");
		builder.append(driver);
		builder.append(", speed=");
		builder.append(speed);
		builder.append(", acceleration=");
		builder.append(acceleration);
		builder.append("]\n");
		return builder.toString();
	}
    
}