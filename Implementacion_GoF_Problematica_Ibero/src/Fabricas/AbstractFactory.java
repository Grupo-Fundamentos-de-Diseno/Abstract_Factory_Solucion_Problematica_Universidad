package Fabricas;

//Se importan las interfaces de cada semestre
import MateriasPrimerSemestre.IMateriasPrimerSemestre;
import MateriasSegundoSemestre.IMateriasSegundoSemestre;
import MateriasTercerSemestre.IMateriasTercerSemestre;
import MateriasCuartoSemestre.IMateriasCuartoSemestre;
import MateriasQuintoSemestre.IMateriasQuintoSemestre;
import MateriasSextoSemestre.IMateriasSextoSemestre;
import MateriasSeptimoSemestre.IMateriasSeptimoSemestre;
import MateriasOctavoSemestre.IMateriasOctavoSemestre;

//FÁBRICA ABSTRACTA
//Se crean los metodos que crearán los paquetes de materias para cada semestre
public interface AbstractFactory {
    
    IMateriasPrimerSemestre crearMateriasPrimerSemestre();
    IMateriasSegundoSemestre crearMateriasSegundoSemestre();
    IMateriasTercerSemestre crearMateriasTercerSemestre();
    IMateriasCuartoSemestre crearMateriasCuartoSemestre();
    IMateriasQuintoSemestre crearMateriasQuintoSemestre();
    IMateriasSextoSemestre crearMateriasSextoSemestre();
    IMateriasSeptimoSemestre crearMateriasSeptimoSemestre();
    IMateriasOctavoSemestre crearMateriasOctavoSemestre();
    
}
