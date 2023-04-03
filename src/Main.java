package runnergame.src;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
    }
}

class User {
    private String name;
    private int col;
    private int row_idx;
    public User(String name){
        this.name =name;
    }
}


