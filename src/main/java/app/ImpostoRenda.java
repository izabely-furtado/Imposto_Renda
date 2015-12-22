/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app;

import cdp.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author IzabelyFurtado
 */
public class ImpostoRenda{
    List<CalculaImpostoStrategy> estrategias;
    double salario;
    
    ImpostoRenda(double salario){
        //criando as estrategias
        CalcImpostoFaixa1 f1 = new CalcImpostoFaixa1();
        CalcImpostoFaixa2 f2 = new CalcImpostoFaixa2();
        CalcImpostoFaixa3 f3 = new CalcImpostoFaixa3();
        CalcImpostoFaixa4 f4 = new CalcImpostoFaixa4();
        CalcImpostoFaixa5 f5 = new CalcImpostoFaixa5();
        //setando as estrategias
        this.estrategias = new ArrayList();
        this.estrategias.add(f1);
        this.estrategias.add(f2);
        this.estrategias.add(f3);
        this.estrategias.add(f4);
        this.estrategias.add(f5);
        //setando o salario
        this.salario = salario;
    }

    public double calcularImpostoRenda() {
        double imposto = -1;
        //CalculaImpostoStrategy estrategiaUse;
        //adequando o estrategia a ser usada para o salario
        for (CalculaImpostoStrategy estrategia: this.estrategias){
            if (salario >= estrategia.getLimInferior() && this.salario <= estrategia.getLimSuperior()){
                imposto = estrategia.calcularImpostoRenda(this.salario);
            }
        }
        if(imposto == -1){
            throw new UnsupportedOperationException("Salário negativo não é considerado\n");
        }
        return imposto;
    }
    
    public static void vai(){
        //solicitando valor do salario
        Scanner le = new Scanner(System.in);
        System.out.println("Insira o Salário para o calculo de Imposto de Renda");
        double salario = le.nextDouble();
        
        //criando imposto de renda
        ImpostoRenda ir = new ImpostoRenda(salario);
        double imposto = ir.calcularImpostoRenda();
        System.out.println("Seu salário é de R$ " + salario + " e o imposto é de R$ " + imposto);
    }
}
