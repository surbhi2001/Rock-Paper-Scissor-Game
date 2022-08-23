package com.Java;
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissor {
    public static void main(String[] args){
        System.out.println("######################################################### ROCK-PAPER-SCISSOR GAME #####################################################");
        for(int i=1;i<=3;i++) {
            System.out.println("CHOOSE THE OPTIONS : " + "\n0 : ROCK" + "\n1 : PAPER" + "\n2 : SCISSOR");
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            Random rc = new Random();
            int random = rc.nextInt(3);
            switch (option) {
                case 0 -> System.out.println("ROCK");
                case 1 -> System.out.println("PAPER");
                case 2 -> System.out.println("SCISSOR");
                default -> System.out.println("Invalid Option");
            }
            if (random == 0) {
                System.out.println("ROCK");
            } else if (random == 1) {
                System.out.println("PAPER");
            } else {
                System.out.println("SCISSOR");
            }
            if (option == 0 && random == 0) {
                System.out.println("                                                        ===== Its a Draw =====                 ");
            } else if (option == 0 && random == 1) {
                System.out.println("                                                        00000 You Lose 00000                ");
            } else if (option == 0 && random == 2) {
                System.out.println("                                                        ***** You Won *****                  ");
            } else if (option == 1 && random == 0) {
                System.out.println("                                                        ***** You Won *****                  ");
            } else if (option == 1 && random == 1) {
                System.out.println("                                                        ===== Its a Draw =====                 ");
            } else if (option == 1 && random == 2) {
                System.out.println("                                                        00000 You Lose 00000                ");
            } else if (option == 2 && random == 0) {
                System.out.println("                                                        00000 You Lose 00000                ");
            } else if (option == 2 && random == 1) {
                System.out.println("                                                        ***** You Won *****                  ");
            } else if (option == 2 && random == 2) {
                System.out.println("                                                        ===== Its a Draw =====                 ");
            }
        }
        }
    }

