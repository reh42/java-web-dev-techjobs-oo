package org.launchcode.techjobs_oo;

public class Main {

    public static void main(String[] args) {
       Job test_job4 = new Job(null, new Employer(null), new Location(""), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String printMe = test_job4.toString();
       System.out.println(test_job4.toString());
       // System.out.println(printMe.charAt(0));
        System.out.println(printMe.substring(0, 1));
        System.out.println(printMe.substring(printMe.length()-1, printMe.length()));
        System.out.println(printMe.length());
    }}

//        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        Job job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
//        Job job3 = new Job("Ice cream taster", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Taste"));
//
//        ArrayList<Job> jobs = new ArrayList<>();
//        jobs.add(job1);
//        jobs.add(job2);
//        jobs.add(job3);
//
//        for (Job job : jobs){
//            System.out.println(job);
//        }
//    }

   // }
