package test;

public class Example {
	public static void main(String[] args) {
		int[][][] cube = {
			{
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
			},
			{
				{10, 11, 12},
				{13, 14, 15},
				{16, 17, 18}
			}
		};
		
		for (int i = 0; i < cube.length; i++) {
			for (int j = 0; j < cube[i].length; j++) {
				for (int k = 0; k < cube[i][j].length; k++) {
					System.out.print(cube[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}