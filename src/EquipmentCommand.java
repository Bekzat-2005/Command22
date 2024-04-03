public class EquipmentCommand implements Command{
    Item item;
    public EquipmentCommand(Item item){
        this.item=item;
    }
    public void execute(){
        item.equipment();
    }
}
