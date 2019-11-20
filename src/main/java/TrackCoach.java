public class TrackCoach implements Coach {

    private FortuneService fortuneService;


    public TrackCoach() {
        //Default no-arg constructor
    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Run you dumb jock.";
    }

    public String getDailyFortune() {
        return "Just do it: "+fortuneService.GetFortune();
    }

    private void doMyStartupStuff() {
        System.out.println("Trackcoach in my doMyStartup method");
    }

    private void doMyCleanUpStuff() {
        System.out.println("Trackcoach in my doMyCleanup method");
    }
}
