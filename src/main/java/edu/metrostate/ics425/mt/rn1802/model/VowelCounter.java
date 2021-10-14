package edu.metrostate.ics425.mt.rn1802.model;

import java.io.Serializable;
/**
 * @author Ricky N Implementation of the VowelCounter
 */
public class VowelCounter implements Serializable {
	private static final long serialVersionUID = 1L;

	String text;

	public VowelCounter() {
		text = null;
	}

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}

	public char[] getVowels() {
		return text.replaceAll("[^aeiouAEIOU]", "").toCharArray();
	}

	public int[] getVowelCounts() {
		char[] vowels = getVowels();
		int[] count = new int[5];
		
		for(int i = 0; i < vowels.length; i++) {
			switch(vowels[i]) {
			case 'a':
				count[0]++;
				break;
			case 'e':
				count[1]++;
				break;
			case 'i':
				count[2]++;
				break;
			case 'o':
				count[3]++;
				break;
			case 'u':
				count[4]++;
			}
		}
		
		return count;
		
	}

}
