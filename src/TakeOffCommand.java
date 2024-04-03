public class TakeOffCommand implements Command{
    Item item;
    public TakeOffCommand(Item item){
        this.item=item;
    }
    public void execute(){
        item.takeOff();
    }
}
