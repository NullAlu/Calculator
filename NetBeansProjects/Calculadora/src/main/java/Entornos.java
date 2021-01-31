import java.util.Scanner;

/**
 *
 * @author Christopher, Marco y Pablo
 * 
 * 
 */
public class Entornos {

    public static void main(String[] args) {
        operaciones calc = new operaciones(0);
        Scanner sc = new Scanner(System.in);
               
        while(true){
            System.out.println(""+calc.getOp()+"");
            String op=sc.next();
            if("exit".equals(op)) 
                return;
            
            if(operaciones.operador2(op)){
                String op1=sc.next();
                calc.operar(op, op1);
            }else{
                calc.operar(op);
            }
        }
    }
}