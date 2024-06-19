package org.example;

import DAO.CavaleiroDAO;
import DAO.DungeonDAO;
import DAO.MonstroDAO;

public class Main {
    public static void main(String[] args) {
        CavaleiroDAO cavaleiro = new CavaleiroDAO();
        MonstroDAO monstro = new MonstroDAO();
        DungeonDAO dungeon = new DungeonDAO();
        JogoDAO jogoDAO = new JogoDAO();
        Candidato_JogoDAO candidato_jogoDAO= new Candidato_JogoDAO();
    }
} 