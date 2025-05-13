package week3.day3;

public  class JavaConnection implements DatabaseConnection {
	@Override
	public void connect() {
		System.out.println("Connected to Database using javaconnection");
	}
	@Override
	public void disconnect() {
		System.out.println("DisConnected from Database");
	}
	@Override
	public void executeUpdate() {
		System.out.println("Update executed on the Database");
	}
	public static void main(String[] args) {
		JavaConnection db= new JavaConnection();
		db.connect();
		db.disconnect();
		db.executeUpdate();
	}

}
