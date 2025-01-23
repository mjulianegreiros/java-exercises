public class ReceberEmail{
	String email;
	
	public ReceberEmail(String email){
		this.email = email;
	}
	
	public boolean validarEmail() throws InvalidEmailFormatException{
		boolean temArroba = email.contains("@");
		boolean temDotCom = email.endsWith(".com");

		if(!(temArroba) || !(temDotCom)){
				return false;
		}
		return true;
	}
}