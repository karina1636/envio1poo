package org.example;


import org.example.entidades.Afiliado;
import org.example.entidades.ExamenGeneral;
import org.example.entidades.SignoVital;

import java.time.LocalDate;
import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        scaner teclado = new Scanner(System.in);
        Afiliado afiliado = new Afiliado();

        System.out.println("Digite el Id del usuario: ");
        afiliado.setId(teclado.nextInt());

    }

}