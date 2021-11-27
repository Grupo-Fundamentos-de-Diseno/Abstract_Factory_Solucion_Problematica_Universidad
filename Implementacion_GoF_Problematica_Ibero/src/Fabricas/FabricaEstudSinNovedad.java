package Fabricas;

import MateriasPrimerSemestre.*;
import MateriasSegundoSemestre.*;
import MateriasTercerSemestre.*;
import MateriasCuartoSemestre.*;
import MateriasQuintoSemestre.*;
import MateriasSextoSemestre.*;
import MateriasSeptimoSemestre.*;
import MateriasOctavoSemestre.*;

//Esta fabrica implementa los métodos de la Fabrica Abstracta y devuelve
//las clases concretas que crearán los paquetes de materias.
public class FabricaEstudSinNovedad implements AbstractFactory {    
    @Override    
    public IMateriasPrimerSemestre crearMateriasPrimerSemestre(){
        return new EstudSinNovedadPaquetePrimerSemestre();
    }          
    @Override
    public IMateriasSegundoSemestre crearMateriasSegundoSemestre(){
        return new EstudSinNovedadPaqueteSegundoSemestre();
    }    
    @Override
    public IMateriasTercerSemestre crearMateriasTercerSemestre(){
        return new EstudSinNovedadPaqueteTercerSemestre();
    }   
    @Override
    public IMateriasCuartoSemestre crearMateriasCuartoSemestre(){
        return new EstudSinNovedadPaqueteCuartoSemestre();
    }    
    @Override
    public IMateriasQuintoSemestre crearMateriasQuintoSemestre(){
        return new EstudSinNovedadPaqueteQuintoSemestre();
    }    
    @Override
    public IMateriasSextoSemestre crearMateriasSextoSemestre(){
        return new EstudSinNovedadPaqueteSextoSemestre();
    }    
    @Override
    public IMateriasSeptimoSemestre crearMateriasSeptimoSemestre(){
        return new EstudSinNovedadPaqueteSeptimoSemestre();
    }    
    @Override
    public IMateriasOctavoSemestre crearMateriasOctavoSemestre(){
        return new EstudSinNovedadPaqueteOctavoSemestre();
    }    
}
