import javax.naming.Name;

public class Player {
    public String Name;
    public int age;
    public String type;
    public int runsScored;
    public int wickets;
    public double runRate;
    public double strikeRate;

    public Player (String name,int age, String type, int runsScored,int wickets, double runRate, double strikeRate){
        Name = name;
        this.age = age;
        this.type = type;
        this.runsScored = runsScored;
        this.wickets = wickets;
        this.runRate = runRate;
        this.strikeRate = strikeRate;
    }
    public String getName(){
        return Name;
    }
    public void setName(String name){
        Name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int Age){
        this.age = age;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
    public int getRunsScored(){
        return runsScored;
    }
    public void setRunScored(int runsScored){
        this.runsScored = runsScored;
    }
    public int getWickets(){
        return wickets;
    }
    public void setWickets(int wickets){
        this.wickets = wickets;
    }

    public double g
    }
}
