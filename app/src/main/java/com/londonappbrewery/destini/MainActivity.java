package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    TextView mQuestionTextView;
    Button mAnswerTop;
    Button mAnswerBottom;
    int mStoryIndex = 1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mAnswerTop = (Button) findViewById(R.id.buttonTop);
        mAnswerBottom = (Button) findViewById(R.id.buttonBottom);
        mQuestionTextView = (TextView) findViewById(R.id.storyTextView);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mAnswerTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStoryIndex == 1 || mStoryIndex == 2){
                    mQuestionTextView.setText(R.string.T3_Story);
                    mAnswerTop.setText(R.string.T3_Ans1);
                    mAnswerBottom.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;}

                else {
                    mQuestionTextView.setText(R.string.T6_End);
                    mAnswerTop.setVisibility(View.GONE);
                    mAnswerBottom.setVisibility(View.GONE);
                }

            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mAnswerBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mStoryIndex == 1){
                mQuestionTextView.setText(R.string.T2_Story);
                mAnswerTop.setText(R.string.T2_Ans1);
                mAnswerBottom.setText(R.string.T2_Ans2);
                mStoryIndex = 2; }
                else if (mStoryIndex == 2){
                    mQuestionTextView.setText(R.string.T4_End);
                    mAnswerTop.setVisibility(View.GONE);
                    mAnswerBottom.setVisibility(View.GONE);
                } else if (mStoryIndex == 3){
                    mQuestionTextView.setText(R.string.T5_End);
                    mAnswerTop.setVisibility(View.GONE);
                    mAnswerBottom.setVisibility(View.GONE);
                }  else {
                    mQuestionTextView.setText(R.string.T3_Story);
                    mAnswerTop.setText(R.string.T3_Ans1);
                    mAnswerBottom.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                }


            }
        });

    }

}
