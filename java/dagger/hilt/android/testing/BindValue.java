/*
 * Copyright (C) 2020 The Dagger Authors.
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

package dagger.hilt.android.testing;

import static java.lang.annotation.RetentionPolicy.CLASS;

import dagger.hilt.GeneratesRootInput;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * An annotation that can be used on a test field to contribute the value into the {@link
 * dagger.hilt.components.SingletonComponent}. Example usage:
 *
 * <pre><code>
 * public class FooTest{
 *   ...
 *   {@literal @}BindValue Bar boundBar = new Bar();
 *   ...
 * }
 * </code></pre>
 *
 * Here {@code boundBar} will be accessible to the entire application for your test.
 */
@Retention(CLASS)
@Target({ElementType.FIELD})
@GeneratesRootInput
public @interface BindValue {}
