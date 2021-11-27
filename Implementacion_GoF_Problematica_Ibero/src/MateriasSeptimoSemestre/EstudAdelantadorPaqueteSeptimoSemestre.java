package MateriasSeptimoSemestre;

import javax.swing.JOptionPane;

public class EstudAdelantadorPaqueteSeptimoSemestre implements IMateriasSeptimoSemestre {
    @Override
    public void materiaAsignada(){
        String pantalla = "";
        pantalla += "SÉPTIMO SEMESTRE\n\n";
        pantalla += "Estudiante que adelanta materias\n";
        pantalla += "Materias asignadas\n\n";
        pantalla += "1. Opciones de Grado I\n";
        pantalla += "2. Proyecto de Software\n";
        pantalla += "3. Calidad de Software\n";
        pantalla += "4. Gerencia y Control de Proyectos Informáticos\n";
        pantalla += "5. Electiva Institucional II\n";
        pantalla += "6. Electiva Diciplinar III\n";
        pantalla += "7. Inteligencia Artificial\n";
        pantalla += "7. Adelantar Materia 1\n";
        pantalla += "8. Adelantar Materia 2\n";
        
        JOptionPane.showMessageDialog(null,pantalla);
    }
    
    
}
