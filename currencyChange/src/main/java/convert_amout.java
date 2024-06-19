

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class convert_amout
 */
public class convert_amout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
 
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		 response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        PrintWriter pw=response.getWriter();
	        
		try {
		
		double amt=Double.parseDouble(request.getParameter("amt")) ;
		String from=request.getParameter("fromcurrency") ;
		String to=request.getParameter("tocurrency");
		
		String symbols="";
		
		double exchangeRate=0;
		//USD
		if (from.equals("USD") && to.equals("INR")) {
			exchangeRate= amt*83.49;
        	symbols=String.valueOf(String.format("%.2f", exchangeRate)).concat(" ₹ Rupees");
        } else if (from.equals("USD") && to.equals("ERU")) {
        	exchangeRate= amt*0.93;
        	symbols=String.valueOf(String.format("%.2f", exchangeRate)).concat(" € Euros");
        } else if (from.equals("USD") && to.equals("KWD")) {
        	exchangeRate= amt*0.31 ;
        	symbols=String.valueOf(String.format("%.2f", exchangeRate)).concat(" د.ك Dinars");
        }else if (from.equals("USD") && to.equals("USD")) {
        	exchangeRate= amt;
        	symbols=String.valueOf(String.format("%.2f", exchangeRate)).concat(" $ Dollars");
        } 
		//INR
        else if (from.equals("INR") && to.equals("USD")) {
        	exchangeRate= amt*0.012 ;
        	symbols=String.valueOf(String.format("%.2f", exchangeRate)).concat(" $ Dollars");
        } else if (from.equals("INR") && to.equals("KWD")) {
        	exchangeRate= amt*0.0037 ;
        	symbols=String.valueOf(String.format("%.2f", exchangeRate)).concat(" د.ك Dinars");
        } else if (from.equals("INR") && to.equals("ERU")) {
        	exchangeRate= amt*0.011 ;
        	symbols=String.valueOf(String.format("%.2f", exchangeRate)).concat(" € Euros");
        }else if (from.equals("INR") && to.equals("INR")) {
        	exchangeRate= amt ;
        	symbols=String.valueOf(String.format("%.2f", exchangeRate)).concat(" ₹ Rupees");
        }  
		//KWD
        else if (from.equals("KWD") && to.equals("USD")) {
        	exchangeRate= amt*3.25 ;
        	symbols=String.valueOf(String.format("%.2f", exchangeRate)).concat(" $ Dollars");
        } else if (from.equals("KWD") && to.equals("KWD")) {
        	exchangeRate= amt;
        	symbols=String.valueOf(String.format("%.2f", exchangeRate)).concat(" د.ك Dinars");
        } else if (from.equals("KWD") && to.equals("ERU")) {
        	exchangeRate= amt*3.02 ;
        	symbols=String.valueOf(String.format("%.2f", exchangeRate)).concat(" € Euros");
        }else if (from.equals("KWD") && to.equals("INR")) {
        	exchangeRate= amt*271.43 ;
        	symbols=String.valueOf(String.format("%.2f", exchangeRate)).concat(" ₹ Rupees");
        } 
		//ERU
        else if (from.equals("ERU") && to.equals("USD")) {
        	exchangeRate= amt*1.08 ;
        	symbols=String.valueOf(String.format("%.2f", exchangeRate)).concat(" $ Dollars");
        } else if (from.equals("ERU") && to.equals("KWD")) {
        	exchangeRate= amt*0.33 ;
        	symbols=String.valueOf(String.format("%.2f", exchangeRate)).concat(" د.ك Dinars");
        } else if (from.equals("ERU") && to.equals("ERU")) {
        	exchangeRate= amt;
        	symbols=String.valueOf(String.format("%.2f", exchangeRate)).concat(" € Euros");
        }else if (from.equals("ERU") && to.equals("INR")) {
        	exchangeRate= amt*89.97 ;
        	symbols=String.valueOf(String.format("%.2f", exchangeRate)).concat(" ₹ Rupees");
        } 
        
        else {
            throw new IllegalArgumentException("Unsupported currency conversion");
       }
		
		//pw.println(exchangeRate);
		request.setAttribute("amount",amt );
		request.setAttribute("from",from );
		request.setAttribute("to",to );
		request.setAttribute("amountExchanged",symbols );
		request.getRequestDispatcher("userFace.jsp").forward(request,response);
		
    } catch (Exception e) {

        out.println("<h1>Error in conversion</h1>");
        out.println("<p>Please enter valid inputs.</p>");
        out.println("<a href=userFace.jsp>Go back</a>");
        
		
        
    }
		
	}

}
