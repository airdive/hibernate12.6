package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import orm.Sub;
import orm.SubDAO;

public class DeleteSub extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		SubDAO SubDAORef = new SubDAO();
		SubDAORef.getSession().beginTransaction();
		Sub SubRef = SubDAORef.findById(new Long(4));
		SubDAORef.delete(SubRef);
		SubDAORef.getSession().getTransaction().commit();
		SubDAORef.getSession().close();

	}

}
