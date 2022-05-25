package community_organizations;

public class MAIN {

	public static void main(String[] args) {
		//religious organizations
		
		religious_org r1=new religious_org("ALEZ","next to the garage","Mohammad Bilal Alabrash","religious",1020,27,"alfiqh");
		religious_org r2=new religious_org("AHLULQURAN","Next to the flag circle","Mohammad Hassan Zibn","religious",400,11,"alquran");
		religious_org r3=new religious_org("SABIL ALRASHAD","Next to the bilal Mosque","Abdulmumen Zibn","religious",587,12,"aldawah");
		r1.print();
		r2.print();
		r3.print();
		religious_org.num();

		//cultural organizations
		cultural_org c1=new cultural_org("ALNADI ALSHABABI","Next to the flag circle","Alaa al-bitar","cultural",358,5,true);
		cultural_org c2=new cultural_org("ALNNUBALAA","Next to the Hakim Sweets","Alaa al-bitar","cultural",28,1,false);
		cultural_org c3=new cultural_org("RAQIM","Next to Qasour Al Sham Restaurant","Abo Duraid","cultural",45,3,true);
		c1.print();
		c2.print();
		c3.print();
		cultural_org.num();
		
		//activities organizations
		activities_org a1 =new activities_org("ALMARKAZ ALSABABI","Next to the Al-gahgah circle","Gomaah Al-hamdo","activities",587,9,true);
		activities_org a2 =new activities_org("ALJABAL","Next to the Al-raiee circle","Abo Osman","activities",500,2,false);
		a1.print();
		a2.print();
		activities_org.num();
		
		father_org.num();

	}

}
