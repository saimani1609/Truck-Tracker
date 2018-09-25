package com.rg.egen.entity;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Tires {

    @Id
    @Column(columnDefinition = "VARCHAR(36)")
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(columnDefinition = "INT(2)")
    private int frontLeft;

    @Column(columnDefinition = "INT(2)")
    private int frontRight;

    @Column(columnDefinition = "INT(2)")
    private int rearLeft;

    @Column(columnDefinition = "INT(2)")
    private int rearRight;

    public Tires() {
        this.id = UUID.randomUUID().toString();
    }

    public int getFrontLeft() {
        return frontLeft;
    }

    public void setFrontLeft(int frontLeft) {
        this.frontLeft = frontLeft;
    }

    public int getFrontRight() {
        return frontRight;
    }

    public void setFrontRight(int frontRight) {
        this.frontRight = frontRight;
    }

    public int getRearLeft() {
        return rearLeft;
    }

    public void setRearLeft(int rearLeft) {
        this.rearLeft = rearLeft;
    }

    public int getRearRight() {
        return rearRight;
    }

    public void setRearRight(int rearRight) {
        this.rearRight = rearRight;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
