package community_organizations;

public class activities_org extends father_org{
	int number_activities;
	boolean govern;
	private static int number_orgs;   

	public activities_org(String name, String location, String directory, 
						String type, int number_beneficiaries,int number_activities,boolean govern) {
		super(name, location, directory, type, number_beneficiaries);
		this.number_activities=number_activities;
		number_orgs++;
	}
	
	public void pri() {
		System.out.println("The number of mashaieh is "+number_activities);
	if(govern==true)
		System.out.println("it is goverment");
	else 
		System.out.println("it is not goverment");
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
