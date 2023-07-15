package me.ifmo.creatures;

public class Alice extends King{

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
