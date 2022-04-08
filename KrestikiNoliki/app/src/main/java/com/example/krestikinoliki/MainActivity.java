package com.example.krestikinoliki;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView resultField;
    int moves = 0;
    Boolean win = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultField = findViewById(R.id.resultField);
    }

    public void onButtonClick(View view) {
        Button button = (Button)view;
        String text = "0";

        if (moves == 9 || win) {
            return;
        }

        if (moves == 0) {
            resultField.setText("Игра началась");
        }

        if (button.getText().toString() == "") {
            if (moves % 2 == 0) {
                text = "X";
            }
            button.setText(text);
            moves++;

            if (moves >= 3) {
                wins();
            }
        }

    }

    public void onButtonRestartClick(View view) {
        Button[] buttons = {
                findViewById(R.id.button1),
                findViewById(R.id.button2),
                findViewById(R.id.button3),
                findViewById(R.id.button4),
                findViewById(R.id.button5),
                findViewById(R.id.button6),
                findViewById(R.id.button7),
                findViewById(R.id.button8),
                findViewById(R.id.button9)
        };

        for (Button button : buttons) {
            button.setText("");
        }

        resultField.setText("Для начала игры сделайте ход (первыми ходят крестики)");

        moves = 0;
        win = false;
    }

    public void wins() {
        String whoWin = "Крестики";

        Button[] buttons = {
                findViewById(R.id.button1),
                findViewById(R.id.button2),
                findViewById(R.id.button3),
                findViewById(R.id.button4),
                findViewById(R.id.button5),
                findViewById(R.id.button6),
                findViewById(R.id.button7),
                findViewById(R.id.button8),
                findViewById(R.id.button9)
        };

        if (
                buttons[0].getText().toString() == "0" &&
                buttons[1].getText().toString() == "0" &&
                buttons[2].getText().toString() == "0"
        ) {
            resultField.setText("Победили нолики");
            win = true;
        }
        else if (
                buttons[3].getText().toString() == "0" &&
                buttons[4].getText().toString() == "0" &&
                buttons[5].getText().toString() == "0"
        ) {
            resultField.setText("Победили нолики");
            win = true;
        }
        else if (
                buttons[6].getText().toString() == "0" &&
                buttons[7].getText().toString() == "0" &&
                buttons[8].getText().toString() == "0"
        ) {
            resultField.setText("Победили нолики");
            win = true;
        }
        else if (
                buttons[0].getText().toString() == "0" &&
                buttons[4].getText().toString() == "0" &&
                buttons[8].getText().toString() == "0"
        ) {
            resultField.setText("Победили нолики");
            win = true;
        }
        else if (
                buttons[2].getText().toString() == "0" &&
                buttons[4].getText().toString() == "0" &&
                buttons[6].getText().toString() == "0"
        ) {
            resultField.setText("Победили нолики");
            win = true;
        }
        else if (
                buttons[0].getText().toString() == "0" &&
                buttons[3].getText().toString() == "0" &&
                buttons[6].getText().toString() == "0"
        ) {
            resultField.setText("Победили нолики");
            win = true;
        }
        else if (
                buttons[1].getText().toString() == "0" &&
                buttons[4].getText().toString() == "0" &&
                buttons[7].getText().toString() == "0"
        ) {
            resultField.setText("Победили нолики");
            win = true;
        }
        else if (
                buttons[2].getText().toString() == "0" &&
                buttons[5].getText().toString() == "0" &&
                buttons[8].getText().toString() == "0"
        ) {
            resultField.setText("Победили нолики");
            win = true;
        }
        else if (
                buttons[0].getText().toString() == "X" &&
                buttons[1].getText().toString() == "X" &&
                buttons[2].getText().toString() == "X"
        ) {
            resultField.setText("Победили крестики");
            win = true;
        }
        else if (
                buttons[3].getText().toString() == "X" &&
                buttons[4].getText().toString() == "X" &&
                buttons[5].getText().toString() == "X"
        ) {
            resultField.setText("Победили крестики");
            win = true;
        }
        else if (
                buttons[6].getText().toString() == "X" &&
                buttons[7].getText().toString() == "X" &&
                buttons[8].getText().toString() == "X"
        ) {
            resultField.setText("Победили крестики");
            win = true;
        }
        else if (
                buttons[0].getText().toString() == "X" &&
                buttons[4].getText().toString() == "X" &&
                buttons[8].getText().toString() == "X"
        ) {
            resultField.setText("Победили крестики");
            win = true;
        }
        else if (
                buttons[2].getText().toString() == "X" &&
                buttons[4].getText().toString() == "X" &&
                buttons[6].getText().toString() == "X"
        ) {
            resultField.setText("Победили крестики");
            win = true;
        }
        else if (
                buttons[0].getText().toString() == "X" &&
                buttons[3].getText().toString() == "X" &&
                buttons[6].getText().toString() == "X"
        ) {
            resultField.setText("Победили крестики");
            win = true;
        }
        else if (
                buttons[1].getText().toString() == "X" &&
                buttons[4].getText().toString() == "X" &&
                buttons[7].getText().toString() == "X"
        ) {
            resultField.setText("Победили крестики");
            win = true;
        }
        else if (
                buttons[2].getText().toString() == "X" &&
                buttons[5].getText().toString() == "X" &&
                buttons[8].getText().toString() == "X"
        ) {
            resultField.setText("Победили крестики");
            win = true;
        }
        else if (moves == 9){
            resultField.setText("Ничья");
        }
    }

}