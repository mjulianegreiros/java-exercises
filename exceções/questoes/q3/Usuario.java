public class Usuario{
	private int senha;
	private String nome;

	public int getSenha(){
		return this.senha;
	}
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		try{
			if(nome.isEmpty()){
				throw  new NomeInvalidoException("O nome de usuario nao pode ser vazio.");
			}
		}catch(NomeInvalidoException e){
			System.out.println(e.getMessage());
		}
		this.nome = nome;
		
	}
	public void setSenha(int senha) throws SenhaInvalidaException{
		if((senha%1000 == 0){
			throw new SenhaInvalidaExcpetion("A senha não pode iniciar com 0.");
		}
		this.senha = senha;
	}
}