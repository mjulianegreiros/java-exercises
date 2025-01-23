public class InvalidEmailFormatException extends Exception{
	public InvalidEmailFormatException(){
		super();
	}
	public InvalidEmailFormatException(String msg){
		super(msg);
	}
}