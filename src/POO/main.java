package POO;

public class main {

	public static void main(String[] args) {
		Musicas m = new Musicas();
		m.setTitulo("Counting Stars");
		m.setArtista("One Republic");
		
		for(int i = 0;i<1000;i++) {
			m.reproduz();
		}
		for(int i =0;i<50;i++) {
			m.curtir();
		}
		
		Podcasts p = new Podcasts();
		p.setTitulo("Bolha Dev");
		p.setApresentador("Marcus Mendes");
		
		for(int i = 0;i<5000;i++) {
			p.reproduz();
		}
		for(int i =0;i<1000;i++) {
			p.curtir();
		}
		
		Preferidas pr = new Preferidas();
		pr.avaliar(p);
		pr.avaliar(m);
		
	}

}
