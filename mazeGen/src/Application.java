
public final class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MazeGen maze = new MazeGen();
		maze.genMaze();
		System.out.println(maze);
	}

}
