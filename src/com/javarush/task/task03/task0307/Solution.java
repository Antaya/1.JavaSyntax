package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg zerg1 = new Zerg();
        zerg1.name = "Зерг1";
        Zerg zerg2 = new Zerg();
        zerg2.name = "Зерг2";
        Zerg zerg3 = new Zerg();
        zerg3.name = "Зерг3";
        Zerg zerg4 = new Zerg();
        zerg4.name = "Зерг4";
        Zerg zerg5 = new Zerg();
        zerg5.name = "Зерг5";

        Protoss protoss1 = new Protoss();
        protoss1.name = "Протосc1";
        Protoss protoss2 = new Protoss();
        protoss2.name = "Протосc2";
        Protoss protoss3 = new Protoss();
        protoss3.name = "Протосc3";

        Terran terran1 = new Terran();
        terran1.name = "Терран1";
        Terran terran2 = new Terran();
        terran2.name = "Терран2";
        Terran terran3 = new Terran();
        terran3.name = "Терран3";
        Terran terran4 = new Terran();
        terran4.name = "Терран4";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
