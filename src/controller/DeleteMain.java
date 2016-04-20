package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import orm.Main;
import orm.MainDAO;

public class DeleteMain extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		MainDAO MainDAORef = new MainDAO();
		MainDAORef.getSession().beginTransaction();
		Main MainRef = MainDAORef.findById(new Long(1));
		MainDAORef.delete(MainRef);
		MainDAORef.getSession().getTransaction().commit();
		MainDAORef.getSession().close();

	}

}
