package com.example.edubuddy;

import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

/**
 * This is a fundamental method of the Search function in
 * order to execute the necessary widgets used in the code
 * derived from android package.
 *
 * @version 1.0
 * @since 2020-12-15
 */
public class Search extends AppCompatActivity {

    /**
     * Method onCreate will establish the actions of the widgets.
     * And set the view of the UX/UI design.
     *
     * @param savedInstanceState ,import android.os.Bundle
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        ImageButton backButton = findViewById(R.id.back_button);

        //lambda expression for the login button going to the main activity (home)
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });
    }

    /**
     * Function in order to initiate the execution of the button
     * going back to MainActivity or Home. startActivity(intent)
     */
    public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}