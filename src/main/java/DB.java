import org.sql2o.*;

public class DB {
  // public static Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker", null, null);

  public static Sql2o sql2o = new Sql2o("jdbc:postgresql://ec2-23-21-246-11.compute-1.amazons.com:5432/d6iscsi7k46sgs", "libellous",  "9f195ab9c22336597beef199bba05cf8215cc0ec369c413b42afraid28bf85992");
}
