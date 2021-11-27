package MateriasCuartoSemestre;

import javax.swing.JOptionPane;

public class EstudRepitentePaqueteCuartoSemestre implements IMateriasCuartoSemestre {
    @Override
    public void materiaAsignada(){
        String pantalla = "";
        pantalla += "CUARTO SEMESTRE\n\n";
        pantalla += "Estudiante que perdio materias\n";
        pantalla += "Materias asignadas\n\n";
        pantalla += "1. Ingles Avanzado (B1)\n";
        pantalla += "2. Cálculo Diferencial\n";
        pantalla += "3. Matemáticas Discretas\n";
        pantalla += "4. Física Mecánica\n";
        pantalla += "5. Análisis y Modelación de Sistemas de Software\n";
        pantalla += "6. Pruebas de Software y Aplicabilidad\n";
        pantalla += "7. Repetir Materia 1\n";
        pantalla += "8. Repetir Materia 2\n";
        
        JOptionPane.showMessageDialog(null,pantalla);
    }
    
}
