package controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Hibernate;

import orm.Main;
import orm.MainDAO;
import orm.Sub;
import orm.SubDAO;

public class CreateSub extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		MainDAO MainDAORef = new MainDAO();
		MainDAORef.getSession().beginTransaction();

		Main mainRef = MainDAORef.findById(new Long(1));
		Hibernate.initialize(mainRef);
		MainDAORef.getSession().getTransaction().commit();
		MainDAORef.getSession().close();

		Sub SubRef = new Sub();
		SubRef.setSubContent("�����ӱ�Ĵ��ı�");
		SubRef.setCreatetime(new Date());
		SubRef.setMain(mainRef);

		SubDAO SubDAORef = new SubDAO();
		SubDAORef.getSession().beginTransaction();
		SubDAORef.attachDirty(SubRef);
		SubDAORef.getSession().getTransaction().commit();
		SubDAORef.getSession().close();

	}

}
