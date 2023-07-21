package nl.danman85.gang.of.four.patterns.prototype;

public class UniformJacket extends PrototypeClothUniformPart {

	@Override
	public PrototypeClothUniformPart cloneUniformPart() throws CloneNotSupportedException {
		
		UniformJacket uniformJacket = null;
		
		try {
			uniformJacket = (UniformJacket) super.clone();
		} catch (final CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return uniformJacket;
	}

	@Override
	public String toString() {
		return "UniformJacket [clothUniformPart()=" + getClothUniformPart() + ", soldierName()="
				+ getOwner() + "]";
	}

}
