package wildlife.database;

import org.sql2o.Sql2o;
public class DB {
  public static String connectionString = "jdbc:postgresql://ec2-34-201-95-176.compute-1.amazonaws.com:5432/dbllqkpeck6bk3"; // connect to postgres test database
   public static Sql2o sql2o = new Sql2o(connectionString, "gifvtypykejxxl", "a063802209bb3afad3f8593e5983e8bee8328065d30de32f8b1bbb63a15af7d1");
//    public static String connectionString = "jdbc:postgresql://ec2-107-22-238-112.compute-1.amazonaws.com:5432/dal944u6isvbf3";
//    public static Sql2o sql2o = new Sql2o(connectionString,"mssvdwwzvjuacq","b54b18a36912df8f8b756f668809cdac8becf9c6757a35c25a510bd4b98c2e9e");
}
