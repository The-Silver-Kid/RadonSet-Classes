package entity.Changeling;

import DevTSK.Entity.Entity;

public abstract class Changeling extends Entity {

	@Override
	public String getInfo() {
		return "A Changeling is like a Ponii but has both a horn and wings.\n"
				+ "They also have holes through their hooves, wings and horn.\n"
				+ "Live typically 15-30 years longer then poniis.\n"
				+ "Can transform themselves to look like a ponii, dragon or anything.";

	}

	public String getGender() {
		String s = "Stallion";
		if (super.Gender)
			s = "Mare";
		return s;
	}
}
