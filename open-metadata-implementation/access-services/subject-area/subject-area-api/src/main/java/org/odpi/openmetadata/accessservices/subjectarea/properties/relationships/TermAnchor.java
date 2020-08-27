/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
// This is a generated file - do not edit - changes should be made to the templates amd/or generator to generate this file with changes.

package org.odpi.openmetadata.accessservices.subjectarea.properties.relationships;

import org.odpi.openmetadata.accessservices.subjectarea.properties.objects.graph.LineEnd;
import org.odpi.openmetadata.repositoryservices.connectors.stores.metadatacollectionstore.properties.typedefs.RelationshipEndCardinality;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.*;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE;
import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;

//omrs
import org.odpi.openmetadata.repositoryservices.connectors.stores.metadatacollectionstore.properties.instances.*;
//omrs beans
import org.odpi.openmetadata.accessservices.subjectarea.properties.objects.graph.Line;
import org.odpi.openmetadata.accessservices.subjectarea.properties.objects.graph.LineType;

/**
 * TermAnchorRelationship is a relationship between an entity of type Glossary and an entity of type GlossaryTerm.
 * The ends of the relationship are stored as entity proxies, where there is a 'proxy' name by which the entity type is known.
 * The first entity proxy has anchor as the proxy name for entity type Glossary.
 * The second entity proxy has terms as the proxy name for entity type GlossaryTerm.
 * <p>
 * Each entity proxy also stores the entities guid.
 * <p>
 * Links a term to its owning glossary.
 */
@JsonAutoDetect(getterVisibility = PUBLIC_ONLY, setterVisibility = PUBLIC_ONLY, fieldVisibility = NONE)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TermAnchor extends Line {
    private static final Logger log = LoggerFactory.getLogger(TermAnchor.class);
    private static final String className = TermAnchor.class.getName();

    private static final String[] PROPERTY_NAMES_SET_VALUES = new String[]{

            // Terminate the list
            null
    };
    private static final String[] ATTRIBUTE_NAMES_SET_VALUES = new String[]{

            // Terminate the list
            null
    };
    private static final String[] ENUM_NAMES_SET_VALUES = new String[]{

            // Terminate the list
            null
    };
    private static final String[] MAP_NAMES_SET_VALUES = new String[]{

            // Terminate the list
            null
    };
    private static final java.util.Set<String> PROPERTY_NAMES_SET = new HashSet<>(Arrays.asList(PROPERTY_NAMES_SET_VALUES));
    private static final java.util.Set<String> ATTRIBUTE_NAMES_SET = new HashSet<>(Arrays.asList(ATTRIBUTE_NAMES_SET_VALUES));
    private static final java.util.Set<String> ENUM_NAMES_SET = new HashSet<>(Arrays.asList(ENUM_NAMES_SET_VALUES));
    private static final java.util.Set<String> MAP_NAMES_SET = new HashSet<>(Arrays.asList(MAP_NAMES_SET_VALUES));
    private String end1TypeName;
    private String end1AttributeName;
    private String end1AttributeDescription;
    private RelationshipEndCardinality end1Cardinality;
    private String end2TypeName;
    private String end2AttributeName;
    private String end2AttributeDescription;
    private RelationshipEndCardinality end2Cardinality;
    @Override
    protected LineEnd getLineEnd1() {
        return new LineEnd(this.end1TypeName,
                           this.end1AttributeName,
                           this.end1AttributeDescription,
                           this.end1Cardinality);
    }
    @Override
    protected LineEnd getLineEnd2() {
        return new LineEnd(this.end2TypeName,
                           this.end2AttributeName,
                           this.end2AttributeDescription,
                           this.end2Cardinality);
    }

    public TermAnchor() {
        initialise();

    }

    private void initialise() {
        name = "TermAnchor";
        typeDefGuid = "1d43d661-bdc7-4a91-a996-3239b8f82e56";
        // set the LineType if this is a LineType enum value.
        try {
            lineType = LineType.valueOf(name);
            setLineEnds();
        } catch (IllegalArgumentException e) {
            lineType = LineType.Unknown;
        }
    }

    public TermAnchor(Line template) {
        super(template);
        initialise();
    }

    public TermAnchor(Relationship omrsRelationship) {
        super(omrsRelationship);
        name = "TermAnchor";
        // set the LineType if this is a LineType enum value.
        try {
            lineType = LineType.valueOf(name);
        } catch (IllegalArgumentException e) {
            lineType = LineType.Unknown;
        }
    }

    InstanceProperties obtainInstanceProperties() {
        final String methodName = "obtainInstanceProperties";
        if (log.isDebugEnabled()) {
            log.debug("==> Method: " + methodName);
        }
        InstanceProperties instanceProperties = new InstanceProperties();
        EnumPropertyValue enumPropertyValue = null;
        MapPropertyValue mapPropertyValue = null;
        PrimitivePropertyValue primitivePropertyValue = null;
        if (log.isDebugEnabled()) {
            log.debug("<== Method: " + methodName);
        }
        return instanceProperties;
    }




    @Override
    public StringBuilder toString(StringBuilder sb) {
        if (sb == null) {
            sb = new StringBuilder();
        }
        sb.append(" TermAnchorRelationship=");
        sb.append(super.toString(sb));
        sb.append(" TermAnchorRelationship Attributes{");
        sb.append("}");
        return sb;
    }

    @Override
    public String toString() {
        return toString(new StringBuilder()).toString();
    }
}