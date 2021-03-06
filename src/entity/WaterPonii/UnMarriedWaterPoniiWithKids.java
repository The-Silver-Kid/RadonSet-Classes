package entity.WaterPonii;

import DevTSK.Util.Day;

public class UnMarriedWaterPoniiWithKids extends WaterPonii {

	public UnMarriedWaterPoniiWithKids(String Name, String AlternateName, String Flag, Boolean Gender, Boolean IsVamponii, String Description, String CutiiMarkInfo, String ManeColour, String TailColour, String Mother, String Father, Day bday, String Imagename, String CutiimarkImage, String[] kidNames, String[] kidOtherParent) {
		this.name = Name;
		this.Gender = Gender;
		this.description = "\nWater Ponii" + Description;
		this.colour = ManeColour;
		this.otherBoolean = IsVamponii;
		this.anotherColour = TailColour;
		this.mother = Mother;
		this.father = Father;
		this.birthday = bday;

		this.imagepath = Imagename;
		this.altimagepath = CutiimarkImage;
		this.kidammount = kidNames.length;
		this.kids = kidNames;
		this.with = kidOtherParent;
		this.additionalInfo = CutiiMarkInfo;
		this.altName = AlternateName;

		this.flag = Flag;
	}

	@Override
	public String toString(Day offset) {
		String vpni = "", kdz = "None";
		if (kids.length != 0) {
			kdz = kidammount + "\n";
			for (int i = 0; i < kids.length; i++)
				kdz = kdz + "With : " + with[i] + ":\t" + kids[i] + "\n";
		}
		if (otherBoolean)
			vpni = "\nIs a Vamponii";
		String s = "Name : " + name + " AKA " + altName +
				"\nAge : " + offset.yearsFrom(birthday) +
				"\n\n" + super.getGender() +
				"\n\n" + description + vpni +
				"\nMane : " + colour + "\nTail : " + anotherColour +
				"\nBirthday : " + birthday.getMonth() + " " + birthday.getDay() + " " + birthday.getYear() +
				"\n\nCutii Mark : " + additionalInfo +
				"\n\nMother : " + mother + "\nFather : " + father +
				"\n\nKids : " + kdz +
				"\n\nFlag : '" + flag + "'" +
				"\n::End Of Ponii::";
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
