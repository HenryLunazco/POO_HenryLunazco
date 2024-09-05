package clase01;

public class Calculadora_class {
    //Metodos
    public String sumar(String a, String b){
        int resultado = Integer.parseInt(a)+ Integer.parseInt(b);
        return String.valueOf(resultado);
    }
    
    public String restar(String a, String b){
        int resultado = Integer.parseInt(a)- Integer.parseInt(b);
        return String.valueOf(resultado);
    }
    
    public String multiplicar(String a, String b){
        int resultado = Integer.parseInt(a)* Integer.parseInt(b);
        return String.valueOf(resultado);
    }
    
    public String dividir(String a, String b){
        double resultado = Double.parseDouble(a)/ Double.parseDouble(b);
        return String.format("%.2f",resultado);
    }
}
