package org.pltw.examples.collegeapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;


public class Upload extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        upload();
    }
    public void upload() {
        String url = "arduino.local/arduino/addFamily";
        url += Family.get().getFamily().size();
        for (FamilyMember member : Family.get().getFamily()){
            String firstName = member.getFirstName();
            String lastName = member.getLastName();
            url += firstName + "/";
            url += lastName + "/";
        }
        Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse("www.Google.com") );
        startActivity(Intent.createChooser(browse, "dialogTitle"));//change to just browse if it works correctly
    }
}
