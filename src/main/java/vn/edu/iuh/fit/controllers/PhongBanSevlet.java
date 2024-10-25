package vn.edu.iuh.fit.controllers;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.edu.iuh.fit.dtos.NhanVien;
import vn.edu.iuh.fit.models.NhanVienProcessing;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "Controller", value = "/controller")
public class PhongBanSevlet extends HttpServlet {
    @Inject
    private NhanVienProcessing processing;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String action = req.getParameter("action");
        if(action.equalsIgnoreCase("add")){
            String manv = req.getParameter("manv");
            String tennv = req.getParameter("tennv");
            String email = req.getParameter("email");
            String diachi = req.getParameter("diachi");
            String dienthoai = req.getParameter("dienthoai");
            String phongban = req.getParameter("phongban");

            processing.AddNhanVien(manv,tennv,email,diachi,dienthoai,phongban);

        }
        else if(action.equalsIgnoreCase("update")){

            ArrayList<NhanVien> processing.ltsNhanVien();

        }

    }
}
