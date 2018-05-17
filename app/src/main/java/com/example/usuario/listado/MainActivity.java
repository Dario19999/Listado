package com.example.usuario.listado;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lista = (ListView) findViewById(R.id.ListID);
        OrigenDeDatosDeTarjeta elOrigen = new OrigenDeDatosDeTarjeta();
        TarjetaAdapter Adapter = new TarjetaAdapter();
        Adapter.contexto=this;
        Adapter.dataAdapter = elOrigen.getData();
        Adapter.Imagenes = elOrigen.getImage();
        lista.setAdapter(Adapter);

    }
}
