package kr.co.kcs.core.utils;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class DataValue {
    String qualNameLength;
    String qualifiedNameRequiredFlag;
    String parentOccursFlag;
    String identifierElement;
    String objClass;
    String localName;
    String level;
    String structure;
    String intervalLeadingPrecision;
    String scale;
    String occursMax;
    String occursElement;
    String elementRedefined;
    String sqlnullableFlag;
    String fieldAlign;
    String userDefinedFiller;
    String isDdlFiller;
    String ddlValueLen;
    String bitOffset;
    
    
    
    String qualName;    //클래스 또는 변수명
    String offset;		
    String bitLength;   //변수타입에 관련됨
    String elementSize; //dataValue의 길이
//    Class  valueType;	//dataValue의 타입, short, int, String, Map, Ncp_Resp_Info_Pro.class
//    byte[] streamData;  //inputstream에서 가져온 lgth = 2에 대한 바이트
//    Object dataValue;   //해당변수의 값  lgth = 2 Ncp_Resp_Info_Pro

    public DataValue(Element attributeElement) {
        this.qualNameLength = DdlXmlMap.getElementText(attributeElement, "qual_name_length");
        this.qualName = DdlXmlMap.getElementText(attributeElement, "qual_name");
        this.qualifiedNameRequiredFlag = DdlXmlMap.getElementText(attributeElement, "qualified_name_required_flag");
        this.parentOccursFlag = DdlXmlMap.getElementText(attributeElement, "parent_occurs_flag");
        this.identifierElement = DdlXmlMap.getElementText(attributeElement, "identifier_element");
        this.objClass = DdlXmlMap.getElementText(attributeElement, "obj_class");
        this.localName = DdlXmlMap.getElementText(attributeElement, "local_name");
        this.level = DdlXmlMap.getElementText(attributeElement, "level");
        this.offset = DdlXmlMap.getElementText(attributeElement, "offset");
        this.elementSize = DdlXmlMap.getElementText(attributeElement, "element_size");
        this.structure = DdlXmlMap.getElementText(attributeElement, "structure");
        this.intervalLeadingPrecision = DdlXmlMap.getElementText(attributeElement, "interval_leading_precision");
        this.scale = DdlXmlMap.getElementText(attributeElement, "scale");
        this.occursMax = DdlXmlMap.getElementText(attributeElement, "occurs_max");
        this.occursElement = DdlXmlMap.getElementText(attributeElement, "occurs_element");
        this.elementRedefined = DdlXmlMap.getElementText(attributeElement, "element_redefined");
        this.sqlnullableFlag = DdlXmlMap.getElementText(attributeElement, "sqlnullable_flag");
        this.bitOffset = DdlXmlMap.getElementText(attributeElement, "bit_offset");
        this.fieldAlign = DdlXmlMap.getElementText(attributeElement, "field_align");
        this.bitLength = DdlXmlMap.getElementText(attributeElement, "bit_length");
        this.userDefinedFiller = DdlXmlMap.getElementText(attributeElement, "user_defined_filler");
        this.isDdlFiller = DdlXmlMap.getElementText(attributeElement, "is_ddl_filler");
        this.ddlValueLen = DdlXmlMap.getElementText(attributeElement, "ddl_value_len");
    }

    @Override
    public String toString() {
        return "AttributeElement {\n" +
                "  qualNameLength='" + qualNameLength + "',\n" +
                "  qualName='" + qualName + "',\n" +
                "  qualifiedNameRequiredFlag='" + qualifiedNameRequiredFlag + "',\n" +
                "  parentOccursFlag='" + parentOccursFlag + "',\n" +
                "  identifierElement='" + identifierElement + "',\n" +
                "  objClass='" + objClass + "',\n" +
                "  localName='" + localName + "',\n" +
                "  level='" + level + "',\n" +
                "  offset='" + offset + "',\n" +
                "  elementSize='" + elementSize + "',\n" +
                "  structure='" + structure + "',\n" +
                "  intervalLeadingPrecision='" + intervalLeadingPrecision + "',\n" +
                "  scale='" + scale + "',\n" +
                "  occursMax='" + occursMax + "',\n" +
                "  occursElement='" + occursElement + "',\n" +
                "  elementRedefined='" + elementRedefined + "',\n" +
                "  sqlnullableFlag='" + sqlnullableFlag + "',\n" +
                "  bitOffset='" + bitOffset + "',\n" +
                "  fieldAlign='" + fieldAlign + "',\n" +
                "  bitLength='" + bitLength + "',\n" +
                "  userDefinedFiller='" + userDefinedFiller + "',\n" +
                "  isDdlFiller='" + isDdlFiller + "',\n" +
                "  ddlValueLen='" + ddlValueLen + "'\n" +
                "}";
    }
    
}

public class DdlXmlMap {
    private static DdlXmlMap instance;
    private static Map<String, Map<String, DataValue>> dataMap;
    private static final String FILE_PATH = "C:\\work\\workspace\\kFrame\\ddl.xml";

    private DdlXmlMap() {
        dataMap = new HashMap<>();
        parseXML();
    }

    public static DdlXmlMap getInstance() {
        if (instance == null) {
            synchronized (DdlXmlMap.class) {
                if (instance == null) {
                    instance = new DdlXmlMap();
                }
            }
        }
        return instance;
    }

    private void parseXML() {
        try {
            File xmlFile = new File(FILE_PATH);
            
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(xmlFile);
            document.getDocumentElement().normalize();

            NodeList classList = document.getElementsByTagName("ClassElement");
            for (int i = 0; i < classList.getLength(); i++) {
                Element classElement = (Element) classList.item(i);
                String classKey = getElementText(classElement, "qual_name");
                
                Map<String, DataValue> attributeMap = new HashMap<>();
                NodeList attributeList = classElement.getElementsByTagName("AttributeElement");
                for (int j = 0; j < attributeList.getLength(); j++) {
                    Element attributeElement = (Element) attributeList.item(j);
                    String attributeKey = getElementText(attributeElement, "qual_name");
                    DataValue dataValue = new DataValue(attributeElement);
                    attributeMap.put(attributeKey, dataValue);
                    System.err.println("AttributeElement ::::::::::::::: "+dataValue);
                }
                dataMap.put(classKey, attributeMap);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getElementText(Element parent, String tagName) {
        NodeList nodeList = parent.getElementsByTagName(tagName);
        return (nodeList.getLength() > 0) ? nodeList.item(0).getTextContent().trim() : "";
    }

    public Map<String, Map<String, DataValue>> getDataMap() {
    	Map<String, DataValue> attributeElement = dataMap.get("ncp-lex-struct-static");
    	DataValue lgth = attributeElement.get("lgth");   
    	
        return dataMap;
    }
    
}
