package ru.geekbrains.java2.lesson1.competitors;

/**
 * Created by Eduard on 22.02.2017.
 */
public class Team {
    private String title;
    private Competitor[] competitors;

    public Team(String title, Competitor... competitors) {
        this.title = title;
        this.competitors = competitors;
    }

    //Team team = new Team("Rocket", new Human(...), new Dog(...), new Cat(...));
    //Team team = new Team("Rocket", new Competitor[] {new Human(...), new Dog(...), new Cat(...)});

    public Competitor[] getCompetitors() {
        return competitors;
    }

    public void showResults() {
        System.out.println("====================");
        for (Competitor o: competitors) {
            o.result();
        }
    }

    public void showInfo() {
        System.out.println("Team: " + title);
        for (Competitor o: competitors) {
            o.info();
        }
        System.out.println("=====================");
    }
}
