package org.apache.maven.shared.release.transform.jdom2;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.apache.maven.model.Extension;
import org.apache.maven.shared.release.transform.MavenCoordinate;
import org.jdom2.Element;

/**
 * JDOM2 implementation of poms EXTENSION element
 *
 * @author Robert Scholte
 * @since 3.0
 */
public class JDomExtension extends Extension implements MavenCoordinate
{
    private final MavenCoordinate coordinate;

    /**
     * <p>Constructor for JDomExtension.</p>
     *
     * @param extension a {@link org.jdom2.Element} object
     */
    public JDomExtension( Element extension )
    {
        this.coordinate = new JDomMavenCoordinate( extension );
    }

    @Override
    public String getArtifactId()
    {
        return coordinate.getArtifactId();
    }

    @Override
    public String getGroupId()
    {
        return coordinate.getGroupId();
    }

    @Override
    public String getVersion()
    {
        return coordinate.getVersion();
    }

    @Override
    public void setArtifactId( String artifactId )
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setGroupId( String groupId )
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setVersion( String version )
    {
        coordinate.setVersion( version );
    }

    @Override
    public String getName()
    {
        return "extension";
    }
}
