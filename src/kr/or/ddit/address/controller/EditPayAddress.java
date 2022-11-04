package kr.or.ddit.address.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.JsonObject;

/**
 * Servlet implementation class UpdateAddress
 */
@WebServlet("/address/editPay.do")
public class EditPayAddress extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		String jsonData = request.getParameter("jsonData");
		String memZip = request.getParameter("memZip");
		String memAddr1 = request.getParameter("memAddr1");
		String memAddr2 = request.getParameter("memAddr2");
		
		System.out.println("===jsonData==="+jsonData);
		System.out.println("===memzip==="+memZip);
		System.out.println("===memaddr1==="+memAddr1);
		System.out.println("===memaddr2==="+memAddr2);

//		JsonObject object = new JsonObject();
//
//		object.addProperty("memZip", memZip);
//		object.addProperty("memAddr1", memAddr1);
//		object.addProperty("memAddr2", memAddr2);
//
//		PrintWriter out = response.getWriter();
//
//		out.print(object);
//		out.flush();
//		out.close();

	}

}
