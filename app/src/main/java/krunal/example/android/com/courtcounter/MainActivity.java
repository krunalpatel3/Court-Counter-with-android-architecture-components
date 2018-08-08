package krunal.example.android.com.courtcounter;


import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * This activity keeps track of the basketball score for 2 teams.
 */
public class MainActivity extends AppCompatActivity {

    private ScoureCountViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewModel = ViewModelProviders.of(this).get(ScoureCountViewModel.class);
        displayScoureForTeamA(mViewModel.scoureCountforTeamA);
        displayScoreForTeamB(mViewModel.scoureCountforTeamB);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamA(View view){
        mViewModel.scoureCountforTeamA = mViewModel.scoureCountforTeamA +3;
        displayScoureForTeamA(mViewModel.scoureCountforTeamA);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View view){
        mViewModel.scoureCountforTeamA = mViewModel.scoureCountforTeamA +2;
        displayScoureForTeamA(mViewModel.scoureCountforTeamA);
    }
    /**
     * Increase the score for Team A by 1 points.
     */
    public void addOneForTeamA(View view){
        mViewModel.scoureCountforTeamA = mViewModel.scoureCountforTeamA +1;
        displayScoureForTeamA(mViewModel.scoureCountforTeamA);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamB(View view){
        mViewModel.scoureCountforTeamB = mViewModel.scoureCountforTeamB +3;
        displayScoreForTeamB(mViewModel.scoureCountforTeamB);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamB(View view){
        mViewModel.scoureCountforTeamB = mViewModel.scoureCountforTeamB +2;
        displayScoreForTeamB(mViewModel.scoureCountforTeamB);
    }

    /**
     * Increase the score for Team A by 1 points.
     */
    public void addOneForTeamB(View view){
        mViewModel.scoureCountforTeamB = mViewModel.scoureCountforTeamB +1;
        displayScoreForTeamB(mViewModel.scoureCountforTeamB);
    }

    /**
     * Reset the score of Team A and Team B by 0.
     * @param view
     */
    public void Reset(View view){
        mViewModel.scoureCountforTeamA = 0;
        mViewModel.scoureCountforTeamB = 0;
        displayScoureForTeamA(mViewModel.scoureCountforTeamA);
        displayScoreForTeamB(mViewModel.scoureCountforTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    private void displayScoureForTeamA(int scoure){
        TextView textView = findViewById(R.id.teamA);
        textView.setText(String.valueOf(scoure));
    }

    /**
     * Displays the given score for Team B.
     */
    private void displayScoreForTeamB(int scoure){
        TextView textView = findViewById(R.id.teamB);
        textView.setText(String.valueOf(scoure));
    }
}
