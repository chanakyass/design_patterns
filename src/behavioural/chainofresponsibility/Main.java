package behavioural.chainofresponsibility;

/*
Explanation: Chain of responsibility has client handler and concrete handlers.
Here the responsibility of processing a request falls on only one handler among all and the responsibility is passed along a chain of objects.
One among these objects takes responsibility of processing the request.

Useful when :- Needed to decouple sender and receiver in the sense that object that should process the request need not be mentioned explicitly and
objects can be chained together to let them figure which one can process the request
*/

public class Main {
    public static void main(String[] args) {
        Chain chain = new Chain();
        chain.process("BACK");

    }
}
