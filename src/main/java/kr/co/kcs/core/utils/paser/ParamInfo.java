package kr.co.kcs.core.utils.paser;

/** 변수 하나의 정보 클래스 */
public class ParamInfo {
	public String className;  // 클래스명 ncp-device
	public String name; 	  // 변수명 
	public int 	  offset;
	public int 	  length;	  // 실제 데이터의 길이
	public int 	  occursMax;  // 배열의 갯수, 옵션용
	
	Class<?> dataObjType;// dataObj의 클래스 타입 short[], String, int, long, ArrayList<ParamInfo>
	byte[]	 byteData;	 // 나중에 변경가능 
	Object 	 dataObj;	 // 값 short, String, int, long, ArrayList<ParamInfo>
	
	public ParamInfo(String className, VariableProperties properties) {
		this.className  = className;
		this.name 		= properties.qualName;
		this.offset 	= Integer.parseInt(properties.offset);
		this.length 	= Integer.parseInt(properties.elementSize);
		this.occursMax	= Integer.parseInt(properties.occursMax);
		this.dataObjType = getTypeByProperties(properties);
	}
	
	public ParamInfo(ParamInfo other) {
		this.className    = other.className;
		this.name         = other.name;
		this.offset       = other.offset;
		this.length       = other.length;
		this.occursMax    = other.occursMax;
		this.dataObjType  = other.dataObjType;
		this.byteData     = other.byteData != null ? other.byteData.clone() : null;
		this.dataObj      = other.dataObj;
	}

	
	public ParamInfo setObject(Object obj) {
		this.dataObj 	 = obj;
		this.dataObjType = obj.getClass();
		return this;
	}
	
	public <T> T getObjectAsType() {
        if (dataObj == null) {
            return null;
        }
        
        try {
            return (T) dataObjType.cast(dataObj);
        } catch (ClassCastException e) {
            System.err.println("Type casting failed for object: " + dataObj + " to " + dataObjType.getSimpleName());
            return null;
        }
    }
	

	private Class<?> getTypeByProperties(VariableProperties properties) {
		//int bitLength 	= Integer.parseInt(properties.bitLength);	// 그냥 bitLength... 
		int objectClass = Integer.parseInt(properties.objClass);	// 0이면 Bean 1이면 변수
		int structure 	= Integer.parseInt(properties.structure);	// 실제적인 타입의 구분자
		int occursMax	= Integer.parseInt(properties.occursMax);	// 1보다 크면 배열
		
		if(objectClass == 0) {
			if(occursMax > 1) 	return Object[].class;
			else 				return Object.class;
		}
		
		if(structure == 25 && occursMax == 1) return Object.class;	//변수명:Ncp_Resp_Err_Attr_Val_Inv 안의 "reason"
		if(structure == 22 && occursMax == 1) return byte.class;	//변수명:fil030324_1400,fil030324-1401
		if(structure == 23 && occursMax == 1) return byte.class;	//변수명:hsm-port-len
		if(structure == 2  && occursMax == 1) return short.class;
		if(structure == 3  && occursMax == 1) return short.class;
		if(structure == 4  && occursMax == 1) return int.class;
		if(structure == 5  && occursMax == 1) return int.class; 	//변수명:ncp-req-alter-uint-big 정확히는 uint
		if(structure == 6  && occursMax == 1) return long.class;	//attr-val-fixed structure=6
		if(structure == 0  && occursMax == 1) return String.class;  //변수명:xnc_File_Len
		
		//byte[]은 없다.
		//if(bitLength == 8  && structure == 22 && occursMax > 1) return byte[].class;	//변수명:fil030324_1400,fil030324-1401 structure=22
		if(structure == 2  && occursMax > 1) return short[].class;	//last-cmd-timestamp는 structure가 2이다.
		if(structure == 3  && occursMax > 1) return short[].class; 	//short[]만 structure가 3이다.
		if(structure == 4  && occursMax > 1) return int[].class;
		if(structure == 5  && occursMax > 1) return int[].class;  	//변수명:ncp-req-alter-uint-big 정확히는 uint
		if(structure == 6  && occursMax > 1) return long[].class;	//attr-val-fixed structure=6
		if(structure == 0  && occursMax > 1) return String[].class; //변수명:xnc_File_Len
		if(structure == 25 && occursMax > 1) return Object[].class;	
		else {
			System.out.println("[Skip] 분류하지 못함.."+ properties.qualName);
		}
		return null;
	}
	
}
