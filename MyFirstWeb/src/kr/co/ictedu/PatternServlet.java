package kr.co.ictedu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.ictedu.board.service.BoardDeleteService;
import kr.co.ictedu.board.service.BoardDetailService;
import kr.co.ictedu.board.service.BoardListService;
import kr.co.ictedu.board.service.BoardUpdateService;
import kr.co.ictedu.board.service.BoardWriteService;
import kr.co.ictedu.board.service.IBoardService;
import kr.co.ictedu.user.service.IUserService;
import kr.co.ictedu.user.service.UserJoinService;
import kr.co.ictedu.user.service.UserLoginService;
import kr.co.ictedu.user.service.UserLogoutService;

/**
 * Servlet implementation class PatternServlet
 */
// *.do�� ���� ������ .do�� ������ �����ּҸ� ��� ��ƿɴϴ�.
// Ȯ���� ������ /�� ���� �ۼ��մϴ�.
@WebServlet("*.hello")
public class PatternServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public PatternServlet() {
        super();
        System.out.println("Ȯ���� ���� ����");
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Ȯ���� ���� ����");
	}

	/**
	 * @see Servlet#destroy()
	 */
	@Override
	public void destroy() {
		System.out.println("Ȯ���� ���� �Ҹ�");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doRequest(request, response);
}




	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doRequest(request, response);
	}


	// ���� ��û �޼���(get, post) ��� ���� ó���ϰ� ����� �ʹٸ�
	// �޼��� �ϳ��� �� ���� ��û�Ѵ�.
	protected void doRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ���� ȣ���� ���� ��� ���� �ڷ����� ���� �� �ִ�
		// �������̽��� �����մϴ�.
		IBoardService sv = null;
		IUserService usv = null;
		// �ش� ������ ���� �ڿ� �Ѿ .jsp ���� ����
		String ui = null;

		// ���� ���� ��
		HttpSession session = null;
		session = request.getSession();

		// doget�� �ִ� ��� �ڵ带 �����ɳ���.
		// Ȯ���� ���Ͽ��� Ȯ���ڸ� ������ �ּҰ��� �������� ���ؼ�
		// �Ʒ� �ڵ带 ����մϴ�.
		String uri = request.getRequestURI();
		System.out.println("uri ����:" + uri);

		// �ܼ��� �ƴ� ����ڰ� Ȯ���� �� �ֵ��� .jsp ȭ�鿡
		// ������ ��� �ڷḦ ��� out.print(); ����� ����
		// ���� �غ�
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		// jsp�������� html�������� �̷��� ������ �˷��ִ� �ڵ�
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();


		if(uri.equals("/MyFirstWeb/join.do")) {
			usv = new UserJoinService();
			usv.execute(request, response);
			ui = "/users/user_login_form.jsp";
		} else if(uri.equals("/MyFirstWeb/login.do")) {
			usv = new UserLoginService();
			usv.execute(request, response);
			// ���ǿ��� �α��� ���� Ȯ��
			String result=(String)session.getAttribute("login");
			System.out.println(result);
			if(result != null&&result.equals("fail")) {
				session.invalidate();
				ui = "/users/user_login_form.jsp";
			}else if(result.equals("success")){
				ui = "/boardselect.do";
			}
		} else if(uri.equals("/MyFirstWeb/userupdate.do")) {
			System.out.println("���� ��û Ȯ��");
		} else if(uri.equals("/MyFirstWeb/userlogout.do")) {
			usv = new UserLogoutService();
			usv.execute(request, response);
			ui = "/users/user_login_form.jsp";
		}else if(uri.equals("/MyFirstWeb/userdelete.do")) {
			System.out.println("Ż�� ��û Ȯ��");
		}
		// PatternServlet2�� ������ .do�� ���ļ� ���� �Ű��ּ���.
		else if(uri.equals("/MyFirstWeb/boardwrite.do")) {
			// �۾��⿡ �ʿ��� ������ ȣ���ϵ��� ���񽺸� �����մϴ�.
			sv = new BoardWriteService();
			// BoardWriteSerivice�� execute�� ȣ���ϸ�
			// ������ ���� ������ �� ���Ͽ��� �� �ٸ� �����ؼ� ó���մϴ�.
			sv.execute(request, response);
			// ��� ����� / �� WebContent������ �⺻���� �����ֽ��ϴ�.
			ui = "/boardselect.do";
			// ��� ���� �Ŀ��� ������ �����̵�(forward)�� �����մϴ�.

		}else if(uri.equals("/MyFirstWeb/boardupdate.do")) {
			sv = new BoardDetailService();
			sv.execute(request, response);
			ui="/board/board_update_form.jsp";
		}else if(uri.equals("/MyFirstWeb/boardupdateok.do")) {
			// 1. ���� ��ü ����
			sv = new BoardUpdateService();
			// 2. ���� �޼��� ����
			sv.execute(request, response);
			// 3. ������ ������ �����Ϸ� ������
			// ���� ������ �� ��ȣ �޾ƿ���
			String strbId = request.getParameter("bId");
			ui = "/boarddetail.do?bId=" + strbId;

		}else if(uri.equals("/MyFirstWeb/boarddelete.do")) {
			sv = new BoardDeleteService();
			sv.execute(request, response);
			ui = "/boardselect.do";
		}else if(uri.equals("/MyFirstWeb/boardselect.do")) {
			// �� ��ȸâ ������ �����ϵ��� ���� �ڵ带 �ۼ����ּ���.
			sv = new BoardListService();
			sv.execute(request, response);

			ui = "/board/board_list.jsp";
		}else if(uri.equals("/MyFirstWeb/boarddetail.do")) {
			sv = new BoardDetailService();
			sv.execute(request, response);

			ui = "/board/board_detail.jsp";
		}else {
			out.print("�߸��� �����Դϴ�.");
		}


		// ������ ������ ���ǹ��� ��� �۵��� �ڿ� �����մϴ�.
		// RequestDispatcher�� ����� �������� �ϸ�
		// request, response�� �ڷḦ jsp�������� ������ �� �ֽ��ϴ�.
		// ��2 ����� ��ũ��Ʈ���� ���� �ʱ� ������
		// ��Ʈ�ѷ��ܿ��� ��¿� �ʿ��� �����͸� �޾Ƴ���
		// ������� .jsp�� �����մϴ�.
		RequestDispatcher dp = request.getRequestDispatcher(ui);
		dp.forward(request, response);
	}


}