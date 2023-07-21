package nl.danman85.gang.of.four.patterns.prototype;

public class FullUniform extends PrototypeClothUniformPart {

	private UniformTrousers trousers;
	private UniformJacket jacket;
	
	public FullUniform(UniformTrousers trousers, UniformJacket jacket) {
		super();
		this.trousers = trousers;
		this.jacket = jacket;
	}

	public UniformTrousers getTrousers() {
		return trousers;
	}

	public void setTrousers(UniformTrousers trousers) {
		this.trousers = trousers;
	}

	public UniformJacket getJacket() {
		return jacket;
	}

	public void setJacket(UniformJacket jacket) {
		this.jacket = jacket;
	}

	@Override
	public PrototypeClothUniformPart cloneUniformPart() throws CloneNotSupportedException {

		FullUniform fullUniform = null;
		fullUniform = (FullUniform) super.clone();
		
		UniformTrousers trousers = (UniformTrousers) this.trousers.cloneUniformPart();
		UniformJacket jacket = (UniformJacket) this.jacket.cloneUniformPart();

		fullUniform.setJacket(jacket);
		fullUniform.setTrousers(trousers);
		
		return fullUniform;
	}

	@Override
	public String toString() {
		return "FullUniform [trousers=" + trousers + ", jacket=" + jacket + "]";
	}

}
