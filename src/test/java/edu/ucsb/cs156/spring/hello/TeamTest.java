package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void equals_with_same_objects_is_true() {
        team = new Team();

        assertTrue(team.equals(team));
    }

    @Test
    public void equals_with_diff_objects_is_false() {
        team = new Team();
        int x = 5;

        assertFalse(team.equals(x));
    }
    
    @Test
   public void equals_with_same_fields_is_true() {
        Team team1 = new Team("test-team");
        Team team2 = new Team("test-team");

        assertTrue(team1.equals(team2));
    }

    @Test
    public void equals_with_diff_fields_is_false() {
        Team team1 = new Team("test-team1");
        Team team2 = new Team("test-team2");

        assertFalse(team1.equals(team2));
    }

    @Test
    public void hashCode_returns_true() {
        team = new Team();
        int result = team.hashCode();
        int expectedResult = 1;
        assertEquals(expectedResult, result);
    }
}
