import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class Main {
    /*
    Any alive cell that is touching less than two alive neighbours dies.
    Any alive cell touching four or more alive neighbours dies.
    Any alive cell touching two or three alive neighbours does nothing.
    Any dead cell touching exactly three alive neighbours becomes alive.
     */

    public static int[][] update(int[][] map){
        int[][] updated = new int[20][20];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                int count = 0;
               if (i == 0 && j == 0){
                   //top left corner
                   if(map[i][j+1] == 1){
                       count++;
                   }
                   if(map[i+1][j] == 1){
                       count++;
                   }
                   if(map[i+1][j+1] == 1){
                       count++;
                   }


                   if(map[i][j] == 1){
                       if (count > 2){
                           updated[i][j] = 0;
                       }
                   }
                   if(map[i][j] == 0){
                       if (count == 3) {
                           updated[i][j] = 1;
                       }
                   }




               }
               else if (i == 0 && j == map[i].length-1) {
                   //top right corner
                   if(map[i][j-1] == 1){
                       count++;
                   }
                   if(map[i+1][j] == 1){
                       count++;
                   }
                   if(map[i+1][j+-1] == 1){
                       count++;
                   }


                   if(map[i][j] == 1){
                       if (count > 2){
                           updated[i][j] = 0;
                       }
                   }
                   if(map[i][j] == 0){
                       if (count == 3) {
                           updated[i][j] = 1;
                       }
                   }







               }
               else if (i == map.length-1 && j == 0) {
                   //bottom left corner
                   if(map[i][j+1] == 1){
                       count++;
                   }
                   if(map[i-1][j] == 1){
                       count++;
                   }
                   if(map[i-1][j+1] == 1){
                       count++;
                   }


                   if(map[i][j] == 1){
                       if (count > 2){
                           updated[i][j] = 0;
                       }
                   }
                   if(map[i][j] == 0){
                       if (count == 3) {
                           updated[i][j] = 1;
                       }
                   }






               }
               else if (i == map.length-1 && j == map[i].length-1) {
                   //bottom right corner
                   if(map[i][j-1] == 1){
                       count++;
                   }
                   if(map[i-1][j] == 1){
                       count++;
                   }
                   if(map[i-1][j-1] == 1){
                       count++;
                   }


                   if(map[i][j] == 1){
                       if (count > 2){
                           updated[i][j] = 0;
                       }
                   }
                   if(map[i][j] == 0){
                       if (count == 3) {
                           updated[i][j] = 1;
                       }
                   }

               }
               else if (j == 0) {
                   //left side
                   if(map[i][j+1] == 1){
                       count++;
                   }
                   if(map[i-1][j+1] == 1){
                       count++;
                   }
                   if(map[i+1][j+1] == 1){
                       count++;
                   }
                   if(map[i+1][j] == 1){
                       count++;
                   }
                   if(map[i-1][j] == 1){
                       count++;
                   }



                   if(map[i][j] == 1){
                       if (count > 2){
                           updated[i][j] = 0;
                       }
                   }
                   if(map[i][j] == 1){
                       if (count <= 4) {
                           updated[i][j] = 0;
                       }
                   }
                   if(map[i][j] == 0){
                       if (count == 3) {
                           updated[i][j] = 1;
                       }
                   }





               }
               else if (j ==  map[i].length-1) {
                   //right side
                   if(map[i][j-1] == 1){
                       count++;
                   }
                   if(map[i-1][j-1] == 1){
                       count++;
                   }
                   if(map[i+1][j-1] == 1){
                       count++;
                   }
                   if(map[i+1][j] == 1){
                       count++;
                   }
                   if(map[i-1][j] == 1){
                       count++;
                   }








                   if(map[i][j] == 1){
                       if (count > 2){
                           updated[i][j] = 0;
                       }
                   }
                   if(map[i][j] == 1){
                       if (count <= 4) {
                           updated[i][j] = 0;
                       }
                   }
                   if(map[i][j] == 0){
                       if (count == 3) {
                           updated[i][j] = 1;
                       }
                   }


               }
               else if (i == 0) {
                   //top side

                   if(map[i+1][j] == 1){
                       count++;
                   }
                   if(map[i+1][j+1] == 1){
                       count++;
                   }
                   if(map[i+1][j-1] == 1){
                       count++;
                   }
                   if(map[i][j+1] == 1){
                       count++;
                   }
                   if(map[i][j-1] == 1){
                       count++;
                   }










                   if(map[i][j] == 1){
                       if (count > 2){
                           updated[i][j] = 0;
                       }
                   }
                   if(map[i][j] == 1){
                       if (count <= 4) {
                           updated[i][j] = 0;
                       }
                   }
                   if(map[i][j] == 0){
                       if (count == 3) {
                           updated[i][j] = 1;
                       }
                   }


               }
               else if (i == map.length-1) {
                   //bottom side
                   if(map[i-1][j] == 1){
                       count++;
                   }
                   if(map[i-1][j+1] == 1){
                       count++;
                   }
                   if(map[i-1][j-1] == 1){
                       count++;
                   }
                   if(map[i][j+1] == 1){
                       count++;
                   }
                   if(map[i][j-1] == 1){
                       count++;
                   }











                   if(map[i][j] == 1){
                       if (count > 2){
                           updated[i][j] = 0;
                       }
                   }
                   if(map[i][j] == 1){
                       if (count <= 4) {
                           updated[i][j] = 0;
                       }
                   }
                   if(map[i][j] == 0){
                       if (count == 3) {
                           updated[i][j] = 1;
                       }
                   }


               }
               else{
                   //all in middle

                   if(map[i-1][j] == 1){
                       count++;
                   }
                   if(map[i-1][j+1] == 1){
                       count++;
                   }
                   if(map[i-1][j-1] == 1){
                       count++;
                   }
                   if(map[i+1][j+1] == 1){
                       count++;
                   }
                   if(map[i+1][j-1] == 1){
                       count++;
                   }
                   if(map[i+1][j] == 1){
                       count++;
                   }
                   if(map[i][j+1] == 1){
                       count++;
                   }
                   if(map[i][j-1] == 1){
                       count++;
                   }










                   if(map[i][j] == 1){
                       if (count > 2){
                           updated[i][j] = 0;
                       }
                   }
                   if(map[i][j] == 1){
                       if (count <= 4) {
                           updated[i][j] = 0;
                       }
                   }
                   if(map[i][j] == 0){
                       if (count == 3) {
                           updated[i][j] = 1;
                       }
                   }


               }
            }
        }
        return updated;
    }




    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();

        int[][] initial = new int[20][20];


        for (int i = 0; i < initial.length; i++) {
            for (int j = 0; j < initial[i].length; j++) {
                int value = rand.nextInt(0,10);
                if (value <2){
                    initial[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < initial.length; i++) {
            for (int j = 0; j < initial[i].length; j++) {
                System.out.print(initial[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();


        int[][] life = update(initial);

        System.out.print("\033[H\033[2J");
        System.out.flush();

        TimeUnit.SECONDS.sleep(3);

        for (int i = 0; i < life.length; i++) {
            for (int j = 0; j < life[i].length; j++) {
                System.out.print(life[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }








    }


}