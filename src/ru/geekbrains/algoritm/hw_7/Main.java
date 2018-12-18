package ru.geekbrains.algoritm.hw_7;

import java.util.Random;

public class Main {

    final static int VERTEX_COUNT=10;
    static Random  random= new Random();

    public static void main(String[] args) {
        Graph graph = new Graph(VERTEX_COUNT);
        for (int i = 0; i <VERTEX_COUNT ; i++) {
            for (int j = i+1; j <VERTEX_COUNT ; j++) {
                if (random.nextInt(10)>6)
                graph.addEdge(i,j);
            }
        }

        for (int i = 0; i <VERTEX_COUNT ; i++) {
            System.out.println(graph.adjList(i));
        }

        BFS bfs= new BFS(graph,3);
        System.out.println(bfs.pathTo(7));
        System.out.println(bfs.distTo(8));
    }
}
