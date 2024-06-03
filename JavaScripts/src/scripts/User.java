package scripts;

public class User 
{
    private int id;
    private String name;
    private String userName;
    private String email;
    private String phone;
    private String password;

    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getUserName() 
    {
        return userName;
    }

    public void setUserName(String userName) 
    {
        if (VerifyUserName() == 0)
        {
            return;
        }
        
        this.userName = userName;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPhone() 
    {
        return phone;
    }

    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPassword() 
    {
        return password;
    }

    public void setPassword(String password) 
    {
        if (VerifyPassword() == 0)
        {
            return;
        }
        
        this.password = password;
    }
    
    public int VerifyUserName()
    {
        // Vai verificar se o nome de usuário já existe
        
        return 1; //true 
    }
    
    public int VerifyPassword()
    {
        // Vai verificar se a senha atende aos requisitos
        
        return 1; //true 
    }
}
