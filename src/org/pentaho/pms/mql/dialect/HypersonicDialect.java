/*
 * This program is free software; you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License, version 2.1 as published by the Free Software
 * Foundation.
 *
 * You should have received a copy of the GNU Lesser General Public License along with this
 * program; if not, you can obtain a copy at http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html
 * or from the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * Copyright (c) 20011 Pentaho Corporation.  All rights reserved.
 */
package org.pentaho.pms.mql.dialect;

public class HypersonicDialect extends DefaultSQLDialect {

  private static final String TOP_KEYWORD = "TOP"; //$NON-NLS-1$

  public HypersonicDialect() {
    super( "HYPERSONIC" ); //$NON-NLS-1$
  }

  @Override
  protected void generateSelectPredicate( SQLQueryModel query, StringBuilder sql ) {
    generateTopBeforeDistinct( query, sql, TOP_KEYWORD );
  }

  /**
   * return HSQL formatted date, 'YYYY-MM-DD hh:mm:ss'
   *
   * @param year
   * @param month
   * @param day
   *
   * @return date string
   */
  @Override
  public String getDateSQL( int year, int month, int day ) {
    return getDateSQL( year, month, day, 0, 0, 0, 0 );
  }
}
