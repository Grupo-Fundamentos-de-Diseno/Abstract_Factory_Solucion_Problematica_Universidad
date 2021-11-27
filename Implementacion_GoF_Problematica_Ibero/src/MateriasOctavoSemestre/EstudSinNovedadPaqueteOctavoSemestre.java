package MateriasOctavoSemestre;

import javax.swing.JOptionPane;

public class EstudSinNovedadPaqueteOctavoSemestre implements IMateriasOctavoSemestre {
    @Override
    public void materiaAsignada(){
        String pantalla = "";
        pantalla += "OCTAVO SEMESTRE\n\n";
        pantalla += "Estudiante Sin Novedad\n";
        pantalla += "Materias asignadas\n\n";
        pantalla += "1. Opción de Grado II\n";
        pantalla += "2. Seguridad y Ciberseguridad Informática\n";
        pantalla += "3. Práctica Profesional\n";
        pantalla += "4. Ética Profesional\n";
        pantalla += "5. Electiva Diciplinar IV\n";
        
        JOptionPane.showMessageDialog(null,pantalla);
    }
    
}
