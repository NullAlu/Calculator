/**
 *
 * @author Christopher, Marco y Pablo
 * 
 * 
 */

public class operaciones {
    private double numero;
    
    public operaciones(double i) {
        this.numero=i;
    }
    
    public double getOp() {
        return numero;
    }
    
    public void setOp(double op) {
        this.numero=numero;
    }
   
    public double operar(String operacion){

        try{
            double d = Double.parseDouble(operacion);
            numero=d;
            return numero;
        } catch(NumberFormatException ex){
            switch(operacion){
                case "sqrt": numero=Math.sqrt(numero);
                case "sin": numero=Math.sin(numero);
                case "cos": numero=Math.cos(numero);
                case "inv": numero=1/numero;
            }
            return numero;            
        }        
    }
    public double operar(String operacion,String operador) {
        switch (operacion) {
            case "+": numero=numero+Double.parseDouble(operador);
            case "-": numero=numero-Double.parseDouble(operador);
            case "*": numero=numero*Double.parseDouble(operador);
            case "/": numero=numero/Double.parseDouble(operador);
        }
        return numero;
    }
    
    static boolean operador2(String operacion) {
        return("+,-,*,/".contains(operacion));
    }
}