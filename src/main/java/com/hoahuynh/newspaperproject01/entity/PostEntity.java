package com.hoahuynh.newspaperproject01.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity(name = "post")
public class PostEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "tieuDe")
    private String tieuDe;
    @Column(name = "noiDung")
    private String noiDung;
    @Column(name = "idTacGia")
    private String idTacGia;
    @Column(name = "ngayViet")
    private Date ngayViet;

    public PostEntity() {
    }

    public PostEntity(String tieuDe, String noiDung, String idTacGia, Date ngayViet) {
        this.tieuDe = tieuDe;
        this.noiDung = noiDung;
        this.idTacGia = idTacGia;
        this.ngayViet = ngayViet;
    }

    public PostEntity(int id, String tieuDe, String noiDung, String idTacGia, Date ngayViet) {
        this.id = id;
        this.tieuDe = tieuDe;
        this.noiDung = noiDung;
        this.idTacGia = idTacGia;
        this.ngayViet = ngayViet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getIdTacGia() {
        return idTacGia;
    }

    public void setIdTacGia(String idTacGia) {
        this.idTacGia = idTacGia;
    }

    public Date getNgayViet() {
        return ngayViet;
    }

    public void setNgayViet(Date ngayViet) {
        this.ngayViet = ngayViet;
    }
}
