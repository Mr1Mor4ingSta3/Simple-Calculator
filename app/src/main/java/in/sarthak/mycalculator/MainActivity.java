package in.sarthak.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnAllClear, btnClear, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    private Button btnAddition, btnMinus, btnDivide, btnMultiply,btnEqual;
    private TextView txtInput;

    private String userInput;
    int num1 = 0;
    int num2 = 0;
    char sign = '0';

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initViews();
        setupListener();
    }


    private void initViews() {
        txtInput = findViewById(R.id.txtInput);

        btnAddition = findViewById(R.id.btnAddition);
        btnMinus = findViewById(R.id.btnMinus);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        btnAllClear = findViewById(R.id.btnAllClear);
        btnClear = findViewById(R.id.btnClear);
        btnEqual =findViewById(R.id.btnEqual);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

    }

    private void setupListener() {

        BtnOnClickListener btnOnClickListener = new BtnOnClickListener();

        btnAllClear.setOnClickListener(btnOnClickListener);
        btnClear.setOnClickListener(btnOnClickListener);
        btnAddition.setOnClickListener(btnOnClickListener);
        btnMinus.setOnClickListener(btnOnClickListener);
        btnMultiply.setOnClickListener(btnOnClickListener);
        btnDivide.setOnClickListener(btnOnClickListener);
        btnEqual.setOnClickListener(btnOnClickListener);

        btn0.setOnClickListener(btnOnClickListener);
        btn1.setOnClickListener(btnOnClickListener);
        btn2.setOnClickListener(btnOnClickListener);
        btn3.setOnClickListener(btnOnClickListener);
        btn4.setOnClickListener(btnOnClickListener);
        btn5.setOnClickListener(btnOnClickListener);
        btn6.setOnClickListener(btnOnClickListener);
        btn7.setOnClickListener(btnOnClickListener);
        btn8.setOnClickListener(btnOnClickListener);
        btn9.setOnClickListener(btnOnClickListener);

    }

    private class BtnOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {


            String buttonText = ((Button) view).getText().toString();

            switch (buttonText) {
                case "AC":
                    userInput = "";
                    num1 = 0;
                    num2 = 0;
                    txtInput.setText("");
                    break;

                case "C":
                    userInput = "";
                    num1 = 0;
                    num2 = 0;
                    txtInput.setText("");
                    break;

                case "0":
                    if (userInput!="") {
                        setInputData("0");
                    }
                    break;

                case "1":
                    setInputData("1");
                    break;

                case "2":
                    setInputData("2");
                    break;

                case "3":
                    setInputData("3");
                    break;

                case "4":
                    setInputData("4");
                    break;

                case "5":
                    setInputData("5");
                    break;

                case "6":
                    setInputData("6");
                    break;

                case "7":
                    setInputData("7");
                    break;

                case "8":
                    setInputData("8");
                    break;

                case "9":
                    setInputData("9");
                    break;

                case "+":
                    num1 = Integer.parseInt(userInput);
                    if (num1 > 0 ) {
                        userInput = "";
                        sign = '+';
                        setInputSign("+");
                    }
                    break;

                case "-":
                    num1 = Integer.parseInt(userInput);
                    userInput = "";
                    if (num1 > 0 ) {
                        sign = '-';
                        setInputSign("-");
                    }
                    break;

                case "*":
                    num1 = Integer.parseInt(userInput);
                    userInput = "";
                  if (num1 > 0 ) {
                      sign = '*';
                      setInputSign("*");
                  }
                  break;

                case "/":
                    num1 = Integer.parseInt(userInput);
                    userInput = "";
                    if (num1 > 0) {
                        sign = '/';
                        setInputSign("/");
                    }
                    break;

                case "=":
                    num2 = Integer.parseInt(userInput);
                    userInput = "";

                    switch (sign) {

                        case '+':
                            setInputData(String.valueOf(num1 + num2));
                            break;
                        case '-':
                           setInputData(String.valueOf(num1 - num2));
                            break;
                        case '*':
                            setInputData(String.valueOf(num1 * num2));
                            break;
                        case '/':
                            setInputData(String.valueOf(num1 / num2));
                            break;
                    }
                    break;
            }
        }
    }
    private void setInputData(String str){
        userInput = userInput + str;
        txtInput.setText(userInput);

    }
    private void setInputSign (String str) {
        txtInput.setText(str);
    }
}