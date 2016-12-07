package edu.orangecoastcollege.cs273.kfrederick5tmorrissey1ischenck.occstudentsuccesscenter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ProfileActivity extends NavDrawerActivity {

    private DBHelper userDB;
    private UserListAdapter mUserListAdapter;
    private TextView fName;
    private TextView lName;
    private TextView studentNum;

    private List<User> courses;
    private ListView coursesListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.contentFrame);
        getLayoutInflater().inflate(R.layout.activity_profile, contentFrameLayout);

        ArrayList<User> userCourses = userDB.getAllUserCourses();
        String first = userDB.getUser(1).getfName();
        String last = userDB.getUser(1).getlName();
        String num = userDB.getUser(1).getUserNum();

        fName = (TextView) findViewById(R.id.firstNameTextView);
        lName = (TextView) findViewById(R.id.lastNameTextView);
        studentNum = (TextView) findViewById(R.id.studentNumTextView);


        mUserListAdapter = new UserListAdapter(this, R.layout.course_item, userCourses);

        coursesListView = (ListView) findViewById(R.id.coursesListView);
        coursesListView.setAdapter(mUserListAdapter);

        fName.setText(first);
        lName.setText(last);
        studentNum.setText(num);
    }

    public void editProfileOnClick (View v)
    {
        startActivityForResult(new Intent(ProfileActivity.this, EditProfileActivity.class));
    }

    private void startActivityForResult(Intent intent) {

    }
}
