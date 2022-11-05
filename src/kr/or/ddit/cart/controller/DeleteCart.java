package kr.or.ddit.cart.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.cart.service.CartServiceImpl;
import kr.or.ddit.cart.service.ICartService;

/**
 * Servlet implementation class DeleteCart
 */
@WebServlet("/deleteCart.do")
public class DeleteCart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		String cartNo = request.getParameter("cart_no");
		System.out.println("cart_no확인 :" + cartNo);

		ICartService service = CartServiceImpl.getInstance();

		int res = service.deleteCart(cartNo);
		System.out.println("res:" + res);

		request.setAttribute("result", res);

		try {
			request.getRequestDispatcher("/jhs/result.jsp").forward(request,
					response);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {
			doGet(request, response);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}

}
