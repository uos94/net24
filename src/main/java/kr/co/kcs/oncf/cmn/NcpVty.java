package kr.co.kcs.oncf.cmn;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum NcpVty {
	RESP_STRUCT(103, new Constants());

    private final int number;
	private final Object beanType;

    NcpVty(int number, Object beanType){
        this.number 	= number;
		this.beanType	= beanType;
    }

    public int number() {
        return number;
    }

    public Object beanType() {
    	return beanType;
    }

    private static final Map<Integer, NcpVty> BY_NUMBER = Stream.of(values()).collect(Collectors.toMap(NcpVty::number, Function.identity()));


    public static NcpVty valueOfNumber(int number) {
        return BY_NUMBER.get(number);
    }


}
