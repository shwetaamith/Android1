package edu.asu.msse.smurthy3.movieinfo;

/**
 * Copyright (c) 2016 Shweta Murthy,
 * You may not use this file except for self-evaluation and practice
 * This file is allowed to be used for grading puroposes
 * through the spring semester 2016, ASU, by  the grader, TA and the instructor
 * Unless agreed to in writing, this material can is to be
 * distributed on an "AS IS" BASIS
 *
 * @author Shweta Murthy mailTo: smurthy3@asu.edu
 * @version January/19/2016
 */

    import org.json.JSONArray;
    import org.json.JSONObject;

    import java.util.Vector;

    public class MovieInfo {

        public String name;
        public int year;
        public String rated;
        public String released;
        public String genre;
        public String plot;
        public String actors;

        MovieInfo(String jsonStr) {
            try {
                JSONObject jo = new JSONObject(jsonStr);
                name = jo.getString("Title");
                year = jo.getInt("Year");
                rated = jo.getString("Rated");
                released = jo.getString("Released");
                genre = jo.getString("Genre");
                plot = jo.getString("Plot");
                actors = jo.getString("Actors");
            } catch (Exception ex) {
                android.util.Log.w(this.getClass().getSimpleName(),
                        "error converting to/from json");
            }
        }

        public String toJsonString() {
            String ret = "";
            try{
                JSONObject jo = new JSONObject();
                jo.put("Title",name);
                jo.put("Year", year);
                jo.put("Rated", rated);
                jo.put("Released", released);
                jo.put("Genre", genre);
                jo.put("Plot", plot);
                jo.put("actors",actors);
                ret = jo.toString();
            }catch (Exception ex){
                android.util.Log.w(this.getClass().getSimpleName(),
                        "error converting to/from json");
            }
            return ret;
        }
    }
