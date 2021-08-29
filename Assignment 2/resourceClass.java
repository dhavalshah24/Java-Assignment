import java.util.*;

class Message extends Thread {

    public String text;
    public boolean isEmpty;

    public Message(String text) {
        this.text = text;
        this.isEmpty = false;
    }

    public synchronized void write(String text) {

        if(this.isEmpty) {
            try {
                this.text = text;
                this.isEmpty = false;
                Thread.sleep(500);
                System.out.println("Text written");
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            System.out.println("Text is not empty");
        }
    }

    public synchronized void read() {

        if(this.isEmpty) {
            System.out.println("Text is empty");
        } else {
            this.isEmpty = true ;
            System.out.println("Text read "+ this.text);
        }
    }
}

public class resourceClass {
    
    public static void main(String[] args) {
        
        Message greeting = new Message("Good morning");
        greeting.read();
        greeting.write("Good night");
        greeting.read();

        Message newGreeting = new Message("Hello");
        newGreeting.read();
        newGreeting.write("Hi");
        newGreeting.read();
    }
}
