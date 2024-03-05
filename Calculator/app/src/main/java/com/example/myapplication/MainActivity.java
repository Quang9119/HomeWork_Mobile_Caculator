package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Stack;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private boolean buttonsHidden = false;
    Button clearButton, percentButton, deleteButton, divisionButton,
            sevenButton, eightButton, nineButton, multiplyButton,
            fourButton, fiveButton, sixButton, minusButton,
            oneButton, twoButton, threeButton, sumButton,
            zeroButton, pointButton, equalButton, sinButton,
            cosButton, tanButton, exponentialButton, squareButton,lgButton, lnButton,leftParenthesisButton,rightParenthesisButton,
            factorialButton,onedivxButton,piButton,eButton,ConvertButton,twondButton,degButton;

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


        twondButton = findViewById(R.id.twondButton);
        twondButton.setOnClickListener(this);

        degButton = findViewById(R.id.degButton);
        degButton.setOnClickListener(this);


        ConvertButton = findViewById(R.id.ConvertButton);
        ConvertButton.setOnClickListener(this);

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

        sinButton = findViewById(R.id.sinButton);
        sinButton.setOnClickListener(this);

        cosButton = findViewById(R.id.cosButton);
        cosButton.setOnClickListener(this);

        tanButton = findViewById(R.id.tanButton);
        tanButton.setOnClickListener(this);

        exponentialButton = findViewById(R.id.exponentialButton);
        exponentialButton.setOnClickListener(this);

        squareButton = findViewById(R.id.squareButton);
        squareButton.setOnClickListener(this);

        lgButton = findViewById(R.id.lgButton);
        lgButton.setOnClickListener(this);

        lnButton = findViewById(R.id.lnButton);
        lnButton.setOnClickListener(this);

        leftParenthesisButton = findViewById(R.id.leftParenthesisButton);
        leftParenthesisButton.setOnClickListener(this);

        rightParenthesisButton = findViewById(R.id.rightParenthesisButton);
        rightParenthesisButton.setOnClickListener(this);

        factorialButton = findViewById(R.id.factorialButton);
        factorialButton.setOnClickListener(this);

        onedivxButton= findViewById(R.id.onedivxButton);
        onedivxButton.setOnClickListener(this);

        piButton = findViewById(R.id.piButton);
        piButton.setOnClickListener(this);
        eButton = findViewById(R.id.eButton);
        eButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.ConvertButton) {
            // Kiểm tra trạng thái của biến boolean
            if (!buttonsHidden) {
                // Danh sách ID của các nút cần ẩn
                int[] buttonsToHide = {R.id.sinButton, R.id.cosButton, R.id.tanButton, R.id.lgButton, R.id.lnButton,
                        R.id.leftParenthesisButton, R.id.rightParenthesisButton, R.id.squareButton, R.id.exponentialButton,
                        R.id.factorialButton, R.id.onedivxButton, R.id.piButton, R.id.eButton,R.id.twondButton,R.id.degButton};

                // Ẩn các nút trong danh sách
                for (int buttonId : buttonsToHide) {
                    Button button = findViewById(buttonId);
                    button.setVisibility(View.GONE);
                }
                // Đặt lại trạng thái của biến boolean thành true
                buttonsHidden = true;
            } else {
                // Danh sách ID của các nút cần hiện lại
                int[] buttonsToShow = {R.id.sinButton, R.id.cosButton, R.id.tanButton, R.id.lgButton, R.id.lnButton,
                        R.id.leftParenthesisButton, R.id.rightParenthesisButton, R.id.squareButton, R.id.exponentialButton,
                        R.id.factorialButton, R.id.onedivxButton, R.id.piButton, R.id.eButton,R.id.twondButton,R.id.degButton};


                for (int buttonId : buttonsToShow) {
                    Button button = findViewById(buttonId);
                    button.setVisibility(View.VISIBLE);
                }
                // Đặt lại trạng thái của biến boolean thành false
                buttonsHidden = false;
            }
        } else {

        }
        if (id == R.id.equalButton) {
            try {
                OperationCalculation();

                answerView.setTextColor(getResources().getColor(R.color.teal));
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
            questionView.append(".");
            try {
                OperationCalculation();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }  else if (id == R.id.sinButton) {
            questionView.append("sin(");
            try {
                OperationCalculation();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (id == R.id.cosButton) {
            questionView.append("cos(");
            try {
                OperationCalculation();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (id == R.id.tanButton) {
            questionView.append("tan(");
            try {
                OperationCalculation();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (id == R.id.exponentialButton) {
            questionView.append("^");
            try {
                OperationCalculation();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (id == R.id.squareButton) {
            questionView.append("√");
            try {
                OperationCalculation();
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
        else if (id == R.id.lgButton) {
            questionView.append("lg(");
            try {
                OperationCalculation();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (id == R.id.lnButton) {
            questionView.append("ln(");
            try {
                OperationCalculation();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (id == R.id.leftParenthesisButton) {
            questionView.append("(");
            try {
                OperationCalculation();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (id == R.id.rightParenthesisButton) {
            questionView.append(")");
            try {
                OperationCalculation();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (id == R.id.factorialButton) {
            questionView.append("!");
            try {
                OperationCalculation();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (id == R.id.onedivxButton) {
            String currentText = questionView.getText().toString();
            if (!currentText.isEmpty()) {
                double num = Double.parseDouble(currentText);
                if (num != 0) {
                    double result = 1 / num;
                    answerView.setText(String.valueOf(result));
                } else {

                    answerView.setText("Error: Cannot divide by zero");
                }
            }
        } else if (id == R.id.piButton) {
            questionView.append("π");
            try {
                OperationCalculation();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (id == R.id.eButton) {
            questionView.append("e");
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
        Stack<Double> operandStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();


        if (ch == ')') {
            while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                char operator = operatorStack.pop();
                double num2 = operandStack.pop();
                double num1 = operandStack.pop();
                double result = performOperation(num1, num2, operator);
                operandStack.push(result);
            }
            operatorStack.pop();
        } if (ch == ')') {
            while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                char operator = operatorStack.pop();
                double num2 = operandStack.pop();
                double num1 = operandStack.pop();
                double result = performOperation(num1, num2, operator);
                operandStack.push(result);
            }
            operatorStack.pop();
        } else {
            for (int i = 0; i < length; i++) {
                ch = str.charAt(i);
                ascii = (int) ch;
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

                if (ch == 's') {
                    op = 's';
                }

                if (ch == 'c') {
                    op = 'c';
                }

                if (ch == 't') {
                    op = 't';
                }
                if (ch == 'l') {
                    if (i + 1 < length && str.charAt(i + 1) == 'n') {
                        op = 'n';
                        i++;
                    } else {
                        op = 'l';
                    }
                }


                if (ch == '^') {
                    op = '^';
                }

                if (ch == '√') {
                    op = '√';
                }

                if (ch == '!') {
                    op = '!';
                } if (ch == 'π') {
                    op = 'π';
                } if (ch == 'e') {
                    op = 'e';
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
                        previousAns = ans;
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

                if (op == 's') {
                    if (!value.isEmpty()) {
                        num = Double.parseDouble(value);
                        ans = Math.sin(Math.toRadians(num));
                        answerView.setText("" + ans);
                    }
                } else if (op == 'c') {
                    if (!value.isEmpty()) {
                        num = Double.parseDouble(value);
                        ans = Math.cos(Math.toRadians(num));
                        answerView.setText("" + ans);
                    }
                } else if (op == '^') {
                    if (!value.isEmpty()) {
                        num = Double.parseDouble(value);

                        String previousNumber = str.substring(0, i);
                        String nextNumber = str.substring(i + 1);


                        double previousOperand = Double.parseDouble(previousNumber);
                        double nextOperand = Double.parseDouble(nextNumber);


                        ans = Math.pow(previousOperand, nextOperand);
                        answerView.setText(String.valueOf(ans));
                    }
                }
                else if (op == '√') {
                    if (!value.isEmpty()) {
                        num = Double.parseDouble(value);
                        ans = Math.sqrt(num);
                        answerView.setText("" + ans);
                    }
                } else if (op == 'l') {
                    if (!value.isEmpty()) {
                        num = Double.parseDouble(value);
                        ans = Math.log10(num);
                        answerView.setText("" + ans);
                    }
                } else if (op == 'n') {
                    if (!value.isEmpty()) {
                        num = Double.parseDouble(value);
                        ans = Math.log(num);
                        answerView.setText("" + ans);
                    }
                }

                else if (op == '(') {

                } else if (op == ')') {

                }
                else if (op == '!') {
                    if (!value.isEmpty()) {
                        int factorialNum = Integer.parseInt(value);
                        ans = factorial(factorialNum);
                        answerView.setText("" + ans);
                    }
                } else if (op == 'π') {
                    ans = Math.PI;
                    answerView.setText("" + ans);
                } else if (op == 'e') {
                    ans = Math.E;
                    answerView.setText("" + ans);
                } else if (op == 't') {
                    if (!value.isEmpty()) {
                        num = Double.parseDouble(value);
                        ans = Math.tan(Math.toRadians(num));
                        answerView.setText("" + ans);
                    }
                }
        }

        }
    }

    private double performOperation(double num1, double num2, char operator) {

        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;

        }
        return 0;
    }

    private int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }




}