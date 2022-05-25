package community_organizations;

public class religious_org extends father_org {
	int number_mashaieh;
	String Science;
	private static int number_orgs;   

	public religious_org(String name, String location, String directory, String type, int number_beneficiaries,int number_mashaieh,String Science) {
		super(name, location, directory, type, number_beneficiaries);
		this.number_mashaieh=number_mashaieh;
		this.Science=Science;
		number_orgs++;
	}
	
	public void pri() {
		System.out.println("The number of mashaieh is "+number_mashaieh);
		System.out.println("The most important science taught in this institution is "+Science);
		System.out.println("------------");
	}
	public static void num() {
		System.out.println("The number of religious organizations is "+number_orgs);
		System.out.println("____________________________________________________________________");

	}
	public void print() {
		super.prin();
		this.pri();
	}
	 
}
