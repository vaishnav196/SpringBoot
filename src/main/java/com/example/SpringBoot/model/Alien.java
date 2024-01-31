package com.example.SpringBoot.model;

import com.example.SpringBoot.AlienRepo;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Entity
public class Alien {
    @Id
    private  int aid;
    private  String aname;
//@Autowired
//    AlienRepo repo;
    public Alien(int aid, String aname) {
        this.aid = aid;
        this.aname = aname;
    }

    public String getAname() {
        return aname;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                '}';
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }


}

