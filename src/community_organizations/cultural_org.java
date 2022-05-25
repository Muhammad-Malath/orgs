package community_organizations;

public class cultural_org extends father_org {
	int number_lecturers;
	boolean library;
	private static int number_orgs;   

	public cultural_org(String name, String location, String directory, String type, 
	            		int number_beneficiaries,int number_lecturers,	boolean library) {
		super(name, location, directory, type, number_beneficiaries);
		this.number_lecturers=number_lecturers;
		number_orgs++;
	}
	
	public void pri() {
		System.out.println("The number of leacturers is "+number_lecturers);
		if(library==true)
			System.out.println("There is a library");
		else 
			System.out.println("There is not a library");
		System.out.println("------------");
	}
	public static void num() {
		System.out.println("The number of cultural organizations is "+number_orgs);
		System.out.println("____________________________________________________________________");

	}
	public void print() {
		super.prin();
		this.pri();
	}
}
