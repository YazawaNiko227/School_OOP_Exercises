/**
 * 
 */
package exercise05;

import java.util.Arrays;

/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @version 1.0
 * @created date20 thg 9, 2025 time13:19:24
 */
public class ListCD {
	private CompactDisk[] list;
	private int count = 0;

	public ListCD(int capacity) {
		if(capacity <= 0) {
			this.list = new CompactDisk[10];
		}
		this.list = new CompactDisk[capacity];
	}

	public ListCD() {
		this(10);
	}
	
	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}
	
	public boolean addCD(CompactDisk cd) {
	    if (cd == null) return false;

	    for (int i = 0; i < count; i++) {
	        if (list[i].getCodeCD() == cd.getCodeCD()) {
	            return false;
	        }
	    }

	    if (count >= list.length) {
	        list = Arrays.copyOf(list, list.length * 2);
	    }

	    list[count++] = cd;
	    return true;
	}


	public double sumPricesOfCD() {
		double sum = 0;
		for (int i = 0; i < count; i++) {
			sum += list[i].getPrices();
		}
		return sum;
	}
	
	public void DesByPrices() {
	    for (int i = 0; i < count - 1; i++) {
	        for (int j = i + 1; j < count; j++) {
	            if (list[i].getPrices() < list[j].getPrices()) {
	                CompactDisk temp = list[i];
	                list[i] = list[j];
	                list[j] = temp;
	            }
	        }
	    }
	}

	public void AcsByTitle() {
	    for (int i = 0; i < count - 1; i++) {
	        for (int j = i + 1; j < count; j++) {
	            if (list[i].getTitleCD().compareTo(list[j].getTitleCD()) > 0) {
	                CompactDisk temp = list[i];
	                list[i] = list[j];
	                list[j] = temp;
	            }
	        }
	    }
	}

	public void ShowCD() {
		for (int i = 0; i < count; i++) {
				System.out.println(list[i]);
		}
	}
}
