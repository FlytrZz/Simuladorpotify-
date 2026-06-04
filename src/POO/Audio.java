package POO;

public class Audio {
private String titulo;
private int duração;
private int totReproduçoes;
private int totCurtidas;
private int classificaçao;

public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public int getDuração() {
	return duração;
}
public void setDuração(int duração) {
	this.duração = duração;
}
public int getTotReproduçoes() {
	return totReproduçoes;
}
public void setTotReproduçoes(int totReproduçoes) {
	this.totReproduçoes = totReproduçoes;
}
public int getTotCurtidas() {
	return totCurtidas;
}
public void setTotCurtidas(int curtidas) {
	this.totCurtidas = curtidas;
}
public int getClassificaçao() {
	return classificaçao;
}
public void setClassificaçao(int classificaçao) {
	this.classificaçao = classificaçao;
}
public void curtir() {
	this.totCurtidas++;
}
public void reproduz() {
	this.totReproduçoes++;
}
}
