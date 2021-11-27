package MateriasPrimerSemestre;

import javax.swing.JOptionPane;

public class EstudHomologantePaquetePrimerSemestre implements IMateriasPrimerSemestre {
    @Override
    public void materiaAsignada(){
        String pantalla = "";
        pantalla += "PRIMER SEMESTRE\n\n";
        pantalla += "Estudiante homologante\n";
        pantalla += "Materias asignadas\n\n";
        pantalla += "1. Cátedra Iberoamericana - Responsabilidad Social\n";
        pantalla += "2. Habilidades de Comunicación y Expresión Escrita\n";
        pantalla += "3. Competencias Básicas Digitales\n";
        pantalla += "4. Pensamiento Matemático\n";
        pantalla += "5. Introducción a la Ingeniería de Software\n";
        pantalla += "6. Electiva Institucional I\n";
        
        JOptionPane.showMessageDialog(null,pantalla);
    }
    
}
