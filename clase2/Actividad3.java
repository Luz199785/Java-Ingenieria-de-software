
    


packagearreglos;
import java.util.Scanner;   

public class problem {
public static void main(String[] args) {
Scanner lectura=new Scanner(System.in);
int tamano;
System.out.println("Ingrese el tamaño de la matriz");
tamano= lectura.nextInt();

int matriz[][]= new int [tamano][tamano];

for (int i = 0; i <tamano; i++) {
for (int j = 0; j <tamano; j++) {
if (i==j) {
matriz[i][j]=1;
 
}
else {
matriz[i][j]=0;
}
}
}
String mat="";
for(int i=0;i<tamano;i++){
for(int j=0;j<tamano;j++){
if(j==4){
mat=mat+"|"+ matriz[i][j]+"|\n";
}
else{
mat=mat+"|" +matriz[i][j]+"|";
}
}
}


System.out.println(mat);
}
}
