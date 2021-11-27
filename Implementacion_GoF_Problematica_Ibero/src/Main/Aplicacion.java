package Main;

import Fabricas.AbstractFactory;
import MateriasPrimerSemestre.IMateriasPrimerSemestre;
import MateriasSegundoSemestre.IMateriasSegundoSemestre;
import MateriasTercerSemestre.IMateriasTercerSemestre;
import MateriasCuartoSemestre.IMateriasCuartoSemestre;
import MateriasQuintoSemestre.IMateriasQuintoSemestre;
import MateriasSextoSemestre.IMateriasSextoSemestre;
import MateriasSeptimoSemestre.IMateriasSeptimoSemestre;
import MateriasOctavoSemestre.IMateriasOctavoSemestre;

//Clase Intermediaria entre las fabricas y el cliente
public class Aplicacion {
    
    private IMateriasPrimerSemestre materiasPrimerSemestre;
    private IMateriasSegundoSemestre materiasSegundoSemestre;
    private IMateriasTercerSemestre materiasTercerSemestre;
    private IMateriasCuartoSemestre materiasCuartoSemestre;
    private IMateriasQuintoSemestre materiasQuintoSemestre;
    private IMateriasSextoSemestre materiasSextoSemestre;
    private IMateriasSeptimoSemestre materiasSeptimoSemestre;
    private IMateriasOctavoSemestre materiasOctavoSemestre;
    
    public Aplicacion(AbstractFactory fabrica){
        
        materiasPrimerSemestre = fabrica.crearMateriasPrimerSemestre();
        materiasSegundoSemestre = fabrica.crearMateriasSegundoSemestre();
        materiasTercerSemestre = fabrica.crearMateriasTercerSemestre();
        materiasCuartoSemestre = fabrica.crearMateriasCuartoSemestre();
        materiasQuintoSemestre = fabrica.crearMateriasQuintoSemestre();
        materiasSextoSemestre = fabrica.crearMateriasSextoSemestre();
        materiasSeptimoSemestre = fabrica.crearMateriasSeptimoSemestre();
        materiasOctavoSemestre = fabrica.crearMateriasOctavoSemestre();        
    }
    
    public void materiaAsignada(){
        materiasPrimerSemestre.materiaAsignada();
        materiasSegundoSemestre.materiaAsignada();
        materiasTercerSemestre.materiaAsignada();
        materiasCuartoSemestre.materiaAsignada();
        materiasQuintoSemestre.materiaAsignada();
        materiasSextoSemestre.materiaAsignada();
        materiasSeptimoSemestre.materiaAsignada();
        materiasOctavoSemestre.materiaAsignada();        
    }
}


