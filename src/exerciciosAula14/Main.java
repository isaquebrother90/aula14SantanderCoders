package exerciciosAula14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// EXERC�CIOS FUNDAMENTOS DA PROGRAMA��O

		/*
		 * 1- d) Algoritmos s�o um conjunto de instru��es finitas e ordenadas.
		 * 
		 * 2- Linguagem de alto n�vel est� muito mais para o programador do que para a
		 * m�quina, onde a sintaxe � muito mais pr�xima da nossa linguagem. Com ela a
		 * perca de performance quando comparada a linguagem de baixo n�vel, devido a
		 * necessidade de interpreta��es at� a m�quina entender o que se quer. Uma das
		 * vantagens � que ela utiliza menos mem�ria do que uma linguagem de baixo
		 * n�vel, gerando menos custos de manuten��o. Linguagem de baixo n�vel est�
		 * muito mais para a m�quina do que para o programador, onde a sintaxe � muito
		 * mais pr�xima da linguagem de m�quina. A grande vantagem � a performance, mas
		 * exigindo um conhecimento muito maior da arquitetura por parte do programador.
		 * 
		 * 3- Escolheria o tipo int (Ocupa 32 bits), o mais adequado para valores
		 * inteiros.O processamento � mais r�pido e economiza mem�ria RAM do que se
		 * usasse um tipo long, que aceita mais n�meros mas ocupam mais espa�o na
		 * mem�ria, no caso 64 bits
		 * 
		 */

		// 4

		// String nome = "Isaque";
		// System.out.println("O nome contido dentro da vari�vel nome � " + nome + ".");

		// 5

		// Scanner usuario = new Scanner(System.in);
		// System.out.println("Digite a sua idade padawan");
		// int recebeUsuario = usuario.nextInt();
		// if(recebeUsuario >= 18) {
		// System.out.println("Olha s�! Voc� � maior de idade, bora tirar a CNH!");
		// }else {
		// System.out.println("Vejo que voc� � menor de idade. Aguarde a maioridade para
		// tirar a CNH.");
		// }



		// 6
		// Scanner entrada = new Scanner(System.in);

		// System.out.println("Fim de semana ou n�o? Escolha uma op��o e descubra!\n ");

		// System.out.println("1 - Segunda-feira ");
		// System.out.println("2 - Ter�a-feira ");
		// System.out.println("3 - Quarta-feira ");
		// System.out.println("4 - Quinta-feira ");
		// System.out.println("5 - Sexta-feira ");
		// System.out.println("6 - S�bado ");
		// System.out.println("7 - Domingo ");

		// int num = entrada.nextInt();
		// switch (num) {
		// case 1:
		// System.out.println("Segunda-feira n�o � fim de semana.");
		// break;
		// case 2:
		// System.out.println("Ter�a-feira n�o � fim de semana.");
		// break;
		// case 3:
		// System.out.println("Quarta-feira n�o � fim de semana.");
		// break;
		// case 4:
		// System.out.println("Quinta-feira n�o � fim de semana.");
		// case 5:
		// System.out.println("Sexta-feira n�o � fim de semana.");
		// break;
		// case 6:
		// System.out.println("S�bado � fim de semana.");
		// break;
		// case 7:
		// System.out.println("Domingo � fim de semana");
		// break;
		// default:
		// System.out.println("N�mero inv�lido");
		// }
		// }

		// 7
		tirarCnh();
		
	}

	public static void tirarCnh() {

		Scanner usuario = new Scanner(System.in);
		int idade, alfabetizacao, horasAulasTeoricas, horasAulasPraticasDiurnas, horasAulasPraticasNoturnas,
				documentoOficialComFoto, cpf, comprovanteResid, coletaEletronica, examesFisPsi;

		System.out.println("Bem vindo ao PERMITIDO ou N�O.");
		System.out.println("Descubra se atende a todos os requisitos legais para dirigir!\n");

		System.out.print("Qual � a sua idade: \n-> ");
		idade = usuario.nextInt();

		System.out.print("Sabe ler e escrever? \n ");
		System.out.print("1 - Sim ");
		System.out.println("2 - N�o \n-> ");
		alfabetizacao = usuario.nextInt();

		System.out.print("Tem documento oficial com foto? \n ");
		System.out.print("1 - Sim ");
		System.out.print("2 - N�o \n-> ");
		documentoOficialComFoto = usuario.nextInt();

		System.out.print("Possui CPF? \n ");
		System.out.print("1 - Sim ");
		System.out.print("2 - N�o \n-> ");
		cpf = usuario.nextInt();

		System.out.print("Possui comprovante de resid�ncia (de at� 90 dias)? \n ");
		System.out.print("1 - Sim ");
		System.out.print("2 - N�o \n-> ");
		comprovanteResid = usuario.nextInt();

		System.out.print("Fez a coleta eletr�nica? (Impress�es digitais, foto e assinatura) \n ");
		System.out.print("1 - Sim ");
		System.out.print("2 - N�o \n-> ");
		coletaEletronica = usuario.nextInt();

		System.out.print("Foi aprovado nos exames m�dico e psicol�gico? \n ");
		System.out.print("1 - Sim ");
		System.out.print("2 - N�o \n-> ");
		examesFisPsi = usuario.nextInt();

		System.out.print("Cumpriu quantas horas no curso te�rico? \n ");
		horasAulasTeoricas = usuario.nextInt();

		System.out.print("Cumpriu quantas horas no curso pr�tico diurno? \n ");
		horasAulasPraticasDiurnas = usuario.nextInt();

		System.out.print("Cumpriu quantas horas no curso pr�tico Noturno? \n ");
		horasAulasPraticasNoturnas = usuario.nextInt();

		if (idade >= 18 && alfabetizacao == 1 && documentoOficialComFoto == 1 && cpf == 1 && comprovanteResid == 1
				&& coletaEletronica == 1 && examesFisPsi == 1 && horasAulasTeoricas == 45
				&& horasAulasPraticasDiurnas == 19 && horasAulasPraticasNoturnas == 1) {
			System.out.println("Parab�ns! Permiss�o para dirigir concedida");
		} else {
			System.out.println("Voc� n�o tem permiss�o para dirigir. Verifique o que faltou e tente novamente.");
		}
	}
}
