package Colections.ArrayList.ex03;

import Colections.ArrayList.Test01.User;

import java.util.ArrayList;
import java.util.List;

public class Ex03 {
    static void main() {
        List<User> users = new ArrayList<User>();

        User u1 = new User("João",23);

        users.add(u1);

        for (int i = 0; i < users.size();i++) {
            System.out.println("NOME: " + users.get(i).name + " IDADE: " + users.get(i).age);
        }
    }
}
