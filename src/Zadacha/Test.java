package Zadacha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        FamilyFinder ff=new FamilyFinder();
        ff.printLargeFamiles();
    }
}

class House {


    private int number;
    private List<Room> roomList;

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

}

class Room {
    private int number;
    private List<Human> humanList;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Human> getHumanList() {
        return humanList;
    }

    public void setHumanList(List<Human> humanList) {
        this.humanList = humanList;
    }
}

class Human {
   private String name;
   private String lastName;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class FamilyFinder {

    void printLargeFamiles() {
        Scanner scaner = new Scanner(System.in);
        System.out.print("Введите количество домов: ");
        int countHouse = scaner.nextInt();
        List<House> houses = new ArrayList<>();
        for (int i = 0; i < countHouse; i++) {
            houses.add(new House());
        }
        System.out.print("Введите номер дома: ");
        int numberHouse=scaner.nextInt();
        houses.get(0).setNumber(numberHouse);
        System.out.print("Введите количество квартир в доме: ");
        int countRooms=scaner.nextInt();
        List<Room> rooms=new ArrayList<>();
        for (int i = 0; i < countRooms; i++) {
            rooms.add(new Room());
        }
        houses.get(0).setRoomList(rooms);
        System.out.print("Введите номер квартиры: ");
        int numberRoom=scaner.nextInt();
        rooms.get(0).setNumber(numberRoom);
        System.out.print("Введите количество человек: ");
        int countHumans=scaner.nextInt();
        List <Human> humans=new ArrayList<>();
        for (int i = 0; i < countHumans; i++) {
            humans.add(new Human());
        }
        rooms.get(0).setHumanList(humans);
        int i=0;
        while (i<humans.size()) {
            System.out.print("Введите имя, фамилию и возраст человека, разделение должно быть через пробел: ");

            scaner.nextLine();
            String infoHuman = scaner.nextLine();
            String[] nAge = infoHuman.split(" ");
            if (nAge.length >= 3 * countHumans) {
                for (int t = 0; t < countHumans; t++) {
                    humans.get(t).setName(nAge[3 * t]);
                    humans.get(t).setLastName(nAge[3 * t + 1]);
                    humans.get(t).setAge(Integer.parseInt(nAge[3 * t + 2]));
                }
            } else {
                System.out.println("Недостаточно данных для всех людей.");
            }
            scaner.close();
        }



    }
}



