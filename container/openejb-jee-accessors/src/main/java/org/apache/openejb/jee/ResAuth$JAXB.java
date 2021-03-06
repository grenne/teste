/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
    * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.openejb.jee;

import org.metatype.sxc.jaxb.JAXBEnum;
import org.metatype.sxc.jaxb.RuntimeContext;
import org.metatype.sxc.util.XoXMLStreamReader;

import javax.xml.namespace.QName;

public class ResAuth$JAXB
    extends JAXBEnum<ResAuth> {


    public ResAuth$JAXB() {
        super(ResAuth.class, null, new QName("http://java.sun.com/xml/ns/javaee".intern(), "resAuth".intern()));
    }

    public ResAuth parse(final XoXMLStreamReader reader, final RuntimeContext context, final String value)
        throws Exception {
        return parseResAuth(reader, context, value);
    }

    public String toString(final Object bean, final String parameterName, final RuntimeContext context, final ResAuth resAuth)
        throws Exception {
        return toStringResAuth(bean, parameterName, context, resAuth);
    }

    public static ResAuth parseResAuth(final XoXMLStreamReader reader, final RuntimeContext context, final String value)
        throws Exception {
        if ("Application".equals(value)) {
            return ResAuth.APPLICATION;
        } else if ("Container".equals(value)) {
            return ResAuth.CONTAINER;
        } else {
            context.unexpectedEnumValue(reader, ResAuth.class, value, "Application", "Container");
            return null;
        }
    }

    public static String toStringResAuth(final Object bean, final String parameterName, final RuntimeContext context, final ResAuth resAuth)
        throws Exception {
        if (ResAuth.APPLICATION == resAuth) {
            return "Application";
        } else if (ResAuth.CONTAINER == resAuth) {
            return "Container";
        } else {
            context.unexpectedEnumConst(bean, parameterName, resAuth, ResAuth.APPLICATION, ResAuth.CONTAINER);
            return null;
        }
    }

}
