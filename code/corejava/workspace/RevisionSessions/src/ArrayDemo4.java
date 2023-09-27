
public class ArrayDemo4 {
	public static void main(String[] args) {
		String name[][];
		name = new String[3][3];
		
		name[0][0] = "Abc";
		name[0][1] = "Xyz";
		name[0][2] = "Lmn";
		
		name[1][0] = "Pqr";
		name[1][1] = "Stu";
		name[1][2] = "Yzx";
		
		name[2][0] = "Mnu";
		name[2][1] = "Qpr";
		name[2][2] = "Xzy";
		
		for(String r[] : name) {
			for(String val : r) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
	}
}
