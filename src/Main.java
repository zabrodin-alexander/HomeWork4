public class Main {
    public static void main(String[] args) {
        System.out.println();

        int age = 22;
        if (age >= 18) {
            System.out.println("Если возраст человека равен, " + age + " то он совершеннолетний. ");
        } else {
            System.out.println("Если возраст человека равен, " + age +
                    " то он не достиг совершенолетия, нужно немного подождать.");
        }

        int temperatures = 11;
        if (temperatures < 5) {
            System.out.println("На улице " + temperatures + ", то нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperatures + ", то можно идти без шапки.");
        }

        int speed = 22;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф. ");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно. ");
        }

        int yearsOld = 25;
        if (yearsOld >= 2 && yearsOld <= 6) {
            System.out.println("Если возраст человека равен, " + yearsOld + " то ему нужно ходить в садик. ");
        } else if (yearsOld >= 7 && yearsOld <= 17) {
            System.out.println("Если возраст человека равен, " + yearsOld + " то ему нужно ходить в школу. ");
        } else if (yearsOld >= 18 && yearsOld <= 24) {
            System.out.println("Если возраст человека равен, " + yearsOld + " то ему нужно ходить в университет. ");
        } else {
            System.out.println("Если возраст человека равен, " + yearsOld + " то ему нужно ходить на работу. ");
        }

        int child = 23;
        if (child < 5){
            System.out.println("Если возраст ребенка равен, " + child + " то он не может кататься на аттракционе. ");
        } else if (child >= 5 && child < 14) {
            System.out.println("Если возраст ребенка равен, " + child + ", " +
                    "то он может кататься только в сопровождении взрослого. " + "Если взрослого нет,то кататься нельзя.");
        }else if (child >= 14){
            System.out.println("Если возраст ребенка равен, " + child + " то он может кататься без сопровождения взрослого. ");
        }

        int people = 123;
        if (people <= 60) {
            System.out.println("Свободно сидячее место. ");
        } else if (people <= 102) {
            System.out.println("Свободно стоячее место. ");
        } else {
            System.out.println("Свободных мест нет. ");
        }

        int one = 11;
        int two = 13;
        int three = 12;
        if (one > two && one > three) {
            System.out.println("Наибольшее число = " + one);
        } else if (two > one && two > three) {
            System.out.println("Наибольшее число = " + two);
        }else{
            System.out.println("Наибольшее число = " + three);
        }

        }
    }