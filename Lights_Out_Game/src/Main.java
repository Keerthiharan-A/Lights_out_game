package games;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 5;
        LightsOut game = new LightsOut(size);
        game.randomize();
        System.out.println(game);

        while(!game.isSoved()){
            System.out.println("Enter X coordinate: ");
            int x = sc.nextInt();
            System.out.println("Enter Y coordinate: ");
            int y = sc.nextInt();
            if(x<0 || y<0 || x>size || y>size) System.out.println("Out of bound coordinates try again!");
            else game.toggle(x, y);
            System.out.println(game);
        }
    }
}