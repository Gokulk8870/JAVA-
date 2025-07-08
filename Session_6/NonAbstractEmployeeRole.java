package Session_6;

public class NonAbstractEmployeeRole extends AbstractEmployeeEx{
	//explicit overriding
	@Override
	public void futureDesignation() {
		System.out.println("Future Designation:Full -stack Developer");
		
	}
	public static void main(String[] args) {
		NonAbstractEmployeeRole nmr=new NonAbstractEmployeeRole();
		
		nmr.name();
		nmr.designation();	
		nmr.futureDesignation();
	}
	
}
