package exerciciosAula14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// EXERCÍCIOS FUNDAMENTOS DA PROGRAMAÇÃO

		/*
		 * 1- d) Algoritmos são um conjunto de instruções finitas e ordenadas.
		 * 
		 * 2- Linguagem de alto nível está muito mais para o programador do que para a
		 * máquina, onde a sintaxe é muito mais próxima da nossa linguagem. Com ela a
		 * perca de performance quando comparada a linguagem de baixo nível, devido a
		 * necessidade de interpretações até a máquina entender o que se quer. Uma das
		 * vantagens é que ela utiliza menos memória do que uma linguagem de baixo
		 * nível, gerando menos custos de manutenção. Linguagem de baixo nível está
		 * muito mais para a máquina do que para o programador, onde a sintaxe é muito
		 * mais próxima da linguagem de máquina. A grande vantagem é a performance, mas
		 * exigindo um conhecimento muito maior da arquitetura por parte do programador.
		 * 
		 * 3- Escolheria o tipo int (Ocupa 32 bits), o mais adequado para valores
		 * inteiros.O processamento é mais rápido e economiza memória RAM do que se
		 * usasse um tipo long, que aceita mais números mas ocupam mais espaço na
		 * memória, no caso 64 bits
		 * 
		 */

		// 4

		// String nome = "Isaque";
		// System.out.println("O nome contido dentro da variável nome é " + nome + ".");

		// 5

		// Scanner usuario = new Scanner(System.in);
		// System.out.println("Digite a sua idade padawan");
		// int recebeUsuario = usuario.nextInt();
		// if(recebeUsuario >= 18) {
		// System.out.println("Olha só! Você é maior de idade, bora tirar a CNH!");
		// }else {
		// System.out.println("Vejo que você é menor de idade. Aguarde a maioridade para
		// tirar a CNH.");
		// }



		// 6
		// Scanner entrada = new Scanner(System.in);

		// System.out.println("Fim de semana ou não? Escolha uma opção e descubra!\n ");

		// System.out.println("1 - Segunda-feira ");
		// System.out.println("2 - Terça-feira ");
		// System.out.println("3 - Quarta-feira ");
		// System.out.println("4 - Quinta-feira ");
		// System.out.println("5 - Sexta-feira ");
		// System.out.println("6 - Sábado ");
		// System.out.println("7 - Domingo ");

		// int num = entrada.nextInt();
		// switch (num) {
		// case 1:
		// System.out.println("Segunda-feira não é fim de semana.");
		// break;
		// case 2:
		// System.out.println("Terça-feira não é fim de semana.");
		// break;
		// case 3:
		// System.out.println("Quarta-feira não é fim de semana.");
		// break;
		// case 4:
		// System.out.println("Quinta-feira não é fim de semana.");
		// case 5:
		// System.out.println("Sexta-feira não é fim de semana.");
		// break;
		// case 6:
		// System.out.println("Sábado é fim de semana.");
		// break;
		// case 7:
		// System.out.println("Domingo é fim de semana");
		// break;
		// default:
		// System.out.println("Número inválido");
		// }
		// }

		// 7
		tirarCnh();
		
	}

	public static void tirarCnh() {

		Scanner usuario = new Scanner(System.in);
		int idade, alfabetizacao, horasAulasTeoricas, horasAulasPraticasDiurnas, horasAulasPraticasNoturnas,
				documentoOficialComFoto, cpf, comprovanteResid, coletaEletronica, examesFisPsi;

		System.out.println("Bem vindo ao PERMITIDO ou NÃO.");
		System.out.println("Descubra se atende a todos os requisitos legais para dirigir!\n");

		System.out.print("Qual é a sua idade: \n-> ");
		idade = usuario.nextInt();

		System.out.print("Sabe ler e escrever? \n ");
		System.out.print("1 - Sim ");
		System.out.println("2 - Não \n-> ");
		alfabetizacao = usuario.nextInt();

		System.out.print("Tem documento oficial com foto? \n ");
		System.out.print("1 - Sim ");
		System.out.print("2 - Não \n-> ");
		documentoOficialComFoto = usuario.nextInt();

		System.out.print("Possui CPF? \n ");
		System.out.print("1 - Sim ");
		System.out.print("2 - Não \n-> ");
		cpf = usuario.nextInt();

		System.out.print("Possui comprovante de residência (de até 90 dias)? \n ");
		System.out.print("1 - Sim ");
		System.out.print("2 - Não \n-> ");
		comprovanteResid = usuario.nextInt();

		System.out.print("Fez a coleta eletrônica? (Impressões digitais, foto e assinatura) \n ");
		System.out.print("1 - Sim ");
		System.out.print("2 - Não \n-> ");
		coletaEletronica = usuario.nextInt();

		System.out.print("Foi aprovado nos exames médico e psicológico? \n ");
		System.out.print("1 - Sim ");
		System.out.print("2 - Não \n-> ");
		examesFisPsi = usuario.nextInt();

		System.out.print("Cumpriu quantas horas no curso teórico? \n ");
		horasAulasTeoricas = usuario.nextInt();

		System.out.print("Cumpriu quantas horas no curso prático diurno? \n ");
		horasAulasPraticasDiurnas = usuario.nextInt();

		System.out.print("Cumpriu quantas horas no curso prático Noturno? \n ");
		horasAulasPraticasNoturnas = usuario.nextInt();

		if (idade >= 18 && alfabetizacao == 1 && documentoOficialComFoto == 1 && cpf == 1 && comprovanteResid == 1
				&& coletaEletronica == 1 && examesFisPsi == 1 && horasAulasTeoricas == 45
				&& horasAulasPraticasDiurnas == 19 && horasAulasPraticasNoturnas == 1) {
			System.out.println("Parabéns! Permissão para dirigir concedida");
		} else {
			System.out.println("Você não tem permissão para dirigir. Verifique o que faltou e tente novamente.");
		}
	}
}
