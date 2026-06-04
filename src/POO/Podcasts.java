package POO;

public class Podcasts extends Audio{
	private String apresentador;
	private String descriçao;
	
	public String getApresentador() {
		return apresentador;
	}
	public void setApresentador(String apresentador) {
		this.apresentador = apresentador;
	}
	public String getDescriçao() {
		return descriçao;
	}
	public void setDescriçao(String descriçao) {
		this.descriçao = descriçao;
	}
	@Override
	public int getClassificaçao() {
		if(this.getTotCurtidas()>500) {
			return 10;
		} else {
			return 8;
		}
	}
	
	
}
