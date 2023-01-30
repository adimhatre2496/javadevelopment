package com.cross.Collectionn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class JDBC
    {
           // private final String url="jdbc:postgresql://localhost:5432/citizen";
           // private final String user = "postgres";
            //private final String password = "Change ";

            public static void main(String[] args)
            {
                try
                {
                    Class.forName("org.postgresql.Driver");
                  Connection  con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/citizen","postgres","Change");
                    if(con!=null)
                    {
                        System.out.println("Connected");
                    } else
                    {
                        System.out.println("Not connceted");
                    }
                }

                catch (Exception e)
                {
                    System.out.println(e);
                }
            }
    }
