package com.example.admin.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.admin.calculator.R.id.center;
import static com.example.admin.calculator.R.id.edt_input;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edtNumber;
    private TextView tvResult;

    private Button btnNumber1;
    private Button btnNumber2;
    private Button btnNumber3;
    private Button btnNumber4;
    private Button btnNumber5;
    private Button btnNumber6;
    private Button btnNumber7;
    private Button btnNumber8;
    private Button btnNumber9;
    private Button btnNumber0;

    private Button btnAdd;
    private Button btnSub;
    private Button btnMul;
    private Button btnDiv;

    private Button btnPoint;
    private Button btnResult;
    private Button btnClear;
    private Button btnAClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidget();
        setEventClickView();
    }

    public void initWidget(){
        edtNumber=(EditText)findViewById(R.id.edt_input);
        tvResult=(TextView) findViewById(R.id.tv_result);

        btnNumber0=(Button) findViewById(R.id.btnNumber0);
        btnNumber1=(Button) findViewById(R.id.btnNumber1);
        btnNumber2=(Button) findViewById(R.id.btnNumber2);
        btnNumber3=(Button) findViewById(R.id.btnNumber3);
        btnNumber4=(Button) findViewById(R.id.btnNumber4);
        btnNumber5=(Button) findViewById(R.id.btnNumber5);
        btnNumber6=(Button) findViewById(R.id.btnNumber6);
        btnNumber7=(Button) findViewById(R.id.btnNumber7);
        btnNumber8=(Button) findViewById(R.id.btnNumber8);
        btnNumber9=(Button) findViewById(R.id.btnNumber9);

        btnAdd=(Button) findViewById(R.id.btnAdd);
        btnSub=(Button) findViewById(R.id.btnSub);
        btnMul=(Button) findViewById(R.id.btnMul);
        btnDiv=(Button) findViewById(R.id.btnDiv);

        btnPoint=(Button) findViewById(R.id.btnPoint);
        btnResult=(Button)findViewById(R.id.btnResult);
        btnClear=(Button) findViewById(R.id.btnClear);
        btnAClear=(Button)findViewById(R.id.btnAClear);
    }

    public void setEventClickView(){
        btnNumber0.setOnClickListener(this);
        btnNumber1.setOnClickListener(this);
        btnNumber2.setOnClickListener(this);
        btnNumber3.setOnClickListener(this);
        btnNumber4.setOnClickListener(this);
        btnNumber5.setOnClickListener(this);
        btnNumber6.setOnClickListener(this);
        btnNumber7.setOnClickListener(this);
        btnNumber8.setOnClickListener(this);
        btnNumber9.setOnClickListener(this);

        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);

        btnPoint.setOnClickListener(this);
        btnResult.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnAClear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btnNumber0:
                edtNumber.append("0");
                break;

            case R.id.btnNumber1:
                edtNumber.append("1");
                break;

            case R.id.btnNumber2:
                edtNumber.append("2");
                break;

            case R.id.btnNumber3:
                edtNumber.append("3");
                break;

            case R.id.btnNumber4:
                edtNumber.append("4");
                break;

            case R.id.btnNumber5:
                edtNumber.append("5");
                break;

            case R.id.btnNumber6:
                edtNumber.append("6");
                break;

            case R.id.btnNumber7:
                edtNumber.append("7");
                break;

            case R.id.btnNumber8:
                edtNumber.append("8");
                break;

            case R.id.btnNumber9:
                edtNumber.append("9");
                break;

            case R.id.btnAdd:
                edtNumber.append("+");
                break;

            case R.id.btnSub:
                edtNumber.append("-");
                break;

            case R.id.btnMul:
                edtNumber.append("*");
                break;

            case R.id.btnDiv:
                edtNumber.append("/");
                break;

            case  R.id.btnPoint:
                edtNumber.append(".");
                break;

            case R.id.btnResult:
                int numberA=Integer.parseInt(String.valueOf(edtNumber.getText()));
                break;

            case R.id.btnClear:
                BaseInputConnection textFieldInputConnection= new BaseInputConnection(edtNumber,true);
                textFieldInputConnection.sendKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_DEL));
                String numberAfterRemove=delNumber(edtNumber.getText().toString());
                edtNumber.setText(numberAfterRemove);
                break;

            case R.id.btnAClear:
                edtNumber.setText("");
                break;
        }
    }
//btnClear
    public String delNumber(String number){
        int leght=number.length();
        String tem=number.substring(0,leght-1);
        return tem;
    }
}
