package com.student_management.backend_project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_room;
    private String room_name;
    private String room_adress;

    public Room() {
    }

    public Room(Long id_room, String room_name, String room_adress) {
        this.id_room = id_room;
        this.room_name = room_name;
        this.room_adress = room_adress;
    }

    public Long getId_room() {
        return id_room;
    }

    public void setId_room(Long id_room) {
        this.id_room = id_room;
    }

    public String getRoom_name() {
        return room_name;
    }

    public void setRoom_name(String room_name) {
        this.room_name = room_name;
    }

    public String getRoom_adress() {
        return room_adress;
    }

    public void setRoom_adress(String room_adress) {
        this.room_adress = room_adress;
    }
}
