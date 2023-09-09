package com.hoahuynh.newspaperproject01.entity;

import jakarta.persistence.*;

@Entity(name = "author")
public class AuthorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "tenTacGia")
    private String tenTacGia;
    @Column(name = "hoTen")
    private String hoTen;
    @Column(name = "gioiTinh")
    private int gioiTinh;

    public AuthorEntity() {
    }

    public AuthorEntity(int id, String tenTacGia, String hoTen, int gioiTinh) {
        this.id = id;
        this.tenTacGia = tenTacGia;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
    }

    public AuthorEntity(String tenTacGia, String hoTen, int gioiTinh) {
        this.tenTacGia = tenTacGia;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
}
