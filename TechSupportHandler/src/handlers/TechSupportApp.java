public class TechSupportApp {
    public static void main(String[] args) {
        SupportHandler faq = HandlerFactory.createHandlerChain();

        String[] issues = {"password_reset", "refund_request", "account_ban", "unknown_bug"};
        for (String issue : issues) {
            faq.handle(issue);
        }
    }
}
