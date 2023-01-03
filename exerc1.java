/*Uma determinada empresa deseja conceder um aumento de salário a seus funcionários. O ajuste
salarial deve obedecer à seguinte tabela:

Salário Atual                              Ação

Até R$ 1500,00                           Aumento de 20%
Acima de R$ 1500,00 até R$ 2.500,00      Aumento de 15%
Acima de R$ 2.500,00 até R$ 4.000,00     Aumento de 10%
Acima de 4.000,00                        Aumento de 5%
Implemente um programa para solicitar ao usuário que informe o salário atual dos funcionários. O
programa deve calcular o aumento e o novo salário dos funcionários. */

Scanner input = new Scanner (System.in);
    	double salAtual, aumento, novoSal = 0;
    	char resp = 'S';
    	do {
   			 System.out.println("informe o seu salário atual: ");
            	salAtual = input.nextDouble();
         	while (salAtual <= 1212.0 ) {
       		  System.out.println("salário inválido! informe um salário maior ou igual a R$1212,00 ");
       		  salAtual = input.nextDouble();
         	}
         	if (salAtual <= 1500.0) {
       		  aumento = novoSal*0.20;
             	novoSal = salAtual + aumento;
             	System.out.println("o funcionario terá aumento de R$" + aumento + "e passará a receber" + novoSal);
         	}
         	else if (salAtual > 1500.0 || salAtual <= 2500.0) {
       		  aumento = novoSal*0.15;
       		  novoSal = salAtual + aumento;
       		  System.out.println("o funcionario terá aumento de R$" + aumento + "e passará a receber" + novoSal);
         	}
         	else if (salAtual > 2500.0 || salAtual <= 4000.0) {
       		  aumento = novoSal*0.10;
       		  novoSal = salAtual + aumento;
       		  System.out.println("o funcionario terá aumento de R$" + aumento + "e passará a receber" + novoSal);
         	}
         	else if (salAtual < 4000.0) {
       		  aumento = novoSal*0.05;
       		  novoSal = salAtual + aumento;
       		  System.out.println("o funcionario terá aumento de R$" + aumento + "e passará a receber" + novoSal);
         	}
         	System.out.println("deseja continuar executando o programa? digite S ou N: ");
         	resp = input.next().charAt(0);
         	resp = Character.toUpperCase(resp);
         	while (resp != 'S' && resp != 'N') {
             	System.out.print("resposta inválida. digite S ou N: ");
             	resp = input.next().charAt(0);
              	resp = Character.toUpperCase(resp);

        	 
        	 }
   		 } while (resp == 'S');
    	}
    }
