public class FinalDemo1 {
	public static void main(String[] args) {
		Company obj = new Company();
		System.out.println(obj.companyName);
	}
}

final class Company {
	final String companyName = "ABC ptv.ltd";
	public final void leavePolicies() {
		System.out.println("Company Leave Policies");
	}
	public final void medicalPolicies() {
		System.out.println("Company Medical Policies");
	}
}
