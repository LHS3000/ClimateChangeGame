package com.example.climatechangegame;

        import android.os.Bundle;
        import android.app.Activity;
        import android.util.Log;
        import android.widget.Button;
        import android.view.View;
        import android.content.Intent;

public class MainActivity extends Activity {
    String msg = "Android : ";
    private Button whichBinButton;
    private Button triviaButton;


    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg, "The onCreate() event");

        whichBinButton = (Button) findViewById(R.id.whichBinButtonX);
            whichBinButton.setOnClickListener(new View.OnClickListener(){
            @Override
                public void onClick(View v){
                    openWhichBinGame();
                }
            });

        triviaButton = (Button) findViewById(R.id.triviaGameX);
        triviaButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openTriviaGame();
            }
        });
    }

    /** Called if the Which Bin game button's clicked. */
    public void openWhichBinGame(){
        Intent intent = new Intent(this, WhichBinGame.class);
        startActivity(intent);
    }

    public void openTriviaGame(){
        Intent intent = new Intent(this, TriviaGame.class);
        startActivity(intent);
    }

    /** Called when the activity is about to become visible. */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg, "The onStart() event");
    }

    /** Called when the activity has become visible. */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(msg, "The onResume() event");
    }

    /** Called when another activity is taking focus. */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(msg, "The onPause() event");
    }

    /** Called when the activity is no longer visible. */
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(msg, "The onStop() event");
    }

    /** Called just before the activity is destroyed. */
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(msg, "The onDestroy() event");
    }
}
