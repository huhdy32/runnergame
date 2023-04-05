package runnergame.src;
import runnergame.src.user.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            StringTokenizer stk = new StringTokenizer(br.readLine());
            while (stk.hasMoreTokens()){
                users.add(new User(stk.nextToken()));
            }
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}