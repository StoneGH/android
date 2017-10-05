package stone.com.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String TEXTBOX_MSG_KEY = "TEXTBOX_MSG_KEY";//存储文本框消息key

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 点击提交按钮执行方法
     *
     * @param view
     */
    public void sendMessage(View view) {
        /**
         * Intent是在不同组件中(比如两个Activity)提供运行时绑定的对象。
         * Intent代表一个应用"想去做什么事"，你可以用它做各种各样的任务，不过大部分的时候他们被用来启动另一个Activity。
         */
        Intent intent = new Intent(this, DisplayMessageActivity.class);

        EditText editText = (EditText) findViewById(R.id.textbox);//获得当前Activity中的文本框
        String text = editText.getText().toString();//获得文本框的文本

        intent.putExtra(TEXTBOX_MSG_KEY, text);//将文本传递到下一个Activity

        startActivity(intent);//启动DisplayMessageActivity
    }
}
