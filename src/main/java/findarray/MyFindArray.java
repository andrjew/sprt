/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findarray;

public class MyFindArray implements FindArray {

	@Override
	public int findArray(int[] array, int[] subArray) {
		if (array.length < subArray.length) {
			return -1;
		}
		if (subArray.length == 0) {
			return 0;
		}

		outer:
		for (int i = 0; i < array.length - subArray.length + 1; i++) {
			for (int j = 0; j < subArray.length; j++) {
				if (array[i + j] != subArray[j]) {
					continue outer;
				}
			}
			return i;
		}
		return -1;
	}

}
