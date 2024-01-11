package org.example;

import org.apache.commons.lang3.StringUtils;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Program {
    public static void main(String[] args) throws FileNotFoundException {

       String obj ;
        Scanner scanner = new Scanner(System.in);

        int Jetons= 50;

        System.out.println("Le jeu de la machine à sous pokémon commence !");
        System.out.println("Vous avez 50 jetons");
       System.out.println("Entrez nombre de jetons que vous voulez utilisé : 1 2 ou 3 ");
       int nombreJetonUtilise = scanner.nextInt();

       ColumnsHandler columnsHandler = new ColumnsHandler();


       String fichierJson = "E:\\Cours\\IPI\\JAVA\\MachineASous\\src\\main\\java\\org\\example\\tableau.json";

         List<List<String>> columns = columnsHandler.deserialize(fichierJson);

         Machine machine = new Machine(columns);
         Machine machine2 = new Machine(columns);
         machine.printMatrix();
         machine.checkLines( nombreJetonUtilise);




    }
}