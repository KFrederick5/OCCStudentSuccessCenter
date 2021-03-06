package edu.orangecoastcollege.cs273.kfrederick5tmorrissey1ischenck.occstudentsuccesscenter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * Created by tmorrissey1 on 11/22/2016.
 */
public class TutorTest {
    private Tutor mTutor;

    @Before
    public void setUp() throws Exception {
        mTutor = new Tutor();
    }

    @After
    public void tearDown() throws Exception {
        // Do nothing
    }

    @Test
    public void getFirstName() throws Exception {
        mTutor.setFirstName("John");
        assertEquals("John", mTutor.getFirstName());
    }

    @Test
    public void getLastName() throws Exception {
        mTutor.setLastName("Doe");
        assertEquals("Doe", mTutor.getLastName());
    }

}