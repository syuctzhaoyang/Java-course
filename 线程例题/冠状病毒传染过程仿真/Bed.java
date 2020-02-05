package com;
/**
 * @ClassName: Bed
 * @Description: TODO
 * @author: Bruce Young
 * @date: 2020å¹?02æœ?02æ—? 21:00
 */
public class Bed extends Point{
    public Bed(int x, int y) {
        super(x, y);
    }
    private boolean isEmpty=true;

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
