package org.example;

import org.jetbrains.annotations.Nullable;

import java.util.*;

public class Machine {

    List<List<String>> originalColumn;

    int i;
    int j;

    String[][] matrix;
    public Machine( List<List<String>> column)
    {
        this.matrix = new String[3][3];
        this.originalColumn = column;
       checkTable();
    }

   public void checkTable()
   {

   Random random = new Random();

       for (i = 0; i < originalColumn.size(); i++ ) {
           List<String> column = originalColumn.get(i);
        int   randomIndex = random.nextInt(originalColumn.size());
        for(j = 0; j < 3; j++) {
            int currentIndex = (randomIndex + j) % column.size();
            matrix[j][i] = column.get(currentIndex);
        }
       }
      printLines(matrix);
   }
   public void printMatrix()
   {
      System.out.println(Arrays.deepToString(matrix));
   }


   public void printLines(String[][] matrix)
   {
        for (i = 0; i < matrix.length; i++){

            System.out.print(" " + i + ": ");
            for(j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
   }
   public void checkLines(int nbJetonsUtilise)
   {
       // 1 on regarde la premiere ligne
       // 2 2
       // 3 toutes les lignes

       String[][] newMatrix = new String[0][0];

      switch(nbJetonsUtilise)
      {
          case 1:
              for(i = 1; i<2; i++)
              {
                  List<String> column = originalColumn.get(i);
                  for( j = 0; j < matrix[i].length; j++ )
                  {
                    System.out.print(matrix[i][j] + " ");
                 matrix[i][j] = column.get(i);

                  }
                  System.out.println();
              }
              break;
          case 2:
              for(i =0; i< matrix.length; i++)
              {
                  for( j= 0; j < matrix[i].length; j++)
                  {
                      System.out.print(matrix[i][j] + " ");
                  }
                  System.out.println();
              }
              break;
          case 3:
              for(i =0; i< matrix.length; i++)
              {
                  for( j= 0; j < matrix[i].length; j++)
                  {
                      System.out.print(matrix[i][j] + " ");
                  }
                  System.out.println();
              }
              for (int i = 0; i < matrix.length; i++) {
                  System.out.print(matrix[i][i] + " ");
              }
              System.out.println();


              for (int i = 0; i < matrix.length; i++) {
                  System.out.print(matrix[i][matrix.length - 1 - i] + " ");
              }
              System.out.println();
              break;
      }
      checkWin(matrix);
   }
   public String checkWin(@Nullable String[][] matrix)
   {

            // on check la matrice
           // est ce que les caractères sous tous les mêmes
          // si oui c'est gagné, sinon on relance le jeu
       String premierCaractere = matrix[0][0];

       for(i = 0; i < matrix.length; i++)
       {
           for (int i = 0; i < matrix.length; i++) {
               for (int j = 0; j < matrix[i].length; j++) {
                   if (!matrix[i][j].equals(premierCaractere)) {
                       // Les caractères ne sont pas tous les mêmes, le jeu continue
                       break;
                      // Relance du jeu
                   }
               }
           }


       }
       return "victoire";
   }

}
