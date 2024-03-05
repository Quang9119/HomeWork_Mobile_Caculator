package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button clearButton, percentButton, deleteButton, divisionButton,
            sevenButton, eightButton, nineButton, multiplyButton,
            fourButton, fiveButton, sixButton, minusButton,
            oneButton, twoButton, threeButton, sumButton,
            zeroButton, pointButton, equalButton;
    EditText questionView;
    TextView answerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionView = findViewById(R.id.questionView);
        answerView = findViewById(R.id.answerView);

        clearButton = findViewById(R.id.clearButton);
        clearButton.setOnClickListener(this);

        percentButton = findViewById(R.id.percentButton);
        percentButton.setOnClickListener(this);

        deleteButton = findViewById(R.id.deleteButton);
        deleteButton.setOnClickListener(this);

        divisionButton = findViewById(R.id.divisionButton);
        divisionButton.setOnClickListener(this);

        sevenButton = findViewById(R.id.sevenButton);
        sevenButton.setOnClickListener(this);

        eightButton = findViewById(R.id.eightButton);
        eightButton.setOnClickListener(this);

        nineButton = findViewById(R.id.nineButton);
        nineButton.setOnClickListener(this);

        multiplyButton = findViewById(R.id.multiplyButton);
        multiplyButton.setOnClickListener(this);

        fourButton = findViewById(R.id.fourButton);
        fourButton.setOnClickListener(this);

        fiveButton = findViewById(R.id.fiveButton);
        fiveButton.setOnClickListener(this);

        sixButton = findViewById(R.id.sixButton);
        sixButton.setOnClickListener(this);

        minusButton = findViewById(R.id.minusButton);
        minusButton.setOnClickListener(this);

        oneButton = findViewById(R.id.oneButton);
        oneButton.setOnClickListener(this);

        twoButton = findViewById(R.id.twoButton);
        twoButton.setOnClickListener(this);

        threeButton = findViewById(R.id.threeButton);
        threeButton.setOnClickListener(this);

        sumButton = findViewById(R.id.SumButton);
        sumButton.setOnClickListener(this);

        zeroButton = findViewById(R.id.zeroButton);
        zeroButton.setOnClickListener(this);

        pointButton = findViewById(R.id.pointButton);
        pointButton.setOnClickListener(this);

        equalButton = findViewById(R.id.equalButton);
        equalButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.equalButton) {
            try {
                OperationCalculation();
                // Đổi màu của answerView thành màu đỏ
                answerView.setTextColor(getResources().getColor(R.color.teal)); // Sử dụng màu đỏ từ resources
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if (id == R.id.clearButton) {
            try {
                questionView.setText("");
                answerView.setText("");
                OperationCalculation();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (id == R.id.percentButton) {
            questionView.append("%");
            try {
                OperationCalculation();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (id == R.id.deleteButton) {
            try {
                String text = questionView.getText().toString();
                if (text.length() > 0) {
                    text = text.substring(0, text.length() - 1);
                    questionView.setText(text);
                }
                OperationCalculation();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (id == R.id.divisionButton) {
            questionView.append("÷");
            try {
                OperationCalculation();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (id == R.id.sevenButton) {
            questionView.append("7");
            try {
                OperationCalculation();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (id == R.id.eightButton) {
            questionView.append("8");
            try {
                OperationCalculation();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (id == R.id.nineButton) {
            questionView.append("9");
            try {
                OperationCalculation();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (id == R.id.multiplyButton) {
            questionView.append("x");
            try {
                OperationCalculation();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (id == R.id.fourButton) {
            questionView.append("4");
            try {
                OperationCalculation();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (id == R.id.fiveButton) {
            questionView.append("5");
            try {
                OperationCalculation();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (id == R.id.sixButton) {
            questionView.append("6");
            try {
                OperationCalculation();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (id == R.id.minusButton) {
            questionView.append("-");
            try {
                OperationCalculation();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (id == R.id.oneButton) {
            questionView.append("1");
            try {
                OperationCalculation();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (id == R.id.twoButton) {
            questionView.append("2");
            try {
                OperationCalculation();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (id == R.id.threeButton) {
            questionView.append("3");
            try {
                OperationCalculation();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (id == R.id.SumButton) {
            questionView.append("+");
            try {
                OperationCalculation();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (id == R.id.zeroButton) {
            questionView.append("0");
            try {
                OperationCalculation();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (id == R.id.pointButton) {
            questionView.append(",");
            try {
                OperationCalculation();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (id == R.id.sinButton) {
            // Xử lý khi nhấn vào nút sinButton
            questionView.append("sin(");
            try {
                OperationCalculation();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (id == R.id.cosButton) {
            // Xử lý khi nhấn vào nút cosButton
            questionView.append("cos(");
            try {
                OperationCalculation();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (id == R.id.tanButton) {
            // Xử lý khi nhấn vào nút tanButton
            questionView.append("tan(");
            try {
                OperationCalculation();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (id == R.id.exponentialButton) {
            // Xử lý khi nhấn vào nút exponentialButton
            questionView.append("^");
            try {
                OperationCalculation();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (id == R.id.squareButton) {
            // Xử lý khi nhấn vào nút squareButton
            questionView.append("^2");
            try {
                OperationCalculation();
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
}

    private void OperationCalculation() {
        double ans = 0, num, previousAns = 0;
        String value = "";
        int length, ascii;
        char op = ' ', ch = ' ';
        String str = questionView.getText().toString();
        length = str.length();
        for(int i = 0; i < length; i++) {
            ch = str.charAt(i);
            ascii = (int)ch;
            if (ascii >= 48 && ascii <= 57 || ascii == 46) {
                value += ch;
                value = value.trim();
                ans = previousAns;
            }

            if (ch == '+' || ch == '-' || ch == 'x' || ch == '÷') {
                op = ch;
                value = "";
                previousAns = ans;
            }

            if (ch == '%') {
                op = ch;
            }

            if (op == ' ') {
                if (!value.isEmpty()) {
                    num = Double.parseDouble(value);
                    ans = num;
                    answerView.setText("" + ans);
                }
            }

            if (op == '+') {
                if (!value.isEmpty()) {
                    num = Double.parseDouble(value);
                    ans += num;
                    answerView.setText("" + ans);
                }
            }

            if (op == '-') {
                if (!value.isEmpty()) {
                    num = Double.parseDouble(value);
                    ans -= num;
                    answerView.setText("" + ans);
                }
            }

            if (op == 'x') {
                if (!value.isEmpty()) {
                    num = Double.parseDouble(value);
                    ans *= num;
                    answerView.setText("" + ans);
                }
            }

            if (op == '÷') {
                if (!value.isEmpty()) {
                    num = Double.parseDouble(value);
                    ans /= num;
                    answerView.setText("" + ans);
                }
            }

            if (op == '%') {
                if (!value.isEmpty()) {
                    ans /= 100;
                    answerView.setText("" + ans);
                }
            }
        }
    }
    }