/*******************************************************************************
 * Copyright (c) 2004 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/

package org.eclipse.birt.report.engine.internal.executor.load;

import java.util.ArrayList;

import junit.framework.TestCase;

import org.eclipse.birt.report.engine.internal.document.v4.PageRangeIterator;

public class PageSequenceIteratorTest extends TestCase
{

	public void testIterator( )
	{
		ArrayList pages = new ArrayList( );
		pages.add( new long[]{1, 1} );
		pages.add( new long[]{5, 6} );
		PageRangeIterator iter = new PageRangeIterator( pages );
		assertTrue( iter.hasNext( ) );
		assertEquals( 1, iter.next( ) );
		assertEquals( 5, iter.next( ) );
		assertEquals( 6, iter.next( ) );
		assertTrue( !iter.hasNext( ) );
	}

}
