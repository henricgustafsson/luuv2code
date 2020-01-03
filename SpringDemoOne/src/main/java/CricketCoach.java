public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String emailAdress;
    private String team;

    public CricketCoach() {
        //default no arg constructor
        System.out.println("noarg");
    }

    public void setTeam(String team) {
        System.out.println("setter team :"+team);
        this.team = team;
    }

    public void setEmailAddress(String emailAdress) {
        System.out.println("setter email "+emailAdress);
        this.fortuneService = fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("setter");
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Practice fast bowling for 15 min per day";
    }

    public String getDailyFortune() {
        return fortuneService.GetFortune();
    }
}
