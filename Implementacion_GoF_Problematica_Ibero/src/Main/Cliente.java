package Main;

import Fabricas.*;
import javax.swing.JOptionPane;

public class Cliente {
    //METODO MAIN
    public static void main(String[] args) {
        Aplicacion app = asignarMaterias();
        app.materiaAsignada();
    }
    //MÉTODO PARA SELECCIONAR EL TIPO DE ESTUDIANTE  
    private static Aplicacion asignarMaterias(){        
        Aplicacion app = null;
        AbstractFactory fabrica;
        String mensaje="";
        int opcion;        
        mensaje += "Asignación de Materias\n\n";
        mensaje += "Elija el tipo de estudiante para asignar materias\n\n";
        mensaje += "1. Estudiante Sin Novedades\n";
        mensaje += "2. Homologante\n";
        mensaje += "3. Estudiante que adelanta materias\n";
        mensaje += "4. Estudiante que perdio materias\n";        
        opcion = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        
        switch (opcion){
            case 1 -> {
                fabrica = new FabricaEstudSinNovedad();
                app = new Aplicacion(fabrica);
            }
            case 2 -> {
                fabrica = new FabricaEstudHomologante();
                app = new Aplicacion(fabrica);
            }
            case 3 -> {
                fabrica = new FabricaEstudAdelantador();
                app = new Aplicacion(fabrica);
            }
            case 4 -> {
                fabrica = new FabricaEstudRepitente();
                app = new Aplicacion(fabrica);
            }
        }        
        return app;
    }
}
