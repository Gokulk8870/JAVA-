package Session_6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("Argument Length"+args.length);
			if(args.length==3) {
				String name=args[0];
				int age=Integer.parseInt(args[1]);
				double percentage=Double.parseDouble(args[2]);
				
				System.out.println("name:"+name+","+"age:"+age+","+percentage);
			}
			else {
				System.out.println("Index out of bound");
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
