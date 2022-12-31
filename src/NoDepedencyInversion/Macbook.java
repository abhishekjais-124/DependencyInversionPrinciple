package NoDepedencyInversion;

import KeyboardsAndMouse.WiredKeyBoard;
import KeyboardsAndMouse.WiredMouse;

// Here Macbook is using concrete clas objects of Keyboard and Mouse. So this macbook, keyboards and mouse can't be changed.
public class Macbook {
    private WiredKeyBoard wiredKeyBoard;
    private WiredMouse wiredMouse;

    public Macbook() {
        this.wiredKeyBoard = new WiredKeyBoard();
        this.wiredMouse = new WiredMouse();
    }
}
