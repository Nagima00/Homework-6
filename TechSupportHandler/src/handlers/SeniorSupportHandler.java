public class SeniorSupportHandler extends SupportHandler {
    @Override
    public void handle(String issue) {
        if (issue.equals("account_ban") || issue.equals("data_loss")) {
            System.out.println("[SeniorSupport] Handled " + issue);
        } else if (nextHandler != null) {
            nextHandler.handle(issue);
        } else {
            System.out.println("[SeniorSupport] Cannot handle " + issue + " — escalate manually");
        }
    }
}
