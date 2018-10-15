/*
 * Copyright 2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.function.web.source;

import java.util.function.Supplier;

/**
 * @author Dave Syer
 *
 */
public class SimpleDestinationResolver implements DestinationResolver {

	@Override
	public String destination(Supplier<?> supplier, String name, Object value) {
		return name.contains("|") ? name.substring(0, name.indexOf("|")).trim() : name;
	}

}