package intigrent.com.login;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private EditText usernameField,passwordField;
    private TextView status,role,method;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usernameField = (EditText)findViewById(R.id.editText1);
        passwordField = (EditText)findViewById(R.id.editText2);
        status = (TextView)findViewById(R.id.textView6);
        role = (TextView)findViewById(R.id.textView7);
        method = (TextView)findViewById(R.id.textView9);
    }

    public void login(View view){
        String email = usernameField.getText().toString();
        String password = passwordField.getText().toString();
        method.setText("Get Method");
        new SigninActivity(this,status,role,0).execute(email,password);

    }
    public void loginPost(View view){
        String email = usernameField.getText().toString();
        String password = passwordField.getText().toString();
        method.setText("Post Method");
        new SigninActivity(this,status,role,1).execute(email, password);

    }

    public void onClick(View view){
        startActivity(new Intent(MainActivity.this,SecondActivity.class));
    }




}