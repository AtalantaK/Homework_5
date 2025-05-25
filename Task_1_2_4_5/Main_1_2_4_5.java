package Task_1_2_4_5;

import java.util.*;

public class Main_1_2_4_5 {

    public static void main(String[] args) {

        //Task 1
        Player player1 = new Player(10001, true, "Nick1");
        Player player2 = new Player(10002, false, "Nick2");
        Player player3 = new Player(10001, true, "Nick1");

//        System.out.println("Игрок 1 равен Игроку 2 через \"==\"? " + (player1 == player2));
//        System.out.println("Игрок 1 равен Игроку 2 через equals()? " + player1.equals(player2));
//
//        System.out.println("Игрок 1 равен Игроку 3 через \"==\"? " + (player1 == player3));
//        System.out.println("Игрок 1 равен Игроку 3 через equals()? " + player1.equals(player3));
//        System.out.println();


        // Task 2
        List<String> listTask2 = new ArrayList<>();
        listTask2.add("Сделать домашнее задание");
        listTask2.add("Поработать");
        listTask2.add("Приготовить ужин");
        listTask2.add("Покормить кота");
        listTask2.add("Встретиться с парнем");

//        for (String s : listTask2) {
//            System.out.println("Задача " + (listTask2.indexOf(s) + 1) + ": " + s);
//        }
//        System.out.println();

        //Task 5

        Set<Player> players = new HashSet<>();

        players.add(new Player(10001, true, "Nick1"));
        players.add(new Player(10002, false, "Nick2"));
        players.add(new Player(10003, false, "Nick3"));
        players.add(new Player(10004, true, "Nick4"));
        players.add(new Player(10005, false, "Nick5"));
        players.add(new Player(10006, true, "Nick6"));
        players.add(new Player(10007, false, "Nick7"));
        players.add(new Player(10008, false, "Nick8"));
        players.add(new Player(10009, false, "Nick9"));
        players.add(new Player(10010, true, "Nick10"));

        players.add(new Player(10001, true, "Nick1"));

//        for (Player player : players) {
//            System.out.println(player.toString());
//        }

        //Task 6
        Map<Player, Integer> points = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            points.put(new Player((10000 + i), true, "Nick" + (i + 1)), 0);
        }

        points.replace(new Player((10000 + 4), true, "Nick4"), 10);

//        points.put(new Player(10001, true, "Nick1"), 0);
//        points.put(new Player(10002, false, "Nick2"), 0);
//        points.put(new Player(10003, false, "Nick3"), 0);
//        points.put(new Player(10004, true, "Nick4"), 10);
//        points.put(new Player(10005, false, "Nick5"), 0);
//        points.put(new Player(10006, true, "Nick6"), 0);
//        points.put(new Player(10007, false, "Nick7"), 12);
//        points.put(new Player(10008, true, "Nick8"), 11);
//        points.put(new Player(10009, true, "Nick9"), 13);
//        points.put(new Player(10010, true, "Nick10"), 5);

        //Сортируем игроков по очкам по убыванию
        List<Map.Entry<Player, Integer>> sortedPlayers = new ArrayList<>(points.entrySet());
        Collections.sort(sortedPlayers, Map.Entry.comparingByValue(Collections.reverseOrder()));

        System.out.println("3 самых лучших игрока турнира:");
        for (int i = 0; i < 3; i++) {
            System.out.println("\t" + (i + 1) + " место: " + sortedPlayers.get(i).getKey() + ". Количество очков: " + sortedPlayers.get(i).getValue());
        }
    }
}
