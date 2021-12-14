package Run;

import Core.*;
import Utility.ArtistType;

public class Main {

    public static void main(String[] args) {
        Poet poet = new Poet("Самоцветик");
        poet.Shout(" Все уселись на лавочки и приготовились слушать");

        Babies babyBoyss = new Babies("Малыши");
        Babies babyGirls = new Babies("Малышки");

        babyBoyss.clap(true, false);
        babyGirls.clap(true, false);

        Applauses applauses = new Applauses("Аплодисменты");
        applauses.muteApplauses();

        Director director = new Director("Гусля", ArtistType.DIRECTOR);
        Orchestra orchestra = new Orchestra("Оркестр");

        Poems friendsipPoems = new Poems("Новые стихи о дружбе");

        director.StickUp();
        orchestra.Play();
        poet.ReadPoems(friendsipPoems);

        friendsipPoems.LikePoems();
        Poems oldPoems = new Poems("Стихи, которые сочиняла Самоцветик");
        oldPoems.LikePoems();

        String poemFinishString = "Надо всем нам подружиться, надо дружбу укреплять!";
        friendsipPoems.FinishPoems(poemFinishString);
        friendsipPoems.LikePoems();
        poet.finishPerformance();

        DancingEnsemble dancingEnsemble = new DancingEnsemble("танцевальный ансамбль из двенадцати малышек");
        Dresses dresses = new Dresses("красивые, разноцветные платья с лентами");
        dancingEnsemble.DescribeClose(dresses);
        dancingEnsemble.Dance();
        RepkaDance repkaDance = new RepkaDance("Танец \"Репка\"");

        babyBoyss.clap(false, true);
        babyGirls.clap(false, true);
        babyBoyss.BravoShout();
        babyGirls.BravoShout();

        dancingEnsemble.Dance(repkaDance);
        dancingEnsemble.Dance(repkaDance);
        dancingEnsemble.finishPerformance();

        Chorus chorus = new Chorus("Хор малышей из города Змеевки");
        chorus.Sing();
        chorus.finishPerformance();

        director.finishPerformance();
        int stairs = 2;
        director.GoDown(stairs);
        director.Shout();
    }
}
