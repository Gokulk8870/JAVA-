package Session_6;

public class GrantChildCompany extends BranchCompany1 implements  SubMiniBranch {

		

		@Override
		public void extraMemebers() {
			System.out.println("500 employees extra");
			
		}
		public static void main(String args[]) {
			GrantChildCompany gcc=new GrantChildCompany();
			gcc.parentCompany();
			gcc.branchMetod1();

			gcc.extraMemebers();
		}
		
}
