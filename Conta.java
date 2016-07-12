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
public class Conta {
    private int numeroConta;
    private double saldo;
    private double limite;
    private Cliente titular;
    static int contador;

    public Conta(){
        contador+=1;
    }
    public static int getContador() {
        return contador;
    }
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String getTitular() {
        return titular.nome;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    public void deposita(double valor){
        this.saldo+=valor;
    }
    public void saca(double valor){
        this.saldo -=valor;
    }
    
    public void atualiza(double taxa){
        this.saldo+=this.saldo*taxa;
    }
}
