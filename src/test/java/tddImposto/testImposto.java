package tddImposto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import cdp.CalcImpostoFaixa1;
import cdp.CalcImpostoFaixa2;
import cdp.CalcImpostoFaixa3;
import cdp.CalcImpostoFaixa4;
import cdp.CalcImpostoFaixa5;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author IzabelyFurtado
 */
public class testImposto {
    
    public testImposto() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Test
    public void CalculaImposto1(){
        CalcImpostoFaixa1 f1 = new CalcImpostoFaixa1();
        assertEquals(0, f1.calcularImpostoRenda(1000), 0.1);
    }
    
    @Test
    public void CalculaImposto11(){
        CalcImpostoFaixa1 f1 = new CalcImpostoFaixa1();
        assertEquals(0, f1.calcularImpostoRenda(1710.78), 0.1);
    }
    
    @Test
    public void CalculaImposto12(){
        CalcImpostoFaixa1 f1 = new CalcImpostoFaixa1();
        assertEquals(0, f1.calcularImpostoRenda(0), 0.1);
    }
    
    @Test
    public void CalculaImposto2(){
        CalcImpostoFaixa2 f2 = new CalcImpostoFaixa2();
        double imposto = 2000*0.075;
        assertEquals(imposto, f2.calcularImpostoRenda(2000), 0.1);
    }
    
    @Test
    public void CalculaImposto21(){
        CalcImpostoFaixa2 f2 = new CalcImpostoFaixa2();
        double imposto = 1710.79*0.075;
        assertEquals(imposto, f2.calcularImpostoRenda(1710.79), 0.1);
    }
    
    @Test
    public void CalculaImposto22(){
        CalcImpostoFaixa2 f2 = new CalcImpostoFaixa2();
        double imposto = 2563.91*0.075;
        assertEquals(imposto, f2.calcularImpostoRenda(2563.91), 0.1);
    }
    
    @Test
    public void CalculaImposto3(){
        CalcImpostoFaixa3 f3 = new CalcImpostoFaixa3();
        double imposto = 3000*0.15;
        assertEquals(imposto, f3.calcularImpostoRenda(3000), 0.1);
    }
    
    @Test
    public void CalculaImposto31(){
        CalcImpostoFaixa3 f3 = new CalcImpostoFaixa3();
        double imposto = 2563.92*0.15;
        assertEquals(imposto, f3.calcularImpostoRenda(2563.92), 0.1);
    }
    
    @Test
    public void CalculaImposto32(){
        CalcImpostoFaixa3 f3 = new CalcImpostoFaixa3();
        double imposto = 3418.59*0.15;
        assertEquals(imposto, f3.calcularImpostoRenda(3418.59), 0.1);
    }
    
    @Test
    public void CalculaImposto4(){
        CalcImpostoFaixa4 f4 = new CalcImpostoFaixa4();
        double imposto = 4000*0.225;
        assertEquals(imposto, f4.calcularImpostoRenda(4000), 0.1);
    }
    
    @Test
    public void CalculaImposto41(){
        CalcImpostoFaixa4 f4 = new CalcImpostoFaixa4();
        double imposto = 3418.60*0.225;
        assertEquals(imposto, f4.calcularImpostoRenda(3418.60), 0.1);
    }
    
    @Test
    public void CalculaImposto42(){
        CalcImpostoFaixa4 f4 = new CalcImpostoFaixa4();
        double imposto = 4271.59*0.225;
        assertEquals(imposto, f4.calcularImpostoRenda(4271.59), 0.1);
    }
    
    @Test
    public void CalculaImposto5(){
        CalcImpostoFaixa5 f5 = new CalcImpostoFaixa5();
        double imposto = 5000*0.275;
        assertEquals(imposto, f5.calcularImpostoRenda(5000), 0.1);
    }
    
    @Test
    public void CalculaImposto51(){
        CalcImpostoFaixa5 f5 = new CalcImpostoFaixa5();
        double imposto = 4271.59*0.275;
        assertEquals(imposto, f5.calcularImpostoRenda(4271.59), 0.1);
    }
    
    @Test
    public void CalculaImposto52(){
        CalcImpostoFaixa5 f5 = new CalcImpostoFaixa5();
        double imposto = 50000*0.275;
        assertEquals(imposto, f5.calcularImpostoRenda(50000), 0.1);
    }
    
    
    
    
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
