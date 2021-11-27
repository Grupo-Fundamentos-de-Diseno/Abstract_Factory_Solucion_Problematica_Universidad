package Fabricas;

import MateriasPrimerSemestre.*;
import MateriasSegundoSemestre.*;
import MateriasTercerSemestre.*;
import MateriasCuartoSemestre.*;
import MateriasQuintoSemestre.*;
import MateriasSextoSemestre.*;
import MateriasSeptimoSemestre.*;
import MateriasOctavoSemestre.*;

public class FabricaEstudHomologante implements AbstractFactory {    
    @Override    
    public IMateriasPrimerSemestre crearMateriasPrimerSemestre(){
        return new EstudHomologantePaquetePrimerSemestre();
    }          
    @Override
    public IMateriasSegundoSemestre crearMateriasSegundoSemestre(){
        return new EstudHomologantePaqueteSegundoSemestre();
    }    
    @Override
    public IMateriasTercerSemestre crearMateriasTercerSemestre(){
        return new EstudHomologantePaqueteTercerSemestre();
    }   
    @Override
    public IMateriasCuartoSemestre crearMateriasCuartoSemestre(){
        return new EstudHomologantePaqueteCuartoSemestre();
    }    
    @Override
    public IMateriasQuintoSemestre crearMateriasQuintoSemestre(){
        return new EstudHomologantePaqueteQuintoSemestre();
    }    
    @Override
    public IMateriasSextoSemestre crearMateriasSextoSemestre(){
        return new EstudHomologantePaqueteSextoSemestre();
    }    
    @Override
    public IMateriasSeptimoSemestre crearMateriasSeptimoSemestre(){
        return new EstudHomologantePaqueteSeptimoSemestre();
    }    
    @Override
    public IMateriasOctavoSemestre crearMateriasOctavoSemestre(){
        return new EstudHomologantePaqueteOctavoSemestre();
    }      
}
