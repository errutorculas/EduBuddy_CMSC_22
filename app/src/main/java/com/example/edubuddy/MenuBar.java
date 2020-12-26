package com.example.edubuddy;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

/**
 * This is a fundamental method of the Menu appearing the
 * Main Activity or Home panel in order to execute the
 * necessary widgets used in the code derived from android package.
 *
 * @version 1.0
 * @since 2020-12-15
 */
public class MenuBar extends AppCompatActivity {

    /**
     * Method onCreate will establish the actions of the widgets.
     * And set the view of the UX/UI design.
     *
     * @param savedInstanceState ,import android.os.Bundle
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_bar);

        ImageButton backButton = findViewById(R.id.back_button);
        Button subjectsButton = findViewById(R.id.subjects_button);
        Button messagesButton = findViewById(R.id.messages_button);
        Button logoutButton = findViewById(R.id.logout_button);

        //lambda expression for the back button going back to the main activity (home)
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });

        //lambda expression for the back button going to the subjects panel
        subjectsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSubjectsActivity();
            }
        });

        //lambda expression for the back button going to the messages panel
        messagesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMessagesActivity();
            }
        });

        //lambda expression for the logout button going to the login activity
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLoginActivity();
            }
        });
    }

    /**
     * Function in order to initiate the execution of the button
     * opening the MainActivity or Home. startActivity(intent)
     */
    public void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    /**
     * Function in order to initiate the execution of the button
     * opening the Subjects feature. startActivity(intent)
     */
    public void openSubjectsActivity() {
        Intent intent = new Intent(this, Subjects.class);
        startActivity(intent);
    }
    /**
     * Function in order to initiate the execution of the button
     * opening the Messages feature. startActivity(intent)
     */
    public void openMessagesActivity() {
        Intent intent = new Intent(this, Messages.class);
        startActivity(intent);
    }
    /**
     * Function in order to initiate the execution of the button
     * opening the Login feature. startActivity(intent)
     */
    public void openLoginActivity(){
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
}