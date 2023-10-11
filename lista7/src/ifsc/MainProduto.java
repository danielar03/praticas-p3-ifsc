package ifsc;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {
		
		ArrayList<Desktop> computadores = new ArrayList<>();
		
		Desktop pc = new Desktop();
		pc.setCodBarras(387437345l);
		pc.setFabricante("apple");
		pc.setGamer(true);
				
		ArrayList<String> pecas = new ArrayList<>();
		
		pecas.add("Mouse");
		pecas.add("Teclado");
		pecas.add("Gabinete");
		pc.setPecas(pecas);
		
		Desktop pc2 = new Desktop();
		pc.setCodBarras(498354l);
		pc.setFabricante("positivo");
		pc.setGamer(false);
				
		ArrayList<String> pecas2 = new ArrayList<>();
		pecas2.add("placa de video");
		pecas2.add("placa mae");
		pecas2.add("teclado");
		pc2.setPecas(pecas);
	
		Desktop pc3 =new Desktop();
		pc3.setCodBarras(85438534l);
		pc3.setFabricante("lg");
		pc.setGamer(true);
		
		
		ArrayList<String> pecas3 = new ArrayList<>();
		pecas3.add("placa de video");
		pecas3.add("placa mae");
		pecas3.add("teclado");
		pc3.setPecas(pecas);
		
		Smartphone lg = new Smartphone();
		lg.setCodBarras(57687456l);
		lg.setFabricante("lg");
		lg.setDimensoesTela("polegadas");
		lg.setCor("preto");
		
		Smartphone sansung = new Smartphone();
		sansung .setCodBarras(54854758l);
		sansung .setFabricante("sansung ");
		sansung .setDimensoesTela("polegadas");
		sansung .setCor("branco");
		
		Smartphone apple = new Smartphone();
		apple.setCodBarras(34234344l);
		apple.setFabricante("apple");
		apple.setDimensoesTela("polegadas");
		apple.setCor("roxo");
		
		ArrayList<Smartphone> smartphones = new ArrayList<>();

		smartphones.add(sansung);
		smartphones.add(apple);
		smartphones.add(lg);
		
		System.out.println(smartphones.size());
		
		for (Smartphone smartphone : smartphones) {
			System.out.println(smartphone.getCor());
			System.out.println(smartphone.getDimensoesTela());
			System.out.println(smartphone.getFabricante());
			System.out.println(smartphone.getCodBarras());
		}
	}
	
	

}
