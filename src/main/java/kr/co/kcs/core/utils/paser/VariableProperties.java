package kr.co.kcs.core.utils.paser;

import org.w3c.dom.Element;

public class VariableProperties {
    public String qualNameLength;
    public String qualName;    //클래스 또는 변수명
    public String qualifiedNameRequiredFlag;
    public String parentOccursFlag;
    public String identifierElement;
    public String objClass;
    public String localName;
    public String level;
    public String offset;
    public String elementSize; //dataValue의 길이
    public String structure;
    public String intervalLeadingPrecision;
    public String scale;
    public String occursMax;
    public String occursElement;
    public String elementRedefined;
    public String sqlnullableFlag;
    public String fieldAlign;
    public String bitLength;   //변수타입에 관련됨
    public String userDefinedFiller;
    public String isDdlFiller;
    public String ddlValueLen;
    public String bitOffset;

    public VariableProperties(Element attributeElement) {
        this.qualNameLength 			= getElementText(attributeElement, "qual_name_length");
        this.qualName 					= getElementText(attributeElement, "qual_name");
        this.qualifiedNameRequiredFlag 	= getElementText(attributeElement, "qualified_name_required_flag");
        this.parentOccursFlag 			= getElementText(attributeElement, "parent_occurs_flag");
        this.identifierElement 			= getElementText(attributeElement, "identifier_element");
        this.objClass 					= getElementText(attributeElement, "obj_class");
        this.localName 					= getElementText(attributeElement, "local_name");
        this.level 						= getElementText(attributeElement, "level");
        this.offset 					= getElementText(attributeElement, "offset");
        this.elementSize 				= getElementText(attributeElement, "element_size");
        this.structure 					= getElementText(attributeElement, "structure");
        this.intervalLeadingPrecision 	= getElementText(attributeElement, "interval_leading_precision");
        this.scale 						= getElementText(attributeElement, "scale");
        this.occursMax 					= getElementText(attributeElement, "occurs_max");
        this.occursElement 				= getElementText(attributeElement, "occurs_element");
        this.elementRedefined 			= getElementText(attributeElement, "element_redefined");
        this.sqlnullableFlag 			= getElementText(attributeElement, "sqlnullable_flag");
        this.bitOffset 					= getElementText(attributeElement, "bit_offset");
        this.fieldAlign 				= getElementText(attributeElement, "field_align");
        this.bitLength 					= getElementText(attributeElement, "bit_length");
        this.userDefinedFiller 			= getElementText(attributeElement, "user_defined_filler");
        this.isDdlFiller 				= getElementText(attributeElement, "is_ddl_filler");
        this.ddlValueLen 				= getElementText(attributeElement, "ddl_value_len");
    }

    private String getElementText(Element parent, String tagName) {
        return parent.getElementsByTagName(tagName).getLength() > 0 ? parent.getElementsByTagName(tagName).item(0).getTextContent().trim() 
                : "";
    }
    
    public boolean isClassVariable() {
    	return objClass.equals("0");
    }
    
    public boolean isArray() {
    	return occursMax.equals("1") == false;
    }
}
