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
                addIdentation(AddCommand.MESSAGE_USAGE)
                + "\n" + addIdentation(DeleteCommand.MESSAGE_USAGE)
                + "\n" + addIdentation(ClearCommand.MESSAGE_USAGE)
                + "\n" + addIdentation(FindCommand.MESSAGE_USAGE)
                + "\n" + addIdentation(ListCommand.MESSAGE_USAGE)
                + "\n" + addIdentation(ViewCommand.MESSAGE_USAGE)
                + "\n" + addIdentation(ViewAllCommand.MESSAGE_USAGE)
                + "\n" + addIdentation(HelpCommand.MESSAGE_USAGE)
                + "\n" + addIdentation(ExitCommand.MESSAGE_USAGE)
        );
    }
}
