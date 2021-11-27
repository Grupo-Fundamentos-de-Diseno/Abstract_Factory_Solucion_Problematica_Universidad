package MateriasPrimerSemestre;

import javax.swing.JOptionPane;

public class EstudAdelantadorPaquetePrimerSemestre implements IMateriasPrimerSemestre {
    @Override
    public void materiaAsignada(){
        String pantalla = "";
        pantalla += "PRIMER SEMESTRE\n\n";
        pantalla += "Estudiante que adelanta materias\n";
        pantalla += "Materias asignadas\n\n";
        pantalla += "1. Cátedra Iberoamericana - Responsabilidad Social\n";
        pantalla += "2. Habilidades de Comunicación y Expresión Escrita\n";
        pantalla += "3. Competencias Básicas Digitales\n";
        pantalla += "4. Pensamiento Matemático\n";
        pantalla += "5. Introducción a la Ingeniería de Software\n";
        pantalla += "6. Fundamentos de Programación y Algoritmia Básica\n";
        pantalla += "7. Electiva Institucional I\n";
        pantalla += "8. Adelantar Materia 1\n";
        pantalla += "9. Adelantar Materia 2\n";
        
        JOptionPane.showMessageDialog(null,pantalla);
    }
    
    
}
