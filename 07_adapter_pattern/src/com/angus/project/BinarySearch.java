package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��15�� ����3:07:23 
 * @version 1.0 
 */
// ���ֲ��ң�������
public class BinarySearch {
	public int binarySearch(int[] array, int key) {
		int low = 0;
		int high = array.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			int midVal = array[mid];
			if (midVal < key) {
				low = mid + 1;
			} else if (midVal > key) {
				high = mid - 1;
			} else {
				return 1; // �ҵ�Ԫ�ط���1
			}
		}
		return -1; // δ�ҵ�Ԫ�ط���-1
	}
}