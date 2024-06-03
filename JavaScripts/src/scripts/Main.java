package scripts;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {
        Scanner optionScan = new Scanner(System.in);
        int optionIndex;

        do
        {
            ShowOptions();
            optionIndex = optionScan.nextInt();

            switch (optionIndex) 
            {
                case 1:
                    RegisterUser();
                    break;

                case 2:
                    Login();
                    break;

                case 0:
                    break;
            }
        } while (optionIndex != 0);
    }
    
    public static void RegisterUser()
    {
        User user = new User();
    
        Scanner stringScan = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");              
        user.setName(stringScan.nextLine());
        System.out.println("Digite seu nome de usuário:");   
        user.setUserName(stringScan.nextLine());
        System.out.println("Digite seu e-mail:");
        user.setEmail(stringScan.nextLine());
        System.out.println("Digite seu número de telefone:");
        user.setPhone(stringScan.nextLine());
        System.out.println("Digite sua senha:");
        user.setPassword(stringScan.nextLine());
    }

    public static void Login()
    {
        User user = new User();

        String userName, password;

        Scanner stringScan = new Scanner(System.in);

        System.out.println("Digite seu nome de usuário:");  
        userName = stringScan.nextLine();
        System.out.println("Digite sua senha:");
        password = stringScan.nextLine();
    }

    public static void ShowOptions()
    {
        System.out.println("---------- Escolha uma opção ----------");
        System.out.println("0 - Finalizar Programa");
        System.out.println("1 - Registrar Usuário");
        System.out.println("2 - Fazer Login");
    }
}
