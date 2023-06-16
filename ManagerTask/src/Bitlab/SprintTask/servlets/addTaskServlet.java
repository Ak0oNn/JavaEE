package Bitlab.SprintTask.servlets;

import Bitlab.SprintTask.DB.dbManager;
import Bitlab.SprintTask.Entity.Task1.model;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet(value = "/add-task")
public class addTaskServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("t_name");
        String deadlineDate = request.getParameter("t_deadlineDate");
        String description = request.getParameter("t_description");
        String status = request.getParameter("t_status");

        dbManager.addTask(new model(0, name, deadlineDate, description, status));

        response.sendRedirect("/");
    }
}