package practice;

public class Singelton {
	
	private static Singelton instance = null;
	
	public static Singelton getInstance() throws Exception {
		if(instance == null) {
			synchronized (Singelton.class) {
				System.out.println("Instance created");
				instance = new Singelton();
			}
		}
		return instance;
	}
	
	public Singelton() throws Exception{
		if(instance != null) {
			throw new Exception("Instance already exists");
		}
	}
}
