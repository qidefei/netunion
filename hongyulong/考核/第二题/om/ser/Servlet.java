package om.ser;

import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import om.dao.studentDAO;
import om.impl.studentimpl;
import om.thing.student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class Servlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException{
       doPost(req, resp);
       }
   protected void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String method=req.getParameter("method");
       if("findall".equals(method)){
            findall(req, resp);;
        }else if("find".equals(method)){
            find(req, resp);
       }else if("update".equals(method)){
            update(req, resp);
        }else if("add".equals(method)){
            add(req, resp);
        }else if("delete".equals(method)){
            delete(req, resp);
        }
   }
   //业务逻辑


    //添加
    protected void add(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
        String name=req.getParameter("name");
        String stuid=req.getParameter("stuid");
        String gender= req.getParameter("gender");
        String age=req.getParameter("age");
        student stu=new student(name,stuid,age,gender);
        studentDAO dao = new studentimpl();
        try {
            dao.add(stu);
            resp.sendRedirect(req.getContextPath()+"/student?method=findall");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //删除
    protected void delete(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
        String stuid =req.getParameter("stuid");
        studentDAO dao = new studentimpl();
        try {
            dao.delete(stuid);
            resp.sendRedirect(req.getContextPath()+"/student?method=findall");
            } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //更新
    protected void update(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
        String name=req.getParameter("name");
        String stuid=req.getParameter("stuid");
        String gender=req.getParameter("gender");
        String age=req.getParameter("age");
        student stu =new student(stuid,name,age,gender);
        studentDAO dao=new studentimpl();
        try {
            dao.update(stu);
            resp.sendRedirect(req.getContextPath()+"/student?method=findall");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //寻找单个
    protected void find(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
        String stuid=req.getParameter("stuid");
        studentDAO dao=new studentimpl();
        try {
            student stu=dao.findbyid(stuid);
            req.setAttribute("stu",stu);
            req.getRequestDispatcher("result.jsp").forward(req,resp);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //寻找所有
    protected void findall(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
        studentDAO dao= new studentimpl();
        try {
            List<student> list =dao.findall();
            req.setAttribute("list",list);
            req.getRequestDispatcher("list.jsp").forward(req,resp);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
