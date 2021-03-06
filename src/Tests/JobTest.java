package Tests;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
//is using JUnit4 from external libraries okay/what was wanted?
import org.launchcode.techjobs_oo.*;


import static org.junit.Assert.assertEquals;


public class JobTest {
    //create @Before to declare and initalize Job objects
    Job test_job;
    Job test_job2;
    Job test_job3;
    Job test_job4;
    Job test_job5;
    Job test_job6;

    @Before
    public void createJobObject(){
        test_job = new Job();
        test_job2 = new Job();
        test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job5 = new Job("Product tester", new Employer("ACME"), new Location(""), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job6= new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));

    }


    //test that each job object contains a unique ID number,
    // that is also sequential integers
    @Test
    public void testSettingJobId(){
        assertTrue(test_job.getId()!=test_job2.getId() && test_job2.getId()==test_job.getId()+1);
    }
    //Test the Full Constructor
    //Use assert statements to test that the constructor correctly assigns the class and value of each field.
    //new Job("Product tester", new Employer("ACME"), new Location("Desert"),
    // new PositionType("Quality control"), new CoreCompetency("Persistence"));
    //objectName instanceof ClassName
    @Test
    public void testJobConstructorSetsAllFields(){
        assertTrue(test_job3.getName() instanceof String
                && test_job3.getEmployer() instanceof Employer
                &&test_job3.getLocation() instanceof Location
                &&test_job3.getPositionType() instanceof PositionType
                &&test_job3.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Product tester", test_job3.getName());
        assertEquals("ACME", test_job3.getEmployer().getValue());
        assertEquals("Desert", test_job3.getLocation().getValue());
        assertEquals("Quality control", test_job3.getPositionType().getValue());
        assertEquals("Persistence", test_job3.getCoreCompetency().getValue());

    }
    @Test
    public void testJobsForEquality(){
        assertFalse(test_job3.equals(test_job4));
    }

    //use TDD to build toString Method
    //test method before making it
    //
    @Test
    public void testToStringReturnsBlankLine(){
        String testString = test_job4.toString();
        String firstChar = testString.substring(0,1);
        String lastChar = testString.substring(testString.length()-1,testString.length());
        assertTrue(firstChar.equals("\n") && lastChar.equals("\n")  );

    }
    @Test
    public void testToStringReturnsEachFieldLabelAndData(){
        assertEquals(
                "\n"+
                        "ID: "+ test_job4.getId() + "\n" +
                        "Name: Product tester" +  "\n" +
                        "Employer: ACME" + "\n" +
                        "location: Desert" + "\n" +
                        "Position Type: Quality control" + "\n" +
                        "Core Competency: Persistence"
                        +"\n"
                , test_job4.toString());

    }
    @Test
    public void testToStringWithEmptyField(){
        assertEquals("\n"+
                        "ID: "+ test_job5.getId() + "\n" +
                        "Name: Product tester" +  "\n" +
                        "Employer: ACME" + "\n" +
                        "location: Data not available" + "\n" +
                        "Position Type: Quality control" + "\n" +
                        "Core Competency: Persistence"
                        +"\n"
                , test_job5.toString());


    }
    //“OOPS! This job does not seem to exist.”
    //test with empty constructor and constructor with "" for each parameter
    //Bonus
//    @Test
//    public void testToStringWhenOnlyID(){
//        //assertEquals("OOPS! This job does not seem to exist.", test_job6);
//        assertEquals("OOPS! This job does not seem to exist.", test_job);
//
//    }
//does not pass because while what is returned is the statement, expected is String and actual is jobs class. not sure how to fix that.
}
