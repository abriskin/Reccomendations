    package com.example.reccomendations;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.os.Handler;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

    public class EnterInfo extends AppCompatActivity {

        private static int recType;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_enter_info2);

            TextView enterV = (TextView)findViewById(R.id.enter);
            Button nextV = (Button)findViewById(R.id.next);
            loading loadingDialogue = new loading(EnterInfo.this);
            setRecType(getIntent().getIntExtra("mediaButtonPressed", 0));

            switch (recType) {
                case 1:
                    enterV.setText("Enter A Movie You Enjoyed");
                    nextV.setText("Enter Another Movie");
                    break;
                case 2:
                    enterV.setText("Enter An Album You Enjoyed");
                    nextV.setText("Enter Another Album");
                    break;
            }
        }

        public void setRecType(Integer button) {
            switch (button) {
                case R.id.movie_button:
                    recType = 1;
                    break;
                case R.id.music_button:
                    recType = 2;
                    break;
            }
        }

        public void nextClick(View view) {
            Intent i = new Intent(EnterInfo.this, EnterInfo.class);
            startActivity(i);
            finish();
        }

        public void endClick(View view) {
            Intent i = new Intent(EnterInfo.this, loading.class);
            startActivity(i);

            final loading loadingDialogue = new loading(EnterInfo.this);
            loadingDialogue.startLoadingAnimation();
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    loadingDialogue.dismissDialogue();
                }
            }, 5000);

            finish();
        }
    }