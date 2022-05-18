package wildlife;

public class Main {
    static int getHerokuAssignedPort(){
      ProcessBuilder processBuilder = new ProcessBuilder();
      if(processBuilder.environment().get("PORT") !=null){
          return Integer.parseInt((processBuilder.environment().get("PORT")));
      }
    }
}
