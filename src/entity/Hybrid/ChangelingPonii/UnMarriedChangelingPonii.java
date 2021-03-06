package entity.Hybrid.ChangelingPonii;

import DevTSK.Util.Day;

public class UnMarriedChangelingPonii extends ChangelingPonii {

	public UnMarriedChangelingPonii(String Name, String AlternateName, String Flag, Boolean Gender, String Description, String ManeColour, String TailColour, String Mother, String Father, Day bday, String Imagename) {
		this.name = Name;
		this.Gender = Gender;
		this.description = "\nChangeling Ponii" + Description;
		this.colour = ManeColour;
		this.anotherColour = TailColour;
		this.mother = Mother;
		this.father = Father;
		this.birthday = bday;

		this.imagepath = Imagename;
		this.altName = AlternateName;

		this.flag = Flag;
	}

	@Override
	public String toString(Day offset) {
		String vpni = "";
		if (otherBoolean)
			vpni = "\nIs a Vamponii";
		String s = "Name : " + name + " AKA " + altName +
				"\nAge : " + offset.yearsFrom(birthday) +
				"\n\n" + super.getGender() +
				"\n\n" + description + vpni +
				"\nMane : " + colour + "\nTail : " + anotherColour +
				"\nBirthday : " + birthday.getMonth() + " " + birthday.getDay() + " " + birthday.getYear() +
				"\n\nMother : " + mother + "\nFather : " + father +
				"\nFlag : '" + flag + "'" +
				"\n::End Of Changeling::";
		return s;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getAltName() {
		return altName;
	}

	@Override
	public String getImagePath() {
		return imagepath;
	}

	@Override
	public String getAltImagePath() {
		return altimagepath;
	}
}
