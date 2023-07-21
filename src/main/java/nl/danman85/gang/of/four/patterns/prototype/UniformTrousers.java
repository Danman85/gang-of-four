package nl.danman85.gang.of.four.patterns.prototype;

public class UniformTrousers extends PrototypeClothUniformPart {

	@Override
	public PrototypeClothUniformPart cloneUniformPart() throws CloneNotSupportedException {
		
		UniformTrousers uniformTrousers = null;
		
		try {
			uniformTrousers = (UniformTrousers) super.clone();
		} catch (final CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return uniformTrousers;
	}

	@Override
	public String toString() {
		return "UniformTrousers [clothUniformPart=" + getClothUniformPart() + ", soldierName="
				+ getOwner() + "]";
	}
	
}
