import java.util.Vector;

public class RemoteControl {
    private int count;
    private Vector<Command> onCommands=new Vector<>();
    private Vector<Command> offCommands=new Vector<>();

    private Command commandUndo = new NoCommand();
    public RemoteControl(int count) {
        Command noCommand = new NoCommand();
        this.count = count;
        for(int i=0; i<count; i++){
            onCommands.add(noCommand);
            offCommands.add(noCommand);
        }

    }
    public void setCommands(int slot, Command onCommand, Command offCommand){
        onCommands.set(slot, onCommand);
        offCommands.set(slot, offCommand);

    }
    public void EquipmentButton(int slot){
        onCommands.get(slot).execute();
        commandUndo=onCommands.get(slot);
    }

    public void TakeOffButton(int slot){
        offCommands.get(slot).execute();
        commandUndo = offCommands.get(slot);
    }

}
