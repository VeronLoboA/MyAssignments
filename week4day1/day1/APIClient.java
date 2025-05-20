package week4.day1;



public class APIClient {
	public void sendRequest(String endpoint) {
		System.out.println("Sending request to endpoint"+" "+ endpoint);
	}
	public void sendRequest(String endpoint,String requestBody,Boolean requestStatus) {
		System.out.println("Sending request to endpoint"+" "+ endpoint);
		System.out.println("Requesting boday "+ requestBody);
		System.out.println("The Request status is "+ (requestStatus? "Success" : "Failure"));
		
	}
		
public static void main(String[] args) {
	APIClient client = new APIClient();
	client.sendRequest("User");
	client.sendRequest("Users", "Name: Veron", true);
}

}
