/*! ******************************************************************************
 *
 * Pentaho
 *
 * Copyright (C) 2024 by Hitachi Vantara, LLC : http://www.pentaho.com
 *
 * Use of this software is governed by the Business Source License included
 * in the LICENSE.TXT file.
 *
 * Change Date: 2029-07-20
 ******************************************************************************/


package mondrian.xmla;

import mondrian.test.DiffRepository;

/**
 * Test suite for compatibility of Mondrian XMLA with Excel 2000.
 * Simba (the maker of the O2X bridge) supplied captured request/response
 * soap messages between Excel 2000 and SQL Server. These form the
 * basis of the output files in the  excel_2000 directory.
 *
 * @author Richard M. Emberson
 */
public class XmlaExcel2000Test extends XmlaBaseTestCase {

    public XmlaExcel2000Test() {
        super();
    }

    public XmlaExcel2000Test(String name) {
        super(name);
    }

    protected DiffRepository getDiffRepos() {
        return DiffRepository.lookup(XmlaExcel2000Test.class);
    }

    protected Class<? extends XmlaRequestCallback> getServletCallbackClass() {
        return Callback.class;
    }

    static class Callback extends XmlaRequestCallbackImpl {
        Callback() {
            super("XmlaExcel2000Test");
        }
    }

    public void test01() {
        helperTest(false);
    }

    // BeginSession
    public void test02() {
        helperTest(false);
    }

    public void test03() {
        helperTest(true);
    }

    public void test04() {
        helperTest(true);
    }

    public void test05() {
        helperTest(true);
    }

    public void test06() {
        helperTest(true);
    }

    // BeginSession
    public void test07() {
        helperTest(false);
    }

    public void test08() {
        helperTest(true);
    }

    public void test09() {
        helperTest(true);
    }

    public void test10() {
        helperTest(true);
    }

    public void test11() {
        helperTest(true);
    }

    public void test12() {
        helperTest(true);
    }

    public void testMdschemaMeasures() {
        helperTest(true);
    }

    public void testMdschemaMeasuresEmitInvisible() {
        helperTest(true);
    }

    public void test14() {
        helperTest(true);
    }

    public void test15() {
        helperTest(true);
    }

    public void test16() {
        helperTest(true);
    }
    public void test17() {
        helperTest(true);
    }

    public void test18() {
        helperTest(true);
    }

    public void testExpect01() {
        helperTestExpect(false);
    }

    public void testExpect02() {
        helperTestExpect(false);
    }

    public void testExpect03() {
        helperTestExpect(true);
    }

    public void testExpect04() {
        helperTestExpect(true);
    }

    public void testExpect05() {
        helperTestExpect(true);
    }

    public void testExpect06() {
        helperTestExpect(true);
    }

    /////////////////////////////////////////////////////////////////////////
    // helpers
    /////////////////////////////////////////////////////////////////////////

    protected String getSessionId(Action action) {
        return getSessionId("XmlaExcel2000Test", action);
    }
}

// End XmlaExcel2000Test.java
