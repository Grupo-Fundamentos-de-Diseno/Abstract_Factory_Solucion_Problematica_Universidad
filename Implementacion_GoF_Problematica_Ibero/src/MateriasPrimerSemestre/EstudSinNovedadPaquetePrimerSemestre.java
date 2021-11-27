package MateriasPrimerSemestre;

import javax.swing.JOptionPane;

//Clase con el paquete puntual que crea las materias para primer semestre
public class EstudSinNovedadPaquetePrimerSemestre implements IMateriasPrimerSemestre {
    @Override
    public void materiaAsignada(){
        String pantalla = "";
        pantalla += "PRIMER SEMESTRE\n\n";
        pantalla += "Estudiante Sin Novedad\n";
        pantalla += "Materias asignadas\n\n";
        pantalla += "1. Cátedra Iberoamericana - Responsabilidad Social\n";
        pantalla += "2. Habilidades de Comunicación y Expresión Escrita\n";
        pantalla += "3. Competencias Básicas Digitales\n";
        pantalla += "4. Pensamiento Matemático\n";
        pantalla += "5. Introducción a la Ingeniería de Software\n";
        pantalla += "6. Fundamentos de Programación y Algoritmia Básica\n";
        pantalla += "7. Electiva Institucional I\n";
        
        JOptionPane.showMessageDialog(null,pantalla);
    }
    
}
