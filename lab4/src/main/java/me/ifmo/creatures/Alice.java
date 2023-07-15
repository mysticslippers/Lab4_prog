package me.ifmo.creatures;

import me.ifmo.exceptions.*;
import me.ifmo.interfaces.*;

public class Alice extends King implements TimeSkipAble, ConsiderAble, LearnAble, NotToBeAble, GuessJudgeAble{

    private String condition;
    public Alice(String name, boolean gender, int appetite) {
        super(name, gender, appetite);
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getCondition(){
        return this.condition;
    }

    public static class Judge{
        private static String name = "судья без большого парика";

        public static String getName(){
            return name;
        }

        public static void changeWig(){
            Judge.name = "судья с большим париком";
        }
    }

    @Override
    public void waste(){
        this.setAppetite(0);
        while(getAppetite() + Dish.getCountOfPies() == 50){
            this.setAppetite(getAppetite() + 1);
            setCondition("недостаточно голодна");
        }
        setCondition(" прямо слюнки потекли.");
    }

    public String dream(){
        if(this.equals(" прямо слюнки потекли.") && getCondition().hashCode() == this.hashCode()){
            setName("Алиса");
            setGender(true);
            return "\"Хорошо бы, суд уже кончился и позвали к столу!\" - подумала она.";
        }
        return null;
    }

    @Override
    public String timeSkip(){
        return "Но так как, судя по всему, до этого было еще далеко, она, чтобы скоротать время, ";
    }

    @Override
    public String consider(){
        return "стала рассматривать все окружающее.";
    }

    @Override
    public String learn(){
        return "она узнала про суд в книжках, и ей было очень приятно отметить, что она знает, как тут все - или почти все - называется.";
    }

    @Override
    public String notToBe(){
        return "Хотя Алиса раньше никогда не бывала в суде, ";
    }

    public String guessJudge() throws JudgeNotFoundException{
        if(Judge.getName().equals("судья с большим париком")){
            return "\"Вот это судья,- сказала она про себя.- Кто в большом парике, тот и судья\".";
        }
        else{
            Judge.changeWig();
            throw new JudgeNotFoundException("Этот человек не судья!");
        }
    }

    public void anonymousReachable(ReachAble instance){
        instance.reach();
    }

    public String arrive(){
        anonymousReachable(() -> {
            int distance = 50;
            double descriptionOfDistance = 1;
            while(distance != -1){
                try{
                    distance -= 1;
                    descriptionOfDistance /= distance;
                }catch(DistanceOutOfRangeException exception){
                    break;
                }
            }
        });
        return "Когда Алиса с ";
    }

    @Override
    public String toString(){
        return "Alice: " + getName() + isGender();
    }

    @Override
    public int hashCode(){
        return (getCondition() == null) ? 0 : getCondition().hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof String comparableString) {
            int length = getCondition().length();
            if (length == comparableString.length()) {
                int i = 0;
                while (length-- != 0) {
                    if (getCondition().charAt(i) != comparableString.charAt(i)) {
                        return false;
                    }
                    i++;
                }
                return true;
            }
        }
        return false;
    }
}
