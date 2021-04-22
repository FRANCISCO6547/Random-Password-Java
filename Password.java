//Programa para generar una contraseña aleatoria
public class Password{
  private int longitud;
  private String password;
  public Password(){
    longitud=10;
  }
  public Password(int longitud){
    this.longitud=longitud;
  }
  public void generar(){
    char c;
    password="";
    for(int i=0;i<longitud;i++){
      //Al azar entre 48-58 sin incluir 58
      double n1=48+(Math.random()*10);
      //Al azar entre 65-91 sin incluir 91
      double n2=65+(Math.random()*26);
      //Al azar entre 97-123 sin incluir 123
      double n3=97+(Math.random()*26);
      double aux=1+(Math.random()*3);
      int auxR=(int) Math.floor(aux);
      int r1=(int) Math.floor(n1);
      int r2=(int) Math.floor(n2);
      int r3=(int) Math.floor(n3);
      if(auxR==1){
        c=(char) r3;
      }
      else if(auxR==2){
        c=(char) r2;
      }
      else{
        c=(char) r1;
      }
      password+=String.valueOf(c);
    }
  }
  public String getPassword(){
    return password;
  }
  //Retorna true si la contraseña posee al menos 5 numeros, al menos 1 minuscula y al menos 2 mayusculas
  public boolean validar(){
    int min=0, may=0, num=0;
    boolean segura=false;
    for(int i=0;i<longitud;i++){
      char letra = password.charAt(i);
      int x=letra;
      if(x>=48&&x<=57){
        num++;
      }
      else if(x>=65&&x<=90){
        may++;
      }
      else if(x>=97&&x<=122){
        min++;
      }
    }
    if(num>=5&&min>=1&&may>=2){
      segura=true;
    }
    return segura;
  }
  public void generarSegura(){
    if(longitud>=8){
      while(!validar()){
        generar();
      }
    }
    else{
      System.out.println("Su contraseña es muy pequeña");
    }
  }
}
