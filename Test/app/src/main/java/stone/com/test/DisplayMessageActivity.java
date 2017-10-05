package stone.com.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();//接受Intent
        String text = intent.getStringExtra(MainActivity.TEXTBOX_MSG_KEY);//获得文本框内容
        //创建TextView对象
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(text);

        //将TextView加入之前被标记为R.id.content的RelativeLayout中
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.content);//获得Activity中的布局对象
        relativeLayout.addView(textView);
    }
}
