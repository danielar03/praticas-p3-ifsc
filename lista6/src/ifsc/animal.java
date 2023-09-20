package ifsc;

public class animal {
	
	private String nome;
	private String raca;
	private String cor;
	private String ecossistema;
	private float comprimento;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getEcossistema() {
		return ecossistema;
	}
	public void setEcossistema(String ecossistema) {
		this.ecossistema = ecossistema;
	}
	public float getComprimento() {
		return comprimento;
	}
	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}
	public Integer getNumeroDePatas() {
		return numeroDePatas;
	}
	public void setNumeroDePatas(Integer numeroDePatas) {
		this.numeroDePatas = numeroDePatas;
	}
	private Integer numeroDePatas;
	
	public void caminha(){

		System.out.println("tuctuc");

		}
	
}
