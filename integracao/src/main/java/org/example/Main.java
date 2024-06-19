package org.example;

import DAO.*;
import Model.Arma;
import Model.Cavaleiro;
import Model.Dungeon;
import Model.Deus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CavaleiroDAO cavaleiroDAO = new CavaleiroDAO();
        MonstroDAO monstroDAO = new MonstroDAO();
        DungeonDAO dungeonDAO = new DungeonDAO();
        ArmaDAO armaDAO = new ArmaDAO();
        DeusDAO deusDAO = new DeusDAO();

        Dungeon dungeon10 = new Dungeon("Massa", 200);
        //dungeonDAO.insertDungeon(dungeon10);

        Scanner scanner = new Scanner(System.in);
        boolean rodando = true;

        while (rodando) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Rezar");
            System.out.println("2 - Andar pela dungeon");
            System.out.println("0 - Sair");

            int x = scanner.nextInt();

            if (x == 1) {
                boolean rodando2 = true;

                while (rodando2) {
                    System.out.println("Escolha uma opção de rezar:");
                    System.out.println("1 - Rezar para um novo deus");
                    System.out.println("2 - Corrigir erros da crença");
                    System.out.println("3 - Abandonar deus");
                    System.out.println("4 - Qual deus estou me devotando no momento?");
                    System.out.println("0 - Voltar");

                    int y = scanner.nextInt();

                    switch (y) {
                        case 1:
                            System.out.println("Rezar para um novo deus...");
                            // Adicione a lógica de rezar para um novo deus aqui
                            break;
                        case 2:
                            System.out.println("Corrigir erros da crença...");
                            // Adicione a lógica de corrigir erros da crença aqui
                            break;
                        case 3:
                            System.out.println("Abandonar deus...");
                            // Adicione a lógica de abandonar deus aqui
                            break;
                        case 4:
                            System.out.println("Qual deus estou me devotando no momento...");
                            // Adicione a lógica de verificar o deus atual aqui
                            break;
                        case 0:
                            rodando2 = false;
                            break;
                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                    }
                }
            } else if (x == 2) {
                System.out.println("Você está andando pela dungeon...");
                // Adicione a lógica de andar pela dungeon aqui
            } else if (x == 0) {
                rodando = false;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}