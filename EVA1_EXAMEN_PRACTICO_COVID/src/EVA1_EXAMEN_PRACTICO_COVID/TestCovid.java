/*
 * LUIS RAUL RIVAS SANCHEZ
 */
package EVA1_EXAMEN_PRACTICO_COVID;

/**
 *
 * @author raulr
 */
public class TestCovid{
    private int edad;
    private boolean enfermedadCronica;
    private double peso;
    private double estatura;
    
    //METODOS GET Y SET
    public void setEdad(int valor){
        edad = valor;
    }

    public int getEdad(){
        return edad;
    }

    public void setEnfermedadCronica(boolean valor){
        enfermedadCronica = valor;
    }

    public boolean tieneEnfermedadCronica(){
        return enfermedadCronica;
    }

    public void setPeso(double valor){
        peso = valor;
    }

    public double getPeso(){
        return peso;
    }

    public void setEstatura(double valor){
        estatura = valor;
    }

    public double getEstatura(){
        return estatura;
    }
    //METODO PARA DEFINIR SI ES PERSONA DE RIESGO
    public String calcularPersonaRiesgo(){
        if (edad >= 65 || enfermedadCronica || calcularIMC() > 30){
            return "PERSONA DE RIESGO";
        }else{
            return "PERSONA SIN RIESGO";
        }
    }
    //METODO PARA CALCULAR EL IMC
    private double calcularIMC(){
        if (peso != 0 && estatura != 0){
            return peso / (estatura * estatura);
        }else{
            return 0;
        }
    }
}