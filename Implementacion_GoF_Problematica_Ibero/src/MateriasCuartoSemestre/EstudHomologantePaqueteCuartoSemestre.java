package MateriasCuartoSemestre;

import javax.swing.JOptionPane;

public class EstudHomologantePaqueteCuartoSemestre implements IMateriasCuartoSemestre {
    @Override
    public void materiaAsignada(){
        String pantalla = "";
        pantalla += "CUARTO SEMESTRE\n\n";
        pantalla += "Estudiante homologante\n";
        pantalla += "Materias asignadas\n\n";
        pantalla += "1. Ingles Avanzado (B1)\n";
        pantalla += "2. Cálculo Diferencial\n";
        pantalla += "3. Matemáticas Discretas\n";
        pantalla += "4. Física Mecánica\n";
        pantalla += "5. Pruebas de Software y Aplicabilidad\n";
        
        JOptionPane.showMessageDialog(null,pantalla);
    }
    
}
