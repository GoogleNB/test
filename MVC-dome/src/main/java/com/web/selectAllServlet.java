package com.web;

import com.pojo.Brand;
import com.service.BrandService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "selectAllServlet", value = "/selectAllServlet")
public class selectAllServlet extends HttpServlet {
    private BrandService service = new BrandService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //调用BrandService完成查询
        List<Brand> brands = service.selectAll();
        //存入request域中
        request.setAttribute("brands",brands);
        //3.转发到brand.jsp
        request.getRequestDispatcher("/Brand.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
