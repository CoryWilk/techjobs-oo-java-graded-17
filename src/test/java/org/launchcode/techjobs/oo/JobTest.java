package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;
public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId(){
        Job job1 = new Job();
        Job job2 = new Job();

        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(job instanceof Job);
        assertEquals("Product tester", job.getName());

        assertTrue(job.getEmployer() instanceof Employer);
        assertEquals("ACME", job.getEmployer().toString());

        assertTrue(job.getLocation() instanceof Location);
        assertEquals("Desert", job.getLocation().toString());

        assertTrue(job.getPositionType() instanceof PositionType);
        assertEquals("Quality control", job.getPositionType().toString());

        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", job.getCoreCompetency().toString());
    }

    @Test
    public void testJobsForEquality(){
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertNotEquals(job1, job2);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String newLine = System.lineSeparator();
        String expected = newLine + "ID: " + job.getId() + newLine + "Name: " + job.getName() +
                newLine + "Employer: " + job.getEmployer() +
                newLine + "Location: " + job.getLocation() +
                newLine + "Position Type: " + job.getPositionType() +
                newLine + "Core Competency: " + job.getCoreCompetency() + newLine;

        String actual = job.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        String newLine = System.lineSeparator();
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expected = newLine + "ID: " + job.getId() + newLine + "Name: " + job.getName() +
                newLine + "Employer: " + job.getEmployer() +
                newLine + "Location: " + job.getLocation() +
                newLine + "Position Type: " + job.getPositionType() +
                newLine + "Core Competency: " + job.getCoreCompetency() + newLine;

        String actual = job.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testToStringHandlesEmptyField(){
        String newLine = System.lineSeparator();
        Job job = new Job("Product tester", new Employer(""), new Location(""), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String actual = job.toString();

        String expected = newLine + "ID: " + job.getId() +
                newLine + "Name: Product tester" +
                newLine + "Employer: Data not available" +
                newLine + "Location: Data not available" +
                newLine + "Position Type: Quality control" +
                newLine + "Core Competency: Persistence" + newLine;

        assertEquals(expected, actual);
    }

}
