package com.mycompany.projetodebanco;
import java.util.Scanner;
public class ProjetoDeBanco {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome;
        double valor = 0;
        double saldo = 0;
        int tipoConta = 0;
        boolean contaCriada = false;
        int executar = 0;
        boolean menu = false;
        int operacao = 0;
        
        
       ProjetoDeBanco cliente1 = new ProjetoDeBanco();
       
        System.out.println("Digite o seu nome : ");
        nome = leitura.next();
        
        System.out.println("Digite o tipo da conta");
        System.out.println("1.Conta corrente");
        System.out.println("2.Conta Poupanca");
        tipoConta = leitura.nextInt();
        if(tipoConta == 1){
            System.out.println("Sua conta é Conta corrente = 1");
        }else if(tipoConta == 2){
            System.out.println("Sua conta é Conta Poupança = 2");
        }else{
                System.out.println("Opção inválida. Tente novamente.");
                tipoConta = leitura.nextInt();
        }

        
        System.out.println("Sua conta é do tipo : " + tipoConta);
        if(tipoConta != 0){
            System.out.println("Conta criada com sucesso !!");
            contaCriada = true;
        }else{
            System.out.println("Conta não aberta");
            contaCriada = false;
        }
        System.out.println("Saldo inicial : " + saldo);
                
        
        if(contaCriada == true){
            System.out.println("---Dados Bancarios---");
            System.out.println("Nome : " + nome);
            System.out.println("Tipo da conta : " + tipoConta);
            System.out.println("Seu saldo atual : " + saldo);
        }
        
        
        System.out.println("Deseja executar ? ");
        System.out.println("1.Sim");
        System.out.println("2.Não");
        executar  = leitura.nextInt();
        
        
        while(operacao != 4) {
 
            if(executar == 1){
            System.out.println("Sera executada");
            menu = true;
            
                System.out.println("----Menu Aberto ----");
                System.out.println("Qual execução deseja fazer ?");
                System.out.println("1. Consultar saldo");
                System.out.println("2. Receber valor");
                System.out.println("3. Transferencia");
                System.out.println("4.Sair");
                System.out.println("--------------------");
                operacao  = leitura.nextInt();

                if(operacao == 1 && contaCriada == true){
                    System.out.println("Seu saldo atual é : " + saldo);
                    System.out.println("Deszeja fazer algo mais ?");
                    System.out.println("1.Sim");
                    System.out.println("2.Não");
                    executar  = leitura.nextInt();
                    if(executar == 1){
                    }else{
                        System.out.println("Finalizado");
                    }

                }
                else if(operacao == 2 && contaCriada == true){
                    System.out.println("Qual valor vai receber ? ");
                    valor = leitura.nextDouble();
                    saldo = valor + saldo;
                    System.out.println("Saldo atual : " + saldo);
                    System.out.println("Deszeja fazer algo mais ?");
                    System.out.println("1.Sim");
                    System.out.println("2.Não");
                    executar  = leitura.nextInt();
                    if(executar == 1){
                    }else{
                        System.out.println("Finalizado");
                    }

                }
                else if(operacao == 3 && contaCriada == true){
                    System.out.println("Quanto deseja transferir ?");
                    valor = leitura.nextDouble();
                    System.out.println("Saldo atual : " + saldo);
                    System.out.println("Valor transferido : " + valor);
                    if(saldo < valor)
                        {
                        System.out.println("Não pode ser um valor maior que o saldo");
                        System.out.println("Deseja fazer algo mais ?");
                        System.out.println("1.Sim");
                        System.out.println("2.Não");
                        executar  = leitura.nextInt();
                            if(executar == 1){
                                System.out.println("Qual operacao deseja fazer ?");
                                menu = true;
                            }else{
                                System.out.println("Finalizado");
                            }
                        }
                    else {
                    saldo = saldo - valor;
                    System.out.println("Saldo atual : " + saldo);
                    System.out.println("Deszeja fazer algo mais ?");
                    System.out.println("1.Sim");
                    System.out.println("2.Não");
                    executar  = leitura.nextInt();
                    if(executar == 1){
                                System.out.println("Qual operacao deseja fazer ?");
                                menu = true;
                    }else{
                        System.out.println("Finalizado");
                    }
                    }
                }

                else if(operacao == 4 && contaCriada == true){
                    System.out.println("Operação fechada");
                    executar = 2;
                } 

                else{
                    System.out.println("Opção invalida, selecione uma opção valida");
                }
        }

        }
        if(executar == 2){
            System.out.println("Ok, sessão finalizada");
            menu = false;
        }else {
                System.out.println("Opção inválida. Tente novamente.");
                executar  = leitura.nextInt();
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
