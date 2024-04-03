public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl(2);

        Item sword = new Sword();
        Item shield = new Shield();

        remoteControl.setCommands(0, new EquipmentCommand(sword), new TakeOffCommand(sword));
        remoteControl.setCommands(1, new EquipmentCommand(shield), new TakeOffCommand(shield));

        remoteControl.EquipmentButton(0);
        remoteControl.TakeOffButton(0);

        remoteControl.EquipmentButton(1);
        remoteControl.TakeOffButton(1);

    }
}