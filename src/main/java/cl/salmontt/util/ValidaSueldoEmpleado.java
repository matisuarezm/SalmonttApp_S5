package cl.salmontt.util;

public class ValidaSueldoEmpleado {

    /**
     * Método que valida que el sueldo sea mayor 0
     * @param sueldo Sueldo mensual
     * @throws IllegalArgumentException si el sueldo es negativo
     */
    public static void validar(double sueldo){
        if (sueldo < 0){
            throw new IllegalArgumentException("El sueldo no puede ser menor a 0.");
        }
    }
}
