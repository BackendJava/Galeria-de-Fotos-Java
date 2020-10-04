package SegundoParcial;

import javax.swing.ImageIcon;

public class imagen {

    private ImageIcon imagen = new ImageIcon();
    private int num;

    public ImageIcon getImagen() {
        return imagen;
    }

    public void setImagen() {
        switch (num) {
            case 1:
                imagen = new ImageIcon("imagenes/a1.png");
                break;
            case 2:
                imagen = new ImageIcon("imagenes/a2.png");
                break;
            case 3:
                imagen = new ImageIcon("imagenes/a3.png");
                break;
            case 4:
                imagen = new ImageIcon("imagenes/a4.jpg");
                break;
            case 5:
                imagen = new ImageIcon("imagenes/a5.jpg");
                break;
            case 6:
                imagen = new ImageIcon("imagenes/a6.jpg");
                break;
            case 7:
                imagen = new ImageIcon("imagenes/a7.png");
                break;
            case 8:
                imagen = new ImageIcon("imagenes/a8.jpg");
                break;
            case 9:
                imagen = new ImageIcon("imagenes/a9.jpg");
                break;
            case 10:
                imagen = new ImageIcon("imagenes/a10.jpg");
                break;
        }
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
