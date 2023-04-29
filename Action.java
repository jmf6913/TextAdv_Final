public class Action {
    private Method method;
    private String movement;
    private String name;
    private char hotkey;

    private Enemy kwargs;


    public Enemy getKwargs(){
        return kwargs;
    }

    public void setKwargs(Enemy kwargs){
        this.kwargs = kwargs;

    }
    public String getMovement(){
        return movement;
    }
    public void setMovement(String movement){
        this.movement = movement;
    }

    public char getHotkey(){
        return hotkey;
    }

    public void setHotkey(){
        this.hotkey = hotkey;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }


    public Action(Method method, String name, char hotkey, Enemy kwargs){
        this.method = method;
        this.name = name;
        this.hotkey = hotkey;
        this.kwargs = kwargs;
    }
    public String charAction(){
        return hotkey + ": " + name;
    }
}

