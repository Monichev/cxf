/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.cxf.xmlbeans;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
//import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.2-SNAPSHOT
 * Tue Oct 21 11:29:37 BST 2008
 * Generated source version: 2.2-SNAPSHOT
 *
 */

@WebService(targetNamespace = "http://cxf.apache.org/xmlbeans", name = "GreeterMine")
//@XmlSeeAlso({ObjectFactory.class })
public interface GreeterMine {

    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @Oneway
    @WebMethod(action = "sayHi2")
    void sayHi2(
        @WebParam(partName = "in", name = "sayHi2",
            targetNamespace = "http://cxf.apache.org/xmlbeans")
        StringListType in
    );
}
