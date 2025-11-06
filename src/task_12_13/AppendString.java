package task_12_13;

public class AppendString implements Editable_command{
    private String text;

    public AppendString (String text){
        this.text = text;
    }

    public void execute(StringBuilder string){
        string.append(text);
    }

    public void undo(StringBuilder string){
        string.delete(string.length()-text.length(), string.length());
    }
}
