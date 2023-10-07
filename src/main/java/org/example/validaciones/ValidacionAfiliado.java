package org.example.validaciones;

import org.example.utilidades.Utilidad;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionAfiliado {


    Utilidad utilidad = new Utilidad();  // inyeccion de dependencias

    public ValidacionAfiliado() {
    }

    public Boolean validarId(Integer id) throws Exception {

        if (id < 0) {
            throw new Exception("El id no puede ser negativo");
        }

        //PASE TODAS LAS VALIDACIONES
        return true;

    }

    public Boolean validarNombres(String nombre) throws Exception {

        //longitud sea menor q 3 o mayor q 40 para no funcionar
        if (nombre.length() < 3 || nombre.length() > 40) {
            throw new Exception("El nombre debe tener entre 3 y 40 caracteres");
        }

        String expresionRegular = "^[a-zA-Z ]+$";
        if(!this.utilidad.buscarCoincidencia(expresionRegular,nombre)){
            throw new Exception("revise el formato del nombre");
        }

        return true;

    }


    public Boolean validarApellidos(String apellidos) throws Exception {
        if (apellidos.length() < 10 || apellidos.length() > 50) {
            throw new Exception("Los apellidos ingresados nos cumplen con el mínimo o máximo de caracteres");
        }
        String expresionRegular = "^[a-zA-Z ]+$";
        if(!this.utilidad.buscarCoincidencia(expresionRegular,apellidos)){
            throw new Exception("revise el formato del apellido");
        }
        return true;
    }

    public Boolean validarDocumento(String documento) throws Exception{
        if (documento.length()<7 || documento.length()>10){
            throw new Exception("Documento con longitud invalida");
        }
        String expresionRegular = "^[0-9]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular,documento)){
            throw new Exception("Revise el formato ingresado");
        }
        return true;
    }

    public Boolean validarCiudad(Integer ciudad) throws Exception{
        if (ciudad < 0 || ciudad > 1123){
            throw new Exception("Opcion invalida");
        }
        return true;
    }
    public Boolean validarDepartamento(Integer departamento) throws Exception {
        if (departamento < 0 || departamento > 32) {
            throw new Exception("Opcion invalida");
        }
        return true;
    }

    public Boolean validarCorreoElectronico(String correoElectronico) throws Exception {

        String expresionRegular = "^[A-Za-z0-9+_.-]+@(.+)$";
        if(!this.utilidad.buscarCoincidencia(expresionRegular,correoElectronico)){
            throw new Exception("revise el formato del correo electronico");
        }
        return true;
    }

    public Boolean validarCelular(String celular) throws Exception{
        if (celular.length() != 10){
            throw new Exception("numero con longitud invalida");
        }
        String expresionRegular = "^[0-9]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular,celular)){
            throw new Exception("Revise el formato ingresado");
        }
        return true;
    }

}