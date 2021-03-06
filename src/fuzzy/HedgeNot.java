//Fuzzy engine for Java 0.1a
//Copyright (C) 2000  Edward S. Sazonov (esazonov@usa.com)

//This program is free software; you can redistribute it and/or
//modify it under the terms of the GNU General Public License
//as published by the Free Software Foundation; either version 2
//of the License, or (at your option) any later version.

//This program is distributed in the hope that it will be useful,
//but WITHOUT ANY WARRANTY; without even the implied warranty of
//MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//GNU General Public License for more details.

//You should have received a copy of the GNU General Public License
//along with this program; if not, write to the Free Software
//Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.

package fuzzy;

/**
 * Fuzzy "not" is implemented as a hedge
 */
public class HedgeNot extends Hedge 
{
/**
 * getName method for "not".
 */
public java.lang.String getName() 
{
	return "not";
}
/**
 * hedgeIt method for "not"
 */
public double hedgeIt(double value) 
{
	return 1.0-value;
}
}
