package Fabricas;

import MateriasPrimerSemestre.*;
import MateriasSegundoSemestre.*;
import MateriasTercerSemestre.*;
import MateriasCuartoSemestre.*;
import MateriasQuintoSemestre.*;
import MateriasSextoSemestre.*;
import MateriasSeptimoSemestre.*;
import MateriasOctavoSemestre.*;

public class FabricaEstudAdelantador implements AbstractFactory {    
    @Override    
    public IMateriasPrimerSemestre crearMateriasPrimerSemestre(){
        return new EstudAdelantadorPaquetePrimerSemestre();
    }          
    @Override
    public IMateriasSegundoSemestre crearMateriasSegundoSemestre(){
        return new EstudAdelantadorPaqueteSegundoSemestre();
    }    
    @Override
    public IMateriasTercerSemestre crearMateriasTercerSemestre(){
        return new EstudAdelantadorPaqueteTercerSemestre();
    }   
    @Override
    public IMateriasCuartoSemestre crearMateriasCuartoSemestre(){
        return new EstudAdelantadorPaqueteCuartoSemestre();
    }    
    @Override
    public IMateriasQuintoSemestre crearMateriasQuintoSemestre(){
        return new EstudAdelantadorPaqueteQuintoSemestre();
    }    
    @Override
    public IMateriasSextoSemestre crearMateriasSextoSemestre(){
        return new EstudAdelantadorPaqueteSextoSemestre();
    }    
    @Override
    public IMateriasSeptimoSemestre crearMateriasSeptimoSemestre(){
        return new EstudAdelantadorPaqueteSeptimoSemestre();
    }    
    @Override
    public IMateriasOctavoSemestre crearMateriasOctavoSemestre(){
        return new EstudAdelantadorPaqueteOctavoSemestre();
    }      
}
