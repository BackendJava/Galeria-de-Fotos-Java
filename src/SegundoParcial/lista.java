package SegundoParcial;
import javax.swing.ImageIcon;
public class lista {
     private nodo i, f;
    int c = 0;

    public void CrearLista(imagen d) {
        nodo aux = new nodo();
        aux.setI1(d);
        aux.setAnterior(null);
        aux.setSiguiente(null);
        i = aux;
        f = aux;
        c++;
    }

    public void Insertarsiguiente(imagen d) {
        nodo aux = new nodo();
        aux.setI1(d);
        aux.setAnterior(f);
        aux.setSiguiente(null);
        f.setSiguiente(aux);
        f = aux;
        c++;
    }

    public void Insertar(int num) {
        imagen aux = new imagen();
        aux.setNum(num);
        aux.setImagen();
        
        if (c == 0) {
            CrearLista(aux);
        } else {
            Insertarsiguiente(aux);
        }
    }

    public ImageIcon buscar(int dato) {
        ImageIcon temp = new ImageIcon();
        nodo aux = new nodo();
        aux = i;
        while (aux != null) {
            if (dato == aux.getI1().getNum()) {
                temp = aux.getI1().getImagen();
                break;
            } else {
                aux = aux.getSiguiente();
            }
        }
        return temp;
    }
}
