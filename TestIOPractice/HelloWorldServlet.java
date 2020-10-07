package TestIOPractice;

import java.io.File;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.xml.ws.Response;


public class HelloWorldServlet {
	private static final long serialVersionUID = 1L;
	
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException{
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String s = sdf.format(new java.sql.Date());
		out.print(s);
		String referer = request.getHeader("referer");
	}
	
	String filePath;
	
	public memberFileIO(String filePath) {
		this.filePath = filePath;
		String dir = filePath.substring(0, filePath.lastIndexOf("//"));
		File f = new File(dir);
		if (! f.exists()) {
			f.mkdirs();
		}
	}
	
	protected void doGet (HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException{
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		String s = sdf.format(new java.util.Date());
		out.print(s);
		String referer = request.getHeader("referer");
		
		request.setContentType("text/html ; charset=UTF-8");
		PrintWriter out = response.getWriter("");
		out.print("Request URL = "+request.getRequestURL());
		out.print("Request URL = "+request.getRequestURI());
		out.print("Request URL = "+request.getQueryString());
		out.print("Request URL = "+request.getContextPath());
		out.print("Request URL = "+request.getServletPath());
		out.print("Request URL = "+request.getPathInfo());
		out.print("Request URL = "+request.getRemoteAddr());
		out.print("<hr>");
		out.print("請求標頭如下:<br> ");
		
		Enumeration<String> en = request.getHeaderNames();
		while(en.hasMoreElements()) {
		String header = request.nextElement();
		String value = request.getHeader(header);
		out.println(header + ": " + value +"<br>");
		}
		
		public Collection<Integer> getFourStars(){
		List<Integer> list = new ArrayList<Integer>();
		while(list.size() < ballNumber) {
			int num = (int)(Math.random()*(upperbound - lowerbound +1) + lowerbound);
			list.add(num);
		}return list;
			
		}	
		public Collection<Integer> getLuckyNumber(){
			Set<Integer> set = new Treeset<Integer>();
			while(set.size() < ballNumber) {
				int num = (int)(Math.random()*(upperBound - lowerBound + 1) + lowerBound);
				set.add(num);
			}return set;
		}
	
	public Collection<Integer> getLuckyNumber(){
		Set<Integer> set = new TreeSet<Integer>();
		while(set.size() < ballNumber) {
			int num = (int)(Math.random()*(upperBound-lowerBound+1) + lowerBound);
					set.add(num);
		}	return set;
		}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException{
		processRequest(request, response);
	}
	
	
	
	private void processRequest(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException{
		try {
				request.setCharacterEncoding("UTF-8");
				String name = request.getParameter("visitor");
				if(name == null || name.trim().length() ==0) {
					name="訪客";
				}
				LotteryBean lottery = new LotteryBean();
				lottery.setLowerBound(1);
				lottery.setUpperBound(49);
				lottery.setBallNumber(6);
				Collection<Integer> coll = lottery.getLuckyNumbers();
				request.setAttribute("visitorName", name);
				request.setAttribute("luckyNumber", coll);
				RequestDispatcher rd = request.getRequestDispatcher("/ch01/goodLuck.jsp");
				rd.forward(request, response);
				return;
		}catch	(UnsupportedEncodingException e) {
		          throw new ServletException(e);
		}
	}
	
	
	Enumeration<String> en = request.getHeaderNames();
	while(en.hasMoreElements()) {
		String header = en.nextElement();
		String value = request.getHeader(header);
		out.print(header+" : " +Value  );
	}
	
	Enumeration<String> en = request.getHeaderNames();
	while(en.hasMoreElements()) {
		String header = en.nextElement();
		String value = request.getHeader(header);
		out.println(header + ":" +value );
	}
	
	public Collection<Interger> getLuckyNumber(){
		Set<Integer> set = new TreeSet<Integer>();
	while(set.size() < ballNumber) {
		int num = (int)(Math.random()*(upperBound - lowerBound + 1) + lowerBound);
		set.add(num);
	}return set;
	}
	
	public Collection<Integer> getFourStar(){
		List<Integer> list = new ArrayList<Integer>();
		while( list.size() < ballNumber) {
			int num = (int)(Math.random()*(upperBound - lowerBound +1) + lowerBound);
			list.add(num);
		}return list;
	}
	
	public Collection<Integer> getFourStar(){
		List<Integer> list = new ArrayList<Integer>();
		while(list.size() < ballNumber) {
			int num = (int)(Math.random()*((upperBound - lowerBound +1) + lowerBound));
			list.add();
		}return list;
	}
	
	
	 
	private void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException{
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("visitor");
		if (name == null || name.trim().length() ==0) {
			name = "訪客";
		}
		LotteryBean lottery = new LotteryBean();
		lottery.setupperBound(49);
		lottery.setlowerBound(1);
		lottery.setballNumber(6);
		Collection<Integer> coll = lottery.getLuckyNumbers();
		request.setAttribute("visitorName", name);
		request.setAttribute("LuckyNumber", coll);
		requestDispatcher rd = request.getRequestDispatcher("/ch01/goodLuck.jsp");
		rd.forward(request, response);
		return;
	}
	}

	response.setContentType("text/http; charset = UTF-8");
	PrintWriter out = response.getWriter();
	request.setCharacterEncoding("UTF-8");
	String id = request.getParameter("userId");
	if (id == null || id.trim().length() == 0) {
		id = "未輸入";
	}
}
