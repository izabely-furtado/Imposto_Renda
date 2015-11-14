/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cdp;

/**
 *
 * @author IzabelyFurtado
 */
public abstract class CalculaImpostoStrategy implements ICalculaImposto{
    protected double limiteInferior;
    protected double limiteSuperior;
    protected double aliquota;
    
    CalculaImpostoStrategy(double limInferior, double limSuperior, double aliquota){
        this.limiteInferior = limInferior;
        this.limiteSuperior = limSuperior;
        this.aliquota = aliquota;
    }
    
    public double getLimInferior(){
        return this.limiteInferior;
    }
    
    public double getLimSuperior(){
        return this.limiteSuperior;
    }
    
    
    @Override
    public double calcularImpostoRenda(double salario){
        if (salario >= this.limiteInferior && salario <= this.limiteSuperior){
            return salario * this.aliquota;
        }
        else{
            throw new UnsupportedOperationException("Salário não pertence a esta faixa \n" + this.toString());
        }
    }
    
    @Override
    public String toString(){
        return "O limite para o salário entrar na faixa: \n" + 
               "Inferior: R$ " + this.limiteInferior + " - Superior: R$ " + this.limiteSuperior + 
               "Este salário sofrerá uma aliquota de " + this.aliquota * 100 + "% \n";
    }
}
