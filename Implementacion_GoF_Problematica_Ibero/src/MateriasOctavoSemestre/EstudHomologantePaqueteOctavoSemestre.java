package MateriasOctavoSemestre;

import javax.swing.JOptionPane;

public class EstudHomologantePaqueteOctavoSemestre implements IMateriasOctavoSemestre {
    @Override
    public void materiaAsignada(){
        String pantalla = "";
        pantalla += "OCTAVO SEMESTRE\n\n";
        pantalla += "Estudiante homologante\n";
        pantalla += "Materias asignadas\n\n";
        pantalla += "1. Opción de Grado II\n";        
        pantalla += "2. Práctica Profesional\n";
        pantalla += "3. Ética Profesional\n";
        pantalla += "4. Electiva Diciplinar IV\n";
        
        JOptionPane.showMessageDialog(null,pantalla);
    }
    
    
}
