/**
 * 
 */
package com.sc.SpringbootWebProj.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.SpringbootWebProj.SpringbootWebProjApplication;

@Service
public class SearchService {

	private static final Logger logger	= LoggerFactory.getLogger(SpringbootWebProjApplication.class);
	
	@Autowired
	BinarySearchImpl bubbleSortBasedSearchImpl;
	@Autowired
	BinarySearchImpl quickSortBasedSearchImpl;
	
	public boolean search(int numberToBeSearched) {
		System.out.println(" >>>> "+numberToBeSearched);
		int sourceNumbers [] 	= 	{1,2,3,4,5,6,7,8,9,10};
		//boolean present	=	performBubbleSort(sourceNumbers, numberToBeSearched);
		//performQuickSort(sourceNumbers, numberToBeSearched);
		//System.out.println(" present >>>> "+present);
		return performBubbleSort(sourceNumbers, numberToBeSearched);
	}

	private boolean performQuickSort(int[] sourceNumbers, int numberToBeSearched) {
		boolean isPresent =	quickSortBasedSearchImpl.isPresent(sourceNumbers,numberToBeSearched);
		logger.info("Completed QuickSort "+isPresent);
		return isPresent;
	}


	private boolean performBubbleSort(int[] sourceNumbers, int numberToBeSearched) {
		boolean isPresent =	bubbleSortBasedSearchImpl.isPresent(sourceNumbers,numberToBeSearched);
		logger.info("Completed BubbleSort "+isPresent);
		return isPresent;
	}

}
