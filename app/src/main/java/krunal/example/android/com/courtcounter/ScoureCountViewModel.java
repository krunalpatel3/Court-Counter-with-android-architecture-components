package krunal.example.android.com.courtcounter;

import android.arch.lifecycle.ViewModel;

/**
 * Created by acer
 * on 19-Jan-18.
 */

/**
 * The ViewModel Class for MainActivity.
 * This Class only store UI Data and manage.
 */
public class ScoureCountViewModel extends ViewModel {

    /**
     *  Keep Track of the scoure for TeamA.
     */
    public int scoureCountforTeamA = 0;

    /**
     * Keep Track of the scoure for TeamB
     */
    public int scoureCountforTeamB = 0;
}
