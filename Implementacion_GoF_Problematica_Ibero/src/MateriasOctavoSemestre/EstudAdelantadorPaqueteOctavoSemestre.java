package MateriasOctavoSemestre;

import javax.swing.JOptionPane;

public class EstudAdelantadorPaqueteOctavoSemestre implements IMateriasOctavoSemestre {
    @Override
    public void materiaAsignada(){
        String pantalla = "";
        pantalla += "OCTAVO SEMESTRE\n\n";
        pantalla += "Estudiante que adelanta materias\n";
        pantalla += "Materias asignadas\n\n";
        pantalla += "1. Opción de Grado II\n";
        pantalla += "2. Seguridad y Ciberseguridad Informática\n";
        pantalla += "3. Práctica Profesional\n";
        pantalla += "4. Ética Profesional\n";
        pantalla += "5. Electiva Diciplinar IV\n";
        pantalla += "6. Adelantar Materia 1\n";
        pantalla += "7. Adelantar Materia 2\n";
        
        JOptionPane.showMessageDialog(null,pantalla);
    }
    
    
}
