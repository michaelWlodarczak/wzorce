package iteratorExample;

public class IteratorDemo {
    public static void main(String[] args) {

        IChannelCollector channelCollector = new ChannelCollectionImpl();
        channelCollector.addChannel(new Channel("tvp1"));
        channelCollector.addChannel(new Channel("polsat"));
        channelCollector.addChannel(new Channel("tvn"));
       // channelCollector.removeChannel(new Channel("tvn"));

        IChannelIterator iterator = channelCollector.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
