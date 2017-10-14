package entity.WaterPonii;

import DevTSK.Entity.Entity;

public abstract class WaterPonii extends Entity {

	@Override
	public String getInfo() {
		return "WIP";

	}

	public String getGender() {
		String s = "Stallion";
		if (super.Gender)
			s = "Mare";
		return s;
	}
}
