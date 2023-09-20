package ifsc;

public class MainAnimal {

	public static void main(String[] args) {

		Gato gato = new Gato();
		gato.setComprimento(38f);
		gato.setCor("tricolor");
		gato.setEcossistema("arrisco");
		gato.setNome("xuxuzinho");
		gato.setNumeroDePatas(4);
		gato.setRaca("vira-lata");

		Cachorro cachorro = new Cachorro();
		cachorro.setComprimento(198f);
		cachorro.setCor("dourado");
		cachorro.setEcossistema("Domético(casa)");
		cachorro.setNome("furacão");
		cachorro.setNumeroDePatas(4);
		cachorro.setRaca("Golden retriever");

		System.out.println("CACHORRO");
		System.out.println("Nome: " + cachorro.getNome());
		System.out.println("Comprimento: " + cachorro.getComprimento());
		System.out.println("Cor: " + cachorro.getCor());
		System.out.println("Ecossistema: " + cachorro.getEcossistema());
		System.out.println("Numero de patas: " + cachorro.getNumeroDePatas());
		System.out.println("Raça: " + cachorro.getRaca());
		cachorro.late();
		cachorro.caminha();

		System.out.println("GATO");
		System.out.println("Nome: " + gato.getNome());
		System.out.println("Comprimento: " + gato.getComprimento());
		System.out.println("Cor: " + gato.getCor());
		System.out.println("Ecossistema: " + gato.getEcossistema());
		System.out.println("Numero de patas: " + gato.getNumeroDePatas());
		System.out.println("Raça: " + gato.getRaca());
		gato.mia();
		gato.caminha();
	}
}