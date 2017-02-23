package entity.Changeling;

import DevTSK.Entity.Entity;

public abstract class Changeling extends Entity {

	@Override
	public String getInfo() {
		return "A Ponii is an Entity that is the most common occurrence in Equestria.\n"
				+ "And as such have special Features that other Entities might not have.\n"
				+ "This also results in them having special constructors.";

	}

	public String getGender() {
		String s = "Stallion";
		if (super.Gender)
			s = "Mare";
		return s;
	}
}
