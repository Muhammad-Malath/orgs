package community_organizations;

public abstract class father_org {
	String name;
	String location;
	String directory;
	String type;
	int number_beneficiaries;
	private static int number_orgs;   
	
	public father_org(String name,String location,String directory,String type,int number_beneficiaries) {
		this.name=name;
		this.location=location;
		this.directory=directory;
		this.type=type;
		this.number_beneficiaries=number_beneficiaries;
		number_orgs++;
	}
	
	public void prin() {
		System.out.println("The name of community organization is "+name);
		System.out.println("The location of community organization is "+location);
		System.out.println("The directory of community organization is "+directory);
		System.out.println("The number of beneficiaries from community organization is "+number_beneficiaries);
	}
	public static void num() {
		System.out.println("The number of  organizations is "+number_orgs);
		System.out.println("----THE END----");
	}
}
