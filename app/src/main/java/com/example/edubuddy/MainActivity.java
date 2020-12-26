package com.example.edubuddy;

import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

/**
 * This is a fundamental method of the Main Activity or Home
 * function in order to execute the necessary widgets used in
 * the code derived from android package.
 *
 * @version 1.0
 * @since 2020-12-15
 */
public class MainActivity extends AppCompatActivity {

    /**
     * Method onCreate will establish the actions of the widgets.
     * And set the view of the UX/UI design.
     *
     * @param savedInstanceState ,import android.os.Bundle
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton menuButton = findViewById(R.id.menu_button);
        ImageButton searchButton = findViewById(R.id.search_button);

        //lambda expression for the button menu going to the next activity
        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenu();
            }
        });

        //lambda expression for the search feature going to the search activity
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSearch();
            }
        });
    }

    /**
     * Function in order to initiate the execution of the button
     * opening to the Menu bar panel. startActivity(intent)
     */
    public void openMenu(){
        Intent intent = new Intent(this, MenuBar.class);
        startActivity(intent);
    }
    /**
     * Function in order to initiate the execution of the button
     * opening the Search feature. startActivity(intent)
     */
    public void openSearch(){
        Intent intent = new Intent(this, Search.class);
        startActivity(intent);
    }
}