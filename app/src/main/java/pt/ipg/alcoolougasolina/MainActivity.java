package pt.ipg.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editPrecoAlcool;
    private EditText editPrecoGasolina;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPrecoAlcool = findViewById(R.id.editAlcool);
        editPrecoGasolina = findViewById((R.id.editGasolina));
        textResultado = findViewById((R.id.textResultado));
    }


    public void calucularPreco(View view){

        Double precoAlcool = Double.parseDouble(editPrecoAlcool.getText().toString());
        Double precoGasolina = Double.parseDouble(editPrecoGasolina.getText().toString());

        /* Calculo ( preçoAlcool / preçoGasolina)
       Rsulyado <= 0.7 melhor gasolina
       Senao melhor alcool
     */
        Double resultado = precoAlcool/precoGasolina;

        if(resultado >= 0.7){
            textResultado.setText("Melhor utilizar gasolina");
        }else{
            textResultado.setText("Melhor utilizar o Alcool");
        }


    }

}
