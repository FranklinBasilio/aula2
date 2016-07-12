/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

/**
 *
 * @author usuario
 */
public class Teste {
    public static void main(String args[]){
        //criando um cliente
        Cliente c1 = new Cliente();
        c1.nome="Tesla";
        c1.setCpf("12345678");
        c1.setEndereco("Rua do programador");
        c1.idade=30;
        
        //criando uma conta
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        conta1.setNumeroConta(1);
        conta1.setLimite(1000);
        conta1.setSaldo(500);
        conta1.setTitular(c1);
        
        //Apresentando os dados anteriormente informados
        System.out.println("Cliente: "+conta1.getTitular());
        System.out.println("Conta: "+conta1.getNumeroConta());
        System.out.println("Saldo: "+conta1.getSaldo());
        System.out.println("Limite: "+conta1.getLimite());
        System.out.println("Numero de Contas Criadas: "+Conta.getContador());
        conta1.deposita(300);
        System.out.println("Saldo atualizado apos deposito: "+conta1.getSaldo());
        conta1.saca(100);
        System.out.println("Saldo atualizado apos saque: "+conta1.getSaldo());
    }
            
}
