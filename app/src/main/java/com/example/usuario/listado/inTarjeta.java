package com.example.usuario.listado;

/**
 * Created by Dario Menendez on 17/05/2018.
 */

public class inTarjeta {

    public Integer inEdad;
    public String inNombre;
    public String inDesc;
    public int inImg;

    public String getInEdad()
    {
        return inEdad.toString();
    }
    public int getInImg()
    {
        return inImg;
    }
    public String getInNombre()
    {
        return inNombre;
    }
    public String getInDesc()
    {
        return inDesc;
    }

    public void setInEdad( Integer uInEdad)
    {
        inEdad = uInEdad;
    }
    public void setNombre( String uInNombre)
    {
        inNombre = uInNombre;
    }
    public void setDesc( String uInDesc)
    {
        inDesc = uInDesc;
    }
    public void setImg( int uInImg)
    {
        inImg = uInImg;
    }

    public inTarjeta(Integer edad, String nombre, String desc, int img) {
        this.inEdad = edad;
        this.inNombre = nombre;
        this.inDesc = desc;
        this.inImg = img;
    }

    public inTarjeta() {}
}

