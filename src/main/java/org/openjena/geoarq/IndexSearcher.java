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

package org.openjena.geoarq;

import java.util.Iterator;

import com.hp.hpl.jena.graph.Node;

public interface IndexSearcher {

	// nearby
	public Iterator<Document> nearby(double latitude, double longitude, double miles);
	public Document contains(Node node, double latitude, double longitude, double miles);

	// within
	public Iterator<Document> within(double latitude1, double longitude1, double latitude2, double longitude2);
	public Document contains(Node node, double latitude1, double longitude1, double latitude2, double longitude2);
	
}
