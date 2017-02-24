package entity.Changeling;

import DevTSK.Util.Day;

public class MarriedChangeling extends Changeling {

	public MarriedChangeling(String Name, String AlternateName, String Flag, Boolean Gender, String Description, String CutiiMarkInfo, String ManeColour, String TailColour, String Mother, String Father, Day bday, String Imagename, String CutiimarkImage, String MarriedTo, String[] kidNames) {
		this.name = Name;
		this.Gender = Gender;
		this.description = Description;
		this.colour = ManeColour;
		this.anotherColour = TailColour;
		this.mother = Mother;
		this.father = Father;
		this.birthday = bday;
		this.imagepath = Imagename;
		this.altimagepath = CutiimarkImage;
		this.kidammount = kidNames.length;
		this.kids = kidNames;
		this.marriedTo = new String[] { MarriedTo };
		this.additionalInfo = CutiiMarkInfo;
		this.altName = AlternateName;
		this.flag = Flag;
	}

	public MarriedChangeling(String Name, String AlternateName, String Flag, Boolean Gender, String Description, String CutiiMarkInfo, String ManeColour, String TailColour, String Mother, String Father, Day bday, String Imagename, String CutiimarkImage, String[] MarriedTo, String[] kidNames) {
		this.name = Name;
		this.Gender = Gender;
		this.description = Description;
		this.colour = ManeColour;
		this.anotherColour = TailColour;
		this.mother = Mother;
		this.father = Father;
		this.birthday = bday;
		this.imagepath = Imagename;
		this.altimagepath = CutiimarkImage;
		this.kidammount = kidNames.length;
		this.kids = kidNames;
		this.marriedTo = MarriedTo;
		this.additionalInfo = CutiiMarkInfo;
		this.altName = AlternateName;
		this.flag = Flag;
	}

	@Override
	public String toString(Day offset) {
		String partnrs = "", kdz = "None";
		for (int i = 0; i < marriedTo.length; i++)
			if (i == 0) {
				partnrs += " " + marriedTo[i];
			} else if (i != 0) {
				partnrs += ", " + marriedTo[i];
			}
		if (kids.length != 0) {
			kdz = kidammount + "\n";
			for (int i = 0; i < kids.length; i++)
				kdz = kdz + kids[i] + "\n";
		}
		String s = "Name : " + name + " AKA " + altName +
				"\nAge : " + offset.yearsFrom(birthday) +
				"\n\n" + super.getGender() +
				"\n\n" + description +
				"\nMane : " + colour + "\nTail : " + anotherColour +
				"\nBirthday : " + birthday.getMonth() + " " + birthday.getDay() + " " + birthday.getYear() +
				"\n\nMother : " + mother + "\nFather : " + father +
				"\n\nMarried to : " + partnrs +
				"\n\nKids : " + kdz +
				"\n\nFlag : '" + flag + "'" +
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
