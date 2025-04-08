package kr.co.kcs.core.utils.paser;

import java.util.ArrayList;
import java.util.HashMap;

public class DataArrayMaker {
	
	public DataArrayMaker() {}

    public ArrayList<ParamInfo> getArrayList(String mainName) {
    	
    	ArrayList<ParamInfo> result = new ArrayList<ParamInfo>();
    	
    	makeArrayList(result, mainName);
    	
    	return result;
    }
    
	private void makeArrayList(ArrayList<ParamInfo> result, String className) {
//		//map은 모든 class가 다 들어 있음.
//    	HashMap<String, ArrayList<VariableProperties>> map = Xml2Map.getInstance().getMap();
//    	if(!map.containsKey(className)) {
//			return;
//		}
//    	
//    	//map에서 mainName에 해당하는 class를 가져옴, variables안에는 해당 class에 모든 변수가 다 있음
//    	ArrayList<VariableProperties> variables = map.get(className);
//    	
//    	for (int i = 0; i < variables.size(); i++) {
//    		VariableProperties variable = variables.get(i);
//    		ParamInfo info = new ParamInfo(className, variable);
//			
//    		if(variable.isClassVariable()) {
//				String subClassName = variable.qualName;
//				int arrayCount = Integer.parseInt(variable.occursMax);
//				
//				if(arrayCount > 1) {
//					ArrayList<ArrayList<ParamInfo>> arrayChildArrayList = new ArrayList<ArrayList<ParamInfo>>();
//					for(int j= 0; j < arrayCount; j++) {
//						ArrayList<ParamInfo> childArrayList = new ArrayList<ParamInfo>();
//						makeArrayList(childArrayList, subClassName);
//					}
//					
//					info.setObject(arrayChildArrayList.toArray());
//				}
//				else {
//					ArrayList<ParamInfo> childArrayList = new ArrayList<ParamInfo>();
//					makeArrayList(childArrayList, subClassName);
//					info.setObject(childArrayList);
//				}
//			}
//			
//    		result.add(info);
//		}
//    	
//    	
//		Iterator<HashMap.Entry<String, VariableProperties>> iterator = variables.iterator();
//		if (iterator.hasNext()) {
//            iterator.next(); // 첫 번째 항목 건너뛰기, 첫번째는 클래스 네임이 들어있어 변수에 대한 내용이 아니다. 
//        }
//        
//        while (iterator.hasNext()) {
//        	//VariableProperties안에는 하나의 변수에 대한 속성들이 들어있다.. KEY:qual_name,VALUE:cmd,  KEY:offset, VALUE:2,  KEY:element_size, VALUE:2,
//            HashMap.Entry<String, VariableProperties> var = iterator.next();
//            
//            String verName 					 = var.getKey();
//            VariableProperties varProperties = var.getValue();
//            
//            if(varProperties.isClassVariable()) {
//            	continue;
//            }
//            
//            ParamInfo info = new ParamInfo(mainName, varProperties);
//            list.add(info);
//        }
		
	}    
    
}
