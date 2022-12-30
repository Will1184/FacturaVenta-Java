package mundopc;
import com.gm.mundopc.*;
public class MundoPc {
    public static void main(String[] args) {

        Computadora[] computadoras = {new Computadora(450, "Hp"),new Computadora(365,"Dell")};
        Monitor[] monitores = {new Monitor("All in one", "Hp", 400, 27),new Monitor("XPS","DEll",200,25)};
        Orden [] ordenes={new Orden(computadoras[0]),new Orden(monitores[0])};


        for (int i=0;i<ordenes.length;i++){
            double suma= Orden.Suma(computadoras[i],monitores[i]);
            Orden.imprimir(computadoras[i],monitores[i],suma,i );
        }


    }
}

/*for(int i=0;i<computadoras.length;i++ ){
            System.out.println(computadoras[i]);
        }
        for(int i=0;i<computadoras.length;i++ ){
            System.out.println(monitores[i]);
        }*/