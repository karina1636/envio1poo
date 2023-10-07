package org.example.entidades;

import org.example.validaciones.ValidacionAfiliado;

import java.time.LocalDate;

public class Afiliado {

    private Integer id;
    private String documento;
    private String nombre;
    private String Apellido;
    private LocalDate fechaNacimiento;
    private Integer ciudad;
    private Integer departamento;
    private String correoElectronico;
    private String celular;

    private ValidacionAfiliado validacionAfiliado = new ValidacionAfiliado();   //inyectar dependencias


    // constructor vacio
    public Afiliado() {
    }



        // constructor lleno
    public Afiliado(Integer id, String documento, String nombre, String apellido, LocalDate fechaNacimiento, Integer ciudad, Integer departamento, String correoElectronico, String celular) {
        this.id = id;
        this.documento = documento;
        this.nombre = nombre;
        this.Apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.correoElectronico = correoElectronico;
        this.celular = celular;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        try {  //Intento
            this.validacionAfiliado.validarId(id);
            this.id = id;
            System.out.println("Id cargado con exito en BD");

        }catch (Exception error){  //si no fui capaz el por qué?...
            System.out.println(error.getMessage());
        }

    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        try{
            this.validacionAfiliado.validarNombres(nombre);
            this.nombre = nombre;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getCiudad() {
        return ciudad;
    }

    public void setCiudad(Integer ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Integer departamento) {
        this.departamento = departamento;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}
