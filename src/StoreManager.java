import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/StoreManager")
public class StoreManager extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        displayStoreManager(request, response, pw, false);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        Utilities utility = new Utilities(request,pw);
        utility.printHtml("Header.html");
        utility.printHtml("LeftNavigationBar.html");

        String id = request.getParameter()


    }

    protected void displayStoreManager(HttpServletRequest request,
                                       HttpServletResponse response, PrintWriter pw, boolean error)
            throws ServletException, IOException {
        Utilities utility = new Utilities(request, pw);
        utility.printHtml("Header.html");
        pw.print("<div class='post' style='float: none; width: 100%'>");
        pw.print("<h2 class='title meta'><a style='font-size: 24px;'>Hello,Store Manager</a></h2>"
                + "<div class='entry'>"
                + "<div style='width:400px; margin:25px; margin-left: auto;margin-right: auto;'>");

        pw.print("<form method='post' action='StoreManager'>"
                + "<table style='width:100%'><tr><td>"
                + "<h3>Product Name</h3></td><td><input type='text' name='productname' value='' class='input' required></input>"
                + "</td></tr><tr><td>"
                + "<h3>Product Id</h3></td><td><input type='text' name='productid' value='' class='input' required></input>"
                + "</td></tr><tr><td>"
                + "<h3>Product price</h3></td><td><input type='text' name='productprice' value='' class='input' required></input>"
                + "</td></tr><tr><td>"

                + "<h3>Product manufacture</h3></td><td><input type='text' name='productprice' value='' class='input' required></input>"
                + "</td></tr><tr><td>"

                + "<h3>Product condition</h3></td><td><input type='text' name='productcondition' value='' class='input' required></input>"
                + "</td></tr><tr><td>"

                + "<h3>Product discount</h3></td><td><input type='text' name='productdiscount' value='' class='input' required></input>"
                + "</td></tr><tr><td>"

                + "<h3>User Type</h3></td><td><select name='usertype' class='input'><option value='customer' selected>Customer</option><option value='retailer'>Store Manager</option><option value='manager'>Salesman</option></select>"
                + "</td></tr></table>"

                + "<input type='submit' class='btnbuy' name='ByUser' value='Add or Update Product' style='float: right;height: 20px margin: 20px; margin-right: 10px;'></input>"
                + "</form>" + "</div></div></div>");
        utility.printHtml("Footer.html");

    }
}
