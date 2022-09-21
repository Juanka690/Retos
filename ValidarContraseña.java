package ejercicios;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarContraseña {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Diga pues una contraseña: ");
        String contraseña = sc.next();

        Pattern regex = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&])([A-Za-z\\d$@$!%*?&]|[^ ]){8,15}$");
        Matcher matcher = regex.matcher(contraseña);

        if (matcher.find()) {
            System.out.println("Mono esa contraseña esta como buena");
        } else {
            System.out.println("Oe socio, cambiela, si?, eso no sirve");
        }
    }
}
