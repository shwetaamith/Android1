package edu.asu.msse.smurthy3.movieinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONArray;

import java.util.Iterator;
import java.util.Vector;

public class MainActivity extends AppCompatActivity {
TextView a1, a2, a3, a4, a5, a6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MovieInfo m = new MovieInfo("{\"Title\":\"Baby\",\"Year\":\"2015\",\"Rated\":\"8.5\",\"Released\":\"23 Jan 2015\",\"Runtime\":\"159 min\",\"Genre\":\"Action, Crime, Thriller\",\"Director\":\"Neeraj Pandey\",\"Writer\":\"Neeraj Pandey\",\"Actors\":\"Akshay Kumar, Danny Denzongpa, Rana Daggubati, Tapsee Pannu\",\"Plot\":\"An elite counter-intelligence unit learns of a plot, masterminded by a maniacal madman. With the clock ticking, it's up to them to track the terrorists' international tentacles and prevent them from striking at the heart of India.\",\"Language\":\"Hindi\",\"Country\":\"India\",\"Awards\":\"N/A\",\"Poster\":\"http://ia.media-imdb.com/images/M/MV5BMjAzMDUzMzk0NV5BMl5BanBnXkFtZTgwODczODg4MzE@._V1_SX300.jpg\",\"Metascore\":\"N/A\",\"imdbRating\":\"8.1\",\"imdbVotes\":\"30,947\",\"imdbID\":\"tt3848892\",\"Type\":\"movie\",\"Response\":\"True\"}");
        String s = m.toJsonString();
        a1 = (TextView) findViewById(R.id.textView2);
        a2 = (TextView) findViewById(R.id.textView);
        a3 = (TextView) findViewById(R.id.textView3);
        a4 = (TextView) findViewById(R.id.textView4);
        a5 = (TextView) findViewById(R.id.textView5);
        a6 = (TextView) findViewById(R.id.textView6);
        a1.setText(m.name);
        a2.setText(m.rated);
        a3.setText(m.released);
        a4.setText(m.actors);
        a5.setText(m.plot);
        a6.setText(m.genre);



    }
}
