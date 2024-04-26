import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.plaf.OptionPaneUI;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * A classe <i>leDadosWin</i> permite a leitura de dados de tipos nativos e de
 * instancias da classe <i>String</i> a partir do teclado, atraves de uma
 * janela. Basicamente esta classe encapsula o funcionamento dos metodos da clase
 * <i>JOptionPane</i>, que pode ser usado como entrada padrao de dados.
 * <ul>
 * <li>Os metodos sao estaticos para facilitar o uso da classe
 * <li>Criacao de metodos sobrecarregados para que valores <i>default</i> possam ser
 *     usados
 * <li>Tratamento das excecoes
 * </ul>
 */
public class InOut extends JOptionPane{

	static ImageIcon icon = new ImageIcon(InOut.class.getResource("oraculo.png"));
	static Image newIcon = icon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
	static ImageIcon resizedIcon = new ImageIcon(newIcon);

	public static String leString (String frase){
		String Entrada;
		Entrada = (String) JOptionPane.showInputDialog(null, frase, "Poo Bet", JOptionPane.QUESTION_MESSAGE, resizedIcon, null, null);
		return Entrada;
	}

	/**
	 * Este metodo eh para entrada de um objeto do tipo byte. Tem como parametro
	 * de entrada uma String que indicara para o usuario qual o dado que sera
	 * lido naquele momento por aquela caixa de texto.
	 * Le entao uma String e a converte para um objeto do tipo byte.
	 * Se na conversao ocorrer algum erro, o processo sera feito novamente,
	 * ou seja, sera lida outra String e convertida para byte. O processo soh
	 * para quando a conversao for bem sucedida.
	 *
	 * @param frase que sera usada para o usuario saber qual dado sera lido
	 * @return um objeto do tipo byte
	 */
	public static byte leByte (String frase){
		byte num = 0;
		String Entrada;
		boolean ERRO;

		do{
			try{
				Entrada = (String) JOptionPane.showInputDialog (null, frase, "Entrada de dados", JOptionPane.QUESTION_MESSAGE, resizedIcon, null, null);
				num = Byte.parseByte(Entrada);
				ERRO = false;
			}
			catch(NumberFormatException e){

				JOptionPane.showMessageDialog(null, "VALOR DEVE SER UM NUMERO DO TIPO " +
								"BYTE", "   >>>      ERRO     <<<",
						JOptionPane.ERROR_MESSAGE);
				ERRO = true;
			}
		}while (ERRO);
		return num;
	}

