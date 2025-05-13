package week3.day3;

public class JavaConnection1 extends MySqlConnection {
	
	@Override
	public void connect() {
		System.out.println("Connecting to MySql Database");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("DisConnecting from MySql Database");
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Update is executed in MySql Database");
	}

	@Override
	public void executeQuery() {
		// TODO Auto-generated method stub
		System.out.println("Query is executed in MySql Database");
	}
	
	public static void main(String[] args) {
		JavaConnection1 connection1 = new JavaConnection1();
		connection1.connect();
		connection1.executeUpdate();
		connection1.executeQuery();
		connection1.disconnect();
	}
	
	
	

}
