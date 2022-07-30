package entities;

public class Calification {

	private int id;
	private int score;
	private Plate plate;
	private Waiter waiter;
	private byte calificationType;

	public Calification() {
	}

	public Calification(int id, int score, Plate plate) {
		this.id = id;
		this.score = score;
		this.plate = plate;
		this.calificationType = 1;
	}

	public Calification(int id, int score, Waiter waiter) {
		this.id = id;
		this.score = score;
		this.waiter = waiter;
		this.calificationType = 0;
	}

	public byte getCalificationType() {
		return calificationType;
	}

	public int getIdConsumption() {
		return id;
	}

	public void setIdConsumption(int idConsumption) {
		this.id = idConsumption;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Plate getPlate() {
		return plate;
	}

	public void setPlate(Plate plate) {
		this.plate = plate;
	}

	public Waiter getWaiter() {
		return waiter;
	}
	
	private String toStringPlate() {
		return "Calification{" +"id=" + id +", rating=" + score +", product=" + plate +'}';
	}
	
	private String toStringWaiter() {
		return "Calification{" +"id=" + id +", rating=" + score +", product=" + waiter +'}';
	}
 
	@Override
	public String toString() {
		String varToReturn = "";
		switch (calificationType) {
		case 1: 
			varToReturn = toStringPlate();
			break;
		case 0:
			varToReturn = toStringWaiter();
			break;
		}
		return varToReturn;
	}
}