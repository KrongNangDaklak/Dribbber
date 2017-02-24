package com.example.hoang.dribber.utils;

import android.text.format.DateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * Created by Hoang on 2/25/2017.
 */

public class FormatDatime {
    public static String getRelativeTimeAgo(String rawJsonDate) {
        String apiFormatResult = "yyyy-MM-dd'T'HH:mm:ss'Z'";
        SimpleDateFormat sf = new SimpleDateFormat(apiFormatResult, Locale.ENGLISH);
        sf.setLenient(true);

        String relativeDate = "";
        try {
            long dateMillis = sf.parse(rawJsonDate).getTime();
            relativeDate = DateUtils.getRelativeTimeSpanString(dateMillis,
                    System.currentTimeMillis(), DateUtils.SECOND_IN_MILLIS, DateUtils.FORMAT_ABBREV_ALL).toString();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        relativeDate = relativeDate.replace(" mins", "m");
        relativeDate = relativeDate.replace(" min", "m");
        relativeDate = relativeDate.replace(" hours", "h");
        relativeDate = relativeDate.replace(" hour", "h");
        relativeDate = relativeDate.replace(" days", "d");
        relativeDate = relativeDate.replace(" day", "d");

        return relativeDate;
    }

}
