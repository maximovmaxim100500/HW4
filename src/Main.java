public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он " +
                    "совершеннолетний.");
        }
        else {
            System.out.println("Если возраст человека равен " + age + ", то он " +
                    "не достиг совершеннолетия, нужно немного подождать.");
        }
        System.out.println(" ");
        System.out.println("Задача 2");
int temperature = 4;
if (temperature < 5) {
    System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
}
else {
    System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
}
        System.out.println(" ");
        System.out.println("Задача 3");
        int speed = 50;
        if (speed > 60){
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");
        }
        else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
        }
        System.out.println(" ");
        System.out.println("Задача 4");
        int age2 = 24;
        if (age2 >= 2 && age2 < 6) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в детский сад.");
        }
        else if (age2 >=6 && age2 <= 17) {
            System.out.println("Если возрасть человека равен " + age2 + ", то ему нужно ходить в школу.");
        }
        else if (age2 >= 18 && age2 <= 24) {
            System.out.println("Если возрасть человека равен " + age2 + ", то его место в университете.");
        }
        else {
            System.out.println("Если возрасть человека равен " + age2 + ", то ему пора ходить на работу.");
        }

        System.out.println(" ");
        System.out.println("Задача 5");
        int childsAge = 14;
        if (childsAge < 5) {
            System.out.println("Если возраст ребенка равен " + childsAge + ", то ему нельзя кататься на аттракционе.");
        }
        else if (childsAge >= 5 && childsAge < 14) {
            System.out.println("Если возраст ребенка равен " + childsAge + ", то ему можно кататься на аттракционе" +
                    " в сопровождении взрослого.");
        }
        else {
            System.out.println("Если возраст ребенка равен " + childsAge + ", то ему можно кататься на аттракционе" +
                    " без сопровождения взрослого.");
        }
        System.out.println(" ");
        System.out.println("Задача 6");
        int capacity = 102;
        int seatPlace = 60;
        int totalPerson = 70;
        if ((capacity-totalPerson) <= 0 ) {
            System.out.println("Вагон полностью забит.");
        } else if (seatPlace > totalPerson) {
            System.out.println("В вагоне " + (seatPlace-totalPerson) + " сидячих и " + (capacity - seatPlace) +
                    " стоячих мест.");
        } else  if (seatPlace <= totalPerson) {
            System.out.println("В вагоне 0 сидячих и " + (capacity-totalPerson) + " стоячих мест.");
        }
        System.out.println(" ");
        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one >three) {
            System.out.println("Число " + one + " самое большое");
        } else if (two > one && two > three) {
            System.out.println("Число " + two + " самое большое");
        } else {
            System.out.println("Число " + three + " самое большое");
        }
    }
}
