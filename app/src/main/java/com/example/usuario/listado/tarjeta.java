package com.example.usuario.listado;

/**
 * Created by Usuario on 24/04/2018.
 */

public class tarjeta {

    public Integer edad;
    public String nombre;
    public String desc;
    public int img;

    public String getEdad()
    {
        return edad.toString();
    }
    public int getImg()
    {
        return img;
    }
    public String getNombre()
    {
        return nombre;
    }
    public String getDesc()
    {
        return desc;
    }

    public void setEdad( Integer uEdad)
    {
        edad = uEdad;
    }
    public void setNombre( String uNombre)
    {
        nombre = uNombre;
    }
    public void setDesc( String uDesc)
    {
        desc = uDesc;
    }
    public void setImg( int uImg)
    {
        img = uImg;
    }

    public tarjeta(Integer edad, String nombre, String desc, int img) {
        this.edad = edad;
        this.nombre = nombre;
        this.desc = desc;
        this.img = img;
    }

    public tarjeta() {}
}
