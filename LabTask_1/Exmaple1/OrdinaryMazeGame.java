public class OrdinaryMazeGame extends MazeGame {
    @Override
    protected OrdinaryRoom makeRoom() {
        return new OrdinaryRoom();
    }
}