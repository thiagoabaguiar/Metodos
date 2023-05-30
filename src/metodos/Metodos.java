/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodos;

/**
 *
 * @author Thiago Aguiar
 */
public class Metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int resultado = Operacoes.soma(4, 3);
        
        System.out.println("A soma é: " + resultado);
        
        System.out.println("O resultado do teste foi: " + (Operacoes.soma(5,(Operacoes.multiplicacao(Operacoes.subtracao(25, 5), Operacoes.divisao(25, 5))))));
        
        
    }
    
}
