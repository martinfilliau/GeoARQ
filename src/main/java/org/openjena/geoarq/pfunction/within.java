/*
 * Copyright © 2010 Talis Systems Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openjena.geoarq.pfunction;

import org.openjena.geoarq.GeoARQ;
import org.openjena.geoarq.IndexSearcher;

import com.hp.hpl.jena.sparql.engine.ExecutionContext;

public class within extends WithinPropertyFunctionEval {

	private IndexSearcher index = null ;

    @Override
    protected IndexSearcher getIndexSearcher(ExecutionContext execCxt) { 
        if ( index == null ) {
            index = GeoARQ.getDefaultIndex(execCxt.getContext()) ;
        }

        return index ; 
    }

}
