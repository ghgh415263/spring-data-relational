/*
 * Copyright 2018-2025 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.relational.core.mapping;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The annotation to configure the mapping from an attribute to a database column.
 *
 * @author Kazuki Shimizu
 * @author Florian Lüdiger
 * @author Bastian Wilhelm
 * @author Mark Paluch
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD, ElementType.METHOD, ElementType.ANNOTATION_TYPE })
@Documented
public @interface Column {

	/**
	 * The column name. The attribute supports Value Expressions to dynamically obtain the column name on a per-operation
	 * basis. Expressions returning a {@code String} are {@link SqlIdentifierSanitizer sanitized} prior usage. Expressions
	 * can also return a {@link org.springframework.data.relational.core.sql.SqlIdentifier} directly that is used as-is
	 * without further sanitization.
	 */
	String value() default "";

}
