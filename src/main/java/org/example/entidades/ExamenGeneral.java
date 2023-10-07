package org.example.entidades;

import java.time.LocalDate;

public class ExamenGeneral {

    private Integer id;
    private String nombreExamen;
    private LocalDate fechaExamen;
    private String diagnostico;
    private String imagenExamen;

    public ExamenGeneral() {
    }

    public ExamenGeneral(Integer id, String nombreExamen, LocalDate fechaExamen, String diagnostico, String imagenExamen) {
        this.id = id;
        this.nombreExamen = nombreExamen;
        this.fechaExamen = fechaExamen;
        this.diagnostico = diagnostico;
        this.imagenExamen = imagenExamen;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreExamen() {
        return nombreExamen;
    }

    public void setNombreExamen(String nombreExamen) {
        this.nombreExamen = nombreExamen;
    }

    public LocalDate getFechaExamen() {
        return fechaExamen;
    }

    public void setFechaExamen(LocalDate fechaExamen) {
        this.fechaExamen = fechaExamen;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getImagenExamen() {
        return imagenExamen;
    }

    public void setImagenExamen(String imagenExamen) {
        this.imagenExamen = imagenExamen;
    }
}
