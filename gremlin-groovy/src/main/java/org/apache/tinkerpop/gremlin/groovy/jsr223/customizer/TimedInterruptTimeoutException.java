/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.tinkerpop.gremlin.groovy.jsr223.customizer;

import java.util.concurrent.TimeoutException;

/**
 * An exception thrown from the {@link TimedInterruptCustomizerProvider} when the timeout is exceeded. This exception
 * allows differentiation from other "timeout exceptions" that might occur.
 *
 * @author Stephen Mallette (http://stephen.genoprime.com)
 * @deprecated As of release 3.2.4, replaced by {@link org.apache.tinkerpop.gremlin.groovy.jsr223.TimedInterruptTimeoutException}.
 */
@Deprecated
public class TimedInterruptTimeoutException extends TimeoutException {
    public TimedInterruptTimeoutException() {
    }

    public TimedInterruptTimeoutException(final String message) {
        super(message);
    }
}
