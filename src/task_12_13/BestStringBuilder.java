package task_12_13;

import java.util.Stack;

public class BestStringBuilder {
    private StringBuilder string = new StringBuilder();
    private Stack<Editable_command> history = new Stack<>();

    public void append(String text) {
        Editable_command cmd = new AppendString(text);
        cmd.execute(string);
        history.push(cmd);
    }

    public void delete(int start, int end) {
        Editable_command cmd = new DeleteString(start, end);
        cmd.execute(string);
        history.push(cmd);
    }

    public boolean undo() {
        if (!history.isEmpty()) {
            Editable_command last = history.pop();
            last.undo(string);
            return true;
        } else {
            System.out.println("Нечего отменять!");
            return false;
        }
    }

    @Override
    public String toString() {
        return string.toString();
    }
}

