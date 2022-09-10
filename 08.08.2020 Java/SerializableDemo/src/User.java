

import java.io.Serializable;

public class User implements Serializable
{
    int userid=123;
    String username="sagar";
    String password="pass@123";
    transient String confirmpassword="pass@123";
}
