package Q14;
public class Logger{
	public static String registrosLog;
	
	public static void logInfo(String info){
		registrosLog += "Info: " + info + '\n';
	}
	public static void logAviso(String aviso){
		registrosLog += "Aviso: " + aviso + '\n';
	}
	public static void logErro(String erro){
		registrosLog += "Erro: " + erro + '\n';
	}
	
	public String getRegistrosLog(){
		return registrosLog;
	}
}
