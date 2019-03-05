
public class Fence {

	int height, width = 0;

	public void getHeightWidth(int height, int width) {
		this.height = height;
		this.width = width;

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {

				if (i > 0 && j > 0) {
					if (i != height - 1) {
						if (j == width - 1) {
							System.out.print("#");
						} else {
							System.out.print("|");
						}
					} else {
						System.out.print("#");
					}
				} else {
					System.out.print("#");
				}
			}
			System.out.println();
		}
	}

}

