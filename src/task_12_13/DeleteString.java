package task_12_13;

public class DeleteString implements Editable_command{
    private int start, end;
    private String deletedString;

    public DeleteString(int start, int end){
        this.start = start;
        this.end = end;
    }

    public void execute(StringBuilder string){
        deletedString = string.substring(start, end);
        string.delete(start, end);
    }

    public void undo(StringBuilder string){
        string.insert(start, deletedString);
    }
}
