package Fabricas;

import MateriasPrimerSemestre.*;
import MateriasSegundoSemestre.*;
import MateriasTercerSemestre.*;
import MateriasCuartoSemestre.*;
import MateriasQuintoSemestre.*;
import MateriasSextoSemestre.*;
import MateriasSeptimoSemestre.*;
import MateriasOctavoSemestre.*;

public class FabricaEstudRepitente implements AbstractFactory {    
    @Override    
    public IMateriasPrimerSemestre crearMateriasPrimerSemestre(){
        return new EstudRepitentePaquetePrimerSemestre();
    }        
    @Override
    public IMateriasSegundoSemestre crearMateriasSegundoSemestre(){
        return new EstudRepitentePaqueteSegundoSemestre();
    }    
    @Override
    public IMateriasTercerSemestre crearMateriasTercerSemestre(){
        return new EstudRepitentePaqueteTercerSemestre();
    }   
    @Override
    public IMateriasCuartoSemestre crearMateriasCuartoSemestre(){
        return new EstudRepitentePaqueteCuartoSemestre();
    }    
    @Override
    public IMateriasQuintoSemestre crearMateriasQuintoSemestre(){
        return new EstudRepitentePaqueteQuintoSemestre();
    }    
    @Override
    public IMateriasSextoSemestre crearMateriasSextoSemestre(){
        return new EstudRepitentePaqueteSextoSemestre();
    }    
    @Override
    public IMateriasSeptimoSemestre crearMateriasSeptimoSemestre(){
        return new EstudRepitentePaqueteSeptimoSemestre();
    }    
    @Override
    public IMateriasOctavoSemestre crearMateriasOctavoSemestre(){
        return new EstudRepitentePaqueteOctavoSemestre();
    }      
}
