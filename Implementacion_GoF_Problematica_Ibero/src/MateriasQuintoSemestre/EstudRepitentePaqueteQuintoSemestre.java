package MateriasQuintoSemestre;

import javax.swing.JOptionPane;

public class EstudRepitentePaqueteQuintoSemestre implements IMateriasQuintoSemestre {
    @Override
    public void materiaAsignada(){
        String pantalla = "";
        pantalla += "QUINTO SEMESTRE\n\n";
        pantalla += "Estudiante que perdio materias\n";
        pantalla += "Materias asignadas\n\n";
        pantalla += "1. Investigación I\n";
        pantalla += "2. Cálculo Integral\n";
        pantalla += "3. Métodos numéricos\n";
        pantalla += "4. Física Electromagnética\n";
        pantalla += "5. Arquitectura de Software\n";
        pantalla += "6. Fundamentos de Bases de Datos\n";
        pantalla += "7. Electiva Diciplinar I\n";
        pantalla += "8. Repetir Materia 1\n";
        pantalla += "9. Repetir Materia 2\n";
        
        JOptionPane.showMessageDialog(null,pantalla);
    }
    
    
}
