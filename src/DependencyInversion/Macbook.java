package DependencyInversion;


import KeyboardsAndMouse.Keyboard;
import KeyboardsAndMouse.Mouse;

// Here Macbook is using interfaces of Keyboard and Mouse. So this macbook, keyboards and mouse can use any type of input devices.
// They are loosely coupled.

public class Macbook {
    private Keyboard KeyBoard;
    private Mouse Mouse;

    public Macbook(Keyboard keyBoard, Mouse mouse) {
        KeyBoard = keyBoard;
        Mouse = mouse;
    }
}
