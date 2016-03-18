//Classe de teste de Sistema Operacional
public class testandoSO {
 
    //Variável estática que irá conter o nome do SO em minúsculo
    private static String SO = System.getProperty("os.name").toLowerCase();
 
    //Variável estática que irá conter a versão do SO em minúsculo
    private static String Vr = System.getProperty("os.version").toLowerCase();
 
    //Variável estática que irá conter a arquitetura do SO em minúsculo
    private static String Ar = System.getProperty("os.arch").toLowerCase();
 
    //Função principal
    public static void main(String[] args) {
        System.out.printf("\n-----------------------------------------------------------\n");
 
        //Se for Windows
        if (isWindows()) {
            System.out.printf("\n\tSendo executado em Sistema - Windows\n");
        }
 
        //Senão, se for Macintosh
        else if (isMac()) {
            System.out.printf("\n\tSendo executado em Sistema - Mac\n");
        }
 
        //Senão, se for Unix-Like (Unix, Linux, etc)
        else if (isUnix()) {
            System.out.printf("\n\tSendo executado em Sistema - Unix ou Linux\n");
        }
 
        //Senão, se for Solaris
        else if (isSolaris()) {
            System.out.printf("\n\tSendo executado em Sistema - Solaris\n");
        }
 
        //Senão, sistema irreconhecido
        else {
            System.out.printf("\n\tSistema nao detectado\n"</span>);
        }
 
        //Mostrando o SO que está sendo executado</span>
        System.out.printf("\n-----------------------------------------------------------\n");
        System.out.printf("\n\t--> Sistema:     "+SO+" <--\n");
        System.out.printf("\n\t--> Versao:      "+Vr+" <--\n");
        System.out.printf("\n\t--> Arquitetura: "+Ar+" <--\n");
        System.out.printf("\n-----------------------------------------------------------\n");
    }
 
    //Função que verifica se é windows
    public static boolean isWindows() {
        return (SO.indexOf("win") >= 0);
    }
 
    //Função que verifica se é Macintosh
    public static boolean isMac() {
        return (SO.indexOf("mac") >= 0);
    }
 
    //Função que verifica se é Unix-Like
    public static boolean isUnix() {
        return (SO.indexOf("nix") >= 0 || SO.indexOf("nux") >= 0 || SO.indexOf("aix") > 0 );
    }
 
    //Função que verifica se é Solaris
    public static boolean isSolaris() {
        return (SO.indexOf("sunos") >= 0);
    }
 
}