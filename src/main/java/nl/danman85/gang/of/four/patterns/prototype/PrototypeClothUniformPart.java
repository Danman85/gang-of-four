package nl.danman85.gang.of.four.patterns.prototype;

public abstract class PrototypeClothUniformPart implements Cloneable {

	private String owner;
	private ClothUniformPart clothUniformPart;
	
	public ClothUniformPart getClothUniformPart() {
		return clothUniformPart;
	}

	public void setClothUniformPart(ClothUniformPart clothUniformPart) {
		this.clothUniformPart = clothUniformPart;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String soldierName) {
		this.owner = soldierName;
	}

	public abstract PrototypeClothUniformPart cloneUniformPart() throws CloneNotSupportedException;
}
