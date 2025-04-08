package kr.co.kcs.core.utils.paser;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Xml2Map {
    private static Xml2Map instance;
    private HashMap<String, ArrayList<ParamInfo>> mapParseXml;
    private final String FILE_PATH = "C:\\work\\workspace\\kFrame\\ddl.xml";

    private Xml2Map() {
    	mapParseXml = new HashMap<>();
    	parseXML();
    }

	public static Xml2Map getInstance() {
        if (instance == null) {
            synchronized (Xml2Map.class) {
                if (instance == null) {
                    instance = new Xml2Map();
                }
            }
        }
        return instance;
    }

    // Key : 클래스명, value : 변수내용
    public HashMap<String, ArrayList<ParamInfo>> getMap() {
        return mapParseXml;
    }
    
    public ArrayList<ParamInfo> getArrayList(String className) {
        return mapParseXml.get(className);
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
	            getParamList(classElement);
	        }
    	} catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    private void getParamList(Element classElement) {
    	String className = getFirstClassName(classElement);
        ArrayList<ParamInfo> paramList = new ArrayList<>();
        
        NodeList attributeList = classElement.getElementsByTagName("AttributeElement");
        
        int level = 1;
        
        //1레벨만 전부 긁음.
        for (int j = 1; j < attributeList.getLength(); j++) {
            
        	Element attributeElement = (Element) attributeList.item(j);
            
            VariableProperties properties = new VariableProperties(attributeElement);
            int currentLevel 	= Integer.parseInt(properties.level);
            
            if(level != currentLevel) continue;
            
            ParamInfo currentInfo = new ParamInfo(className, properties);
            paramList.add(currentInfo);
            
            //변수중에 클래스가 있다면 그 녀석만 따로 긁음.
            boolean isClass 	= properties.isClassVariable();
    		if(isClass) {
    			getSubClassList(attributeList, properties, currentInfo);
    		}
        }
        
        mapParseXml.put(className, paramList);
	}

    private void getSubClassList(NodeList attributeList, VariableProperties parentProperties, ParamInfo parentClass) {
    	ArrayList<ArrayList<ParamInfo>> objectResult = new ArrayList<ArrayList<ParamInfo>>();
    	ArrayList<ParamInfo> subList = new ArrayList<ParamInfo>();
    	
    	int parentOffset 		= Integer.parseInt(parentProperties.offset);
    	int parentElementSize 	= Integer.parseInt(parentProperties.elementSize);
    	int parentOccursMax 	= Integer.parseInt(parentProperties.occursMax);
    	int parentLevel 		= Integer.parseInt(parentProperties.level);
    	
    	int paramLevel = parentLevel + 1;
    	int remainSize = parentElementSize;
    	for (int j = 0; j < attributeList.getLength(); j++) {
            
        	Element attributeElement = (Element) attributeList.item(j);
            
            VariableProperties properties = new VariableProperties(attributeElement);
            int currentOffset 		= Integer.parseInt(properties.offset);
            int currentElementSize 	= Integer.parseInt(properties.elementSize);
            int currentLevel 		= Integer.parseInt(properties.level);
            int currentOccursMax 	= Integer.parseInt(properties.occursMax);
            
            if(currentOffset < parentOffset || currentLevel != paramLevel) continue;
            
            ParamInfo currentInfo = new ParamInfo(parentClass.name, properties);
            subList.add(currentInfo);
            
            //변수중에 클래스가 있다면 그 녀석만 따로 긁음.
            boolean isClass = properties.isClassVariable();
    		if(isClass) {
    			
    			if(parentClass.name =="devdest") {
    				
    			}
    			getSubClassList(attributeList, properties, currentInfo);
    		}
    		
    		remainSize = remainSize - (currentElementSize * currentOccursMax) ;
    		if(remainSize <= 0) break;
        }
    	
    	mapParseXml.put(parentClass.name, subList);
    	
    	if(parentOccursMax > 1) {
    		for(int i = 0; i < parentOccursMax; i++) {
        		ArrayList<ParamInfo> copiedList = new ArrayList<>();
        	    for (ParamInfo info : subList) {
        	        copiedList.add(new ParamInfo(info)); // 복사 생성자
        	    }
        		objectResult.add(copiedList);
        	}
        	parentClass.setObject(objectResult.toArray());    		
    	}
    	else {
    		parentClass.setObject(subList);
    	}
    	
	}
    
	private String getFirstClassName(Element classElement) {
        NodeList attributeList = classElement.getElementsByTagName("AttributeElement");
        if (attributeList.getLength() > 0) {
            Element firstAttribute = (Element) attributeList.item(0);
            String objClassValue = getElementText(firstAttribute, "obj_class");
            if ("0".equals(objClassValue)) {
                return getElementText(firstAttribute, "qual_name");
            }
        }
        return "";
    }
    
	private String getParamName(Element attributeElement) {
        return getElementText(attributeElement, "qual_name");
    }

    public String getElementText(Element parent, String tagName) {
        NodeList nodeList = parent.getElementsByTagName(tagName);
        return (nodeList.getLength() > 0) ? nodeList.item(0).getTextContent().trim() : "";
    }
    
}
