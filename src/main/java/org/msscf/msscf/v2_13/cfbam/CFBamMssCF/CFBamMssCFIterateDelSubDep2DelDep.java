
// Description: Java 11 MssCF Iterator for DelSubDep2 Relationship DelDep.

/*
 *	org.msscf.msscf.CFBam
 *
 *	Copyright (c) 2016-2025 Mark Stephen Sobkow
 *	
 *	MSS Code Factory CFBam 2.13 Business Application Model
 *	
 *	This program is free software: you can redistribute it and/or modify
 *	it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	This program is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.msscf.msscf.v2_13.cfbam.CFBamMssCF;

import java.io.*;
import java.lang.reflect.*;
import java.net.*;
import java.sql.*;
import java.rmi.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfcore.MssCF.*;
import org.msscf.msscf.v2_13.cfsec.CFSec.*;
import org.msscf.msscf.v2_13.cfint.CFInt.*;
import org.msscf.msscf.v2_13.cfbam.CFBam.*;
import org.msscf.msscf.v2_13.cfbam.CFBamObj.*;
import org.msscf.msscf.v2_13.cfsec.CFSecObj.*;
import org.msscf.msscf.v2_13.cfint.CFIntObj.*;
import org.msscf.msscf.v2_13.cfcore.CFGenKb.*;
import org.msscf.msscf.v2_13.cfcore.CFGenKbObj.*;

/**
 *	CFBamMssCFIterateDelSubDep2DelDep binds DelSubDep2.DelDep
 *	as an instance of MssCFGenIteratorObj.
 */
public class CFBamMssCFIterateDelSubDep2DelDep
	extends MssCFGenIteratorObj
{
	private static final long serialVersionUID = 1L;

	public CFBamMssCFIterateDelSubDep2DelDep() {
		super();
	}

	public CFBamMssCFIterateDelSubDep2DelDep( MssCFEngine argEngine ) {
		super( argEngine,
			"any",
			null,
			"DelSubDep2",
			"DelDep",
			"DelSubDep3" );
	}

	public ListIterator<ICFLibAnyObj> enumerateDetails( MssCFGenContext genContext ) {
		final String S_ProcName = "CFBamMssCFIterateDelSubDep2DelDep.enumerateDetails() ";

		if( genContext == null ) {
			throw new CFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"genContext" );
		}

		ICFLibAnyObj genDef = genContext.getGenDef();
		if( genDef == null ) {
			throw new CFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"genContext.getGenDef()" );
		}

		List<ICFLibAnyObj> list = new LinkedList<ICFLibAnyObj>();

		if( genDef instanceof ICFBamDelSubDep2Obj ) {
			Iterator<ICFBamDelSubDep3Obj> elements = ((ICFBamDelSubDep2Obj)genDef).getOptionalComponentsDelDep().iterator();
			while( elements.hasNext() ) {
				list.add( elements.next() );
			}
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"genContext.getGenDef()",
				genDef,
				"ICFBamDelSubDep2Obj" );
		}

		return( list.listIterator() );
	}}
