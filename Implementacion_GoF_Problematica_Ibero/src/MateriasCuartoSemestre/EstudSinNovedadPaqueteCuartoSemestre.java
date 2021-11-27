package MateriasCuartoSemestre;

import javax.swing.JOptionPane;

public class EstudSinNovedadPaqueteCuartoSemestre implements IMateriasCuartoSemestre {
    @Override
    public void materiaAsignada(){
        String pantalla = "";
        pantalla += "CUARTO SEMESTRE\n\n";
        pantalla += "Estudiante Sin Novedad\n";
        pantalla += "Materias asignadas\n\n";
        pantalla += "1. Ingles Avanzado (B1)\n";
        pantalla += "2. Cálculo Diferencial\n";
        pantalla += "3. Matemáticas Discretas\n";
        pantalla += "4. Física Mecánica\n";
        pantalla += "5. Análisis y Modelación de Sistemas de Software\n";
        pantalla += "6. Pruebas de Software y Aplicabilidad\n";
        
        JOptionPane.showMessageDialog(null,pantalla);
    }
}
