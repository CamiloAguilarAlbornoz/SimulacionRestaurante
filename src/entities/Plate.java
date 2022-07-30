package entities;

public class Plate {
	
    private int idPlate;
    private String plateName;
    private double probability;
    private TypePlate typePlate;

    public Plate(int id, String namePlate, double probability, TypePlate typePlate) {
        this.idPlate = id;
        this.plateName = namePlate;
        this.probability = probability;
        this.typePlate = typePlate;
    }

    public TypePlate getTypePlate() {
		return typePlate;
	}

	public int getIdPlate() {
        return idPlate;
    }

    public void setIdPlate(int id) {
        this.idPlate = id;
    }

    public String getPlateName() {
        return plateName;
    }

    public void setName(String plateName) {
        this.plateName = plateName;
    }

    public double getRatingProbability() {
        return probability;
    }

    public void setRatingProbability(double probability) {
        this.probability = probability;
    }
}