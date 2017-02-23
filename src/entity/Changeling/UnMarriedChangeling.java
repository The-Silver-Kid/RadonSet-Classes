package entity.Changeling;

import DevTSK.Util.Day;

public class UnMarriedChangeling extends Changeling {

	public UnMarriedChangeling(String Name, String AlternateName, String Flag, Boolean Gender, Boolean IsVamponii, String Description, String CutiiMarkInfo, String ManeColour, String TailColour, String Mother, String Father, Day bday, String Imagename, String CutiimarkImage) {
		this.name = Name;
		this.Gender = Gender;
		this.otherBoolean = IsVamponii;
		this.description = Description;
		this.colour = ManeColour;
		this.anotherColour = TailColour;
		this.mother = Mother;
		this.father = Father;
		this.birthday = bday;

		this.imagepath = Imagename;
		this.altimagepath = CutiimarkImage;
		this.additionalInfo = CutiiMarkInfo;
		this.altName = AlternateName;

		this.flag = Flag;
	}

	@Override
	public String getAltImagePath() {
		return altimagepath;
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
	public String getName() {
		return name;
	}

	@Override
	public String toString(Day offset) {
		String s = "Name : " + name + " AKA " + altName +
				"\nAge : " + offset.yearsFrom(birthday) +
				"\n\n" + super.getGender() +
				"\n\n" + description +
				"\nMane : " + colour + "\nTail : " + anotherColour +
				"\nBirthday : " + birthday.getMonth() + " " + birthday.getDay() + " " + birthday.getYear() +
				"\n\nCutii Mark : " + additionalInfo +
				"\n\nMother : " + mother + "\nFather : " + father +
				"\nFlag : '" + flag + "'" +
				"\n::End Of Changeling::";
		return s;
	}

}
