import java.util.Scanner;
public class AppMain{
  public static void main(String[] args){
    int n;
    Scanner s=new Scanner(System.in);
    Password p=new Password();
    Password p2=new Password(5);
    p.generar();
    System.out.println(p.getPassword());
    p.generarSegura();
    System.out.println(p.getPassword());
    p2.generar();
    System.out.println(p2.getPassword());
    p2.generarSegura();
    System.out.println(p2.getPassword());
    do{
      System.out.println("Digite longitud de la contraseña:");
      n=s.nextInt();
      if(n<=0){
        System.out.println("La longitud debe ser mayor a 0");
      }
    }while(n<1);
    Password p3=new Password(n);
    System.out.println("¿Desea que su contraseña sea obligatoriamente 'segura'?");
    System.out.println("1. Si");
    System.out.println("2. No");
    int x=s.nextInt();
    switch(x){
	case 1:
	  p3.generar();
	  p3.generarSegura();
	  System.out.println(p3.getPassword());
	  break;
	case 2:
	  p3.generar();
	  System.out.println(p3.getPassword());
	  break;
	default:
	  System.out.println("Error");
    }
  }
}
