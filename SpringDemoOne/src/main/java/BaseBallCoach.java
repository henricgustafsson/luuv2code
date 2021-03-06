public class BaseBallCoach implements Coach {

    private FortuneService fortuneService;

    public BaseBallCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Spend 30 min on batting practice";
    }

    public String getDailyFortune() {
        return fortuneService.GetFortune();
    }
}
