package com.lee;

public class Ticket {
    int start;
    int end;
    int price;

    public Ticket() {
    }

    public Ticket(int start, int end, int price) {
        this.start = start;
        this.end = end;
        this.price = price;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
