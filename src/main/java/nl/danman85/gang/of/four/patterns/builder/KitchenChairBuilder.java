package nl.danman85.gang.of.four.patterns.builder;

public class KitchenChairBuilder implements ChairBuilder {

	private Chair chair;
	
	public KitchenChairBuilder(final Chair chair ) {
		this.chair = chair;
	}

	@Override
	public void buildLegType() {
		this.chair.setLegType("Straight legs");
	}

	@Override
	public void buildSeat() {
		this.chair.setSeat("Wooden curved seat");
	}

	@Override
	public void buildArmRests() {
		this.chair.setArmRests("Plain wooden armrests");
	}

	@Override
	public void varnishChair() {
		this.chair.setVarnished(true);
	}

	@Override
	public void setAmountOfLegs() {
		this.chair.setLegCount(4);
	}

	@Override
	public Chair getChair() {
		return this.chair;
	}

}
