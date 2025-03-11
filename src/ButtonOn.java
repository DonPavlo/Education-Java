public class ButtonOn {
    public static void main(String[] args) {
        Button button = new Button(new ButtonClickHandler());
        button.click();
        button.click();
        button.click();
    }
}
class ButtonClickHandler implements EventHandler{

    public void execute(){

        System.out.println("Кнопка нажата!");
    }
}
interface EventHandler{

    void execute();
}
class Button{

    EventHandler handler;
    Button(EventHandler act){

        this.handler=act;
    }
    public void click(){

        handler.execute();
    }
}
