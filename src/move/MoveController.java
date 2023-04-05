package runnergame.src.move;

import runnergame.src.user.User;

import javax.swing.*;
import java.awt.*;

public class MoveController extends JFrame {
    private final User user;

    public MoveController(User user) throws HeadlessException {
        this.user = user;
    }
    public void run() {
        setSize(300, 300);

    }
}
