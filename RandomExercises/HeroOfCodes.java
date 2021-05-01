package com.company;

import java.util.*;

public class HeroOfCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Integer>> map = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            int hp = Integer.parseInt(input[1]);
            int mp = Integer.parseInt(input[2]);

            if (hp > 100 ) {
                hp = 100;
            }
            if (mp > 200) {
                mp = 200;
            }

            if (hp < 0){
                hp = 0;
            }
            if (mp < 0){
                mp = 0;
            }

            map.put(name, Arrays.asList(hp, mp));
        }

        // HP -> 0
        // MP -> 1

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] inputAsArray = input.split(" - ");
            String command = inputAsArray[0];
            String heroName = inputAsArray[1];

            switch (command) {
                case "CastSpell":
                    int mannaRequireForMage = Integer.parseInt(inputAsArray[2]);
                    String mageName = inputAsArray[3];

                    if (map.containsKey(heroName)) {
                        if (map.get(heroName).get(1) > mannaRequireForMage) {
                            int postMageMp = map.get(heroName).get(1) - mannaRequireForMage;
                            System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, mageName, postMageMp);
                            map.get(heroName).set(1, postMageMp);

                        } else {
                            System.out.printf("%s does not have enough MP to cast %s!%n", heroName, mageName);
                        }
                        break;
                    }
                    break;
                case "TakeDamage":
                    int damageGiven = Integer.parseInt(inputAsArray[2]);
                    String attackerName = inputAsArray[3];

                    if (map.containsKey(heroName)) {
                        if (map.get(heroName).get(0) > damageGiven) {
                            int remainingHp = map.get(heroName).get(0) - damageGiven;
                            System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damageGiven, attackerName, remainingHp);
                            map.get(heroName).set(0, remainingHp);
                            break;
                        } else {
                            System.out.printf("%s has been killed by %s!%n", heroName, attackerName);
                            map.remove(heroName);
                        }
                    }
                    break;
                case "Recharge":
                    int bonusMp = Integer.parseInt(inputAsArray[2]);
                    int oldMp = map.get(heroName).get(1);
                    int mannaRecharge = 0;
                    if (map.containsKey(heroName)) {
                        if (map.get(heroName).get(1) + bonusMp > 200) {
                            mannaRecharge = 200 - oldMp;
                            map.get(heroName).set(1, 200);
                        } else {
                            map.get(heroName).set(1, oldMp + bonusMp);
                            mannaRecharge = bonusMp;
                        }

                        System.out.printf("%s recharged for %d MP!%n", heroName, mannaRecharge);

                    }
                    break;
                case "Heal":
                    int bonusHp = Integer.parseInt(inputAsArray[2]);
                    int oldHp = map.get(heroName).get(0);

                    int hpRecharge = 0;
                    if (map.containsKey(heroName)) {

                        if (map.get(heroName).get(0) + bonusHp > 100) {
                            hpRecharge = 100 - oldHp;
                            map.get(heroName).set(0, 100);
                        } else {
                            map.get(heroName).set(0, oldHp + bonusHp);
                            hpRecharge = bonusHp;
                        }
                        System.out.printf("%s healed for %d HP!%n", heroName, hpRecharge);
                    }

                    break;
            }

            input = scanner.nextLine();
        }

        //map.entrySet().stream().sorted((o1, o2) -> o2.getValue().get(0).compareTo(o1.getValue().get(0)))
        //        .forEach(hero -> System.out.printf("%s%nHP: %d%nMP: %d%n" , hero.getKey() , hero.getValue().get(0) , hero.getValue().get(1)));


        map.entrySet().stream().sorted(((o1, o2) -> {
            int result = o2.getValue().get(0).compareTo(o1.getValue().get(0));
            if (result == 0){
                result= o1.getKey().compareTo(o2.getKey());
            }
            return result;
        })).forEach(hero -> System.out.printf("%s%n  HP: %d%n  MP: %d%n" , hero.getKey() , hero.getValue().get(0) , hero.getValue().get(1)));
    }
}
