/*Programa para obter do usuário um número inteiro maior que zero. O programa
deverá gerar e exibir uma pirâmide de números segundo o exemplo abaixo.
Exemplo: Caso o usuário digite o número 5, o programa deverá exibir a seguinte pirâmide:
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1 */

Scanner input = new Scanner (System.in);
		int cont, N=0;
		System.out.print("informe um número inteiro maior que zero");
		N = input.nextInt();
		while (N > 0) {
		cont = 0;
		while (cont < N) {
			cont = cont +1;
			System.out.print(cont + " ");
		}
		N = N-1;
		System.out.print("");
		} while (N > 0);
