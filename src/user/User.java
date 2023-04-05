package runnergame.src.user;

import runnergame.src.job.Job;

public class User extends Thread{
    private final String name;
    private String position;
    private Job job;

    public User(String name) {
        this.name = name;
    }

    public void run(){

    }
}
