public enum Seasons {
    WINTER(-10),
    SPRING(15),
    SUMMER(27),
    AUTUMN(10),
    ;

    private int avgTemp;


    private Seasons(int avgTemp){
        this.avgTemp = avgTemp;
    }

    public int getAvgTemp() {
        return avgTemp;
    }

    @Override
    public String toString() {
        return name() + ", " +
                "средняя температура: " + avgTemp;
    }

    public String getDescription(){
        if (this == SUMMER){
            return ("Теплое время года");
        }
        else{
            return ("Холодное время года");
        }
    }
}
