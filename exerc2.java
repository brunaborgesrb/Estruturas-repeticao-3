/*Programa que receba a idade (de 1 a 120), o peso (de 3 a 300), a altura (0.5 a 2.5),
a cor dos olhos (A para azul, P para preto, V para verde e C para castanho) e a cor dos cabelos (P para
preto, C para Castanho, L para Louro e R para ruivo) de um grupo de pessoas. A quantidade de pessoas
do grupo deve ser informada pelo usuário no início do programa e deve ser obrigatoriamente, no mínimo,
um. O programa deve calcular e exibir:
• A quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 quilos;
• A média das idades das pessoas com altura inferior a 1,50;
• A percentagem de pessoas com olhos azuis entre todas as pessoas analisadas;
• A quantidade de pessoas ruivas e que não possuem olhos azuis. */

Scanner input = new Scanner (System.in);
		int idade, qtdPessoas, cont, contIdade50Peso60 = 0, qtdIdades = 0, contAzul =0;
                int contRuivoNaoAzul = 0;
		double peso, altura, mediaIdades, somaIdades = 0, percAzul;
		char olhos, cabelos;
                 System.out.println("informe a quantidade de pessoas do grupo:");
                qtdPessoas = input.nextInt();
                while (qtdPessoas < 1) {
                    System.out.print("quantidade inválida. informe valor maior que zero:");
                    qtdPessoas = input.nextInt();
                }
                for (cont = 1; cont <= qtdPessoas; cont = cont+1){
        System.out.println("informe a idade:");
        idade = input.nextInt();
        while (idade <1 || idade > 120){
            System.out.println("idade inválida. informe a idade de 1 a 120:");
        idade = input.nextInt();
        }
        System.out.println("informe o peso:");
        peso = input.nextDouble();
         while (peso < 3 || peso > 300){
        System.out.println("peso inválido. informe o peso de 3 a 300:");
        peso = input.nextDouble();
         }
        
        System.out.println("informe a altura:");
        altura = input.nextDouble();
        while (altura < 0.5 || altura > 2.5){
        System.out.println("altura inválida. informe a altura de 0,5 a 2,5:");
        altura = input.nextDouble();
        }
        
        System.out.println("informe a cor dos olhos:");
        olhos = input.next().charAt(0);
        olhos = Character.toUpperCase(olhos);
        while (olhos != 'A' && olhos != 'P' && olhos != 'V' && olhos != 'C'){
        System.out.println("olhos inválidos. informe A, P, V ou C para cor dos olhos:");
        olhos = input.next().charAt(0);
        olhos = Character.toUpperCase(olhos);
        }
        System.out.println("informe a cor dos cabelos:");
        cabelos = input.next().charAt(0);
        cabelos = Character.toLowerCase(cabelos);
        while (cabelos != 'p' && cabelos != 'c' && cabelos != 'l' && cabelos != 'r'){
             System.out.println("cor inválida. informe P, C, L ou R para a cor dos cabelos:");
        cabelos = input.next().charAt(0);
        cabelos = Character.toLowerCase(cabelos);
        }
        if (idade > 50 && peso < 60){
            contIdade50Peso60 = contIdade50Peso60 +1;
            }
        if (altura < 1.50) {
            qtdIdades = qtdIdades +1;
            somaIdades = somaIdades + idade;
        }
        if (olhos == 'A'){
            contAzul = contAzul + 1;
        }
        if (cabelos == 'r' && olhos != 'A'){
            contRuivoNaoAzul =  contRuivoNaoAzul + 1;
        }
        
            }//fim do for
                
        System.out.println("qts de pessoas com idade maior que 50 e peso menor que 60: " + contIdade50Peso60);
        if (qtdIdades != 0) {
        mediaIdades = somaIdades / qtdIdades;
        System.out.println("média das idades de pessoas com menos de 1.50 é: " + mediaIdades);
                }
        else {
            System.out.println("ninguém tem altura menor que 1,50");
        }
        percAzul = (contAzul * 100.0) / qtdPessoas;
        System.out.println("percentual de pessoas com olhos azuis: " + percAzul);
        System.out.println("quantidade de pessoas ruivas de olhos não azuis: " + contRuivoNaoAzul); 
        }
}

