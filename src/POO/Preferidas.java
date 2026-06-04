package POO;

public class Preferidas {
public void avaliar(Audio audio) {
	if(audio.getClassificaçao()>=8) {
		System.out.println(audio.getTitulo()+" é considerado sucesso absoluto"+" e preferido por todos");
	} else {
		System.out.println("A musica "+audio.getTitulo()+" é uma excelente opção para escutar depois");
	}
}
}
