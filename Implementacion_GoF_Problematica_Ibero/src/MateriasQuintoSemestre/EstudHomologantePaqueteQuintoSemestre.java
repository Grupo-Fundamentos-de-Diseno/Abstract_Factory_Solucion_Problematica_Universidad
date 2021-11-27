package MateriasQuintoSemestre;

import javax.swing.JOptionPane;

public class EstudHomologantePaqueteQuintoSemestre implements IMateriasQuintoSemestre {
    @Override
    public void materiaAsignada(){
        String pantalla = "";
        pantalla += "QUINTO SEMESTRE\n\n";
        pantalla += "Estudiante homologante\n";
        pantalla += "Materias asignadas\n\n";
        pantalla += "1. Investigación I\n";
        pantalla += "2. Cálculo Integral\n";
        pantalla += "3. Métodos numéricos\n";
        pantalla += "4. Física Electromagnética\n";
        pantalla += "5. Fundamentos de Bases de Datos\n";
        pantalla += "6. Electiva Diciplinar I\n";
        
        JOptionPane.showMessageDialog(null,pantalla);
    }
    
    
}
