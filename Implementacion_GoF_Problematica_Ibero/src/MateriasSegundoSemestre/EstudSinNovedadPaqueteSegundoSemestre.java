package MateriasSegundoSemestre;

import javax.swing.JOptionPane;

public class EstudSinNovedadPaqueteSegundoSemestre implements IMateriasSegundoSemestre {
    @Override
    public void materiaAsignada(){
        String pantalla = "";
        pantalla += "SEGUNDO SEMESTRE\n\n";
        pantalla += "Estudiante Sin Novedad\n";
        pantalla += "Materias asignadas\n\n";
        pantalla += "1. Catedra Iberoamericana Emprendimiento y Empresarismo\n";
        pantalla += "2. Inglés Básico (A1)\n";
        pantalla += "3. Matemáticas Básica\n";
        pantalla += "4. Costos y Presupuestos\n";
        pantalla += "5. Fundamentos de Requerimientos de Software\n";
        pantalla += "6. Fundamentos de Diseño\n";
        pantalla += "7. Métodos de Construcción de Software\n";
        
        JOptionPane.showMessageDialog(null,pantalla);
    }
    
}
