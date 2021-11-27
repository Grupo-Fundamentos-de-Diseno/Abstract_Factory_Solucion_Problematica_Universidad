package MateriasPrimerSemestre;

import javax.swing.JOptionPane;

public class EstudRepitentePaquetePrimerSemestre implements IMateriasPrimerSemestre {
    @Override
    public void materiaAsignada(){
        String pantalla = "";
        pantalla += "PRIMER SEMESTRE\n\n";
        pantalla += "La asignación de materias a recuperar, se realiza"
                + "a partir del segundo semestre\n";
        
        JOptionPane.showMessageDialog(null,pantalla);
    }       
}
