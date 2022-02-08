package dice_game;

import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Dice_game {

    public static void main(String[] args) throws InterruptedException {
        Scanner k = new Scanner(System.in);
        Random p = new Random();
        int player1, player2, player3, player4, dice1, dice2, dice3, dice4, players;
        String playr1, playr2, playr3, playr4, choice;
        int l = 1, l1 = 1, l2 = 1, n;
        boolean loop = true;
        int backup;
        System.out.println("Every player starts with 10 points");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("You need to end one of players points by winning in dice");
        TimeUnit.SECONDS.sleep(1);
        System.out.print("Enter the number of players:");
        players = k.nextInt();
        while (loop) {
            player1 = 10;
            player2 = 10;
            player3 = 10;
            player4 = 10;
            n = 1;
            if (players > 4) {
                System.out.println("Maximum number of players can be 4");
                TimeUnit.SECONDS.sleep(1);
            }
            if (players == 1) {
                System.out.println("At least 2 player have to be in the game");
                TimeUnit.SECONDS.sleep(1);
            }
            if (players < 1) {
                System.out.println("Enter a valid number");
                TimeUnit.SECONDS.sleep(1);
            }
            if (players == 2) {
                System.out.print("Player 1 enter your name:");
                playr1 = k.next();
                System.out.print("Player 2 enter your name:");
                playr2 = k.next();
                while (player1 >= 1 && player2 >= 1 && l < 2) {
                    n++;
                    System.out.println("Dice are rolling...");
                    TimeUnit.SECONDS.sleep(1);
                    dice1 = p.nextInt(6) + 1;
                    System.out.println(playr1 + "'s dice:" + dice1);
                    dice2 = p.nextInt(6) + 1;
                    System.out.println(playr2 + "'s dice:" + dice2);
                    TimeUnit.SECONDS.sleep(1);
                    if (dice1 > dice2) {
                        System.out.println(playr1 + " " + "won");
                        dice1 = dice1 - dice2;
                        player1 = player1 + dice1;
                        player2 = player2 - dice1;
                        System.out.println(playr1 + ":" + player1);
                        System.out.println(playr2 + ":" + player2);
                        TimeUnit.SECONDS.sleep(1);
                    } else if (dice2 > dice1) {
                        System.out.println(playr2 + " " + "won");
                        TimeUnit.SECONDS.sleep(1);
                        dice2 = dice2 - dice1;
                        player1 = player1 - dice2;
                        player2 = player2 + dice2;
                        System.out.println(playr1 + ":" + player1);
                        System.out.println(playr2 + ":" + player2);
                        TimeUnit.SECONDS.sleep(1);
                    } else {
                        System.out.println("dice are even");
                        TimeUnit.SECONDS.sleep(1);
                    }
                    if (player1 >= 1 && player2 >= 1) {
                        System.out.print("Replay(Y/N):");
                        choice = k.next();
                        switch (choice) {
                            case ("Y"):
                                break;
                            case ("y"):
                                break;
                            case ("n"):
                                l = 2;
                                break;
                            case ("N"):
                                l = 2;
                                break;
                        }
                    }

                }
                if (player1 >= 1 && player2 >= 1) {
                    System.out.println("You left the game half");
                    System.out.println(n + " " + "games played");
                }
                if (player1 <= 0) {
                    System.out.println(playr1 + " " + "lost the game");
                    System.out.println(n + " " + "games played");
                    players--;
                }
                if (player1 <= 0 && player2 <= 0) {
                    System.out.println("You did the impossible");
                    System.out.println("9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999 games played");
                    players = players - 2;
                }
                if (player2 <= 0) {
                    System.out.println(playr2 + " " + "lost the game");
                    System.out.println(n + " " + "games played");
                    players--;
                }
            }
            if (players == 3) {
                System.out.print("Player 1 enter your name:");
                playr1 = k.next();
                System.out.print("Player 2 enter your name:");
                playr2 = k.next();
                System.out.print("Player 3 enter your name:");
                playr3 = k.next();
                while (player1 >= 1 && player2 >= 1 && player3 >= 1 && l1 < 2) {
                    n++;
                    System.out.println("Dice are rolling...");
                    TimeUnit.SECONDS.sleep(1);
                    dice1 = p.nextInt(6) + 1;
                    System.out.println(playr1 + "'s dice:" + dice1);
                    dice2 = p.nextInt(6) + 1;
                    System.out.println(playr2 + "'s dice:" + dice2);
                    dice3 = p.nextInt(6) + 1;
                    System.out.println(playr3 + "'s dice:" + dice3);
                    TimeUnit.SECONDS.sleep(1);
                    if (dice1 > dice2) {
                        if (dice1 > dice3) {
                            if (dice2 > dice3) {
                                System.out.println(playr1 + " " + "won");
                                TimeUnit.SECONDS.sleep(1);
                                backup = dice1;
                                dice1 = dice1 - dice2;
                                player1 = player1 + dice1;
                                player2 = player2 - dice1;
                                dice1 = backup;
                                dice1 = dice1 - dice3;
                                player1 = player1 + dice1;
                                player3 = player3 - dice1;
                                System.out.println(playr1 + ":" + player1);
                                System.out.println(playr2 + ":" + player2);
                                System.out.println(playr3 + ":" + player3);
                                TimeUnit.SECONDS.sleep(1);
                            } else if (dice3 > dice2) {
                                System.out.println(playr1 + " " + "won");
                                TimeUnit.SECONDS.sleep(1);
                                backup = dice1;
                                dice1 = dice1 - dice3;
                                player1 = player1 + dice1;
                                player3 = player3 - dice1;
                                dice1 = backup;
                                dice1 = dice1 - dice2;
                                player1 = player1 + dice1;
                                player2 = player2 - dice1;
                                System.out.println(playr1 + ":" + player1);
                                System.out.println(playr2 + ":" + player2);
                                System.out.println(playr3 + ":" + player3);
                                TimeUnit.SECONDS.sleep(1);
                            } else {
                                System.out.println(playr1 + " " + "won");
                                TimeUnit.SECONDS.sleep(1);
                                dice1 = dice1 - dice2;
                                player1 = player1 + (2 * dice1);
                                player2 = player2 - dice1;
                                player3 = player3 - dice1;
                                System.out.println(playr1 + ":" + player1);
                                System.out.println(playr2 + ":" + player2);
                                System.out.println(playr3 + ":" + player3);
                                TimeUnit.SECONDS.sleep(1);
                            }
                        } else if (dice3 > dice1) {
                            System.out.println(playr3 + " " + "won");
                            TimeUnit.SECONDS.sleep(1);
                            backup = dice3;
                            dice3 = dice3 - dice1;
                            player3 = player3 + dice3;
                            player1 = player1 - dice3;
                            dice3 = backup;
                            dice3 = dice3 - dice2;
                            player3 = player3 + dice3;
                            player2 = player2 - dice3;
                            System.out.println(playr1 + ":" + player1);
                            System.out.println(playr2 + ":" + player2);
                            System.out.println(playr3 + ":" + player3);
                            TimeUnit.SECONDS.sleep(1);
                        } else {
                            System.out.println(playr1 + " " + "and" + " " + playr3 + " " + "won");
                            TimeUnit.SECONDS.sleep(1);
                            dice1 = dice1 - dice2;
                            player1 = player1 + dice1;
                            player3 = player3 + dice1;
                            player2 = player2 - dice1;
                            System.out.println(playr1 + ":" + player1);
                            System.out.println(playr2 + ":" + player2);
                            System.out.println(playr3 + ":" + player3);
                            TimeUnit.SECONDS.sleep(1);
                        }
                    } else if (dice2 > dice1) {
                        if (dice2 > dice3) {
                            if (dice3 > dice1) {
                                System.out.println(playr2 + " " + "won");
                                TimeUnit.SECONDS.sleep(1);
                                backup = dice2;
                                dice2 = dice2 - dice3;
                                player2 = player2 + dice2;
                                player3 = player3 - dice2;
                                dice2 = backup;
                                dice2 = dice2 - dice1;
                                player2 = player2 + dice2;
                                player1 = player1 - dice2;
                                System.out.println(playr1 + ":" + player1);
                                System.out.println(playr2 + ":" + player2);
                                System.out.println(playr3 + ":" + player3);
                                TimeUnit.SECONDS.sleep(1);
                            } else if (dice1 > dice3) {
                                System.out.println(playr2 + " " + "won");
                                TimeUnit.SECONDS.sleep(1);
                                backup = dice2;
                                dice2 = dice2 - dice1;
                                player2 = player2 + dice2;
                                player1 = player1 - dice2;
                                dice2 = backup;
                                dice2 = dice2 - dice3;
                                player2 = player2 + dice2;
                                player3 = player3 - dice2;
                                System.out.println(playr1 + ":" + player1);
                                System.out.println(playr2 + ":" + player2);
                                System.out.println(playr3 + ":" + player3);
                                TimeUnit.SECONDS.sleep(1);
                            } else {
                                System.out.println(playr2 + " " + "won");
                                TimeUnit.SECONDS.sleep(1);
                                dice2 = dice2 - dice1;
                                player2 = player2 + (2 * dice2);
                                player1 = player1 - dice2;
                                player3 = player3 - dice2;
                                System.out.println(playr1 + ":" + player1);
                                System.out.println(playr2 + ":" + player2);
                                System.out.println(playr3 + ":" + player3);
                                TimeUnit.SECONDS.sleep(1);
                            }
                        } else if (dice3 > dice2) {
                            System.out.println(playr3 + " " + "won");
                            TimeUnit.SECONDS.sleep(1);
                            backup = dice3;
                            dice3 = dice3 - dice2;
                            player3 = player3 + dice3;
                            player2 = player2 - dice3;
                            dice3 = backup;
                            dice3 = dice3 - dice1;
                            player3 = player3 + dice3;
                            player1 = player1 - dice3;
                            System.out.println(playr1 + ":" + player1);
                            System.out.println(playr2 + ":" + player2);
                            System.out.println(playr3 + ":" + player3);
                            TimeUnit.SECONDS.sleep(1);
                        } else {
                            System.out.println(playr2 + " " + "and" + " " + playr3 + " " + "won");
                            TimeUnit.SECONDS.sleep(1);
                            dice2 = dice2 - dice1;
                            player2 = player2 + dice2;
                            player3 = player3 + dice2;
                            player1 = player1 - dice2;
                            System.out.println(playr1 + ":" + player1);
                            System.out.println(playr2 + ":" + player2);
                            System.out.println(playr3 + ":" + player3);
                            TimeUnit.SECONDS.sleep(1);
                        }
                    } else if (dice1 == dice2) {
                        if (dice3 > dice1) {
                            System.out.println(playr3 + " " + "won");
                            TimeUnit.SECONDS.sleep(1);
                            dice3 = dice3 - dice1;
                            player3 = player3 + dice3;
                            player2 = player2 - dice3;
                            player1 = player1 - dice3;
                            System.out.println(playr1 + ":" + player1);
                            System.out.println(playr2 + ":" + player2);
                            System.out.println(playr3 + ":" + player3);
                            TimeUnit.SECONDS.sleep(1);
                        }
                        if (dice3 > dice2) {
                            System.out.println(playr3 + " " + "won");
                            TimeUnit.SECONDS.sleep(1);
                            dice3 = dice3 - dice1;
                            player3 = player3 + dice3;
                            player2 = player2 - dice3;
                            player1 = player1 - dice3;
                            System.out.println(playr1 + ":" + player1);
                            System.out.println(playr2 + ":" + player2);
                            System.out.println(playr3 + ":" + player3);
                            TimeUnit.SECONDS.sleep(1);
                        }
                        if (dice3 == dice1) {
                            System.out.println("Dice are even");
                            TimeUnit.SECONDS.sleep(1);
                        } else if (dice3 == dice2) {
                            System.out.println("Dice are even");
                            TimeUnit.SECONDS.sleep(1);
                        }
                        if (dice1 > dice3) {
                            System.out.println(playr1 + " " + "and" + " " + playr2 + "won");
                            TimeUnit.SECONDS.sleep(1);
                            dice1 = dice1 - dice3;
                            player1 = player1 + dice1;
                            player2 = player2 + dice1;
                            player3 = player3 - dice1;
                            System.out.println(playr1 + ":" + player1);
                            System.out.println(playr2 + ":" + player2);
                            System.out.println(playr3 + ":" + player3);
                            TimeUnit.SECONDS.sleep(1);
                        }
                        if (dice2 > dice3) {
                            System.out.println(playr1 + " " + "and" + " " + playr2 + "won");
                            TimeUnit.SECONDS.sleep(1);
                            dice1 = dice1 - dice3;
                            player1 = player1 + dice1;
                            player2 = player2 + dice1;
                            player3 = player3 - dice1;
                            System.out.println(playr1 + ":" + player1);
                            System.out.println(playr2 + ":" + player2);
                            System.out.println(playr3 + ":" + player3);
                            TimeUnit.SECONDS.sleep(1);
                        }
                    }
                    if (player1 >= 1 && player2 >= 1 && player3 >= 1 && l1 == 1) {
                        System.out.print("Replay(Y/N):");
                        choice = k.next();
                        switch (choice) {
                            case ("Y"):
                                break;
                            case ("y"):
                                break;
                            case ("n"):
                                l1 = 2;
                                break;
                            case ("N"):
                                l1 = 2;
                                break;
                        }
                    }
                }
                if (player1 >= 1 && player2 >= 1 && player3 >= 1) {
                    System.out.println("You left the game half");
                    System.out.println(n + " " + "games played");
                }
                if (player1 <= 0) {
                    System.out.println(playr1 + " " + "lost the game");
                    System.out.println(n + " " + "games played");
                    players--;
                }
                if (player1 <= 0 && player2 <= 0) {
                    System.out.println(playr1 + " " + "and" + " " + playr2 + " " + "lost the game");
                    System.out.println(n + " " + "games played");
                    players = players - 2;
                }
                if (player1 <= 0 && player2 <= 0 && player3 <= 0) {
                    System.out.println("You did the impossible");
                    System.out.println("9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999 games played");
                    players = players - 3;
                }
                if (player2 <= 0) {
                    System.out.println(playr2 + " " + "lost the game");
                    System.out.println(n + " " + "games played");
                    players--;
                }
                if (player2 <= 0 && player3 <= 0) {
                    System.out.println(playr2 + " " + "and" + " " + playr3 + " " + "lost the game");
                    System.out.println(n + " " + "games played");
                    players = players - 2;
                }
                if (player3 <= 0) {
                    System.out.println(playr3 + " " + "lost the game");
                    System.out.println(n + " " + "games played");
                    players--;
                }
                if (player1 <= 0 && player3 <= 0) {
                    System.out.println(playr1 + " " + "and" + " " + playr3 + " " + "lost the game");
                    System.out.println(n + " " + "games played");
                    players = players - 2;
                }
            }
            if (players == 4) {
                System.out.print("Player 1 enter your name:");
                playr1 = k.next();
                System.out.print("Player 2 enter your name:");
                playr2 = k.next();
                System.out.print("Player 3 enter your name:");
                playr3 = k.next();
                System.out.print("Player 4 enter your name:");
                playr4 = k.next();
                while (player1 >= 1 && player2 >= 1 && player3 >= 1 && player4 >= 1 && l2 < 2) {
                    n++;
                    System.out.println("Dice are rolling...");
                    TimeUnit.SECONDS.sleep(1);
                    dice1 = p.nextInt(6) + 1;
                    System.out.println(playr1 + "'s dice:" + dice1);
                    dice2 = p.nextInt(6) + 1;
                    System.out.println(playr2 + "'s dice:" + dice2);
                    dice3 = p.nextInt(6) + 1;
                    System.out.println(playr3 + "'s dice:" + dice3);
                    dice4 = p.nextInt(6) + 1;
                    System.out.println(playr4 + "'s dice:" + dice4);
                    if (dice1 > dice2) {
                        if (dice2 > dice3) {
                            if (dice3 > dice4) {
                                System.out.println(playr1 + " " + "won");
                                TimeUnit.SECONDS.sleep(1);
                                backup = dice1;
                                dice1 = dice1 - dice2;
                                player1 = player1 + dice1;
                                player2 = player2 - dice1;
                                dice1 = backup;
                                dice1 = dice1 - dice3;
                                player1 = player1 + dice1;
                                player3 = player3 + dice1;
                                dice1 = backup;
                                dice1 = dice1 - dice4;
                                player1 = player1 + dice1;
                                player4 = player4 - dice1;
                                System.out.println(playr1 + ":" + player1);
                                System.out.println(playr2 + ":" + player2);
                                System.out.println(playr3 + ":" + player3);
                                System.out.println(playr4 + ":" + player4);
                                TimeUnit.SECONDS.sleep(1);
                            } else if (dice4 > dice3) {
                                System.out.println(playr1 + " " + "won");
                                TimeUnit.SECONDS.sleep(1);
                                backup = dice1;
                                dice1 = dice1 - dice2;
                                player1 = player1 + dice1;
                                player2 = player2 - dice1;
                                dice1 = backup;
                                dice1 = dice1 - dice3;
                                player1 = player1 + dice1;
                                player3 = player3 - dice1;
                                dice1 = backup;
                                dice1 = dice1 - dice4;
                                player1 = player1 + dice1;
                                player4 = player4 - dice1;
                                System.out.println(playr1 + ":" + player1);
                                System.out.println(playr2 + ":" + player2);
                                System.out.println(playr3 + ":" + player3);
                                System.out.println(playr4 + ":" + player4);
                                TimeUnit.SECONDS.sleep(1);
                            } else {
                                System.out.println(playr1 + " " + "won");
                                TimeUnit.SECONDS.sleep(1);
                                backup = dice1;
                                dice1 = dice1 - dice2;
                                player1 = player1 + dice1;
                                player2 = player2 - dice1;
                                dice1 = backup;
                                dice1 = dice1 - dice3;
                                player1 = player1 + (2 * dice1);
                                player3 = player3 - dice1;
                                player4 = player4 - dice1;
                                System.out.println(playr1 + ":" + player1);
                                System.out.println(playr2 + ":" + player2);
                                System.out.println(playr3 + ":" + player3);
                                System.out.println(playr4 + ":" + player4);
                                TimeUnit.SECONDS.sleep(1);
                            }
                        }
                        if (dice3 > dice2) {
                            if (dice1 > dice3) {
                                if (dice2 > dice4) {
                                    System.out.println(playr1 + " " + "won");
                                    TimeUnit.SECONDS.sleep(1);
                                    backup = dice1;
                                    dice1 = dice1 - dice2;
                                    player1 = player1 + dice1;
                                    player2 = player2 - dice1;
                                    dice1 = backup;
                                    dice1 = dice1 - dice3;
                                    player1 = player1 + dice1;
                                    player3 = player3 - dice1;
                                    dice1 = backup;
                                    dice1 = dice1 - dice4;
                                    player1 = player1 + dice1;
                                    player4 = player4 - dice1;
                                    System.out.println(playr1 + ":" + player1);
                                    System.out.println(playr2 + ":" + player2);
                                    System.out.println(playr3 + ":" + player3);
                                    System.out.println(playr4 + ":" + player4);
                                    TimeUnit.SECONDS.sleep(1);
                                }
                                if (dice4 > dice2) {
                                    if (dice3 > dice4) {
                                        System.out.println(playr1 + " " + "won");
                                        TimeUnit.SECONDS.sleep(1);
                                        backup = dice1;
                                        dice1 = dice1 - dice2;
                                        player1 = player1 + dice1;
                                        player2 = player2 - dice1;
                                        dice1 = backup;
                                        dice1 = dice1 - dice3;
                                        player1 = player1 + dice1;
                                        player3 = player3 - dice1;
                                        dice1 = backup;
                                        dice1 = dice1 - dice4;
                                        player1 = player1 + dice1;
                                        player4 = player4 - dice1;
                                        System.out.println(playr1 + ":" + player1);
                                        System.out.println(playr2 + ":" + player2);
                                        System.out.println(playr3 + ":" + player3);
                                        System.out.println(playr4 + ":" + player4);
                                        TimeUnit.SECONDS.sleep(1);
                                    }
                                    if (dice4 > dice3) {
                                        if (dice1 > dice4) {
                                            System.out.println(playr1 + " " + "won");
                                            TimeUnit.SECONDS.sleep(1);
                                            backup = dice1;
                                            dice1 = dice1 - dice2;
                                            player1 = player1 + dice1;
                                            player2 = player2 - dice1;
                                            dice1 = backup;
                                            dice1 = dice1 - dice3;
                                            player1 = player1 + dice1;
                                            player3 = player3 - dice1;
                                            dice1 = backup;
                                            dice1 = dice1 - dice4;
                                            player1 = player1 + dice1;
                                            player4 = player4 - dice1;
                                            System.out.println(playr1 + ":" + player1);
                                            System.out.println(playr2 + ":" + player2);
                                            System.out.println(playr3 + ":" + player3);
                                            System.out.println(playr4 + ":" + player4);
                                            TimeUnit.SECONDS.sleep(1);
                                        } else if (dice4 > dice1) {
                                            System.out.println(playr4 + " " + "won");
                                            TimeUnit.SECONDS.sleep(1);
                                            backup = dice4;
                                            dice4 = dice4 - dice1;
                                            player1 = player1 - dice4;
                                            player4 = player4 + dice4;
                                            dice4 = backup;
                                            dice4 = dice4 - dice2;
                                            player4 = player4 + dice4;
                                            player2 = player2 - dice4;
                                            dice4 = backup;
                                            dice4 = dice4 - dice3;
                                            player4 = player4 + dice4;
                                            player3 = player3 - dice4;
                                            System.out.println(playr1 + ":" + player1);
                                            System.out.println(playr2 + ":" + player2);
                                            System.out.println(playr3 + ":" + player3);
                                            System.out.println(playr4 + ":" + player4);
                                            TimeUnit.SECONDS.sleep(1);
                                        } else {
                                            System.out.println(playr1 + " " + "and" + " " + playr4 + "won");
                                            TimeUnit.SECONDS.sleep(1);
                                            backup = dice1;
                                            dice1 = dice1 - dice2;
                                            player1 = player1 + dice1;
                                            player4 = player4 + dice1;
                                            player2 = player2 - dice1;
                                            dice1 = backup;
                                            dice1 = dice1 - dice3;
                                            player1 = player1 + dice1;
                                            player4 = player4 + dice1;
                                            player3 = player3 - dice1;
                                            System.out.println(playr1 + ":" + player1);
                                            System.out.println(playr2 + ":" + player2);
                                            System.out.println(playr3 + ":" + player3);
                                            System.out.println(playr4 + ":" + player4);
                                            TimeUnit.SECONDS.sleep(1);
                                        }
                                    }
                                    if (dice4 == dice3) {
                                        System.out.println(playr1 + " " + "won");
                                        TimeUnit.SECONDS.sleep(1);
                                        backup = dice1;
                                        dice1 = dice1 - dice2;
                                        player1 = player1 + dice1;
                                        player2 = player2 - dice1;
                                        dice1 = backup;
                                        dice1 = dice1 - dice3;
                                        player1 = player1 + (2 * dice1);
                                        player3 = player3 - dice1;
                                        player4 = player4 - dice1;
                                        System.out.println(playr1 + ":" + player1);
                                        System.out.println(playr2 + ":" + player2);
                                        System.out.println(playr3 + ":" + player3);
                                        System.out.println(playr4 + ":" + player4);
                                        TimeUnit.SECONDS.sleep(1);
                                    }
                                }
                                if (dice4 == dice2) {
                                    System.out.println(playr1 + " " + "won");
                                    TimeUnit.SECONDS.sleep(1);
                                    backup = dice1;
                                    dice1 = dice1 - dice3;
                                    player1 = player1 + dice1;
                                    player3 = player3 - dice1;
                                    dice1 = backup;
                                    dice1 = dice1 - dice2;
                                    player1 = player1 + (2 * dice1);
                                    player2 = player2 - dice1;
                                    player4 = player4 - dice1;
                                    System.out.println(playr1 + ":" + player1);
                                    System.out.println(playr2 + ":" + player2);
                                    System.out.println(playr3 + ":" + player3);
                                    System.out.println(playr4 + ":" + player4);
                                    TimeUnit.SECONDS.sleep(1);
                                }
                            }
                            if (dice3 > dice1) {
                                if (dice2 > dice4) {
                                    System.out.println(playr3 + " " + "won");
                                    TimeUnit.SECONDS.sleep(1);
                                    backup = dice3;
                                    dice3 = dice3 - dice1;
                                    player3 = player3 + dice3;
                                    player1 = player1 - dice3;
                                    dice3 = backup;
                                    dice3 = dice3 - dice2;
                                    player3 = player3 + dice3;
                                    player2 = player2 - dice3;
                                    dice3 = backup;
                                    dice3 = dice3 - dice4;
                                    player3 = player3 + dice3;
                                    player4 = player4 - dice3;
                                    System.out.println(playr1 + ":" + player1);
                                    System.out.println(playr2 + ":" + player2);
                                    System.out.println(playr3 + ":" + player3);
                                    System.out.println(playr4 + ":" + player4);
                                    TimeUnit.SECONDS.sleep(1);
                                }
                                if (dice4 > dice2) {
                                    if (dice1 > dice4) {
                                        System.out.println(playr3 + " " + "won");
                                        TimeUnit.SECONDS.sleep(1);
                                        backup = dice3;
                                        dice3 = dice3 - dice1;
                                        player3 = player3 + dice3;
                                        player1 = player1 - dice3;
                                        dice3 = backup;
                                        dice3 = dice3 - dice2;
                                        player3 = player3 + dice3;
                                        player2 = player2 - dice3;
                                        dice3 = backup;
                                        dice3 = dice3 - dice4;
                                        player3 = player3 + dice3;
                                        player4 = player4 - dice3;
                                        System.out.println(playr1 + ":" + player1);
                                        System.out.println(playr2 + ":" + player2);
                                        System.out.println(playr3 + ":" + player3);
                                        System.out.println(playr4 + ":" + player4);
                                        TimeUnit.SECONDS.sleep(1);
                                    }
                                    if (dice4 > dice1) {
                                        if (dice3 > dice4) {
                                            System.out.println(playr3 + " " + "won");
                                            TimeUnit.SECONDS.sleep(1);
                                            backup = dice3;
                                            dice3 = dice3 - dice1;
                                            player3 = player3 + dice3;
                                            player1 = player1 - dice3;
                                            dice3 = backup;
                                            dice3 = dice3 - dice2;
                                            player3 = player3 + dice3;
                                            player2 = player2 - dice3;
                                            dice3 = backup;
                                            dice3 = dice3 - dice4;
                                            player3 = player3 + dice3;
                                            player4 = player4 - dice3;
                                            System.out.println(playr1 + ":" + player1);
                                            System.out.println(playr2 + ":" + player2);
                                            System.out.println(playr3 + ":" + player3);
                                            System.out.println(playr4 + ":" + player4);
                                            TimeUnit.SECONDS.sleep(1);
                                        }
                                        if (dice4 > dice3) {
                                            System.out.println(playr4 + " " + "won");
                                            TimeUnit.SECONDS.sleep(1);
                                            backup = dice4;
                                            dice4 = dice4 - dice1;
                                            player4 = player4 + dice4;
                                            player1 = player1 - dice4;
                                            dice4 = backup;
                                            dice4 = dice4 - dice2;
                                            player4 = player4 + dice4;
                                            player2 = player2 - dice4;
                                            dice4 = backup;
                                            dice4 = dice4 - dice3;
                                            player4 = player4 + dice4;
                                            player3 = player3 - dice4;
                                            System.out.println(playr1 + ":" + player1);
                                            System.out.println(playr2 + ":" + player2);
                                            System.out.println(playr3 + ":" + player3);
                                            System.out.println(playr4 + ":" + player4);
                                            TimeUnit.SECONDS.sleep(1);
                                        }
                                        if (dice4 == dice3) {
                                            System.out.println(playr3 + " " + "and" + " " + playr4 + "won");
                                            TimeUnit.SECONDS.sleep(1);
                                            backup = dice4;
                                            dice4 = dice4 - dice2;
                                            player4 = player4 + dice4;
                                            player3 = player3 + dice4;
                                            player2 = player2 - dice4;
                                            dice4 = backup;
                                            dice4 = dice4 - dice1;
                                            player4 = player4 + dice4;
                                            player3 = player3 + dice4;
                                            player1 = player1 - dice4;
                                            System.out.println(playr1 + ":" + player1);
                                            System.out.println(playr2 + ":" + player2);
                                            System.out.println(playr3 + ":" + player3);
                                            System.out.println(playr4 + ":" + player4);
                                            TimeUnit.SECONDS.sleep(1);
                                        }
                                    }
                                    if (dice1 == dice4) {
                                        System.out.println(playr3 + " " + "won");
                                        TimeUnit.SECONDS.sleep(1);
                                        backup = dice3;
                                        dice3 = dice3 - dice1;
                                        player3 = player3 + (2 * dice3);
                                        player4 = player4 - dice3;
                                        player1 = player1 - dice3;
                                        dice3 = backup;
                                        dice3 = dice3 - dice2;
                                        player3 = player3 + dice3;
                                        player2 = player2 - dice3;
                                        System.out.println(playr1 + ":" + player1);
                                        System.out.println(playr2 + ":" + player2);
                                        System.out.println(playr3 + ":" + player3);
                                        System.out.println(playr4 + ":" + player4);
                                        TimeUnit.SECONDS.sleep(1);
                                    }
                                }
                                if (dice2 == dice4) {
                                    System.out.println(playr3 + " " + "won");
                                    TimeUnit.SECONDS.sleep(1);
                                    backup = dice3;
                                    dice3 = dice3 - dice1;
                                    player3 = player3 + dice3;
                                    player1 = player1 - dice3;
                                    dice3 = backup;
                                    dice3 = dice3 - dice2;
                                    player3 = player3 + (2 * dice3);
                                    player2 = player2 - dice3;
                                    player4 = player4 - dice3;
                                    System.out.println(playr1 + ":" + player1);
                                    System.out.println(playr2 + ":" + player2);
                                    System.out.println(playr3 + ":" + player3);
                                    System.out.println(playr4 + ":" + player4);
                                    TimeUnit.SECONDS.sleep(1);
                                }
                            }
                            if (dice1 == dice3) {
                                if (dice2 > dice4) {
                                    System.out.println(playr1 + " " + "and" + " " + playr3 + "won");
                                    TimeUnit.SECONDS.sleep(1);
                                    backup = dice1;
                                    dice1 = dice1 - dice2;
                                    player1 = player1 + dice1;
                                    player3 = player3 + dice1;
                                    player2 = player2 - dice1;
                                    dice1 = backup;
                                    dice1 = dice1 - dice4;
                                    player1 = player1 + dice1;
                                    player3 = player3 + dice1;
                                    player4 = player4 - dice1;
                                    System.out.println(playr1 + ":" + player1);
                                    System.out.println(playr2 + ":" + player2);
                                    System.out.println(playr3 + ":" + player3);
                                    System.out.println(playr4 + ":" + player4);
                                    TimeUnit.SECONDS.sleep(1);
                                }
                                if (dice4 > dice2) {
                                    if (dice1 > dice4) {
                                        System.out.println(playr1 + " " + "and" + " " + playr3 + "won");
                                        TimeUnit.SECONDS.sleep(1);
                                        backup = dice1;
                                        dice1 = dice1 - dice2;
                                        player1 = player1 + dice1;
                                        player3 = player3 + dice1;
                                        player2 = player2 - dice1;
                                        dice1 = backup;
                                        dice1 = dice1 - dice4;
                                        player1 = player1 + dice1;
                                        player3 = player3 + dice1;
                                        player4 = player4 - dice1;
                                        System.out.println(playr1 + ":" + player1);
                                        System.out.println(playr2 + ":" + player2);
                                        System.out.println(playr3 + ":" + player3);
                                        System.out.println(playr4 + ":" + player4);
                                        TimeUnit.SECONDS.sleep(1);
                                    }
                                    if (dice4 > dice1) {
                                        System.out.println(playr4 + " " + "won");
                                        TimeUnit.SECONDS.sleep(1);
                                        backup = dice4;
                                        dice4 = dice4 - dice1;
                                        player4 = player4 + (2 * dice4);
                                        player1 = player1 - dice4;
                                        player3 = player3 - dice4;
                                        dice4 = backup;
                                        dice4 = dice4 - dice2;
                                        player4 = player4 + dice4;
                                        player2 = player2 - dice4;
                                        System.out.println(playr1 + ":" + player1);
                                        System.out.println(playr2 + ":" + player2);
                                        System.out.println(playr3 + ":" + player3);
                                        System.out.println(playr4 + ":" + player4);
                                        TimeUnit.SECONDS.sleep(1);
                                    }
                                    if (dice4 == dice1) {
                                        System.out.println(playr1 + " " + "and" + " " + playr3 + " " + "and" + " " + playr4 + " " + "won");
                                        TimeUnit.SECONDS.sleep(1);
                                        dice1 = dice1 - dice2;
                                        player1 = player1 + dice1;
                                        player2 = player2 - dice1;
                                        player3 = player3 + dice1;
                                        player4 = player4 + dice1;
                                        System.out.println(playr1 + ":" + player1);
                                        System.out.println(playr2 + ":" + player2);
                                        System.out.println(playr3 + ":" + player3);
                                        System.out.println(playr4 + ":" + player4);
                                        TimeUnit.SECONDS.sleep(1);
                                    }
                                }
                                if (dice2 == dice4) {
                                    System.out.println(playr1 + " " + "and" + " " + playr3 + " " + "won");
                                    TimeUnit.SECONDS.sleep(1);
                                    dice1 = dice1 - dice2;
                                    player1 = player1 + dice1;
                                    player2 = player2 - dice1;
                                    player3 = player3 + dice1;
                                    player4 = player4 - dice1;
                                    System.out.println(playr1 + ":" + player1);
                                    System.out.println(playr2 + ":" + player2);
                                    System.out.println(playr3 + ":" + player3);
                                    System.out.println(playr4 + ":" + player4);
                                    TimeUnit.SECONDS.sleep(1);
                                }
                            }
                        }
                        if (dice2 == dice3) {
                            if (dice3 > dice4 && dice2 > dice4) {
                                System.out.println(playr1 + " " + "won");
                                TimeUnit.SECONDS.sleep(1);
                                backup = dice1;
                                dice1 = dice1 - dice2;
                                player1 = player1 + (2 * dice1);
                                player2 = player2 - dice1;
                                player3 = player3 - dice1;
                                dice1 = backup;
                                dice1 = dice1 - dice4;
                                player1 = player1 + dice1;
                                player4 = player4 - dice1;
                                System.out.println(playr1 + ":" + player1);
                                System.out.println(playr2 + ":" + player2);
                                System.out.println(playr3 + ":" + player3);
                                System.out.println(playr4 + ":" + player4);
                                TimeUnit.SECONDS.sleep(1);
                            }
                            if (dice4 > dice3 && dice4 > dice2) {
                                System.out.println(playr1 + " " + "won");
                                TimeUnit.SECONDS.sleep(1);
                                backup = dice1;
                                dice1 = dice1 - dice4;
                                player1 = player1 + dice1;
                                player4 = player4 - dice1;
                                dice1 = backup;
                                dice1 = dice1 - dice2;
                                player1 = player1 + (2 * dice1);
                                player2 = player2 - dice1;
                                player3 = player3 - dice1;
                                System.out.println(playr1 + ":" + player1);
                                System.out.println(playr2 + ":" + player2);
                                System.out.println(playr3 + ":" + player3);
                                System.out.println(playr4 + ":" + player4);
                                TimeUnit.SECONDS.sleep(1);
                            }
                            if (dice3 == dice4 && dice2 == dice4) {
                                System.out.println(playr1 + " " + "won");
                                TimeUnit.SECONDS.sleep(1);
                                dice1 = dice1 - dice2;
                                player1 = player1 + dice1;
                                player2 = player2 - dice1;
                                player3 = player3 - dice1;
                                player4 = player4 - dice1;
                                System.out.println(playr1 + ":" + player1);
                                System.out.println(playr2 + ":" + player2);
                                System.out.println(playr3 + ":" + player3);
                                System.out.println(playr4 + ":" + player4);
                                TimeUnit.SECONDS.sleep(1);
                            }
                        }
                    }
                    if (dice2 > dice1) {
                        if (dice1 > dice3) {
                            if (dice3 > dice4) {
                                System.out.println(playr2 + " " + "won");
                                TimeUnit.SECONDS.sleep(1);
                                backup = dice2;
                                dice2 = dice2 - dice1;
                                player2 = player2 + dice2;
                                player1 = player1 - dice2;
                                dice2 = backup;
                                dice2 = dice2 - dice3;
                                player2 = player2 + dice2;
                                player3 = player3 - dice2;
                                dice2 = backup;
                                dice2 = dice2 - dice4;
                                player4 = player4 - dice2;
                                player2 = player2 + dice2;
                                System.out.println(playr1 + ":" + player1);
                                System.out.println(playr2 + ":" + player2);
                                System.out.println(playr3 + ":" + player3);
                                System.out.println(playr4 + ":" + player4);
                                TimeUnit.SECONDS.sleep(1);
                            }
                            if (dice4 > dice3) {
                                if (dice1 > dice4) {
                                    System.out.println(playr2 + " " + "won");
                                    TimeUnit.SECONDS.sleep(1);
                                    backup = dice2;
                                    dice2 = dice2 - dice1;
                                    player1 = player1 - dice2;
                                    player2 = player2 + dice2;
                                    dice2 = backup;
                                    dice2 = dice2 - dice3;
                                    player2 = player2 + dice2;
                                    player3 = player3 - dice2;
                                    dice2 = backup;
                                    dice2 = dice2 - dice4;
                                    player2 = player2 + dice2;
                                    player4 = player4 - dice2;
                                    System.out.println(playr1 + ":" + player1);
                                    System.out.println(playr2 + ":" + player2);
                                    System.out.println(playr3 + ":" + player3);
                                    System.out.println(playr4 + ":" + player4);
                                    TimeUnit.SECONDS.sleep(1);
                                }
                                if (dice4 > dice1) {
                                    if (dice2 > dice4) {
                                        System.out.println(playr2 + " " + "won");
                                        TimeUnit.SECONDS.sleep(1);
                                        backup = dice2;
                                        dice2 = dice2 - dice4;
                                        player2 = player2 + dice2;
                                        player4 = player4 - dice2;
                                        dice2 = backup;
                                        dice2 = dice2 - dice1;
                                        player2 = player2 + dice2;
                                        player1 = player1 - dice2;
                                        dice2 = backup;
                                        dice2 = dice2 - dice3;
                                        player2 = player2 + dice2;
                                        player3 = player3 - dice2;
                                        System.out.println(playr1 + ":" + player1);
                                        System.out.println(playr2 + ":" + player2);
                                        System.out.println(playr3 + ":" + player3);
                                        System.out.println(playr4 + ":" + player4);
                                        TimeUnit.SECONDS.sleep(1);
                                    }
                                    if (dice4 > dice2) {
                                        System.out.println(playr4 + " " + "won");
                                        TimeUnit.SECONDS.sleep(1);
                                        backup = dice4;
                                        dice4 = dice4 - dice1;
                                        player4 = player4 + dice4;
                                        player1 = player1 - dice4;
                                        dice4 = backup;
                                        dice4 = dice4 - dice2;
                                        player4 = player4 + dice4;
                                        player2 = player2 - dice4;
                                        dice4 = backup;
                                        dice4 = dice4 - dice3;
                                        player4 = player4 + dice4;
                                        player3 = player3 - dice4;
                                        System.out.println(playr1 + ":" + player1);
                                        System.out.println(playr2 + ":" + player2);
                                        System.out.println(playr3 + ":" + player3);
                                        System.out.println(playr4 + ":" + player4);
                                        TimeUnit.SECONDS.sleep(1);
                                    }
                                    if (dice2 == dice4) {
                                        System.out.println(playr2 + " " + "and" + " " + playr4 + " " + "won");
                                        TimeUnit.SECONDS.sleep(1);
                                        backup = dice2;
                                        dice2 = dice2 - dice1;
                                        player2 = player2 + dice2;
                                        player4 = player4 + dice2;
                                        player1 = player1 - dice2;
                                        dice2 = backup;
                                        dice2 = dice2 - dice3;
                                        player2 = player2 + dice2;
                                        player3 = player3 - dice2;
                                        player4 = player4 + dice2;
                                        System.out.println(playr1 + ":" + player1);
                                        System.out.println(playr2 + ":" + player2);
                                        System.out.println(playr3 + ":" + player3);
                                        System.out.println(playr4 + ":" + player4);
                                        TimeUnit.SECONDS.sleep(1);
                                    }
                                }
                                if (dice1 == dice4) {
                                    System.out.println(playr2 + " " + "won");
                                    TimeUnit.SECONDS.sleep(1);
                                    backup = dice2;
                                    dice2 = dice2 - dice1;
                                    player2 = player2 + (2 * dice2);
                                    player1 = player1 - dice2;
                                    player4 = player4 - dice2;
                                    dice2 = backup;
                                    dice2 = dice2 - dice3;
                                    player2 = player2 + dice2;
                                    player3 = player3 - dice2;
                                    System.out.println(playr1 + ":" + player1);
                                    System.out.println(playr2 + ":" + player2);
                                    System.out.println(playr3 + ":" + player3);
                                    System.out.println(playr4 + ":" + player4);
                                    TimeUnit.SECONDS.sleep(1);
                                }
                            }
                            if (dice3 == dice4) {
                                System.out.println(playr2 + " " + "won");
                                TimeUnit.SECONDS.sleep(1);
                                backup = dice2;
                                dice2 = dice2 - dice1;
                                player2 = player2 + dice2;
                                player1 = player1 - dice2;
                                dice2 = backup;
                                dice2 = dice2 - dice3;
                                player2 = player2 + (2 * dice2);
                                player3 = player3 - dice2;
                                player4 = player4 - dice2;
                                System.out.println(playr1 + ":" + player1);
                                System.out.println(playr2 + ":" + player2);
                                System.out.println(playr3 + ":" + player3);
                                System.out.println(playr4 + ":" + player4);
                                TimeUnit.SECONDS.sleep(1);
                            }
                        }
                        if (dice3 > dice1) {
                            if (dice2 > dice3) {
                                if (dice1 > dice4) {
                                    System.out.println(playr2 + " " + "won");
                                    TimeUnit.SECONDS.sleep(1);
                                    backup = dice2;
                                    dice2 = dice2 - dice3;
                                    player2 = player2 + dice2;
                                    player3 = player3 - dice2;
                                    dice2 = backup;
                                    dice2 = dice2 - dice1;
                                    player2 = player2 + dice2;
                                    player1 = player1 - dice2;
                                    dice2 = backup;
                                    dice2 = dice2 - dice4;
                                    player2 = player2 + dice2;
                                    player4 = player4 - dice2;
                                    System.out.println(playr1 + ":" + player1);
                                    System.out.println(playr2 + ":" + player2);
                                    System.out.println(playr3 + ":" + player3);
                                    System.out.println(playr4 + ":" + player4);
                                    TimeUnit.SECONDS.sleep(1);
                                }
                                if (dice4 > dice1) {
                                    if (dice3 > dice4) {
                                        System.out.println(playr2 + " " + "won");
                                        TimeUnit.SECONDS.sleep(1);
                                        backup = dice2;
                                        dice2 = dice2 - dice1;
                                        player2 = player2 + dice2;
                                        player1 = player1 - dice2;
                                        dice2 = backup;
                                        dice2 = dice2 - dice3;
                                        player2 = player2 + dice2;
                                        player3 = player3 - dice2;
                                        dice2 = backup;
                                        dice2 = dice2 - dice4;
                                        player2 = player2 + dice2;
                                        player4 = player4 - dice2;
                                        System.out.println(playr1 + ":" + player1);
                                        System.out.println(playr2 + ":" + player2);
                                        System.out.println(playr3 + ":" + player3);
                                        System.out.println(playr4 + ":" + player4);
                                        TimeUnit.SECONDS.sleep(1);
                                    }
                                    if (dice4 > dice3) {
                                        if (dice2 > dice4) {
                                            System.out.println(playr2 + " " + "won");
                                            TimeUnit.SECONDS.sleep(1);
                                            backup = dice2;
                                            dice2 = dice2 - dice1;
                                            player2 = player2 + dice2;
                                            player1 = player1 - dice2;
                                            dice2 = backup;
                                            dice2 = dice2 - dice3;
                                            player2 = player2 + dice2;
                                            player3 = player3 - dice2;
                                            dice2 = backup;
                                            dice2 = dice2 - dice4;
                                            player2 = player2 + dice2;
                                            player4 = player4 - dice2;
                                            System.out.println(playr1 + ":" + player1);
                                            System.out.println(playr2 + ":" + player2);
                                            System.out.println(playr3 + ":" + player3);
                                            System.out.println(playr4 + ":" + player4);
                                            TimeUnit.SECONDS.sleep(1);
                                        }
                                        if (dice4 > dice2) {
                                            System.out.println(playr4 + " " + "won");
                                            TimeUnit.SECONDS.sleep(1);
                                            backup = dice4;
                                            dice4 = dice4 - dice1;
                                            player4 = player4 + dice4;
                                            player1 = player1 - dice4;
                                            dice4 = backup;
                                            dice4 = dice4 - dice2;
                                            player4 = player4 + dice4;
                                            player2 = player2 - dice4;
                                            dice4 = backup;
                                            dice4 = dice4 - dice3;
                                            player4 = player4 + dice4;
                                            player3 = player3 - dice4;
                                            System.out.println(playr1 + ":" + player1);
                                            System.out.println(playr2 + ":" + player2);
                                            System.out.println(playr3 + ":" + player3);
                                            System.out.println(playr4 + ":" + player4);
                                            TimeUnit.SECONDS.sleep(1);
                                        }
                                        if (dice2 == dice4) {
                                            System.out.println(playr2 + " " + "and" + " " + playr4 + " " + "won");
                                            TimeUnit.SECONDS.sleep(1);
                                            backup = dice2;
                                            dice2 = dice2 - dice1;
                                            player1 = player1 - dice2;
                                            player2 = player2 + dice2;
                                            player4 = player4 + dice2;
                                            dice2 = backup;
                                            dice2 = dice2 - dice3;
                                            player3 = player3 - dice2;
                                            player2 = player2 + dice2;
                                            player4 = player4 + dice2;
                                            System.out.println(playr1 + ":" + player1);
                                            System.out.println(playr2 + ":" + player2);
                                            System.out.println(playr3 + ":" + player3);
                                            System.out.println(playr4 + ":" + player4);
                                            TimeUnit.SECONDS.sleep(1);
                                        }
                                    }
                                    if (dice3 == dice4) {
                                        System.out.println(playr2 + " " + "won");
                                        TimeUnit.SECONDS.sleep(1);
                                        backup = dice2;
                                        dice2 = dice2 - dice1;
                                        player2 = player2 + dice2;
                                        player1 = player1 - dice2;
                                        dice2 = backup;
                                        dice2 = dice2 - dice3;
                                        player2 = player2 + (2 * dice2);
                                        player3 = player3 - dice2;
                                        player4 = player4 - dice2;
                                        System.out.println(playr1 + ":" + player1);
                                        System.out.println(playr2 + ":" + player2);
                                        System.out.println(playr3 + ":" + player3);
                                        System.out.println(playr4 + ":" + player4);
                                        TimeUnit.SECONDS.sleep(1);
                                    }
                                }
                                if (dice1 == dice4) {
                                    System.out.println(playr2 + " " + "won");
                                    TimeUnit.SECONDS.sleep(1);
                                    backup = dice2;
                                    dice2 = dice2 - dice1;
                                    player2 = player2 + (2 * dice2);
                                    player1 = player1 - dice2;
                                    player4 = player4 - dice2;
                                    dice2 = backup;
                                    dice2 = dice2 - dice3;
                                    player2 = player2 + dice2;
                                    player3 = player3 - dice2;
                                    System.out.println(playr1 + ":" + player1);
                                    System.out.println(playr2 + ":" + player2);
                                    System.out.println(playr3 + ":" + player3);
                                    System.out.println(playr4 + ":" + player4);
                                    TimeUnit.SECONDS.sleep(1);
                                }
                            }
                            if (dice3 > dice2) {
                                if (dice1 > dice4) {
                                    System.out.println(playr3 + " " + "won");
                                    TimeUnit.SECONDS.sleep(1);
                                    backup = dice3;
                                    dice3 = dice3 - dice2;
                                    player3 = player3 + dice3;
                                    player2 = player2 - dice3;
                                    dice3 = backup;
                                    dice3 = dice3 - dice1;
                                    player3 = player3 + dice3;
                                    player1 = player1 - dice3;
                                    dice3 = backup;
                                    dice3 = dice3 - dice4;
                                    player3 = player3 + dice3;
                                    player4 = player4 - dice3;
                                    System.out.println(playr1 + ":" + player1);
                                    System.out.println(playr2 + ":" + player2);
                                    System.out.println(playr3 + ":" + player3);
                                    System.out.println(playr4 + ":" + player4);
                                    TimeUnit.SECONDS.sleep(1);
                                }
                                if (dice4 > dice1) {
                                    System.out.println(playr3 + " " + "won");
                                    TimeUnit.SECONDS.sleep(1);
                                    backup = dice3;
                                    dice3 = dice3 - dice2;
                                    player3 = player3 + dice3;
                                    player2 = player2 - dice3;
                                    dice3 = backup;
                                    dice3 = dice3 - dice4;
                                    player3 = player3 + dice3;
                                    player4 = player4 - dice3;
                                    dice3 = backup;
                                    dice3 = dice3 - dice1;
                                    player3 = player3 + dice3;
                                    player4 = player4 - dice3;
                                    System.out.println(playr1 + ":" + player1);
                                    System.out.println(playr2 + ":" + player2);
                                    System.out.println(playr3 + ":" + player3);
                                    System.out.println(playr4 + ":" + player4);
                                    TimeUnit.SECONDS.sleep(1);
                                }
                                if (dice1 == dice4) {
                                    System.out.println(playr3 + " " + "won");
                                    TimeUnit.SECONDS.sleep(1);
                                    backup = dice3;
                                    dice3 = dice3 - dice2;
                                    player3 = player3 + dice3;
                                    player2 = player2 - dice3;
                                    dice3 = backup;
                                    dice3 = dice3 - dice1;
                                    player3 = player3 + (2 * dice3);
                                    player1 = player1 - dice3;
                                    player4 = player4 - dice3;
                                    System.out.println(playr1 + ":" + player1);
                                    System.out.println(playr2 + ":" + player2);
                                    System.out.println(playr3 + ":" + player3);
                                    System.out.println(playr4 + ":" + player4);
                                    TimeUnit.SECONDS.sleep(1);
                                }
                            }
                            if (dice2 == dice3) {
                                if (dice1 > dice4) {
                                    System.out.println(playr2 + " " + "and" + " " + playr3 + " " + "won");
                                    TimeUnit.SECONDS.sleep(1);
                                    backup = dice2;
                                    dice2 = dice2 - dice1;
                                    player2 = player2 + dice2;
                                    player3 = player3 + dice2;
                                    player1 = player1 - dice2;
                                    dice2 = backup;
                                    dice2 = dice2 - dice4;
                                    player2 = player2 + dice2;
                                    player3 = player3 + dice2;
                                    player4 = player4 - dice2;
                                    System.out.println(playr1 + ":" + player1);
                                    System.out.println(playr2 + ":" + player2);
                                    System.out.println(playr3 + ":" + player3);
                                    System.out.println(playr4 + ":" + player4);
                                    TimeUnit.SECONDS.sleep(1);
                                }
                                if (dice4 > dice1) {
                                    if (dice2 > dice4 && dice3 > dice4) {
                                        System.out.println(playr2 + " " + "and" + " " + playr3 + " " + "won");
                                        TimeUnit.SECONDS.sleep(1);
                                        backup = dice2;
                                        dice2 = dice2 - dice1;
                                        player2 = player2 + dice2;
                                        player3 = player3 + dice2;
                                        player1 = player1 - dice2;
                                        dice2 = backup;
                                        dice2 = dice2 - dice4;
                                        player2 = player2 + dice2;
                                        player3 = player3 + dice2;
                                        player4 = player4 - dice2;
                                        System.out.println(playr1 + ":" + player1);
                                        System.out.println(playr2 + ":" + player2);
                                        System.out.println(playr3 + ":" + player3);
                                        System.out.println(playr4 + ":" + player4);
                                        TimeUnit.SECONDS.sleep(1);
                                    }
                                    if (dice4 > dice2 && dice4 > dice3) {
                                        System.out.println(playr4 + " " + "won");
                                        TimeUnit.SECONDS.sleep(1);
                                        backup = dice4;
                                        dice4 = dice4 - dice2;
                                        player4 = player4 + (2 * dice4);
                                        player2 = player2 - dice2;
                                        player3 = player3 - dice2;
                                        dice4 = backup;
                                        dice4 = dice4 - dice1;
                                        player4 = player4 + dice4;
                                        player1 = player1 - dice4;
                                        System.out.println(playr1 + ":" + player1);
                                        System.out.println(playr2 + ":" + player2);
                                        System.out.println(playr3 + ":" + player3);
                                        System.out.println(playr4 + ":" + player4);
                                        TimeUnit.SECONDS.sleep(1);
                                    }
                                    if (dice4 == dice2 && dice4 == dice3) {
                                        System.out.println(playr2 + " " + "and" + " " + playr3 + " " + "and" + " " + playr4 + " " + "won");
                                        dice2 = dice2 - dice1;
                                        player1 = player1 - dice2;
                                        player2 = player2 + dice2;
                                        player3 = player3 + dice2;
                                        player4 = player4 + dice2;
                                        System.out.println(playr1 + ":" + player1);
                                        System.out.println(playr2 + ":" + player2);
                                        System.out.println(playr3 + ":" + player3);
                                        System.out.println(playr4 + ":" + player4);
                                        TimeUnit.SECONDS.sleep(1);
                                    }
                                }
                                if (dice1 == dice4) {
                                    System.out.println(playr2 + " " + "and" + " " + playr3 + "won");
                                    TimeUnit.SECONDS.sleep(1);
                                    dice2 = dice2 - dice1;
                                    player2 = player2 + (2 * dice2);
                                    player3 = player3 + (2 * dice2);
                                    player1 = player1 - (2 * dice2);
                                    player4 = player4 - (2 * dice2);
                                    System.out.println(playr1 + ":" + player1);
                                    System.out.println(playr2 + ":" + player2);
                                    System.out.println(playr3 + ":" + player3);
                                    System.out.println(playr4 + ":" + player4);
                                    TimeUnit.SECONDS.sleep(1);
                                }
                            }
                        }
                        if (dice1 == dice3) {
                            if (dice1 > dice4 && dice3 > dice4) {
                                System.out.println(playr2 + " " + "won");
                                TimeUnit.SECONDS.sleep(1);
                                backup = dice2;
                                dice2 = dice2 - dice1;
                                player2 = player2 + (2 * dice2);
                                player1 = player1 - dice2;
                                player3 = player3 - dice2;
                                dice2 = backup;
                                dice2 = dice2 - dice4;
                                player2 = player2 + dice2;
                                player4 = player4 - dice2;
                                System.out.println(playr1 + ":" + player1);
                                System.out.println(playr2 + ":" + player2);
                                System.out.println(playr3 + ":" + player3);
                                System.out.println(playr4 + ":" + player4);
                                TimeUnit.SECONDS.sleep(1);
                            }
                            if (dice4 > dice1 && dice4 > dice3) {
                                if (dice2 > dice4) {
                                    System.out.println(playr2 + " " + "won");
                                    backup = dice2;
                                    dice2 = dice2 - dice4;
                                    player2 = player2 + dice2;
                                    player4 = player4 - dice2;
                                    dice2 = backup;
                                    dice2 = dice2 - dice1;
                                    player2 = player2 + (2 * dice2);
                                    player1 = player1 - dice2;
                                    player3 = player3 - dice2;
                                    System.out.println(playr1 + ":" + player1);
                                    System.out.println(playr2 + ":" + player2);
                                    System.out.println(playr3 + ":" + player3);
                                    System.out.println(playr4 + ":" + player4);
                                    TimeUnit.SECONDS.sleep(1);
                                }
                                if (dice4 > dice2) {
                                    System.out.println(playr4 + " " + "won");
                                    TimeUnit.SECONDS.sleep(1);
                                    backup = dice4;
                                    dice4 = dice4 - dice2;
                                    player4 = player4 + dice4;
                                    player2 = player2 - dice4;
                                    dice4 = backup;
                                    dice4 = dice4 - dice1;
                                    player4 = player4 + (2 * dice4);
                                    player1 = player1 - dice4;
                                    player3 = player3 - dice4;
                                    System.out.println(playr1 + ":" + player1);
                                    System.out.println(playr2 + ":" + player2);
                                    System.out.println(playr3 + ":" + player3);
                                    System.out.println(playr4 + ":" + player4);
                                    TimeUnit.SECONDS.sleep(1);
                                }
                                if (dice2 == dice4) {
                                    System.out.println(playr2 + " " + "and" + " " + playr4 + " " + "won");
                                    dice2 = dice2 - dice1;
                                    player2 = player2 + (2 * dice2);
                                    player4 = player4 + (2 * dice2);
                                    player1 = player1 - (2 * dice2);
                                    player3 = player3 - (2 * dice2);
                                    System.out.println(playr1 + ":" + player1);
                                    System.out.println(playr2 + ":" + player2);
                                    System.out.println(playr3 + ":" + player3);
                                    System.out.println(playr4 + ":" + player4);
                                    TimeUnit.SECONDS.sleep(1);
                                }
                            }
                            if (dice4 == dice1 && dice4 == dice3) {
                                System.out.println(playr2 + " " + "won");
                                TimeUnit.SECONDS.sleep(1);
                                dice2 = dice2 - dice1;
                                player2 = player2 + (3 * dice2);
                                player1 = player1 - dice2;
                                player3 = player3 - dice2;
                                player4 = player4 - dice2;
                                System.out.println(playr1 + ":" + player1);
                                System.out.println(playr2 + ":" + player2);
                                System.out.println(playr3 + ":" + player3);
                                System.out.println(playr4 + ":" + player4);
                                TimeUnit.SECONDS.sleep(1);
                            }
                        }
                    }
                    if (dice1 == dice2) {
                        if (dice1 > dice3 && dice2 > dice3) {
                            if (dice3 > dice4) {
                                System.out.println(playr1 + " " + "and" + " " + playr2 + " " + "won");
                                TimeUnit.SECONDS.sleep(1);
                                backup = dice1;
                                dice1 = dice1 - dice3;
                                player1 = player1 + dice1;
                                player2 = player2 + dice1;
                                player3 = player3 - dice1;
                                dice1 = backup;
                                dice1 = dice1 - dice4;
                                player1 = player1 + dice1;
                                player2 = player2 + dice1;
                                player4 = player4 - dice1;
                                System.out.println(playr1 + ":" + player1);
                                System.out.println(playr2 + ":" + player2);
                                System.out.println(playr3 + ":" + player3);
                                System.out.println(playr4 + ":" + player4);
                                TimeUnit.SECONDS.sleep(1);
                            }
                            if (dice4 > dice3) {
                                if (dice1 > dice4 && dice2 > dice4) {
                                    System.out.println(playr1 + " " + "and" + " " + playr2 + " " + "won");
                                    TimeUnit.SECONDS.sleep(1);
                                    backup = dice1;
                                    dice1 = dice1 - dice3;
                                    player1 = player1 + dice1;
                                    player2 = player2 + dice1;
                                    player3 = player3 - dice1;
                                    dice1 = backup;
                                    dice1 = dice1 - dice4;
                                    player1 = player1 + dice1;
                                    player2 = player2 + dice1;
                                    player4 = player4 - dice1;
                                    System.out.println(playr1 + ":" + player1);
                                    System.out.println(playr2 + ":" + player2);
                                    System.out.println(playr3 + ":" + player3);
                                    System.out.println(playr4 + ":" + player4);
                                    TimeUnit.SECONDS.sleep(1);
                                }
                                if (dice4 > dice1 && dice4 > dice2) {
                                    System.out.println(playr4 + " " + "won");
                                    TimeUnit.SECONDS.sleep(1);
                                    backup = dice4;
                                    dice4 = dice4 - dice1;
                                    player4 = player4 + (2 * dice4);
                                    player1 = player1 - dice4;
                                    player2 = player2 - dice4;
                                    dice4 = backup;
                                    dice4 = dice4 - dice3;
                                    player4 = player4 + dice4;
                                    player3 = player3 - dice4;
                                    System.out.println(playr1 + ":" + player1);
                                    System.out.println(playr2 + ":" + player2);
                                    System.out.println(playr3 + ":" + player3);
                                    System.out.println(playr4 + ":" + player4);
                                    TimeUnit.SECONDS.sleep(1);
                                }
                                if (dice1 == dice4 && dice2 == dice4) {
                                    System.out.println(playr1 + " " + "and" + " " + playr2 + " " + "and" + " " + playr4 + " " + "won");
                                    TimeUnit.SECONDS.sleep(1);
                                    dice1 = dice1 - dice3;
                                    player1 = player1 + dice1;
                                    player2 = player2 + dice1;
                                    player3 = player3 - dice1;
                                    player4 = player4 + dice1;
                                    System.out.println(playr1 + ":" + player1);
                                    System.out.println(playr2 + ":" + player2);
                                    System.out.println(playr3 + ":" + player3);
                                    System.out.println(playr4 + ":" + player4);
                                    TimeUnit.SECONDS.sleep(1);
                                }
                            }
                            if (dice3 == dice4) {
                                System.out.println(playr1 + " " + "and" + " " + playr2 + " " + "won");
                                TimeUnit.SECONDS.sleep(1);
                                dice1 = dice1 - dice3;
                                player1 = player1 + (2 * dice1);
                                player2 = player2 + (2 * dice1);
                                player3 = player3 - (2 * dice1);
                                player4 = player4 - (2 * dice1);
                                System.out.println(playr1 + ":" + player1);
                                System.out.println(playr2 + ":" + player2);
                                System.out.println(playr3 + ":" + player3);
                                System.out.println(playr4 + ":" + player4);
                                TimeUnit.SECONDS.sleep(1);
                            }
                        }
                        if (dice3 > dice1 && dice3 > dice2) {
                            if (dice1 > dice4 && dice2 > dice4) {
                                System.out.println(playr3 + " " + "won");
                                TimeUnit.SECONDS.sleep(1);
                                backup = dice3;
                                dice3 = dice3 - dice1;
                                player3 = player3 + (2 * dice3);
                                player1 = player1 - dice3;
                                player2 = player2 - dice3;
                                dice3 = backup;
                                dice3 = dice3 - dice4;
                                player3 = player3 + dice3;
                                player4 = player4 - dice3;
                                System.out.println(playr1 + ":" + player1);
                                System.out.println(playr2 + ":" + player2);
                                System.out.println(playr3 + ":" + player3);
                                System.out.println(playr4 + ":" + player4);
                                TimeUnit.SECONDS.sleep(1);
                            }
                            if (dice4 > dice1 && dice4 > dice2) {
                                if (dice3 > dice4) {
                                    System.out.println(playr3 + " " + "won");
                                    TimeUnit.SECONDS.sleep(1);
                                    backup = dice3;
                                    dice3 = dice3 - dice4;
                                    player3 = player3 + dice3;
                                    player4 = player4 - dice3;
                                    dice3 = backup;
                                    dice3 = dice3 - dice1;
                                    player3 = player3 + (2 * dice3);
                                    player1 = player1 - dice3;
                                    player2 = player2 - dice3;
                                    System.out.println(playr1 + ":" + player1);
                                    System.out.println(playr2 + ":" + player2);
                                    System.out.println(playr3 + ":" + player3);
                                    System.out.println(playr4 + ":" + player4);
                                    TimeUnit.SECONDS.sleep(1);
                                }
                                if (dice4 > dice3) {
                                    System.out.println(playr4 + " " + "won");
                                    TimeUnit.SECONDS.sleep(1);
                                    backup = dice4;
                                    dice4 = dice4 - dice3;
                                    player4 = player4 + dice4;
                                    player3 = player3 - dice4;
                                    dice4 = backup;
                                    dice4 = dice4 - dice1;
                                    player4 = player4 + (2 * dice4);
                                    player1 = player1 - dice4;
                                    player2 = player2 - dice4;
                                    System.out.println(playr1 + ":" + player1);
                                    System.out.println(playr2 + ":" + player2);
                                    System.out.println(playr3 + ":" + player3);
                                    System.out.println(playr4 + ":" + player4);
                                    TimeUnit.SECONDS.sleep(1);
                                }
                                if (dice3 == dice4) {
                                    System.out.println(playr3 + " " + "and" + " " + playr4 + " " + "won");
                                    TimeUnit.SECONDS.sleep(1);
                                    dice3 = dice3 - dice1;
                                    player3 = player3 + (2 * dice3);
                                    player4 = player4 + (2 * dice3);
                                    player1 = player1 - (2 * dice3);
                                    player2 = player2 - (2 * dice3);
                                    System.out.println(playr1 + ":" + player1);
                                    System.out.println(playr2 + ":" + player2);
                                    System.out.println(playr3 + ":" + player3);
                                    System.out.println(playr4 + ":" + player4);
                                    TimeUnit.SECONDS.sleep(1);
                                }
                            }
                            if (dice1 == dice4 && dice2 == dice4) {
                                System.out.println(playr3 + " " + "won");
                                TimeUnit.SECONDS.sleep(1);
                                dice3 = dice3 - dice1;
                                player3 = player3 + (3 * dice3);
                                player1 = player1 - dice3;
                                player2 = player2 - dice3;
                                player4 = player4 - dice3;
                                System.out.println(playr1 + ":" + player1);
                                System.out.println(playr2 + ":" + player2);
                                System.out.println(playr3 + ":" + player3);
                                System.out.println(playr4 + ":" + player4);
                                TimeUnit.SECONDS.sleep(1);
                            }
                        }
                        if (dice1 == dice3 && dice2 == dice3) {
                            //1=2=3>4
                            if (dice1 > dice4 && dice2 > dice4 && dice3 > dice4) {
                                System.out.println(playr1 + " " + "and" + " " + playr2 + " " + "and" + " " + playr3 + " " + "won");
                                TimeUnit.SECONDS.sleep(1);
                                dice1 = dice1 - dice4;
                                player1 = player1 + dice1;
                                player2 = player2 + dice1;
                                player3 = player3 + dice1;
                                player4 = player4 - dice1;
                                System.out.println(playr1 + ":" + player1);
                                System.out.println(playr2 + ":" + player2);
                                System.out.println(playr3 + ":" + player3);
                                System.out.println(playr4 + ":" + player4);
                                TimeUnit.SECONDS.sleep(1);
                            }
                            if (dice4 > dice1 && dice4 > dice2 && dice4 > dice3) {
                                //4>1=2=3
                                System.out.println(playr4 + " " + "won");
                                TimeUnit.SECONDS.sleep(1);
                                dice4 = dice4 - dice1;
                                player4 = player4 + (3 * dice4);
                                player1 = player1 - dice4;
                                player2 = player2 - dice4;
                                player3 = player3 - dice4;
                                System.out.println(playr1 + ":" + player1);
                                System.out.println(playr2 + ":" + player2);
                                System.out.println(playr3 + ":" + player3);
                                System.out.println(playr4 + ":" + player4);
                                TimeUnit.SECONDS.sleep(1);
                            }
                            if (dice1 == dice4 && dice2 == dice4 && dice3 == dice4) {
                                //1=2=3=4
                                System.out.println("Dice are even");
                                TimeUnit.SECONDS.sleep(1);
                                System.out.println(playr1 + ":" + player1);
                                System.out.println(playr2 + ":" + player2);
                                System.out.println(playr3 + ":" + player3);
                                System.out.println(playr4 + ":" + player4);
                                TimeUnit.SECONDS.sleep(1);
                            }
                        }
                    }
                    if (player1 >= 1 && player2 >= 1 && player3 >= 1 && player4 >= 1 && l2 == 1) {
                        System.out.print("Replay(Y/N):");
                        choice = k.next();
                        switch (choice) {
                            case ("Y"):
                                break;
                            case ("y"):
                                break;
                            case ("n"):
                                l2 = 2;
                                break;
                            case ("N"):
                                l2 = 2;
                                break;
                        }
                    }
                }
                if (player1 >= 1 && player2 >= 1 && player3 >= 1 && player4 >= 1) {
                    System.out.println("You left the game half");
                    System.out.println(n + " " + "games played");
                }
                if (player1 <= 0) {
                    System.out.println(playr1 + " " + "lost the game");
                    System.out.println(n + " " + "games played");
                    players--;
                }
                if (player1 <= 0 && player2 <= 0) {
                    System.out.println(playr1 + " " + "and" + " " + playr2 + " " + "lost the game");
                    System.out.println(n + " " + "games played");
                    players = players - 2;
                }
                if (player1 <= 0 && player3 <= 0) {
                    System.out.println(playr1 + " " + "and" + " " + playr3 + " " + "lost the game");
                    System.out.println(n + " " + "games played");
                    players = players - 2;
                }
                if (player1 <= 0 && player4 <= 0) {
                    System.out.println(playr1 + " " + "and" + " " + playr4 + " " + "lost the game");
                    System.out.println(n + " " + "games played");
                    players = players - 2;
                }
                if (player1 <= 0 && player2 <= 0 && player3 <= 0) {
                    System.out.println(playr1 + " " + "and" + " " + playr2 + " " + "and" + " " + playr3 + " " + "lost the game");
                    System.out.println(n + " " + "games played");
                    players = players - 3;
                }
                if (player1 <= 0 && player2 <= 0 && player4 <= 0) {
                    System.out.println(playr1 + " " + "and" + " " + playr2 + " " + "and" + " " + playr4 + " " + "lost the game");
                    System.out.println(n + " " + "games played");
                    players = players - 3;
                }
                if (player1 <= 0 && player3 <= 0 && player4 <= 0) {
                    System.out.println(playr1 + " " + "and" + " " + playr3 + " " + "and" + " " + playr4 + " " + "lost the game");
                    System.out.println(n + " " + "games played");
                    players = players - 3;
                }
                if (player2 <= 0) {
                    System.out.println(playr2 + " " + "lost the game");
                    System.out.println(n + " " + "games played");
                    players--;
                }
                if (player2 <= 0 && player3 <= 0) {
                    System.out.println(playr2 + " " + "and" + " " + playr3 + " " + "lost the game");
                    System.out.println(n + " " + "games played");
                    players = players - 2;
                }
                if (player2 <= 0 && player4 <= 0) {
                    System.out.println(playr2 + " " + "and" + " " + playr4 + " " + "lost the game");
                    System.out.println(n + " " + "games played");
                    players = players - 2;
                }
                if (player2 <= 0 && player3 <= 0 && player4 <= 0) {
                    System.out.println(playr2 + " " + "and" + " " + playr3 + " " + "and" + " " + playr4 + " " + "lost the game");
                    System.out.println(n + " " + "games played");
                    players = players - 3;
                }
                if (player3 <= 0) {
                    System.out.println(playr3 + " " + "lost the game");
                    System.out.println(n + " " + "games played");
                    players--;
                }
                if (player3 <= 0 && player4 <= 0) {
                    System.out.println(playr3 + " " + "and" + " " + playr4 + " " + "lost the game");
                    System.out.println(n + " " + "games played");
                    players = players - 2;
                }
                if (player4 <= 0) {
                    System.out.println(playr4 + " " + "lost the game");
                    System.out.println(n + " " + "games played");
                    players--;
                }
                if (player1 <= 0 && player2 <= 0 && player3 <= 0 && player4 <= 0) {
                    System.out.println("You did the impossible");
                    System.out.println("9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999 games played");
                    players = players - 4;
                }
            }
            TimeUnit.SECONDS.sleep(1);
            if (players > 1) {
                System.out.print("Do you want to play with remaining players?(Y/N):");
                choice = k.next();
                switch (choice) {
                    case ("Y"):
                        break;
                    case ("y"):
                        break;
                    case ("n"):
                        System.out.println("Play again soon");
                        loop = false;
                        break;
                    case ("N"):
                        System.out.println("Play again soon");
                        loop = false;
                        break;
                }
            }
            if (players <= 1) {
                System.out.print("Do you want to play again?(Y/N):");
                choice = k.next();
                switch (choice) {
                    case ("Y"):
                        break;
                    case ("y"):
                        break;
                    case ("N"):
                        System.out.println("Play again soon");
                        loop = false;
                        break;
                    case ("n"):
                        System.out.println("Play again soon");
                        loop = false;
                        break;
                }
            }
        }
    }
}
