package de.project.cinemaapi.persistence;

import javax.persistence.*;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ticketId;

    @Column
    private double price;

    @ManyToOne(fetch = FetchType.EAGER)
    private Show show;

    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

    @Column
    private boolean boxSeat;

    public Ticket(int price, Show show, User user, boolean boxSeat) {
        this.price = price;
        this.show = show;
        this.user = user;
        this.boxSeat = boxSeat;
    }

    public Ticket() {

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
