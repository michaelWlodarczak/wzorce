package iteratorExample;

public interface IChannelCollector {

    void addChannel(Channel channel);

    void removeChannel(Channel channel);

    IChannelIterator iterator();

}
