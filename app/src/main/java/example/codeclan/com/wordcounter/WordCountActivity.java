package example.codeclan.com.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCountActivity extends AppCompatActivity {

    EditText textToCount;
    Button countButton;
    TextView countText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_count);

        textToCount = (EditText) findViewById(R.id.text_to_count_editText);
        countButton = (Button) findViewById(R.id.count_button);
        countText = (TextView) findViewById(R.id.output_textview);
    }

    public void onCountButtonClick(View button) {
        String input = textToCount.getText().toString();
        StringSplitter stringSplitter = new StringSplitter(input);
        countText.setText(String.valueOf(stringSplitter.getCount()));
    }

    public void onDetailedCountClick(View button) {
        String input = textToCount.getText().toString();
        StringSplitter stringSplitter = new StringSplitter(input);
        countText.setText(String.valueOf(stringSplitter.detailedCount()));
    }
}
