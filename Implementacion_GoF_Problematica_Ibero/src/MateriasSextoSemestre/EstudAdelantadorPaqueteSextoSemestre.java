package MateriasSextoSemestre;

import javax.swing.JOptionPane;

public class EstudAdelantadorPaqueteSextoSemestre implements IMateriasSextoSemestre {
    @Override
    public void materiaAsignada(){
        String pantalla = "";
        pantalla += "SEXTO SEMESTRE\n\n";
        pantalla += "Estudiante que adelanta materias\n";
        pantalla += "Materias asignadas\n\n";
        pantalla += "1. Catedra Iberoamericana - Creatividad\n";
        pantalla += "2. Investigación II\n";
        pantalla += "3. Ecuaciones diferenciales\n";
        pantalla += "4. Análisis y Diseño de Sistemas\n";
        pantalla += "5. Bases de Datos Avanzadas\n";
        pantalla += "6. Mantenimiento de Software\n";
        pantalla += "7. Electiva Diciplinar II\n";
        pantalla += "8. Adelantar Materia 1\n";
        pantalla += "9. Adelantar Materia 2\n";
        
        JOptionPane.showMessageDialog(null,pantalla);
    }
    
}
