package yyh.play;

import java.io.Serializable;

/**
 * Created by ÑîÓÀ»ª on 2015/12/16.
 */
public class PlayerAccount implements Serializable{
    private String name;

    private String password;

    public PlayerAccount(String name,String password){
        this.name = name;
        this.password = password;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
