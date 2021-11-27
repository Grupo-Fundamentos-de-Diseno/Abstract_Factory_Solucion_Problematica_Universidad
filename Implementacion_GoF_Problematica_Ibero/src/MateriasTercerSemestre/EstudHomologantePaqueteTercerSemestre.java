package MateriasTercerSemestre;

import javax.swing.JOptionPane;

public class EstudHomologantePaqueteTercerSemestre implements IMateriasTercerSemestre {
    @Override
    public void materiaAsignada(){
        String pantalla = "";
        pantalla += "TERCER SEMESTRE\n\n";
        pantalla += "Estudiante homologante\n";
        pantalla += "Materias asignadas\n\n";
        pantalla += "1. Escritura y Redacción Creativa\n";
        pantalla += "2. Ingles Medio (A2)\n";
        pantalla += "3. Probabilidad y Estadística\n";
        pantalla += "4. Álgebra Lineal\n";
        pantalla += "5. Estructuras de Datos\n";
        
        JOptionPane.showMessageDialog(null,pantalla);
    }
        
}
