interface Playable {
    void playMedia();
}

interface Downloadable {
    void downloadMedia();
}

class MusicPlayer implements Playable, Downloadable {

    @Override
    public void playMedia() {
        System.out.println("Playing music...");
    }

    @Override
    public void downloadMedia() {
        System.out.println("Downloading music...");
    }
}
class music {
    public static void main(String[] args) {

        MusicPlayer m = new MusicPlayer();

        m.playMedia();
        m.downloadMedia();
    }
}
