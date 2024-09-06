/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

/**
 *
 * @author lmfg0
 */
public class Operaciones {

    public Operaciones() {
    }
    
    public double Addition(double a, double b){
        return a + b;
    }
    
    public double Subtraction(double a, double b){
        return a - b;
    }
    
    public double Multiplication(double a, double b){
        return a * b;
    }
    
    public double Divided(double a, double b){
        return a / b;
    }

    public double Sin(double a){
        double radians = Math.toRadians(a);
        return Math.sin(radians);
    }
    
    public double Cos(double a){
        double radians = Math.toRadians(a);
        return Math.cos(radians);
    }
    
    public double Sqrt(double a){
        if (a < 0) {
            return Double.NaN;
        }
        return Math.sqrt(a); 
    }
    
    public double square(double a) {
        return Math.pow(a, 2);
    }
    
    public double logBase10(double a) {
        if (a <= 0) {
            throw new IllegalArgumentException("El argumento debe ser mayor que 0.");
        }
        return Math.log10(a);
    }
}
