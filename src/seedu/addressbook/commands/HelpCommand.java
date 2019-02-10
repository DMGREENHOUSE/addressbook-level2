package seedu.addressbook.commands;


/**
 * Shows help instructions.
 */
public class HelpCommand extends Command {

    public static final String COMMAND_WORD = "help";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Shows program usage instructions.\n"
            + "Example: " + COMMAND_WORD;

    public String addIndentation(String str) {
        str = str.replaceAll("Parameters:", "    Parameters:");
        str = str.replaceAll("Example:", "        Example:");
        return str;
    }

    @Override
    public CommandResult execute() {
        return new CommandResult(
                addIndentation(AddCommand.MESSAGE_USAGE)
                + "\n" + addIndentation(DeleteCommand.MESSAGE_USAGE)
                + "\n" + addIndentation(ClearCommand.MESSAGE_USAGE)
                + "\n" + addIndentation(FindCommand.MESSAGE_USAGE)
                + "\n" + addIndentation(ListCommand.MESSAGE_USAGE)
                + "\n" + addIndentation(ViewCommand.MESSAGE_USAGE)
                + "\n" + addIndentation(ViewAllCommand.MESSAGE_USAGE)
                + "\n" + addIndentation(HelpCommand.MESSAGE_USAGE)
                + "\n" + addIndentation(ExitCommand.MESSAGE_USAGE)
        );
    }
}
