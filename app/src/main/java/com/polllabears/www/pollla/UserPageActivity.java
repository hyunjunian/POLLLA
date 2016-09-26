package com.polllabears.www.pollla;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.polllabears.www.pollla.model.Card;

public class UserPageActivity extends AppCompatActivity {

    private Button mChoButton;
    private EditText mChoText;
    private TextView cho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_page);
        cho = (TextView) findViewById(R.id.user_page_name);
        mChoText = (EditText) findViewById(R.id.user_page_input);
        mChoButton = (Button) findViewById(R.id.choButton);

        mChoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cho.setText(cho_hangul(mChoText.getText().toString()));
            }
        });
    }

    public String cho_hangul(String str) {
        char[] cho = {'ㄱ','ㄲ','ㄴ','ㄷ','ㄸ','ㄹ','ㅁ','ㅂ','ㅃ','ㅅ','ㅆ','ㅇ','ㅈ','ㅉ','ㅊ','ㅋ','ㅌ','ㅍ','ㅎ'};
        String result = "";
        for(int i=0;i<str.length();i++) {
            int code = str.codePointAt(i)-44032;
            if(code>-1 && code<11172) result += cho[code/588];
        }
        return result;
    }
}
