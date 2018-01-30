import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;
import net.sf.json.JsonConfig;
import net.sf.json.xml.XMLSerializer;
/*
	@Author: Dillon Dickerson
	@Version: 1.0
	Copyright Dillon Dickerson 2018
*/

public class GetPersons extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//

		FileManager fm = new FileManager();
		JSONObject jsonObj = fm.readFile();
		System.out.println("try again");
		try {
			BufferedReader buf = new BufferedReader(new FileReader("coderbook.xml"));
			String t = buf.readLine();
			System.out.println(t);
			buf.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("done");

		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("Testting Get Persons");
		out.println(jsonObj.toString());
		out.println("</html>");
	}
}
