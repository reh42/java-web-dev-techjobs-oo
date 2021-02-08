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

    @Before
    public void createJobObject(){
        test_job = new Job();
        test_job2 = new Job();
        test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));


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

}
