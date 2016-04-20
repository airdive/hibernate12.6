package controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import orm.Main;
import orm.MainDAO;

public class CreateMain extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Main MainRef = new Main();
		MainRef.setTitle("超级大喜讯，我来了！");
		MainRef.setContent("我是超大文本啊！");
		MainRef.setCreatetime(new Date());

		MainDAO MainDAORef = new MainDAO();
		MainDAORef.getSession().beginTransaction();
		MainDAORef.save(MainRef);
		MainDAORef.getSession().getTransaction().commit();
		MainDAORef.getSession().close();

	}
}
