package vn.edu.iuh.fit.dtos;

import jakarta.persistence.*;

@Entity
public class NhanVien {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int manv;
    @Column( length = 150 , nullable = false)
    private String tennv;
    @Column( length = 150 , nullable = false, unique = true)
    private String email;
    @Column( length = 150 , nullable = false)
    private String diachi;
    @Column( length = 150 , nullable = false)
    private String dienthoai;
    @Column( length = 150 , nullable = false)
    private String maphong;


    public NhanVien() {
    }

    public NhanVien(int manv, String tennv, String email, String diachi, String dienthoai, String maphong) {
        this.manv = manv;
        this.tennv = tennv;
        this.email = email;
        this.diachi = diachi;
        this.dienthoai = dienthoai;
        this.maphong = maphong;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "manv=" + manv +
                ", tennv='" + tennv + '\'' +
                ", email='" + email + '\'' +
                ", diachi='" + diachi + '\'' +
                ", dienthoai='" + dienthoai + '\'' +
                ", maphong='" + maphong + '\'' +
                '}';
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NhanVien nhanVien)) return false;

        return manv == nhanVien.manv;
    }

    @Override
    public int hashCode() {
        return manv;
    }

    public int getManv() {
        return manv;
    }

    public void setManv(int manv) {
        this.manv = manv;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    public String getMaphong() {
        return maphong;
    }

    public void setMaphong(String maphong) {
        this.maphong = maphong;
    }
}
