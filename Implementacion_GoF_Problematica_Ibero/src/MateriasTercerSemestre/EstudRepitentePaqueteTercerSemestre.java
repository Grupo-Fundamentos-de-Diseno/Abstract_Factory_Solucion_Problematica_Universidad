package MateriasTercerSemestre;

import javax.swing.JOptionPane;

public class EstudRepitentePaqueteTercerSemestre implements IMateriasTercerSemestre {
    @Override
    public void materiaAsignada(){
        String pantalla = "";
        pantalla += "TERCER SEMESTRE\n\n";
        pantalla += "Estudiante que perdio materias\n";
        pantalla += "Materias asignadas\n\n";
        pantalla += "1. Escritura y Redacción Creativa\n";
        pantalla += "2. Ingles Medio (A2)\n";
        pantalla += "3. Probabilidad y Estadística\n";
        pantalla += "4. Álgebra Lineal\n";
        pantalla += "5. Estructuras de Datos\n";
        pantalla += "6. Programación Orientada a Objetos\n";
        pantalla += "7. Repetir Materia 1\n";
        pantalla += "8. Repetir Materia 2\n";
        
        JOptionPane.showMessageDialog(null,pantalla);
    }
        
}
