package com.example.administrator.javagroupmanngersystem;

import android.os.Bundle;
import android.support.constraint.Guideline;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.administrator.javagroupmanngersystem.view.AdaptiveImageView;

import de.hdodenhof.circleimageview.CircleImageView;

public class ShowPersonActivity extends AppCompatActivity {

    private com.example.administrator.javagroupmanngersystem.view.AdaptiveImageView imagebackground;
    private android.widget.TextView studentname;
    private android.widget.TextView studentage;
    private android.widget.TextView studentsignature;
    private android.widget.TextView studentsex;
    private android.support.constraint.Guideline guideline;
    private android.widget.TextView studenttelPhoneNumber;
    private android.widget.TextView studentbirthday;
    private de.hdodenhof.circleimageview.CircleImageView imagepersonalimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_person);
        this.imagepersonalimage = (CircleImageView) findViewById(R.id.image_personal_image);
        this.studentbirthday = (TextView) findViewById(R.id.student_birthday);
        this.studenttelPhoneNumber = (TextView) findViewById(R.id.student_telPhoneNumber);
        this.guideline = (Guideline) findViewById(R.id.guideline);
        this.studentsex = (TextView) findViewById(R.id.student_sex);
        this.studentsignature = (TextView) findViewById(R.id.student_signature);
        this.studentage = (TextView) findViewById(R.id.student_age);
        this.studentname = (TextView) findViewById(R.id.student_name);
        this.imagebackground = (AdaptiveImageView) findViewById(R.id.image_background);

    }
}
