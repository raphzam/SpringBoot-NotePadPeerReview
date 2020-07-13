Spring Boot NotePad Exercise Peer Review



//HomeController.java    @Controller  public class HomeController{  @RequestMapping ("/")  public string home(Model model){  model.addAtttribute("myvar1","Yes, you can!"); return "home"; } public class HomeController{  @RequestMapping ("/")  public string home(Model model){  mode.addAtttribute("myvar2","Let's have fun!"); return "home"; } } //home.html <!DOCTYPE html> <head> <title></title>  </head> <body>  <p th:text="$myvar1"></p> <p th:text="$myvar2"></p>  <p th:text="#{static.message}"></p>   </body>   static.message=Hello world! static.message=Here I come! 