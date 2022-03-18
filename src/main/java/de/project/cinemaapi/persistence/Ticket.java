package de.project.cinemaapi.persistence;

import javax.persistence.*;

@Entity
public class Ticket {

    private static int id = 0;

    @Id
    private int ticketId;

    @Column
    private double price;

    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Show.class)
    private Show show;

    @ManyToOne(fetch = FetchType.EAGER, targetEntity = User.class)
    private User user;

    @Column
    private boolean boxSeat;

    public Ticket(int id,double price, Show show, User user, boolean boxSeat) {
        this.ticketId = id;
        this.price = price;
        this.show = show;
        this.user = user;
        this.boxSeat = boxSeat;
    }

    public Ticket(double price, Show show, User user, boolean boxSeat) {
        this.ticketId = id;
        this.price = price;
        this.show = show;
        this.user = user;
        this.boxSeat = boxSeat;
        id++;
    }

    public Ticket() {
        id++;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isBoxSeat() {
        return boxSeat;
    }

    public void setBoxSeat(boolean boxSeat) {
        this.boxSeat = boxSeat;
    }
}
