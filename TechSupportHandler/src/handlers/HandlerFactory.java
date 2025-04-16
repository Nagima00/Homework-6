public class HandlerFactory {
    public static SupportHandler createHandlerChain() {
        SupportHandler faq = new FAQBotHandler();
        SupportHandler junior = new JuniorSupportHandler();
        SupportHandler senior = new SeniorSupportHandler();

        faq.setNext(junior).setNext(senior);
        return faq;
    }
}
