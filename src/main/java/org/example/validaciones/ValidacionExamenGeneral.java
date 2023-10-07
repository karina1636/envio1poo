package org.example.validaciones;

import org.example.utilidades.Utilidad;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidacionExamenGeneral {

    Utilidad utilidad = new Utilidad();


    public boolean validarId(Integer id) throws Exception{
        if (id < 0) {
            throw new Exception("El id no puede ser negativo");
        }
        return true;
    }

    public Boolean validarNombre(String nombre) throws Exception {
        if (nombre.length() < 10 || nombre.length() > 150) {
            throw new Exception("El nombre no cumple con el mínimo o máximo de caracteres");
        }
        String expresionRegular = "^[a-zA-Z ]+$";
        if(!this.utilidad.buscarCoincidencia(expresionRegular,nombre)){
            throw new Exception("revise el formato del nombre");
        }
        return true;
    }

    public Boolean validarunidadMedida(String imagenExamen) throws Exception{
        if (imagenExamen.length() > 200){
            throw new Exception("Exedio el numero de caracteres");
        }
        return true;
    }

}