	/**
	 * Este metodo eh para entrada de um objeto do tipo short. Tem como parametro
	 * de entrada uma String que indicara para o usuario qual o dado que sera
	 * lido naquele momento por aquela caixa de texto.
	 * Le entao uma String e a converte para um objeto do tipo short.
	 * O processo so para quando a conversao for bem sucedida.
	 *
	 * @param frase que sera usada para o usuario saber qual dado sera lido
	 * @return um objeto do tipo short
	 */
	public static short leShort (String frase){
		short num=0;
		String Entrada;
		ImageIcon icon = new ImageIcon("Tigrinho.png");
		boolean ERRO;

		do{
			try{
				Entrada = (String) JOptionPane.showInputDialog (null, frase, "Entrada de dados", JOptionPane.QUESTION_MESSAGE, resizedIcon, null, null);
				num = Short.parseShort(Entrada);
				ERRO = false;
			}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "VALOR DEVE SER UM NUMERO DO TIPO " +
								"SHORT", "   >>>      ERRO     <<<",
						JOptionPane.ERROR_MESSAGE);
				ERRO = true;
			}
		}while (ERRO);
		return num;
	}

	/**
	 * Este metodo eh para entrada de um objeto do tipo int. Tem como parametro
	 * de entrada uma String que indicara para o usuario qual o dado que sera
	 * lido naquele momento por aquela caixa de texto.
	 * Le entao uma String e a converte para um objeto do tipo int.
	 * O processo so para quando a conversao for bem sucedida.
	 *
	 * @param frase que sera usada para o usuario saber qual dado sera lido
	 * @return um objeto do tipo int
	 */
	public static int leInt (String frase){
		int num = 0;
		String Entrada;
		ImageIcon icon = new ImageIcon("Tigrinho.png");
		boolean ERRO;

		do{
			try{
				Entrada = (String) JOptionPane.showInputDialog (null, frase, "Entrada de dados", JOptionPane.QUESTION_MESSAGE, resizedIcon, null, null);
				num = Integer.parseInt(Entrada);
				ERRO = false;
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null, "VALOR DEVE SER UM NUMERO DO TIPO " +
								"INTEIRO ", "   >>>      ERRO     <<<",
						JOptionPane.ERROR_MESSAGE);
				ERRO = true;
			}
		}while (ERRO);
		return num;
	}

	/**
	 * Este metodo eh para entrada de um objeto do tipo long. Tem como parametro
	 * de entrada uma String que indicara para o usuario qual o dado que sera
	 * lido naquele momento por aquela caixa de texto.
	 * Le entao uma String e a converte para um objeto do tipo long.
	 * O processo so para quando a conversao for bem sucedida.
	 *
	 * @param frase que sera usada para o usuario saber qual dado sera lido
	 * @return um objeto do tipo long
	 */
	public static long leLong (String frase){
		long num = 0;
		String Entrada;
		ImageIcon icon = new ImageIcon("Trigrinho.png");
		boolean ERRO;

		do{
			try{
				Entrada = (String)JOptionPane.showInputDialog (null, frase, "Entrada de dados", JOptionPane.QUESTION_MESSAGE, resizedIcon, null, null);
				num = Long.parseLong(Entrada);
				ERRO = false;
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null, "VALOR DEVE SER UM NUMERO DO TIPO " +
								"LONG ", "   >>>      ERRO     <<<",
						JOptionPane.ERROR_MESSAGE);
				ERRO = true;
			}
		}while (ERRO);
		return num;
	}

	/**
	 * Este metodo eh para entrada de um objeto do tipo float. Tem como parametro
	 * de entrada uma String que indicara para o usuario qual o dado que sera
	 * lido naquele momento por aquela caixa de texto.
	 * Le entao uma String e a converte para um objeto do tipo float.
	 * O processo so para quando a conversao for bem sucedida.
	 *
	 * @param frase que sera usada para o usuario saber qual dado sera lido
	 * @return um objeto do tipo float
	 */
	public static float leFloat (String frase){
		float num = 0;
		String Entrada;
		ImageIcon icon = new ImageIcon("Trigrinho.png");
		boolean ERRO;

		do{
			try{
				Entrada = (String) JOptionPane.showInputDialog (null, frase, "Entrada de dados", JOptionPane.QUESTION_MESSAGE, resizedIcon, null, null);
				num = Float.parseFloat(Entrada);
				ERRO = false;
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null, "VALOR DEVE SER UM NUMERO DO TIPO " +
								"FLOAT", "   >>>      ERRO     <<<",
						JOptionPane.ERROR_MESSAGE);
				ERRO = true;
			}
		}while (ERRO);
		return num;
	}

	/**
	 * Este metodo eh para entrada de um objeto do tipo double. Tem como paraametro
	 * de entrada uma String que indicara para o usuario qual o dado que sera
	 * lido naquele momento por aquela caixa de texto.
	 * Le entao uma String e a converte para um objeto do tipo double.
	 * O processo so para quando a conversao for bem sucedida.
	 *
	 * @param frase que sera usada para o usuario saber qual dado sera lido
	 * @return um objeto do tipo double
	 */
	public static double leDouble (String frase){
		double num = 0;
		String Entrada;
		ImageIcon icon = new ImageIcon("Trigrinho.png");
		boolean ERRO;

		do{
			try{
				Entrada = (String)JOptionPane.showInputDialog (null, frase, "Entrada de dados", JOptionPane.QUESTION_MESSAGE, resizedIcon, null, null);
				num = Double.parseDouble(Entrada);
				ERRO = false;
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null, "VALOR DEVE SER UM NUMERO DO TIPO " +
								"DOUBLE", "   >>>      ERRO     <<<",
						JOptionPane.ERROR_MESSAGE);
				ERRO = true;
			}
		}while (ERRO);
		return num;
	}

	/**
	 * Este metodo eh para entrada de um objeto do tipo char. Tem como parametro
	 * de entrada uma String que indicara para o usuario qual o dado que sera
	 * lido naquele momento por aquela caixa de texto.
	 * Le entao uma String e retorna apenas o primeiro caracter da String.
	 *
	 * @param frase que sera usada para o usuario saber qual dado sera lido
	 * @return um objeto do tipo char
	 */
	public static char leChar (String frase){
		String Entrada;
		ImageIcon icon = new ImageIcon("Trigrinho.png");
		boolean ERRO;

		do{
			Entrada = (String) JOptionPane.showInputDialog (null, frase, "Entrada de dados", JOptionPane.QUESTION_MESSAGE, resizedIcon, null, null);
			if (Entrada.length()!= 0)
				ERRO = false;
			else
				ERRO = true;
		}while (ERRO);
		return Entrada.charAt(0);
	}

	/**
	 * Este metodo foi criado para mandar uma mensagem com o icone de
	 * ERRO
	 *
	 * @param cabecalho que aparecera no topo da mensagem
	 * @param frase     que aparecera dentro da caixa de mensagem
	 */
	public static void MsgDeErro(String cabecalho, String frase){
		JOptionPane.showMessageDialog(null, frase, cabecalho,  JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * Este metodo foi criado para mandar uma mensagem com o icone de
	 * INFORMACAO
	 *
	 * @param cabecalho que aparecer no topo da mensagem
	 * @param frase     que aparecera dentro da caixa de mensagem
	 */
	public static void MsgDeInformacao(String cabecalho, String frase){
		JOptionPane.showMessageDialog(null, frase, cabecalho, JOptionPane.INFORMATION_MESSAGE, resizedIcon);
	}

	/**
	 * Este metodo foi criado para mandar uma mensagem sem icone 
	 *
	 * @param cabecalho que aparecera no topo da mensagem
	 * @param frase     que aparecera dentro da caixa de mensagem
	 */
	public static void MsgSemIcone(String cabecalho, String frase){
		JOptionPane.showMessageDialog(null, frase, cabecalho, JOptionPane.PLAIN_MESSAGE);
	}

	/**
	 * Este metodo foi criado para mandar uma mensagem com o icone de
	 * AVISO
	 *
	 * @param cabecalho que aparecera no topo da mensagem
	 * @param frase     que aparecera dentro da caixa de mensagem
	 */
	public static void MsgDeAviso (String cabecalho, String frase){
		JOptionPane.showMessageDialog(null, frase, cabecalho, JOptionPane.WARNING_MESSAGE);
	}


	/**
	 * Exemplos...
	 * @param args : Entrada de dados do cmd
	 */
	public static void main(String [] args){
		String nome = leString("Digite o seu nome: ");
		int idade = leInt("Digite a sua idade: ");

		MsgDeInformacao("MsgDeInformacao", nome + " tem " + idade + " anos." );
		MsgSemIcone("MsgSemIcone", nome + " tem " + idade + " anos." );
		MsgDeAviso("MsgDeAviso", nome + " tem " + idade + " anos." );
	}
}
