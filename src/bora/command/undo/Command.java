package bora.command.undo;

public interface Command {
	public void execute();
	public void undo();
}
