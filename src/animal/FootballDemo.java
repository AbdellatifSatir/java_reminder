package animal;

public class FootballDemo implements Football{

    @Override
    public void setHomeTeam(String name) {
        System.out.println("Home team: " + name);
    }
    @Override
    public void setVisitingTeam(String name) { }
    @Override
    public void homeTeamScored(int points) { }
    @Override
    public void visitingTeamScored(int points) { }
    @Override
    public void endOfQuarter(int quarter) { }

}