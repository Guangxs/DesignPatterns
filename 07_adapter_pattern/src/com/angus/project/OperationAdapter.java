package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��15�� ����3:12:04 
 * @version 1.0 
 */
// ������������������
public class OperationAdapter implements ScoreOperation {
	private QuickSort sortObj; // ����������QuickSort����
	private BinarySearch searchObj; // ����������BinarySearch����

	public OperationAdapter() {
		sortObj = new QuickSort();
		searchObj = new BinarySearch();
	}

	@Override
	public int[] sort(int[] array) {
		return sortObj.quickSort(array); // ������������QuickSort�����򷽷�
	}

	@Override
	public int search(int[] array, int key) {
		return searchObj.binarySearch(array, key); // ������������BinarySearch�Ĳ��ҷ���
	}

}