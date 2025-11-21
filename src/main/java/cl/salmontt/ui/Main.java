package cl.salmontt.ui;


import cl.salmontt.services.GestorEmpleados;
import cl.salmontt.model.Empleado;

import java.io.InputStream;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Instancia del gestor que controla los Empleados (archivo.xlsx)
        GestorEmpleados gestor = new GestorEmpleados();

        //Obtenemos el InputStream del archivo Excel llamado "Empleados.xlsx" que esta ubicado en resources
        InputStream rutaArchivo = Main.class.getClassLoader().getResourceAsStream("Empleados.xlsx");

        //Validamos que el archivo esté en resoruces, si no arrojamos un mensaje
        if (rutaArchivo == null){
            System.out.println("No se encontro el archivo Empleados.xlsx en resources.");
        }else {
            //Cargamos los datos del archivo excel al gestor para convertirlos en objetos
            gestor.cargarDesdeExcel(rutaArchivo);
        }

        //Filtramos los empleados "administrativo"
        System.out.println(":::::::::EMPLEADOS ADMINISTRATIVOS:::::::::\n");
        List<Empleado> listaDepto = gestor.buscarPorDepartamento("Administrativo");
        for (Empleado empleado : listaDepto){
            System.out.println(empleado);
        }

        //Filtramos los empleados con sueldo mayor a 15000 y traemos algunos de sus datos con los métodos get
        System.out.println(":::::::::MOSTRAR SUELDOS MAYORES A 15000:::::::::\n");
        List<Empleado> SueldosMayor = gestor.sueldoMayorA(1000000);
        for (Empleado empleado : SueldosMayor){
            System.out.println("Nombre: " + empleado.getNombre() + " " + empleado.getApellido());
            System.out.println("Rut:" + empleado.getRut().getTextoRut());
            System.out.println("Email: " + empleado.getEmail());
            System.out.println("Sueldo: " + empleado.getSueldo());
            System.out.println(" ");
        }

        //Listamos todos los empleados que están en el archivo.
        System.out.println("\n:::::::::MOSTRAR TODOS LOS EMPLEADOS:::::::::\n");
        gestor.listarTodos();

    }
}