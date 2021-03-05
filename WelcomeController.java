@WebServlet("/welcome")
public class WelcomeServiceServlet extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    List<String> listofmessage = new ArrayList<String>();
    listofmessage.add("Hello!");
    listofmessage.add("Welcome to my Website!");
    listofmessage.add("Hope you enjoy your stay!");
  }
}

