package com.example.usuario.listado;
import java.util.ArrayList;

/**
 * Created by Usuario on 24/04/2018.
 */

public class OrigenDeDatosDeTarjeta {

    public ArrayList<tarjeta> getData(){
        ArrayList<tarjeta> datos=new ArrayList<tarjeta>();

        tarjeta tarjeta1 = new tarjeta();
        tarjeta1.setNombre("Ivan");
        tarjeta1.setDesc("Ya tuve que ir obligado a misa");
        tarjeta1.setEdad(18);
        tarjeta1.setImg(0);
        datos.add(tarjeta1);

        tarjeta tarjeta2 = new tarjeta();
        tarjeta2.setNombre("Edgar");
        tarjeta2.setDesc("Ya cambié de lugar mi cama");
        tarjeta2.setEdad(17);
        tarjeta2.setImg(0);
        datos.add(tarjeta2);

        tarjeta tarjeta3 = new tarjeta();
        tarjeta3.setNombre("Palomino");
        tarjeta3.setDesc(" Ya me hice el bueno y tuve mala fama");
        tarjeta3.setEdad(18);
        tarjeta3.setImg(0);
        datos.add(tarjeta3);

        tarjeta tarjeta4 = new tarjeta();
        tarjeta4.setNombre("Ismael");
        tarjeta4.setDesc("Ya lancé piedras y escupitajos, al lugar donde ahora trabajo ");
        tarjeta4.setEdad(18);
        tarjeta4.setImg(0);
        datos.add(tarjeta4);

        tarjeta tarjeta5 = new tarjeta();
        tarjeta5.setNombre("Edson");
        tarjeta5.setDesc("Lo que me daba placer ahora me da dolor");
        tarjeta5.setEdad(18);
        tarjeta5.setImg(0);
        datos.add(tarjeta5);

        tarjeta tarjeta6 = new tarjeta();
        tarjeta6.setNombre("Alan");
        tarjeta6.setDesc("Ya me ahogué en un vaso de agua");
        tarjeta6.setEdad(18);
        tarjeta6.setImg(0);
        datos.add(tarjeta6);

        tarjeta tarjeta7 = new tarjeta();
        tarjeta7.setNombre("Roberto");
        tarjeta7.setDesc("Ya creí en los marcianos");
        tarjeta7.setEdad(18);
        tarjeta7.setImg(0);
        datos.add(tarjeta7);

        tarjeta tarjeta8 = new tarjeta();
        tarjeta8.setNombre("Ramon");
        tarjeta8.setDesc("Hice un curso de mitología pero de mí los dioses se reían");
        tarjeta8.setEdad(18);
        tarjeta8.setImg(0);
        datos.add(tarjeta8);

        tarjeta tarjeta9 = new tarjeta();
        tarjeta9.setNombre("Luis");
        tarjeta9.setDesc("Muchas de mis mentiras ya son verdades");
        tarjeta9.setEdad(18);
        tarjeta9.setImg(0);
        datos.add(tarjeta9);

        tarjeta tarjeta10 = new tarjeta();
        tarjeta10.setNombre("Mariana");
        tarjeta10.setDesc("Ya me reí y me importó un bledo, de cosas y gente que ahora me dan miedo");
        tarjeta10.setEdad(18);
        tarjeta10.setImg(0);
        datos.add(tarjeta10);

        return datos;
    }

    public ArrayList<String> getImage() {
        ArrayList<String> Image = new ArrayList<String>();

        Image.add("https://ae01.alicdn.com/kf/HTB1Mk.FRVXXXXaLaXXXq6xXFXXXA/Figma-MAX-EX-018-The-Avenger-Ironman-15cm-Action-Figure-Model-Toy-Iron-Man.jpg_640x640.jpg");

        Image.add("https://s3.pixers.pics/pixers/700/FO/16/15/96/96/700_FO16159696_426615ee66397520efe4e0c2be461f0b.jpg");

        Image.add("https://cdn.vox-cdn.com/thumbor/IEzC-UNuugBPf9kN5cVYMTCyfUs=/1400x1400/filters:format(jpeg)/cdn.vox-cdn.com/uploads/chorus_asset/file/10539653/DZTMk_pW0AEKiVC.jpg");

        Image.add("https://i.ytimg.com/vi/fhe2McOXOQk/hqdefault.jpg");

        Image.add("https://static1.funidelia.com/6828-f4_large/punal-camuflaje.jpg");

        Image.add("https://t2.ea.ltmcdn.com/es/images/2/9/7/img_como_evitar_que_mi_shiba_inu_me_muerda_20792_600.jpg");

        Image.add("https://www.rockombia.com/images/upload/rockombia-201110251319582754.jpg");

        Image.add("http://www.zocalo.com.mx/images/sized/images/uploads/articles/Representante-de-Juan-Gabriel-anuncia-gira-por-22-ciudades-de-Estados-Unidos-621x354.jpg");

        Image.add("https://t1.rg.ltmcdn.com/es/images/3/7/0/img_empanadas_de_pollo_al_horno_59073_600.jpg");

        Image.add("https://i.ytimg.com/vi/ShzJR7Wel_I/hqdefault.jpg");

        return Image;

    }
}
