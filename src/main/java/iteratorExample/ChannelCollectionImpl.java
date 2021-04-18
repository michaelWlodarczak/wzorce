package iteratorExample;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements IChannelCollector {
    private List<Channel> channels = new ArrayList<>();

    @Override
    public void addChannel(Channel channel) {
        channels.add(channel);
    }

    @Override
    public void removeChannel(Channel channel) {
        channels.remove(channel);
    }

    @Override
    public IChannelIterator iterator() {
        return new ChannelIteraror(channels);
    }

    private class ChannelIteraror implements IChannelIterator{

        private List<Channel> channels;
        private int position;

        public ChannelIteraror(List<Channel> channels) {
            this.channels = channels;
        }

        @Override
        public boolean hasNext() {
            if (position<channels.size() && channels.get(position) != null){
                return true;
            }
            return false;
        }

        @Override
        public Channel next() {
            return channels.get(position++);
        }
    }
}
