/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package AppControle.util;

/**
 *
 * @author Thiago Carlos
 */


import java.io.File;


public class Main {

	public static void main(String[] args) {
		//String com o caminho do arquivo MP3 a ser tocado
		String path = "C:/AppControle/tok.mp3";

		//Instanciação de um objeto File com o arquivo MP3
		File mp3File = new File(path);

		//Instanciação do Objeto MP3, a qual criamos a classe.
		MP3 musica = new MP3(mp3File);
 
		//Finalmente a chamada do método que toca a música
		musica.play();
	}
}
